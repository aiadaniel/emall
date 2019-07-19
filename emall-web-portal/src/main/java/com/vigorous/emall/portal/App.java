package com.vigorous.emall.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/26 13:42
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@Configuration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }
}
