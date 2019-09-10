package com.spring.service.impl;

import com.spring.pojo.User;
import com.spring.service.UserService;

public class MobileUserServiceImpl implements UserService {
    private User user;

    @Override
    public User login() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
