package cn.it.feign;

import cn.it.domain.User;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceCallBack implements ProviderService {

    /**
     * 熔断降级的方法
     */
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setName("feign调用触发熔断降级方法");
        return user;
    }
}
