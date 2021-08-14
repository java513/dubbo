package com.lh.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lh.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-dubbo-provider
 * @description:
 * @author: lh
 * @date: 2021-08-14 14:58
 **/
@Service(interfaceClass = IUserService.class)
@Component
public class UserServiceImpl implements IUserService {

    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
