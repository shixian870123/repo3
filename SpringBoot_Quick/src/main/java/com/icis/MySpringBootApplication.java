package com.icis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot程序的启动类  需要加注解   @SpringBootApplication
@SpringBootApplication
public class MySpringBootApplication {
    //依靠main方法启动我们的应用程序
    public static void main(String[] args) {
       //SpringApplication 类  静态方法  run()方法  用于启动我们的应用程序
        // run() 方法里面两个参数  参数1: 启动的字节码(必须要写) 参数2 main方法参数  可以写  可以不写
        SpringApplication.run(MySpringBootApplication.class,args);
    }
}
