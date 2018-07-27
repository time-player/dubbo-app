# dubbo-app

  构建一个最基础的Dubbo程序

# 准备
  1. 开发环境：JDK8、Eclipse（Idea）、SpringBoot  
  2. 开发结构：遵照Dubbo官方建议，服务消费者 + API层 + 服务提供者  
  3. 项目工程：dubbo-interface + dubbo-provider + dubbo-web  
  
  其中工程结构及说明如下：

工程名称 | 说明    
------- | -------    
 dubbo-interface | 程序接口层，主要定义：<br>1.模型对象(即实体类)<br>2.业务接口    
dubbo-provider | 服务提供者：<br>需要引用接口层，并实现接口方法，配置为dubbo服务；<br>然后将服务对外暴露出去(通常将服务注册到注册中心)，供服务消费者使用。
 dubbo-web | 服务消费者：<br> 需要引用接口层，配置注册中心，通过注册中心来使用接口的服务来实现业务逻辑。

  更多说明详见：http://zealon.cn/article/dubbo-simple-project
