package cn.it.controller;

import cn.it.domain.User;
import cn.it.feign.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderService providerService; //OpenFeign

    @RequestMapping(value = "/feignconsumer/{id}")
    public User findById(@PathVariable("id") Integer id){

        return providerService.findById(id);
    }
}
