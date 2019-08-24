package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import com.itheima.domain.UserInfo;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    List<User> findAll();
    int addUser(User user);
    int deleteUser(int id);
    void updateUser(User user);
    int updateUserByMap(Map<String,Object> map);
    User findUser(int id);
    Map<String,Object> findUserById(int id);
    String findUsernameById(int id);
    long findAllUserCount();
    List<User> findUserByUsername(String username);
    User findUserByQueryVo(QueryVo queryVo);
    UserInfo findUserByUserInfoId(int id);
}
