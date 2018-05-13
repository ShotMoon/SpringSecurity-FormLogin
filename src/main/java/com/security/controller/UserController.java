package com.security.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ShotMoon
 */
@RestController
public class UserController {

    /**
     * @description : 
     * @param : []
     * @return : java.util.List<com.shotmoon.dto.User>
     * @date : 2018/5/10 18:28
     */
    @GetMapping("/user")
    public String enter(){

        String success = "登录成功";

        return success;
    }
}
