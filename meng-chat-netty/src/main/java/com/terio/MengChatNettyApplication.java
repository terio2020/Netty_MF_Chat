package com.terio;

import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 扫描mybatis mapper 的包路径
@MapperScan(basePackages = "com.terio.mapper")
public class MengChatNettyApplication {

    @Bean
    public SpringUtil getSpingUtil() {
        return new SpringUtil();
    }

    public static void main(String[] args) {
        SpringApplication.run(MengChatNettyApplication.class, args);
    }

}
