/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.connection.mvc.ConnectionFactory;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lebinhan
 */
public class LoginFunction {
    public Account checkLogin(int id, String password){
        Account account = null;
        String loginSQLScript = "SELECT * FROM user WHERE id=? and password=?";
        Connection connect = ConnectionFactory.getConnection();
        try {
            PreparedStatement prst = connect.prepareStatement(loginSQLScript);
            prst.setInt(1, id);
            prst.setString(2, password);
            ResultSet resultSet = prst.executeQuery();
            if(resultSet.next()){
                account = new Account();
                account.setName(resultSet.getString(3));
            }
            resultSet.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }
}
