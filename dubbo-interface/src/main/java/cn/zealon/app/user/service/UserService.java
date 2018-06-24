package cn.zealon.app.user.service;

import cn.zealon.app.user.entity.User;

public interface UserService {

    public User getUserById(String userId);

    public int updateUser(User user);
}
