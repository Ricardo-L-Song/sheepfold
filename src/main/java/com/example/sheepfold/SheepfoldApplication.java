package com.example.sheepfold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.sheepfold.dao")//这个注解注意一下 放DAO层的包名 对这个包下进行注入
@EnableCaching //开启redis缓存 1.Redis单机版
public class SheepfoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheepfoldApplication.class, args);
    }

}
