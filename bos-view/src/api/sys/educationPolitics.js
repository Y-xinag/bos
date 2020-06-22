import request from "@/utils/request";

export function educationPoliticslist(data) {
  return request({
    url: '/educationPolitics/list',
    method: 'post',
    data
  })
}

export function educationPoliticsAdd(data) {
  return request({
    url: '/educationPolitics/add',
    method: 'post',
    data
  })
}

export function educationPoliticsDelete(id) {
  return request({
    url: '/educationPolitics/delete',
    method: 'get',
    params: { id }
  })
}

export function educationPoliticsUpdate(data) {
  return request({
    url: '/educationPolitics/update',
    method: 'post',
    data
  })
}
