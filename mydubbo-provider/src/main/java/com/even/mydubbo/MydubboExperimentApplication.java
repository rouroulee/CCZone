package com.even.mydubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableDubbo
public class MydubboExperimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydubboExperimentApplication.class, args);
    }

}
