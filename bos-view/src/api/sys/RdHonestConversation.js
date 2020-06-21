import request from '@/utils/request'
// 添加用户
export function add(data) {
  return request({
    url: '/rdHonestConversation/add',
    method: 'post',
    params: {
      id: data.id,
      pid: data.pid,
      mid: data.mid,
      politicaloutlook: data.politicaloutlook,
      post: data.post,
      talktype: data.talktype,
      talkplace: data.talkplace,
      createId: data.createId,
      talktitle: data.talktitle,
      talkcontent: data.talktitle,
      createName: data.createName,
      staus: data.staus
    }
  })
}

// 根据id删除用户
export function deleteUser(def) {
  return request({
    url: '/rdHonestConversation/delete',
    method: 'get',
    params: { def }
  })
}

// 修改用户
export function update(data) {
  return request({
    url: '/rdHonestConversation/update',
    method: 'post',
    params: {
      id: data.id,
      pid: data.pid,
      mid: data.mid,
      politicaloutlook: data.politicaloutlook,
      post: data.post,
      talktype: data.talktype,
      talkplace: data.talkplace,
      createId: data.createId,
      talktitle: data.talktitle,
      talkcontent: data.talktitle,
      createName: data.createName,
      staus: data.staus
    }
  })
}

// 根据用户对象进行查询用户
export function list(data) {
  return request({
    url: '/rdHonestConversation/querylist',
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
    url: '/rdHonestConversation/queryBytitle',
    method: 'post',
    params: {
      search: data.search,
      page: data.page,
      limit: data.limit
    }
  })
}
