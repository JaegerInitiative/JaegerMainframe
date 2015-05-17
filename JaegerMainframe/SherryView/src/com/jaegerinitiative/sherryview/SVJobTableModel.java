/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package com.jaegerinitiative.sherryview;

import com.jaegerinitiative.data.TaskItem;
import com.jaegerinitiative.fakedata.FakeJobEnums;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Horizon Brave
 */
public class SVJobTableModel implements TableModel{
    private final ArrayList<TaskItem> _taskItems;
    protected enum ColumnListJobs{
        TASKNAME(0, "Task Item", String.class), MONEYUSED(1, "Money Used", int.class), MONEYTOTAL(2, "Money Total", int.class);
        private int _column;
        private String _name;
        private Class _colClass;
        private ColumnListJobs(int value, String name, Class colClass) {
            this._column = value;
            this._name = name;
            this._colClass = colClass;
        }
        public int getColumn()
        {
            return _column;
        }
        public String getName()
        {
            return _name;
        }
        public Class getColClass()
        {
            return _colClass;
        }
        
    }
    
    public SVJobTableModel(ArrayList<TaskItem> taskItems)
    {
        _taskItems = taskItems;
    }
    @Override
    public int getRowCount() {
        return FakeJobEnums.values().length;
    }
    
    @Override
    public int getColumnCount() {
        return ColumnListJobs.values().length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        for(int i = 0; i < ColumnListJobs.values().length;i++)
        {
            ColumnListJobs col = ColumnListJobs.values()[i];
            
            if(col.getColumn() == columnIndex)
            {
                return col.getName();
            }
        }
        return "";
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        for(int i = 0; i < ColumnListJobs.values().length;i++)
        {
            ColumnListJobs col = ColumnListJobs.values()[i];
            
            if(col.getColumn() == columnIndex)
            {
                return col.getColClass();
            }
        }
        return null;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == ColumnListJobs.TASKNAME.getColumn())
        {
            return _taskItems.get(rowIndex).getDescription();
        }
        else if (columnIndex == ColumnListJobs.MONEYUSED.getColumn())
        {
            return _taskItems.get(rowIndex).getSpent();
        }
        else if (columnIndex == ColumnListJobs.MONEYTOTAL.getColumn())
        {
            return _taskItems.get(rowIndex).getFunded();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void addTableModelListener(TableModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void removeTableModelListener(TableModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
