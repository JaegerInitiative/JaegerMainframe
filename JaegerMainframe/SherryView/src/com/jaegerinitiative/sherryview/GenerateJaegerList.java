/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaegerinitiative.sherryview;

import com.jaegerinitiative.data.Jaeger;
import com.jaegerinitiative.fakedata.FakeJaegerEnums;
import java.util.ArrayList;

/**
 *
 * @author Horizon Brave
 */
public class GenerateJaegerList {

    private static ArrayList<Jaeger>  _jaegerList;
    public static ArrayList<Jaeger> getInstance()
    {
        if(_jaegerList == null)
        {
            return generateJaegerList();
        }
        else
        {
            return _jaegerList;
        }
    }

    private static ArrayList<Jaeger> generateJaegerList() {
        
        _jaegerList = new ArrayList<Jaeger>();
        FakeJaegerEnums[] values = FakeJaegerEnums.values();
        for(int i= 0; i < values.length;i++)
        {
            _jaegerList.add(FakeJaegerEnums.values()[i].getJaeger());
        }
        return _jaegerList;
    }
    
    public void jaegerAddedDeleted()
    {
        _jaegerList = null;
    }

}
