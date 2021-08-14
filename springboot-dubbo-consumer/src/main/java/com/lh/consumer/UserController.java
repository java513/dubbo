package com.lh.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lh.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-dubbo-consuer
 * @description:
 * @author: lh
 * @date: 2021-08-14 15:05
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference(check = false)
    private IUserService userService;
    @RequestMapping("/sayhello")
    public String sayhello(String name){
        return userService.sayHello(name);
    }
}
