package cn.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启Eureka服务注册中心
public class EurekaServerApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication02.class, args);
    }
}
