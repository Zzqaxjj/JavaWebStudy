package com.proxy;

import java.util.List;

/**
 * @author Zhangzhenqi
 * @create 2019-12-26 21:47
 */
public class StaticProxy implements UserDao{
    private UserDao userDao;
    public StaticProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        if (user.getUsername() == null || user.getUsername().length() == 0) {
            System.out.println("Username 为空，不保存");
            return;
        }
        if (user.getAge() < 0 || user.getAge() > 200) {
            System.out.println("age 范围不正确，不保存");
            return;
        }
        if (user.getSex() == null || user.getSex().length() == 0) {
            System.out.println("sex 为空，不保存");
            return;
        }
        userDao.saveUser(user);
    }

    public void deleteUser(User user) {

    }

    public List selectUser() {
        return null;
    }
}
