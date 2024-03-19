package com.owen.mydemo.controller;

import com.owen.mydemo.entity.User;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

/**
 * Author:  wen
 * Date:    2024/3/19
 * Desc:    hello
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String index(){
        return "Hello1";
    }
    @RequestMapping("/hello2")
    public String page2(ModelMap map){
        map.addAttribute("name","yangwen");
        return "Hello2";
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String postTest(@RequestBody User user){
        return "Post请求"+user;
    }




}
