

## 湖湘传统技艺类非物质文化遗产数字化与虚拟体验平台

基于SpringBoot、Vue、A-Frame等技术开发的一个Web应用平台，旨在让用户感受到到湖湘传统技艺类非物质文化遗产的魅力。

## 产品设计
### 产品使命、口号和策略
1. 产品名称：
 湖湘传统技艺类非物质文化遗产数字化与虚拟体验平台
2. 产品的使命：
让每位湖湘文化热爱者都能身临其境地感受湖湘非物质文化遗产之美，发扬与传承湖湘地域文化
3. 产品的口号：云上拾遗路，守护潇湘情。
4. 目标用户：大众、对传承湖湘文化感兴趣的用户。
5. 如何争取目标用户：对湖湘非物质文化遗产进行数字化，让用户能够全面了解湖湘非物质文化遗产；利用AR技术让用户虚拟体验非物质文化遗产，用户也能预约线下体验非物质文化遗产；通过短视频宣传或与湖南当地的非物质文化遗产保护中心合作，加大产品的宣传力度。
6. 团队优势：团队成员对非物质文化遗产比较感兴趣，学习和开发能力较强，团队合作意识强。
7. 竞争对手与差异化竞争：互联网上已有一些对我国非物质文化遗产展示的平台，但只是介绍，并且基本没有用到AR或VR技术让用户能够虚拟体验，我们所设计的产品针对性比较强，是针对湖湘非物质遗产。

### 产品定义
1. 解决的问题
    - 突破了人们对文化传播的认知结构，使湖湘非物质文化遗产传承主体更多元，传播形式更多样。
    - 构建一种崭新的传播形态，实现裂变式传播，使湖湘非物质文化遗产的传播变得更快捷、更高效、更精准。
    - 为湖湘非物质文化遗产的传承培养人才。
    - 通过建立更大的文化传播平台、刺激更广的文化消费、转化更多的文化资源，可促进非物质文化遗产更有效的传播和更高质量的利用。
2. 对客户的价值
    - 多种方式感受湖湘非物质文化遗产，学习并传承湖湘非物质文化遗产
    - 实现场景漫游、文化探索、作品欣赏、模拟操作等功能，以期运用数字化的方式促进湖湘非物质文化遗产展示多元化、体验模式沉浸化、传播范围广泛化。让大众足不出户便可学习文化，体验技艺，获得在湖湘非遗传播传承过程中的参与感、认同感及文化自信。
3. 解决方案
    - 基于3D建模和数字交互的web应用平台。

## 产品设计应用的原则
1. 需求原则：充分考虑目标用户的特点和行为，将用户需求置于首位，设计出能满足用户需求和期望的产品。 
2. 继承原则：批判性借鉴中国非物质文化遗产官网功能设计的优点以及现成3D模型设计亮点，融合湖湘文化地域特色进行产品功能设计。
3. 创新原则：借助虚拟仿真技术对非物质文化遗产进行真实再现，让用户可以身临其境地感受非物质文化遗产之美，超越传统非物质文化遗产网站枯燥乏味的平面化浏览参观方式 。
4. 效益原则：基于互联网和虚拟仿真技术，给公众带来对湖湘非物质文化遗产全新的交流体验，增进公众对湖湘非物质文化遗产的认同感，拓宽湖湘非物质文化遗产传播时空，这是产品的文化效益。

## 产品实现
### 用户体验设计考虑的因素
1. 对用户的分类：只针对于热爱湖湘传统技艺类非物质文物的用户，根据产品的特点获取目标用户的对于特定产品的感受。
2. 注重交互设计：由于3D模型的元素，设计过程中关注用户可能的行为，定义系统如何配合与响应，组织信息，并设计信息的层级关系。
3. 视觉设计满足用户的感官感受：在颜色上以及布局方面对比明显，将用户视线落到对3D模型体验等重要位置，突出重点的同时，符合用户审美。
4. 将界面、导航、信息设计紧密结合：在产品设计前了解、尊重用户的习惯，并选择正确的界面元素；本产品通过全局导航、局部导航、上下文导航等引导用户去下一步；信息设计是利用图片、列表将湖湘技艺类非遗文物和用户个人信息分组并简单展现。
5. 根据功能优先级设计用户体验：本产品的核心功能是用3D方式给用户虚拟化展示湖湘技艺类非遗文物，给用户沉浸式的体验。在用户体验的过程中，优先考虑高优先级的3D模型功能是否满足产品战略目标与技术可行性。







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

####  工具类的接口设计
| 工具类             | 功能                                     | 说明                                                         |
| ------------------ | :--------------------------------------- | ------------------------------------------------------------ |
| ResponseStatusEnum | 封装所有的响应码和响应码说明             | 以枚举类的形式统一封装后台对前端请求处理结果所有可能的响应码和响应码描述信息 |
| MD5Util            | 对用户存储到数据库的密码进行简单MD5加密  | 对存储到数据库的用户密码简单加密防止用户密码泄露，同时通过对用户密码再次加密可以对比用户密码正确性 |
| Result             | 封装响应码、响应码说明以及返回前端的数据 | 对于前端的不同请求，以统一的方式封装对不同的处理结果返回的不同响应码、响应码描述信息以及相关数据 |


