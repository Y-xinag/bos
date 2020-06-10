import Mock from "mockjs"

Mock.mock('http://localhost:8080/user',{
  data: {
    'name': '@name', // @随机生成
    'email': '@email',
    'age|2-18': 5, // |区间
    'id': '@increment', // 自动增长
    'mz': 'menu',
  }
});

Mock.mock('http://localhost:8080/login', {
  data: {
    'token': '123456'
  }
})
