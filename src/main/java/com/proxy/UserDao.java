package com.proxy;

import java.util.List;

public interface UserDao {
    /**
     * @param user
     * 保存用户方法
     */
    public void saveUser(User user);
    /**
     * @param user
     * 删除用户方法
     */
    public void deleteUser(User user);
    /**
     * @param user
     * 查询用户方法
     */
    public List selectUser();
}
