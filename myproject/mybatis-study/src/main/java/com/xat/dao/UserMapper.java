package com.xat.dao;

import com.xat.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 淡漠
 */
public interface UserMapper {
    /**
     * 获取用户列表
     * @return
     */

    //@Select("select * from user")
    List<User> getUserList();

    /**
     * 通过ID查询特定用户
     * @param id
     * @return
     */
    //@Select("select * from user where id=#{uid}")
    User getUserById(@Param("uid") String id);

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
    //@Insert("insert into user (id,name,age) values (#{id},#{name},#{age})")
    int addUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUserInfo(User user);
}
