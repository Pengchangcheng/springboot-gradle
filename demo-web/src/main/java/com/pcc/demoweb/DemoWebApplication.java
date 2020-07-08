package com.pcc.demoweb;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pcc.*")
@MapperScan(value = "com.pcc", annotationClass = Mapper.class)
public class DemoWebApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
        LOGGER.info("======================================");
        LOGGER.info("==============Web服务启动成功============");
        LOGGER.info("======================================");
    }

}
