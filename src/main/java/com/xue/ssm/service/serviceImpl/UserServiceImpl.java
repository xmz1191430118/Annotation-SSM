package com.xue.ssm.service.serviceImpl;
import com.xue.ssm.dao.UserDao;
import com.xue.ssm.pojo.User;
import com.xue.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 16:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }



}
