package com.proxy;

import java.util.List;

/**
 * @author Zhangzhenqi
 * @create 2019-12-26 21:45
 */
public class UserDaoImpl implements UserDao{
    public void saveUser(User user) {
        System.out.println("添加用户:"+user.getUsername()+","+user.getAge()+","+user.getSex());
    }

    public void deleteUser(User user) {
        System.out.println("删除用户"+user.getUsername()+","+user.getAge()+","+user.getSex());
    }

    public List selectUser() {
        System.out.println("查询用户");
        return null;
    }
}
