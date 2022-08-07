# 将各个微服务注册进Eureka服务中心
* 1.先在微服务中导入对应的maven依赖包
* 2.在yaml文件中添加对应的配置，开启注册功能
* 3.在每个微服务的主程序类上添加一个@EnableEurekaClient注解
* 4.区别：注册服务中心类与各个微服务类所引入的依赖包和注解是不同的！

# 集群环境的搭建
>  理解所谓的：互相注册，相互守望，你中有我，我中有你。
>  修改本地文件 ：MAC电脑：使用这个命令--》sudo vim /etc/hosts
>  ##############SPRING_CLOUD_2022###############
>  127.0.0.1 eureka7001.com
>  127.0.0.1 eureka7002.com
>  127.0.0.1 eureka7003.com
>  ############## END #########################

# 多服务器端情况下，消费端该如何找服务器
*     @LoadBalanced  作用： 赋予RestTemplate负载均衡的能力
* 在消费端中的配置类ApplicationContextConfig中restTemplate()上添加@LoadBalanced注解。否则无法实现多服务器

   
   
   
   
   
