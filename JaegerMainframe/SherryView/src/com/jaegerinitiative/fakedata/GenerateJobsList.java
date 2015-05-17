/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.fakedata;

import com.jaegerinitiative.data.Jaeger;
import com.jaegerinitiative.data.TaskItem;
import java.util.ArrayList;

/**
 *
 * @author Horizon Brave
 */
public class GenerateJobsList {
 private static ArrayList<TaskItem>  _taskItemList;
    public static ArrayList<TaskItem> getInstance()
    {
        if(_taskItemList == null)
        {
            return generateTaskItemList();
        }
        else
        {
            return _taskItemList;
        }
    }

    private static ArrayList<TaskItem> generateTaskItemList() {
        
        _taskItemList = new ArrayList<TaskItem>();
        FakeJobEnums[] values = FakeJobEnums.values();
        for(int i= 0; i < values.length;i++)
        {
            _taskItemList.add(FakeJobEnums.values()[i].getTaskItem());
        }
        return _taskItemList;
    }
    
    public void taskItemAddedDeleted()
    {
        _taskItemList = null;
    }
}
