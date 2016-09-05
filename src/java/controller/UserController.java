/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author klgsa
 */
public class UserController {

    public static boolean addUser(User user) throws SQLException, ClassNotFoundException {

        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = DBConnection.getInstance().getConnection();
            stm = connection.prepareStatement("insert into user valuse(?,?,?,?,?,?,?)");
            stm.setObject(2, user.getName());
            stm.setObject(3, user.getEmail());
            stm.setObject(4, user.getTelNo());
            stm.setObject(5, user.getUserName());
            stm.setObject(6, user.getPassword());
            int res = stm.executeUpdate();
            if (res > 0) {
                return true;
            }
            return false;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (stm != null) {
                stm.close();
            }
        }
    }

    public static boolean deleteUser(String uid) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            stm = connection.prepareStatement("detete from user where uid='" + uid + "'");
            int res = stm.executeUpdate();
            if (res > 0) {
                return true;
            }
            return false;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (stm != null) {
                stm.close();
            }
        }
    }

    public static boolean upDateUser(User user) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            stm = connection.prepareStatement("update user set name=?,email=?,telNo=?,userName=?,password=? where uid=?");
            stm.setObject(1, user.getName());
            stm.setObject(2, user.getEmail());
            stm.setObject(3, user.getTelNo());
            stm.setObject(4, user.getUserName());
            stm.setObject(5, user.getPassword());
            stm.setObject(6, user.getuID());
            int res = stm.executeUpdate();
            if (res > 0) {
                return true;
            }
            return false;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (stm != null) {
                stm.close();
            }
        }

    }
    
    
}
