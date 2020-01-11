package com.src.util;

import javassist.bytecode.stackmap.TypeData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author src
 * @Create 2019-12-22 下午 16:09
 */
public class dbUtil {
    private static String dbDriver = "com.mysql.cj.jdbc.Driver";

    private static String url = "jdbc:mysql://localhost:3306/db_util?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";

    private static String user = "root";

    private static String password = "1";

    static {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getCon() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }

}
