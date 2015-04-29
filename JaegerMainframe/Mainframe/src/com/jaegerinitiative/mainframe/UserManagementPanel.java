/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaegerinitiative.mainframe;

import org.openide.util.NbPreferences;

public final class UserManagementPanel extends javax.swing.JPanel {

    private final UserManagementOptionsPanelController controller;

    public UserManagementPanel(UserManagementOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _usernameLabel = new javax.swing.JLabel();
        _passwordLabel = new javax.swing.JLabel();
        _usernameField = new javax.swing.JTextField();
        _passwordField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(_usernameLabel, org.openide.util.NbBundle.getMessage(UserManagementPanel.class, "UserManagementPanel._usernameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(_passwordLabel, org.openide.util.NbBundle.getMessage(UserManagementPanel.class, "UserManagementPanel._passwordLabel.text")); // NOI18N

        _usernameField.setText(org.openide.util.NbBundle.getMessage(UserManagementPanel.class, "UserManagementPanel._usernameField.text")); // NOI18N

        _passwordField.setText(org.openide.util.NbBundle.getMessage(UserManagementPanel.class, "UserManagementPanel._passwordField.text")); // NOI18N
        _passwordField.setToolTipText(org.openide.util.NbBundle.getMessage(UserManagementPanel.class, "UserManagementPanel._passwordField.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_passwordField)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_usernameLabel)
                    .addComponent(_usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_passwordLabel)
                    .addComponent(_passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    void load() {
        _usernameField.setText(NbPreferences.forModule(UserManagementPanel.class).get("user", ""));
        _passwordField.setText(NbPreferences.forModule(UserManagementPanel.class).get("pass", ""));
    }
    
    void store() {
        NbPreferences.forModule(UserManagementPanel.class).put("user", _usernameField.getText());
        NbPreferences.forModule(UserManagementPanel.class).put("pass", _passwordField.getText());
    }
    
    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _passwordField;
    private javax.swing.JLabel _passwordLabel;
    private javax.swing.JTextField _usernameField;
    private javax.swing.JLabel _usernameLabel;
    // End of variables declaration//GEN-END:variables
}