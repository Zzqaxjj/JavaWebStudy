package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zhangzhenqi
 * @create 2019-12-26 22:05
 */
public class JDKProxyHandler implements InvocationHandler {
    private Object object;
    public JDKProxyHandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         if (method.getName().equals("saveUser")) {
            if (args == null || args.length == 0) {
                System.out.println("用户信息为空");
                return null;
            }
            if (args != null && args[0] instanceof User) {
                User user = (User) args[0];
                if (user.getUsername() == null || user.getUsername().length() == 0) {
                    System.out.println("Username 为空，不保存");
                    return null;
                }
                if (user.getAge() < 0 || user.getAge() > 200) {
                    System.out.println("age 范围不正确，不保存");
                    return null;
                }
                if (user.getSex() == null || user.getSex().length() == 0) {
                    System.out.println("sex 为空，不保存");
                    return null;
                }
            }
         } else if (method.getName().equals("selectUser")) {
             System.out.println("test");
         }
        Object obj = method.invoke(object,args);
        return obj;
    }
}
