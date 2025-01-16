package com.owen.mydemo.controller;

import com.owen.mydemo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  wen
 * Date:    2025/1/16
 * Desc:    转发json
 */
@RestController
public class UserController {

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        // 这里可以添加业务逻辑，例如将用户信息保存到数据库
        System.out.println("Received user: " + user);
        // 假设我们只是简单地返回接收到的用户对象
        return user;
    }
}
