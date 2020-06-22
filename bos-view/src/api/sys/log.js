import request from "@/utils/request";

export function loglist(data) {
  return request({
    url: '/log/list',
    method: 'post',
    data
  })
}

// export function logAdd(data) {
//   return request({
//     url: '/log/add',
//     method: 'post',
//     data
//   })
// }
//
// export function logUpdate(data) {
//   return request({
//     url: '/log/update',
//     method: 'post',
//     data
//   })
// }

export function logDelete(id) {
  return request({
    url: '/log/delete',
    method: 'get',
    params: { id }
  })
}
