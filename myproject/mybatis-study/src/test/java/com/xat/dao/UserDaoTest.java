package com.xat.dao;

import com.xat.pojo.User;
import com.xat.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一(推荐)
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            //方式二
            List<User> users = sqlSession.selectList("com.xat.dao.UserMapper.getUserList");
            for (User user : users) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一(推荐)
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById("4");
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一(推荐)
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int num = mapper.deleteUserById("1");
            System.out.println(num);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    /**
     * 增删该必须提交事务
     */
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一(推荐)
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int num = mapper.addUser(new User("4","wangwu",45));
            System.out.println(num);
            //提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUserInfo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int num = mapper.updateUserInfo(new User("4","王二麻子",32));
            System.out.println(num);
            //提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
