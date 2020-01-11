package com.src;

import java.sql.SQLException;

/**
 * @Author src
 * @Create 2019-12-22 下午 17:15
 */
public class TestMain {
    private static UserService us = new UserService();
    public static void main(String[] args) throws SQLException {
//        userAdd();
        update();
    }


    public static void userAdd(){
 
        UserBean bean = new UserBean();
        bean.setLoginname("张三");
        bean.setPassword("123");
        bean.setAge(20);
        us.add(bean);
    }

    public static void update(){
        UserBean bean = new UserBean();
        bean.setId(2);
        bean.setLoginname("root");
        bean.setPassword("123456");
        bean.setAge(30);
        us.update(bean);
    }
}
