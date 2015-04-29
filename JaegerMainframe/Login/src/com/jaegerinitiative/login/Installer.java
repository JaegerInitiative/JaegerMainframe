/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaegerinitiative.login;

import com.jaegerinitiative.mainframe.UserManagementPanel;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import org.openide.*;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

public class Installer extends ModuleInstall {
    private LoginFrame form = new LoginFrame();
    
    @Override
    public void restored() {
        createLoginDialog();
        
    }
    
    private void createLoginDialog(){
        JButton ok = new JButton();
        ok.setText("OK");
        
        JButton cancel = new JButton();
        cancel.setText("Cancel");
        
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                exit();
            }
        });
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                authenticate();
            }
        });
        
        NotifyDescriptor nd = new NotifyDescriptor.Confirmation(form, "Login");
        nd.setOptions(new Object[]{ok, cancel});
        DialogDisplayer.getDefault().notifyLater(nd);
        
        nd.addPropertyChangeListener(new PropertyChangeListener(){
            public void propertyChange(PropertyChangeEvent evt){
                if(NotifyDescriptor.CLOSED_OPTION.equals(evt.getNewValue())){
                    exit();
                }
            }
        });
    }
    
    
    private void authenticate()
    {
        
//         if(NbPreferences.forModule(UserManagementPanel.class).get("user", "").equals(this.form.getUsername())){
//         try {
//            char[] passwordFromForm = null;
//            char[] passwordFromPref = NbPreferences.forModule(UserManagementPanel.class).get("pass", "").toCharArray();
//                
//            String passwordPref = new String(this.form.getPassword());
//            MessageDigest MD5 = MessageDigest.getInstance("MD5");
//            byte[] tmp = passwordPref.getBytes();
//            MD5.update(tmp);
//            passwordFromForm = byteArrToString(MD5.digest()).toCharArray();
//            int correctCount = 0;
//            if(passwordFromForm.length != passwordFromPref.length){
//               exit();
//            }
//            for (int i = 0; i < passwordFromPref.length; i++) {
//               if (passwordFromPref[i] == passwordFromForm[i]) { 
//                  correctCount++;
//               }
//            }
//            if (passwordFromPref.length == correctCount) {
//               //do nothing here
//            } else {
//               exit();
//            }
//          } catch (NoSuchAlgorithmException ex) {
//             Exceptions.printStackTrace(ex);
//          }
//      } else {
//         exit();
//      }
    }
    
    private static String byteArrToString(byte[] b){
      String res = null;
      StringBuffer sb = new StringBuffer(b.length * 2);
         for (int i = 0; i < b.length; i++){
            int j = b[i] & 0xff;
            if (j < 16) {
               sb.append('0');
            }
               sb.append(Integer.toHexString(j));
            }
            res = sb.toString();
            return res.toUpperCase();
         }
    
   final private void exit(){
      LifecycleManager.getDefault().exit();
   }
}
