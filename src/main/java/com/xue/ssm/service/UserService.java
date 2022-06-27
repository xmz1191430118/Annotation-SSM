package com.xue.ssm.service;

import com.xue.ssm.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 16:38
 */
@Transactional
public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUser();

}
