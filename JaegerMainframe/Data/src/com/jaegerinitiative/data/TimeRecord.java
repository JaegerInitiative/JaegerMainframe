/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.data;

import java.util.Date;

/**
 * This is the standard TimeRecord object that will be used throughout the JaegerMainframe. 
 * 
 * @author Coyote Tango
 */
public class TimeRecord
{
    String _userId;
    String _taskItemId;
    Double _hours;
    Date _date;
    String _notes;
    String _geminiRecords;
    String _attachments;
    
    /**
     * Default, empty constructor.
     */
    public TimeRecord() 
    {
        //do nothing...
    }
    
    public TimeRecord(String userId, String taskItemId, Double hours, Date date, String notes, String geminiRecords, String attachments)
    {
        _userId = userId;
        _taskItemId = taskItemId;
        _hours = hours;
        _date = date;
        _notes = notes;
        _geminiRecords = geminiRecords;
        _attachments = attachments;
    }

    public String getUserId()
    {
        return _userId;
    }

    public void setUserId(String _userId)
    {
        this._userId = _userId;
    }

    public Double getHours()
    {
        return _hours;
    }

    public void setHours(Double _hours)
    {
        this._hours = _hours;
    }

    public Date getDate()
    {
        return _date;
    }

    public void setDate(Date date)
    {
       _date = date;
    }

    public String getNotes()
    {
        return _notes;
    }

    public void setNotes(String notes)
    {
       _notes = notes;
    }

    public String getAttachments()
    {
        return _attachments;
    }

    public void setAttachments(String attachments)
    {
        _attachments = attachments;
    }    
}
