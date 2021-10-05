package cn.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine //trubin配置
@EnableHystrixDashboard
public class TurbinAppliation {

    public static void main(String[] args){
        SpringApplication.run(TurbinAppliation.class,args);
    }
}
