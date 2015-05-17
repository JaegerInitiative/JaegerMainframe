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
public class TaskItem extends AbstractDataObject{
    
    private String _taskItemId;
    private String _taskDescription;
    private float _taskEstimate;
    private boolean _taskFunded;

    public TaskItem(String _taskItemId, String _taskDescription, float _taskEstimate, boolean _taskFunded) {
        this._taskItemId = _taskItemId;
        this._taskDescription = _taskDescription;
        this._taskEstimate = _taskEstimate;
        this._taskFunded = _taskFunded;
    }
    
    public String getTaskItemId() {
        return _taskItemId;
    }
    
    public void setTaskItemId(String taskItemID) {
        _taskItemId = taskItemID;
    }

    public String getTaskDescription() {
        return _taskDescription;
    }

    public void setTaskDescription(String _taskDescription) {
        this._taskDescription = _taskDescription;
    }

    public float getTaskEstimate() {
        return _taskEstimate;
    }

    public void setTaskEstimate(float _taskEstimate) {
        this._taskEstimate = _taskEstimate;
    }

    public boolean isTaskFunded() {
        return _taskFunded;
    }

    public void setTaskFunded(boolean _taskFunded) {
        this._taskFunded = _taskFunded;
    }
}
