package com.xat.dao;

import com.xat.pojo.User;

import java.util.List;

/**
 * @author 淡漠
 */
public interface UserMapper {
    /**
     * 获取用户列表
     * @return
     */
    List<User> getUserList();

    /**
     * 通过ID查询特定用户
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 通过ID删除用户
     * @param id
     * @return
     */
    int deleteUserById(String id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUserInfo(User user);
}
