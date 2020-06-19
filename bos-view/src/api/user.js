import request from '@/utils/request'

export function login(data) {
  return request({
    url: '/staff/login',
    method: 'post',
    data
  })
}

export function getInfo(token) {
  return request({
    url: '/staff/info',
    method: 'get',
    params: { token }
  })
}

export function logout() {
  return request({
    url: '/staff/logout',
    method: 'get'
  })
}
