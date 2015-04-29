/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.data;

/**
 *
 * @author Gypsy Danger
 */
public class TaskItem {
    String _taskItemId;
    String _description;
    String _activeStaff;
    double _funded;
    double _spent;
    
    public TaskItem() {
        
    }
    
    public String getTaskItemId() {
        return _taskItemId;
    }
    
    public void setTaskItemId(String taskItemID) {
        _taskItemId = taskItemID;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public void setDescription(String description) {
        _description = description;
    }
    
    public String getActiveStaff() {
        return _activeStaff;
    }
    
    public void setActiveStaff(String activeStaff) {
        _activeStaff = activeStaff;
    }
    
    public double getFunded() {
        return _funded;
    }
    
    public void setFunded(double funded) {
        _funded = funded;
    }
    
    public double getSpent() {
        return _spent;
    }
    
    public void setSpent(double spent) {
        _spent = spent;
    }
}
