package cn.it.service.impl;

import cn.it.dao.UserDao;
import cn.it.domain.User;
import cn.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
