package com.xat.dao;

import com.xat.pojo.User;

import java.util.List;

/**
 * @author 淡漠
 */
public interface UserDao {
    /**
     * 获取用户列表
     * @return
     */
    List<User> getUserList();
}
