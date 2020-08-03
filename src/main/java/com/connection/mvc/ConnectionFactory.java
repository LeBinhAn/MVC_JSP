/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection.mvc;

import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author lebinhan
 */
public class ConnectionFactory {
    public static Connection getConnection(){
        Connection _connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            /*Connection information*/
            String host = "jdbc:mariadb://localhost:3306/BTECOnlineExample";
            String username = "root";
            String password = "123";
            try {
                _connection = DriverManager.getConnection(host, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return _connection;
    }
}
