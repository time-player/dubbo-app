package cn.zealon.app.user.controller;

import cn.zealon.app.user.entity.User;
import cn.zealon.app.user.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(registry = {"address=zookeeper://47.104.241.41:2181"})
    private UserService userService;

    @RequestMapping("detail/{userId}")
    public User getUserByUserId(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @PostMapping("save")
    public Object save(User user){
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setCreated(new Date());
        userService.updateUser(user);
        return user;
    }
}
