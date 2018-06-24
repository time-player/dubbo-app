package cn.zealon.app.user.controller;

import cn.zealon.app.user.entity.User;
import cn.zealon.app.user.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("user/{userId}")
    public User getUserByUserId(@PathVariable String userId){
        return userService.getUserById(userId);
    }
}
