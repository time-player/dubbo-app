package cn.zealon.app.user.server.impl;

import cn.zealon.app.user.entity.User;
import cn.zealon.app.user.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import cn.zealon.app.user.dao.UserMapper;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.insert(user);
    }
}
