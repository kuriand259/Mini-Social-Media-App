package alasku.socialmediadbms;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kurian
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        jPanel1 = new javax.swing.JPanel();
        titlelabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        unametxt = new javax.swing.JTextField();
        pwtxt = new javax.swing.JPasswordField();
        fnamelbl = new javax.swing.JLabel();
        lnamelbl = new javax.swing.JLabel();
        unamelbl = new javax.swing.JLabel();
        pwlbl = new javax.swing.JLabel();
        signbtn = new javax.swing.JButton();
        logbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(203, 243, 240));

        titlelabel.setFont(new java.awt.Font("Bungee Shade", 0, 48)); // NOI18N
        titlelabel.setForeground(new java.awt.Color(46, 196, 182));
        titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelabel.setText("SIGNUP");
        titlelabel.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        fnametxt.setBackground(new java.awt.Color(240, 240, 240));
        fnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtActionPerformed(evt);
            }
        });

        lnametxt.setBackground(new java.awt.Color(240, 240, 240));
        lnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnametxtActionPerformed(evt);
            }
        });

        unametxt.setBackground(new java.awt.Color(240, 240, 240));

        pwtxt.setBackground(new java.awt.Color(240, 240, 240));

        fnamelbl.setFont(new java.awt.Font("Base Neue SemBd", 0, 14)); // NOI18N
        fnamelbl.setForeground(new java.awt.Color(46, 196, 182));
        fnamelbl.setText("First Name");

        lnamelbl.setFont(new java.awt.Font("Base Neue SemBd", 0, 14)); // NOI18N
        lnamelbl.setForeground(new java.awt.Color(46, 196, 182));
        lnamelbl.setText("Last Name");

        unamelbl.setFont(new java.awt.Font("Base Neue SemBd", 0, 14)); // NOI18N
        unamelbl.setForeground(new java.awt.Color(46, 196, 182));
        unamelbl.setText("Username");

        pwlbl.setFont(new java.awt.Font("Base Neue SemBd", 0, 14)); // NOI18N
        pwlbl.setForeground(new java.awt.Color(46, 196, 182));
        pwlbl.setText("Password");

        signbtn.setBackground(new java.awt.Color(46, 196, 182));
        signbtn.setFont(new java.awt.Font("Base Neue Black", 0, 12)); // NOI18N
        signbtn.setForeground(new java.awt.Color(255, 255, 255));
        signbtn.setText("SIgnup");
        signbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbtnActionPerformed(evt);
            }
        });

        logbtn.setBackground(new java.awt.Color(46, 196, 182));
        logbtn.setFont(new java.awt.Font("Base Neue Black", 0, 12)); // NOI18N
        logbtn.setForeground(new java.awt.Color(255, 255, 255));
        logbtn.setText("Login");
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(unamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(58, 58, 58))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(pwlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logbtn)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(unametxt)
                    .addComponent(lnametxt)
                    .addComponent(fnametxt)
                    .addComponent(pwtxt))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnamelbl))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnamelbl))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamelbl))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwlbl)
                    .addComponent(pwtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signbtn)
                    .addComponent(logbtn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtActionPerformed

    private void lnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnametxtActionPerformed

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        login log = new login();
        log.show();
    }//GEN-LAST:event_logbtnActionPerformed

    private void signbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signbtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybook","root","");
            
            String firname = fnametxt.getText();
            String lasname = lnametxt.getText();
            String username = unametxt.getText();
            String password = pwtxt.getText();
            
            Statement stm =con.createStatement();
            ResultSet rs = stm.executeQuery("select uname from user where uname ='"+username+"'");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"Username Already exists..");
            }
            else if(username.equals("")){
                JOptionPane.showMessageDialog(this,"Cannot be Blank");
            }
            else{
            //String sql = "select * from user where uname='"+username+"'and password='"+password+"'";
            String sql = "insert into user (uname,password,fname,lname) values('"+username+"','"+password+"','"+firname+"','"+lasname+"')";
            stm.executeUpdate(sql);
            //System.out.print(rs);
            setVisible(false);
            login log = new login();
            log.show();
            }
//            if(rs.next())
//            {
//                dispose();
//            }
//            else{
//                JOptionPane.showMessageDialog(this,"usernameor password wrong..");
//                usertxt.setText("");
//                passtxt.setText("");
//            }
//            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_signbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fnamelbl;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lnamelbl;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JButton logbtn;
    private javax.swing.JLabel pwlbl;
    private javax.swing.JPasswordField pwtxt;
    private javax.swing.JButton signbtn;
    private javax.swing.JLabel titlelabel;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JTextField unametxt;
    // End of variables declaration//GEN-END:variables
}
