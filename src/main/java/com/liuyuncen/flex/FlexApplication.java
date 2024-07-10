package com.liuyuncen.flex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiang
 */
@SpringBootApplication
@MapperScan("com.liuyuncen.flex.mapper")
public class FlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexApplication.class, args);
    }

}
