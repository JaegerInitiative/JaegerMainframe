package com.jaegerinitiative.sherryview;


import com.jaegerinitiative.data.Jaeger;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class SVEmpTableModel implements TableModel{

    ArrayList<Jaeger> _jaegerList;

    private int findMonthlyHours(Jaeger get) {
        return (0 + (int)(Math.random()*10)); 
    }

    
    protected enum ColumnListEmp{
        EMPNAME(0, "Employee", String.class), HOURS(1, "Hours", String.class), POKE(2, "Poke", String.class);
        private int _column;
        private String _name;
        private Class _colClass;
        private ColumnListEmp(int value, String name, Class colClass) {
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
    public SVEmpTableModel(ArrayList<Jaeger> jaegerList)
    {
        super();
        _jaegerList = jaegerList;
    }
    @Override
    public int getRowCount() {
        return _jaegerList.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnListEmp.values().length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        for(int i = 0; i < ColumnListEmp.values().length;i++)
        {
            ColumnListEmp col = ColumnListEmp.values()[i];
            
            if(col.getColumn() == columnIndex)
            {
                return col.getName();
            }
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        for(int i = 0; i < ColumnListEmp.values().length;i++)
        {
            ColumnListEmp col = ColumnListEmp.values()[i];
            
            if(col.getColumn() == columnIndex)
            {
                return col.getColClass();
            }
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == ColumnListEmp.POKE.getColumn())
        {
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == ColumnListEmp.EMPNAME.getColumn())
        {
            return _jaegerList.get(rowIndex).getName();
        }
        else if(columnIndex == ColumnListEmp.HOURS.getColumn())
        {
            return findMonthlyHours(_jaegerList.get(rowIndex));
        }
        else if(columnIndex == ColumnListEmp.POKE.getColumn())
        {
            return "Poke";
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       return;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Jaeger getJaegerAt(int rowIndex)
    {
        return _jaegerList.get(rowIndex);
    }
}
