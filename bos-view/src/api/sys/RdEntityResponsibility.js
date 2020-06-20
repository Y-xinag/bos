import request from '@/utils/request'
// 添加用户
export function add(data) {
  return request({
    url: '/rdEntityResponsibility/add',
    method: 'post',
    params: {
      title: data.title,
      createId: data.createId,
      content: data.content,
      staus: data.staus,
      id: data.id
    }
  })
}

// 根据id删除用户
export function deleteUser(def) {
  return request({
    url: '/rdEntityResponsibility/delete',
    method: 'get',
    params: { def }
  })
}

// 修改用户
export function update(data) {
  return request({
    url: '/rdEntityResponsibility/update',
    method: 'post',
    params: {
      title: data.title,
      createId: data.createId,
      content: data.content,
      staus: data.staus,
      id: data.id
    }
  })
}

// 根据用户对象进行查询用户
export function list(data) {
  return request({
    url: '/rdEntityResponsibility/querylist',
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
    url: '/rdEntityResponsibility/queryBytitle',
    method: 'post',
    params: {
      search: data.search,
      page: data.page,
      limit: data.limit
    }
  })
}
