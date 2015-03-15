/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jm.data;

/**
 * At RMA we don't just have employees... we have hunters... we have Jaegers!
 * 
 * @author Coyote Tango
 */
public class Jaeger
{
    String _name;
    String _jaegerId;
    String _staffId;
    String _phone;
    String _email;

    /**
     * Empty constructor
     */
    public Jaeger()
    {
        //do nothing...
    }
    
    public Jaeger(String name, String jaegerId, String staffId, String phone, String email)
    {
        _name = name;
        _jaegerId = jaegerId;
        _staffId = staffId;
        _phone = phone;
        _email = email;
    }
    
    public String getName()
    {
        return _name;
    }
    
    public void setName(String name)
    {
        _name = name;
    }
    
    public String getJaegerId()
    {
        return _jaegerId;
    }
    
    public void setJaegerId(String jaegerId)
    {
        _jaegerId = jaegerId;
    }
    
    public String getStaffId()
    {
        return _staffId;        
    }
    
    public void setStaffId(String staffId)
    {
        _staffId = staffId;
    }
    
    public String getPhone()
    {
        return _phone;
    }
    
    public void setPhone(String phone)
    {
        _phone = phone;
    }
    
    public String getEmail()
    {
        return _email;
    }
    
    public void setEmail(String email)
    {
        _email = email;
    }
}
