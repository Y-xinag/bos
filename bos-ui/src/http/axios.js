import axios from 'axios';
import config from './config';
import qs from 'qs'; // 将json转成字符串
import Cookies from "js-cookie";
import router from '@/router'

export default function $axios(options) {
  // resolve 对应路径 ，reject
  return new Promise((resolve, reject) => {
    const instance = axios.create({
      baseURL: config.baseURL,
      headers: {},
      data: config.data,
      transformResponse: [function (data) {
      }]
    })

    // request拦截器
    instance.interceptors.request.use(
      config => {
        let token = Cookies.get('token')
        // 1. 请求开始的时候可以结合 vuex 开启全屏 loading 动画
        // console.log(store.state.loading)
        // console.log('准备发送请求...')
        // 2. 带上token
        if (token) {
          config.headers.accessToken = token
        } else {
          router.push('/user/login')
        }
        console.debug('axios.js')

        // 3. 根据请求方法，序列化传来的参数，根据后端需求是否序列化
        // 如果是post提交，后台的参数上需要加上RequestBody
        if (config.method === 'get') {
          console.debug('not post')
          config.data = qs.stringify(config.data)
          console.debug(config.data)
        }
        return config
      },

      error => {
        console.log('request:', error)
        //判断超时
        if (error.code === 'ECONNABORTED' && error.message.indexOf('timeout') !== -1) {
          console.log('timeout请求超时')
          // return service.request(originalRequest);// 再重复请求一次
        }
        // 需要重定向到错误页面
        const errorInfo = error.response
        console.log(errorInfo)
        if (errorInfo) {
          // 页面那边catch的时候就能拿到详细的错误信息,看最下边的Promise.reject
          error = errorInfo.data
          //404,403,500
          const errorStatus = errorInfo.status;
          router.push({
            path: '/error/${errorStatus}' // ${errorStatus} 是后台返回的404，500
          })
        }
        // 在调用的那边可以拿到(catch)你想返回的错误信息
        return Promise.reject(error)
      }
    )

    // response 拦截器
    instance.interceptors.response.use(
      response => {
        let data;
        // IE9时response.data是undefined，因此需要使用response.request.responseText(Stringify后的字符串)
        if (response.data == undefined) {
          data = JSON.parse(response.request.responseText)
        } else {
          data = response.data
        }

        // 根据返回的code来处理
        switch (data.rc) {
          case 1:
            console.log(data.desc)
            break
          case 0:
          // store.commit('changeState')
          // console.log('登录成功')
          default:
        }
        // 若不是正确的返回code，且已经登录，就抛出错误
        // const err = new Error(data.desc)
        // err.data = data
        // err.response = response
        // throw err
        return data
      },
      err => {
        if (err && err.response) {
          switch (err.response.status) {
            case 400:
              err.message = '请求错误'
              break
            case 401:
              err.message = '未授权，请登录'
              break
            case 403:
              err.message = '拒绝访问'
              break
            case 404:
              err.message = `请求地址出错: ${err.response.config.url}`
              break
            case 408:
              err.message = '请求超时'
              break
            case 500:
              err.message = '服务器内部错误'
              break
            case 501:
              err.message = '服务未实现'
              break
            case 502:
              err.message = '网关错误'
              break
            case 503:
              err.message = '服务不可用'
              break
            case 504:
              err.message = '网关超时'
              break
            case 505:
              err.message = 'HTTP版本不受支持'
              break
            default:
          }
        }
        console.log(err)
        // 返回接口的错误信息
        return Promise.reject(err)
      }
    )

    // 请求处理
    instance(options).then(res => {
      resolve(res)
      return false
    }).catch(error => {
      reject(error)
    })
  })
}
