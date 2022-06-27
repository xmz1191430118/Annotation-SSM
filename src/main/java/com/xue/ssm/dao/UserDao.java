package com.xue.ssm.dao;

import com.xue.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 17:31
 */
@Repository
public interface UserDao {
    public User getUserById(Integer id);
    public List<User> getAllUser();
}
