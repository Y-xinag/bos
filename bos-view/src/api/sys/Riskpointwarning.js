import request from '@/utils/request'
// 添加用户
export function add(data) {
  return request({
    url: '/riskpointwarning/add',
    method: 'post',
    params: {
      wid: data.wid,
      warningid: data.warningid,
      wtitle: data.wtitle,
      wcontent: data.wcontent,
      wloginid: data.wloginid,
      wcreatename: data.wcreatename,
      staus: data.staus
    }
  })
}

// 根据id删除用户
export function deleteUser(def) {
  return request({
    url: '/riskpointwarning/delete',
    method: 'get',
    params: { def }
  })
}

// 修改用户
export function update(data) {
  return request({
    url: '/riskpointwarning/update',
    method: 'post',
    params: {
      wid: data.wid,
      warningid: data.warningid,
      wtitle: data.wtitle,
      wcontent: data.wcontent,
      wloginid: data.wloginid,
      wcreatename: data.wcreatename,
      staus: data.staus
    }
  })
}

// 根据用户对象进行查询用户
export function list(data) {
  return request({
    url: '/riskpointwarning/querylist',
    method: 'post',
    params: {
      page: data.page,
      limit: data.limit
    }
  })
}

// 根据用户对象进行查询用户
export function queryBytitle(data) {
  return request({
    url: '/riskpointwarning/queryBytitle',
    method: 'post',
    params: {
      search: data.search,
      page: data.page,
      limit: data.limit
    }
  })
}
