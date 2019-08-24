package com.itheima.domain;

import com.itheima.domain.User;

public class QueryVo {
    User user;

    public QueryVo() {
    }

    public QueryVo(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
