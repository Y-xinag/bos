import request from '@/utils/request'

export function groupPermission() {
  return request({
    url: '/postPermission/group',
    method: 'get'
  })
}

export function postPermissionList(data) {
  return request({
    url: '/postPermission/list',
    method: 'post',
    data
  })
}
