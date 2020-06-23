import request from "@/utils/request";

export function postlist(data) {
  return request({
    url: '/post/list',
    method: 'post',
    data
  })
}

export function postAdd(data) {
  return request({
    url: '/post/add',
    method: 'post',
    data
  })
}

export function postDelete(pid) {
  return request({
    url: '/post/delete',
    method: 'get',
    params: { pid }
  })
}

export function postUpdate(data) {
  return request({
    url: '/post/update',
    method: 'post',
    data
  })
}

// 用户
export function grouppost() {
  return request({
    url: '/post/group',
    method: 'get'
  })
}
