/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaegerinitiative.fakedata;

import com.jaegerinitiative.data.TaskItem;

/**
 *
 * @author Amy
 */
public enum FakeJobEnums {
    
    CAVIMAINT(200,100,"CWMS Maintenance"), 
    REGIMAINT(10,400,"REGI Maintenance"), 
    RATINGEDITORMAINT(70,80,"Rating Editor Maintenance");
    private int _moneyUsed;
    private String _name;
    private int _moneyTotal;
    TaskItem _taskItem;
    FakeJobEnums(int moneyUsed, int moneyTotal, String name)
    {
        TaskItem taskItem = new TaskItem();
        taskItem.setFunded(moneyTotal);
        taskItem.setSpent(moneyUsed);
        taskItem.setDescription(name);
        _taskItem = taskItem;
    }

    TaskItem getTaskItem() {
        return _taskItem;
    }
    
}
