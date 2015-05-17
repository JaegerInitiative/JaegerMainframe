/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan Miles
 */
public class DbTaskItemManager extends AbstractDataManager{
    private static final String TABLE_NAME = "TaskItem";
    private static final String TASK_ITEM_ID = "TaskItemId";
    private static final String TASK_DESCRIPTION = "TaskDescription";
    private static final String TASK_ESTIMATE = "TaskEstimate";
    private static final String TASK_FUNDED = "TaskFunded";
    
    private List<TaskItem> cache = new ArrayList<>();
    
    public DbTaskItemManager(){
    }
    
    public List<TaskItem> getTaskItems(){
        List<TaskItem> retval = new ArrayList<>();
        
        retval = loadTaskItemsFromDb();
        
        return retval;
    }

    private List<TaskItem> loadTaskItemsFromDb() {
        List<TaskItem> retval = new ArrayList<>();
        
        try{
            Connection c = getConnection();
            
            Statement statement = c.createStatement();
            
            ResultSet resultSet;
            
            resultSet = statement.executeQuery("select * from " + TABLE_NAME);
            
            while (resultSet.next()){
                
            }
            
        }catch (SQLException ex){
            Logger.getLogger(DbTaskItemManager.class.getName()).log(Level.SEVERE, "SQL Exception.", ex);
        }
        
        return retval;
    }
}
