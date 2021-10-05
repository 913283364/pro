package cn.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//开启客户端发现功能
public class ProviderServiceApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication02.class, args);
    }
}
