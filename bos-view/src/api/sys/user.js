import request from '@/utils/request'
// 添加用户
export function add(data) {
  return request({
    url: '/staff/add',
    method: 'post',
    data
  })
}

// 根据id删除用户
export function deleteUser(id) {
  return request({
    url: '/staff/delete',
    method: 'get',
    params: { id }
  })
}

// 修改用户
export function update(data) {
  return request({
    url: '/staff/update',
    method: 'post',
    data
  })
}

// 根据用户对象进行查询用户
export function list(data) {
  return request({
    url: '/staff/list',
    method: 'post',
    data
  })
}

// 用户id
export function staffid() {
  return request({
    url: '/staff/index',
    method: 'get'
  })
}

// 用户
export function groupstaff() {
  return request({
    url: '/staff/group',
    method: 'get'
  })
}

export function weight(data) {
  return request({
    url: '/staff/weight',
    method: 'post',
    data
  })
}
