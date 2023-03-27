# microservice_base

#### 介绍
SpringBoot 基于Spring+SpringMvc自动配置框架  
Mybatis ORM框架  
Dubbo RPC框架  
Nacos 配置和注册中心  
Seata 分布式事务框架  

#### 软件架构
使用Nacos作为微服务注册和配置中心，Dubbo服务之间相互调用，对订单和库存服务实现分布式事务控制。  
wfs-api 接口层  
wsf-storage-prodiver 库存服务提供者  
wsf-order-provider   订单服务提供者  
wsf-provider         聚合服务提供者  
wsf-consumer		 消费者  

#### 安装教程

安装Nacos-server，配置seata的config配置文件  
安装Seata-server  

#### 使用说明

启动Nacos-server  
启动Seata-server  

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
