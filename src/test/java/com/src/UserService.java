package com.src;

import com.src.util.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author src
 * @Create 2019-12-22 下午 17:05
 */
public class UserService {

    private dbUtil util = new dbUtil();
    public void add(UserBean bean) {
        Connection con = null;
        PreparedStatement stat = null;
        int i = 0;
        try {
            con = util.getCon();
            stat = con.prepareStatement("insert into portal_user values(null,? , ? , ?)") ;
            stat.setString(1,bean.getLoginname());
            stat.setString(2,bean.getPassword());
            stat.setInt(3,bean.getAge());
            i = stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(i>0){
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
    }


    public void update(UserBean bean){
        Connection con = null;
        PreparedStatement stat = null;
        int i = 0;
        try {
            con = util.getCon();
            stat = con.prepareStatement("update portal_user set loginname = ? , password = ? , age = ? where id = ?") ;
            stat.setString(1,bean.getLoginname());
            stat.setString(2,bean.getPassword());
            stat.setInt(3,bean.getAge());
            stat.setInt(4,bean.getId());
            i = stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
}
