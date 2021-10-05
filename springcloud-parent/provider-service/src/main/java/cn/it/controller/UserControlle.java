package cn.it.controller;

import cn.it.domain.User;
import cn.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserControlle {
    @Value("${server.port}")
    private String port;

    //自动获取当前应用的IP地址
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Autowired
    UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById/{id}")
    public User findById(@PathVariable Integer id) {
        //int age = 10/0; //测试熔断降级

        User user = userService.findById(id);
        user.setNote("访问服务地址:"+ "【"+ ip +":"+" "+port+"】被调用");
        return user;
    }
}
