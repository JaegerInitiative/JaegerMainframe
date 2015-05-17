/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ryan Miles
 */
public abstract class AbstractDataManager {
    
    public Connection getConnection(){
        Connection retval = null;
        try
        {
            retval = DriverManager
                    .getConnection("jdbc:mysql://jaegerinitiative.c5hzumrlsx2m.us-west-2.rds.amazonaws.com:3306/JaegerMainframe?",
                            "shatterdome", "P4ssw0rd4U");

        } catch (SQLException e)
        {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        return retval;
    }
}
