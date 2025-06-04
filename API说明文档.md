# 校友社交系统 API 文档

## 基础说明

### 接口基础地址
- 地址：`https://8v2fwgzuxi.apifox.cn`
- 密码：`KxUIrSPw`

### 通用返回格式
```json
{
    "code": 0,       // 返回代码，0表示成功，非0表示失败
    "msg": "success", // 返回信息
    "data": {}       // 返回数据
}
```

### 认证方式
- 登录后获取token
- 请求头携带token：`Authorization: Bearer {token}`

## API 列表

### 用户管理 (UserController)
#### 用户登录
- **接口**：`POST /user/login`
- **描述**：用户登录接口
- **请求参数**：
  ```json
  {
    "username": "string",
    "password": "string"
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "token": "xxx",
      "userInfo": {}
    }
  }
  ```

#### 用户注册
- **接口**：`POST /user/register`
- **描述**：用户注册接口
- **请求参数**：
  ```json
  {
    "username": "string",    // 用户名
    "password": "string",    // 密码
    "name": "string",       // 姓名
    "phone": "string",      // 手机号
    "email": "string",      // 邮箱
    "sex": "string",        // 性别
    "birthday": "2025-06-04", // 生日
    "graduationYear": "2025", // 毕业年份
    "major": "string",      // 专业
    "currentCompany": "string", // 当前公司
    "position": "string"    // 职位
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "注册成功",
    "data": null
  }
  ```

### 活动管理 (XiaoyouhuodongController)
#### 活动列表
- **接口**：`GET /xiaoyouhuodong/list`
- **描述**：获取活动列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "huodongname": "string",  // 活动名称（可选）
    "huodongleixing": "string", // 活动类型（可选）
    "zhuangtai": "string"     // 活动状态（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 10,
      "rows": [{
        "id": 1,
        "huodongname": "2025届校友聚会",
        "huodongleixing": "聚会",
        "huodongshijian": "2025-06-10",
        "huodongdidian": "学校大礼堂",
        "huodongneirong": "2025届校友返校聚会活动",
        "zhaopian": "upload/activity1.jpg",
        "zhuangtai": "未开始",
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

#### 活动详情
- **接口**：`GET /xiaoyouhuodong/detail/{id}`
- **描述**：获取活动详情
- **请求参数**：
  ```json
  {
    "id": 1  // 活动ID
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "id": 1,
      "huodongname": "2025届校友聚会",
      "huodongleixing": "聚会",
      "huodongshijian": "2025-06-10",
      "huodongdidian": "学校大礼堂",
      "huodongneirong": "2025届校友返校聚会活动",
      "zhaopian": "upload/activity1.jpg",
      "zhuangtai": "未开始",
      "renshu": 100,
      "baomingrenshu": 50,
      "addtime": "2025-06-04"
    }
  }
  ```

### 校友会管理 (XiaoyouhuixinxiController)
#### 校友会列表
- **接口**：`GET /xiaoyouhuixinxi/list`
- **描述**：获取校友会列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "xiaoyouhuiming": "string",  // 校友会名称（可选）
    "suozaidiqu": "string"      // 所在地区（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 5,
      "rows": [{
        "id": 1,
        "xiaoyouhuiming": "北京校友会",
        "suozaidiqu": "北京",
        "huizhang": "张三",
        "lianxifangshi": "13800138000",
        "chenglishijian": "2025-01-01",
        "huiyuanrenshu": 100,
        "jianjie": "北京地区校友交流平台",
        "zhaopian": "upload/association1.jpg",
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

#### 加入校友会
- **接口**：`POST /jiaruxiaoyouhui/add`
- **描述**：申请加入校友会
- **请求参数**：
  ```json
  {
    "xiaoyouhuiId": 1,     // 校友会ID
    "shenqingriqi": "2025-06-04",  // 申请日期
    "shenqingyuanyin": "string",   // 申请原因
    "userid": 1,           // 用户ID
    "username": "string",  // 用户名
    "name": "string",      // 姓名
    "phone": "string",     // 联系电话
    "zhuangtai": "待审核"  // 状态
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "申请提交成功",
    "data": null
  }
  ```

### 捐赠管理
#### 捐赠项目列表 (XiaoyuanjuanzengController)
- **接口**：`GET /xiaoyuanjuanzeng/list`
- **描述**：获取捐赠项目列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "xiangmumingcheng": "string",  // 项目名称（可选）
    "juanzengtype": "string"      // 捐赠类型（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 5,
      "rows": [{
        "id": 1,
        "xiangmumingcheng": "图书馆建设",
        "xiangmuleixing": "基建项目",
        "juanzengtype": "资金捐赠",
        "juanzengmubiao": 1000000,
        "muqianjine": 500000,
        "xiangmuneirong": "新图书馆建设项目",
        "xiangmuimage": "upload/project1.jpg",
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

#### 我的捐赠记录 (WodejuanzengController)
- **接口**：`GET /wodejuanzeng/list`
- **描述**：获取个人捐赠记录
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "userid": 1,         // 用户ID
    "xiangmuid": 1       // 项目ID（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 2,
      "rows": [{
        "id": 1,
        "userid": 1,
        "username": "张三",
        "xiangmuid": 1,
        "xiangmumingcheng": "图书馆建设",
        "juanzengjine": 1000,
        "juanzengshijian": "2025-06-04",
        "juanzengtype": "资金捐赠",
        "sfsh": "已审核",
        "shhf": "感谢您的捐赠"
      }]
    }
  }
  ```

### 就业服务
#### 职位列表 (GangweiController)
- **接口**：`GET /gangwei/list`
- **描述**：获取职位列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "gangweimingcheng": "string",  // 职位名称（可选）
    "gangweileixing": "string",    // 职位类型（可选）
    "gangweididian": "string"      // 工作地点（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 10,
      "rows": [{
        "id": 1,
        "gangweimingcheng": "高级Java工程师",
        "gangweileixing": "技术研发",
        "gangweididian": "北京",
        "xinzifanwei": "25k-35k",
        "gongzuonianxian": "3-5年",
        "xueli": "本科及以上",
        "zhiweimiaoshu": "负责核心业务系统开发",
        "zhaopinrenshu": 5,
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

#### 招聘信息 (ZhaopinxinxiController)
- **接口**：`GET /zhaopinxinxi/list`
- **描述**：获取招聘信息列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "qiyemingcheng": "string",    // 企业名称（可选）
    "gangweimingcheng": "string", // 职位名称（可选）
    "zhaopinleibie": "string"     // 招聘类别（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 8,
      "rows": [{
        "id": 1,
        "qiyemingcheng": "腾讯科技",
        "qiyeguimo": "10000人以上",
        "gangweimingcheng": "产品经理",
        "zhaopinleibie": "社会招聘",
        "xinzifanwei": "30k-50k",
        "gongzuodidian": "深圳",
        "zhaopinrenshu": 3,
        "gangweiyaoqiu": "5年以上产品经验",
        "lianxiren": "王先生",
        "lianxidianhua": "13900139000",
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

### 校友相亲 (XiaoyouxiangqinController)
#### 相亲信息列表
- **接口**：`GET /xiaoyouxiangqin/list`
- **描述**：获取相亲信息列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "xingbie": "string", // 性别（可选）
    "nianling": "string", // 年龄范围（可选）
    "xueli": "string"    // 学历（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 15,
      "rows": [{
        "id": 1,
        "nickname": "阳光男孩",
        "xingbie": "男",
        "nianling": 28,
        "shengao": "180cm",
        "tizhong": "75kg",
        "xueli": "硕士",
        "gongzuo": "产品经理",
        "gongzuodidian": "北京",
        "yixianghunling": "26-30岁",
        "yaoqiu": "本科及以上学历，性格开朗",
        "zhaopian": "upload/dating1.jpg",
        "userid": 1,
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

### 新闻管理 (NewsController)
#### 新闻列表
- **接口**：`GET /news/list`
- **描述**：获取新闻列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "title": "string",   // 新闻标题（可选）
    "type": "string"     // 新闻类型（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 20,
      "rows": [{
        "id": 1,
        "title": "2025届校友返校日活动圆满结束",
        "introduction": "活动简介",
        "picture": "upload/news1.jpg",
        "content": "活动详细内容",
        "type": "活动新闻",
        "clicknum": 1000,
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

### 论坛管理 (ForumController)
#### 帖子列表
- **接口**：`GET /forum/list`
- **描述**：获取论坛帖子列表
- **请求参数**：
  ```json
  {
    "page": 1,           // 当前页码
    "limit": 10,         // 每页记录数
    "sort": "addtime",   // 排序字段
    "order": "desc",     // 排序方式
    "title": "string",   // 帖子标题（可选）
    "bankuai": "string", // 板块（可选）
    "userid": 1          // 用户ID（可选）
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "success",
    "data": {
      "total": 30,
      "rows": [{
        "id": 1,
        "title": "欢迎加入北京校友会",
        "content": "帖子内容",
        "bankuai": "校友会交流",
        "userid": 1,
        "username": "张三",
        "zan": 10,
        "reply": 5,
        "addtime": "2025-06-04"
      }]
    }
  }
  ```

### 文件上传 (FileController)
#### 上传文件
- **接口**：`POST /file/upload`
- **描述**：文件上传接口
- **请求参数**：
  ```json
  {
    "file": "multipart/form-data", // 上传的文件
    "type": "string",              // 文件类型（avatar - 头像，news - 新闻图片，etc）
    "module": "string"             // 所属模块
  }
  ```
- **返回示例**：
  ```json
  {
    "code": 0,
    "msg": "上传成功",
    "data": {
      "url": "upload/2025/06/04/filename.jpg", // 文件访问路径
      "filename": "filename.jpg",               // 文件名
      "filesize": 1024,                        // 文件大小（字节）
      "filetype": "image/jpeg"                 // 文件类型
    }
  }
  ```

## 错误码说明

### 通用返回格式
```json
{
    "code": 0,      // 返回代码，0表示成功，非0表示失败
    "msg": "success", // 返回信息
    "data": {}      // 返回数据
}
```

### 错误码
- 0：成功
- 401：未登录或token已过期（使用 @IgnoreAuth 注解可以忽略验证）
- 403：权限不足
- 其他非0值：业务错误，具体错误信息在 msg 字段中

### 常见错误信息
- "账号或密码不正确"
- "用户已存在"
- "未登录或登录已过期"
- "没有权限"
- "文件上传失败"
- "请求参数错误"
- "操作失败"

## 数据字典

### 用户状态码
- 0：禁用
- 1：正常

### 活动状态码
- 0：未开始
- 1：进行中
- 2：已结束

### 审核状态码
- 0：待审核
- 1：通过
- 2：拒绝

### 文件类型
- avatar：用户头像
- news：新闻图片
- activity：活动图片
- forum：论坛图片
- product：商品图片

### 性别
- 0：未知
- 1：男
- 2：女

### 支付类型
- 1：支付宝
- 2：微信
- 3：银行卡

### 消息类型
- 1：系统通知
- 2：活动通知
- 3：审核通知
- 4：评论通知
- 5：点赞通知

### 文章状态
- 0：草稿
- 1：已发布
- 2：已下架

## 注意事项
1. 所有需要认证的接口必须在请求头中携带有效的token
2. 文件上传限制：
   - 图片文件大小限制：10MB
   - 支持的图片格式：jpg、jpeg、png、gif
   - 视频文件大小限制：100MB
   - 支持的视频格式：mp4、avi
   - 其他文件大小限制：20MB

3. 接口调用频率限制：
   - 登录接口：每IP每分钟不超过5次
   - 注册接口：每IP每天不超过10次
   - 验证码接口：每IP每分钟不超过3次
   - 普通查询接口：每用户每秒不超过10次
   - 文件上传接口：每用户每分钟不超过10次
   - 点赞/评论接口：每用户每秒不超过3次

4. 接口响应时间说明：
   - 查询类接口：平均响应时间 < 200ms
   - 上传类接口：平均响应时间 < 2s
   - 导出类接口：平均响应时间 < 10s

## 更新日志
- 2025-06-04：初始版本创建

## 待完善内容
1. 补充各接口的详细请求参数
2. 补充各接口的返回示例
3. 补充错误码说明
4. 补充接口调用限制说明
5. 补充业务流程图
6. 补充数据库表结构说明
