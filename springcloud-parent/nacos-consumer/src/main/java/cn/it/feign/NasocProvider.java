package cn.it.feign;

import cn.it.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明需要调用的微服务名称
 *  @FeignClient
 *    name : 指定feign调用的服务名称
 *    fallback：配置该服务的降级方法
 */
@Component
@FeignClient(name = "nacos-provider")
public interface NasocProvider {

    //请求到服务名的controller中，必须按照它的路径来写才能访问
    @RequestMapping(value="/user/findById/{id}")
    User findById(@PathVariable("id") Integer id);
}