/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaegerinitiative.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

/**
 *
 * @author adam
 */
public class XMLTestJaegerCreator {
    private ArrayList<Jaeger> _jaegers;
    public XMLTestJaegerCreator() {
        _jaegers = new ArrayList<Jaeger>();
        createJaegers();
    }
    
    private void createJaegers() {
        String[] jaegerNames = {"Adam Korynta","Ryan Miles","Deziree Dizon","Joshua Degeorge","Chris Bradley"};
        String[] jaegerJId = {"123456","123789","456789","789123","456123"};
        String[] jaegerSId = {"987654","654321","321987","654987","321654"};
        String[] jaegerPhone = {"7073652103","7073652104","7073652105","7073652106","7073652107"};
        String[] jaegerEmail = {"adam@rmanet.com","ryanm@rmanet.com","deziree@rmanet.com","josh@rmanet.com","chris@rmanet.com"};
        for(int i = 0;i < jaegerNames.length;i++ )
        {
            _jaegers.add(new Jaeger(jaegerNames[i], jaegerJId[i], jaegerSId[i], jaegerPhone[i], jaegerEmail[i]));
        }
    }
    public ArrayList<Jaeger> getJaegers()
    {
        return _jaegers;
    }
}
