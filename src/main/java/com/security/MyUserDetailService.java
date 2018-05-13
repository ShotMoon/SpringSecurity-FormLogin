package com.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


/**
 * @author ShotMoon
 */
@Component
public class MyUserDetailService implements UserDetailsService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * @description :
     * @param : [username]
     * @return : org.springframework.security.core.userdetails.UserDetails
     * @date : 2018/5/12 23:11
     */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("用户名：" + username);

        //根据用户名到数据库查找用户的信息，这里我省略掉，使用mock数据
        String password = passwordEncoder.encode("123");
        logger.info("数据库加密密码：" + password);

        return new User(username, password,
                true,true,true,true,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
