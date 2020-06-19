import request from '@/utils/request'
// 从后台读取分好组的部门信息
export function groupMechanism() {
  return request({
    url: '/mechanism/groupMechanism',
    method: 'get'
  })
}

export function addMechanism(data) {
  return request({
    url: '/mechanism/add',
    method: 'post',
    data
  })
}

export function deleteMechanism(id) {
  return request({
    url: '/mechanism/delete',
    method: 'get',
    params: { id }
  })
}

export function updateMechanism(data) {
  return request({
    url: '/mechanism/update',
    method: 'post',
    data
  })
}

export function listMechanism(data) {
  return request({
    url: '/mechanism/list',
    method: 'post',
    data
  })
}
