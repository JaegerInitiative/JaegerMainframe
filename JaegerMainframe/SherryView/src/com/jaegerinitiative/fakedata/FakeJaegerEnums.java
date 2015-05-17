/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.jaegerinitiative.fakedata;

import com.jaegerinitiative.data.Jaeger;

/**
 *
 * @author Amy
 */
//public class FakeJaegers
//{
public enum FakeJaegerEnums {
    JOSHDEGEORGE("Josh DeGeorge", "12345", "54321", "7073652103", "josh@rmanet.com"), 
    DEZIREEDIZON("Deziree Dizon", "123","321","7073652103", "deziree@rmanet.com"), 
    RYANMILES("Ryan Miles", "123","321","7073652103", "ryanm@rmanet.com"), 
    ADAMKORYNTA("Adam Korynta", "123","321","7073652103", "adam@rmanet.com"), 
    MARKACKERMAN("Mark Ackerman", "123","321","7073652103", "mark@rmanet.com"), 
    SHERRYDALQUIST("Shannon Newbold", "123","321","7073652103", "snewbold@rmanet.com"), 
    SHANNONNEWBOLD("Sherry Dalquist", "123","321","7073652103", "sherry@rmanet.com"), 
    CALEBDECHANT("Caleb Dechant", "123","321","7073652103", "caleb@rmanet.com");
    
    private Jaeger _jaeger;
    FakeJaegerEnums(String name, String jaegerId, String staffId, String phone, String email)
    {
        _jaeger = new Jaeger(name, jaegerId, staffId, phone, email);
    }
    
    public Jaeger getJaeger()
    {
        return _jaeger;
    }
}