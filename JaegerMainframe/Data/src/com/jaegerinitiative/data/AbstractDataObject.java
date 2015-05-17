/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Ryan Miles
 */
public abstract class AbstractDataObject {
    protected boolean _modified = false;
    protected PropertyChangeSupport pcs;
    
    public AbstractDataObject(){
        pcs = new PropertyChangeSupport(this);
    }

    public void setModified(boolean _modified) {
        this._modified = _modified;
    }

    public boolean isModified() {
        return _modified;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener pcl){
        pcs.addPropertyChangeListener(pcl);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener pcl){
        pcs.removePropertyChangeListener(pcl);
    }
}
