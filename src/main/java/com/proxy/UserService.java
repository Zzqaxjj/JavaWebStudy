package com.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Zhangzhenqi
 * @create 2019-12-26 21:48
 */
public class UserService {
    public static void main(String[] args) {
        //静态代理
        //staticProxyTest();
        //JDK 动态代理
        jdkProxyTest();
    }

    private static void jdkProxyTest() {
        User user = new User("张三",12,"男");
        UserDao userDao = new UserDaoImpl();
        JDKProxyHandler jdkProxyHandler = new JDKProxyHandler(userDao);
        UserDao jdkProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                jdkProxyHandler
        );
        jdkProxy.saveUser(user);
        jdkProxy.selectUser();
    }

    private static void staticProxyTest() {
        User user = new User("张三",12,"男");
        UserDao userDao = new UserDaoImpl();
        StaticProxy staticProxy = new StaticProxy(userDao);
        staticProxy.saveUser(user);
    }
}
