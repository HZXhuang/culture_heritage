

## 湖湘传统技艺类非物质文化遗产数字化与虚拟体验平台

基于SpringBoot、Vue、A-Frame等技术开发的一个Web应用平台，旨在让用户感受到到湖湘传统技艺类非物质文化遗产的魅力。

####  开发中遇到的问题及解决方案

| 问题类别 | 问题名称                                                     | 发生原因      |                           解决办法                           |
| :------: | :----------------------------------------------------------: | :-----------: | :----------------------------------------------------------: |
| 安装     | maven打包报错：The POM for **jar** is invalid, transitive dependencies (if any) will not be available | jar包下载出错 | 找到maven仓库，根据错误提示，找到指定版本并删除该版本目录，然后重新下载依赖包 |
| 安装 | npm运行报错：A complete log of this run can be found in ** | 依赖包有问题 | 删除node_modules文件夹并清除缓存，再运行npm install重新安装依赖包 |
|设计	|非物质文化遗产3D模型构建	|知识有限加之时间有限	|在一些网站上寻找已构建好的3D模型|
|设计 |页面布局和样式设计	|代码量多导致没有多少时间进行页面设计及美化	|利用Element-UI所提供的页面布局及组件并参考优秀网页进行页面设计|
|开发	|用户修改个人信息后，头部导航栏依然显示用户历史状态|	视图和数据更新未同步|	用户修改个人信息后需通知状态管理器及时更新用户信息|
|开发|头部导航栏用户信息显示更新后再次刷新页面会退回至原始状态|	状态管理器不能持久化存储，当vuex刷新时会将状态置空|	利用storage进行本地存储|

####  重要的业务功能的接口设计
| 接口名称               | 接口功能                   | 输入变量或对象       | 输出对  象 | 备注                                                         |
| --------------------------- | -------------------------- | -------------------- | ---------- | ------------------------------------------------------------ |
| login                        | 用户登录                   | user                 | Result对象 | 需要传递封装用户名和密码的请求体，返回封装响应码、响应码描述以及用户信息Result对象 |
| update                      | 用户修改信息               | user                 | Result对象 | 需要传递用户名以及要修改的信息的请求体，返回返回封装响应码以及响应码描述的Result对象 |
| rPassword                   | 用户修改密码               | userPassword         | Result对象 | 需要传递封装用户名、原始密码以及修改后的密码，返回返回封装响应码以及响应码描述的Result对象 |
| register                    | 用户账号注册               | user                 | Result对象 | 需要传递封装用户信息的请求体，返回封装响应码以及响应码描述的Result对象 |
| uploadAvatar                | 用户修改头像               | file、id             | Result对象 | 需要传递用户id和图片，返回封装图片url的Result对象            |
| getAllOfflineActivity       | 获取线下活动               | 无                   | Result对象 | 返回封装响应码、响应码描述以及所有管理员通过的线下活动的集合的Result对象 |
| getAllOfflineActivityByPage | 分页获取线下活动           | pageSize、pageNumber | Result对象 | 需要封装页面的大小以及当前页码的请求体，返回封装响应码、响应码描述以及分页查询结果的Result对象 |
| activityPromotionApply      | 用户申请宣传线下活动       | offlineActivity      | Result对象 | 需要传递封装用户申请信息的请求体，返回封装响应码以及响应码描述的Result对象 |
| getAllForum                 | 获取所有论坛信息           | pageSize、pageNumber | Result对象 | 需要封装页面的大小以及当前页码的请求体，返回封装响应码、响应码描述以及分页查询结果的Result对象 |
| upload                      | 上传文件到本地             | file                 | Result对象 | 上传普通文件                                                 |
| editorUpload                | 富文本上传                 | file                 | JSON       | 上传富文本                                                   |
| findByPage                  | 分页查询所有数字化文化遗产 | pageSize、pageNum    | Result对象 | 需要封装页面的大小以及当前页码的请求参数，返回封装响应码、响应码描述以及分页查询结果的Result对象 |
| getFiles                    | 文件下载                   | flag、response       | 无         | 下载文件                                                     |
| getAllHeritageByPage        | 分页查询所有的文化遗产     | pageSize、pageNumber | Result对象 | 需要封装页面的大小以及当前页码的请求参数，返回封装响应码、响应码描述以及分页查询结果的Result对象 |
| searchHeritage              | 查询文化遗产               | searchHeritage       | Result对象 | 需要封装查询信息的请求体，返回封装响应码、响应码描述以及模糊分页查询结果的Result对象 |
| searchDistribute            | 查询文化遗产的分布情况     | 无                   | Result对象 | 返回封装响应码、响应码描述以及湖南省内各个地区文化遗产数量结果的Result对象 |
| searchHotHeritage           | 查询热点非物质文化遗产     | pageSize、pageNum    | Result对象 | 需要封装页面的大小以及当前页码的请求体，返回封装响应码、响应码描述以及分页查询结果的Result对象 |

