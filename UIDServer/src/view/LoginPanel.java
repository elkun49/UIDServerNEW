/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS_PC
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Login System");
        add(jLabel1);
        jLabel1.setBounds(340, 80, 140, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Username:");
        add(jLabel2);
        jLabel2.setBounds(260, 160, 70, 14);
        add(txtUName);
        txtUName.setBounds(340, 160, 140, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Password:");
        add(jLabel3);
        jLabel3.setBounds(260, 200, 70, 14);
        add(txtPass);
        txtPass.setBounds(340, 200, 140, 20);

        btnLogin.setForeground(new java.awt.Color(204, 204, 255));
        btnLogin.setText("Login");
        add(btnLogin);
        btnLogin.setBounds(350, 250, 90, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background3.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 860, 520);
    }// </editor-fold>//GEN-END:initComponents

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtPass = txtPass;
    }

    public JTextField getTxtUName() {
        return txtUName;
    }

    public void setTxtUName(JTextField txtUName) {
        this.txtUName = txtUName;
    }
    
    public void addBtnLoginListener(ActionListener log) {
       btnLogin.addActionListener(log);
    }        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables
}
