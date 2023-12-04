/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controller.CustomerRegisterController;

/**
 *
 * @author Cyber Park
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.JPanel();
        bg3 = new javax.swing.JPanel();
        btnLogin1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtforgotpassword = new javax.swing.JLabel();
        sidepanel8 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg1.setLayout(new javax.swing.BoxLayout(bg1, javax.swing.BoxLayout.LINE_AXIS));

        bg3.setBackground(java.awt.Color.white);

        btnLogin1.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Email");

        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Password");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dumbbell (1).png"))); // NOI18N

        sidepanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setForeground(java.awt.Color.white);
        jLabel63.setText("BOOKER GYM");

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("_____________________________________");

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weightlifting (1).png"))); // NOI18N

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("_____________________________________");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Welcome !");

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("To");

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Admin Login Page");

        javax.swing.GroupLayout sidepanel8Layout = new javax.swing.GroupLayout(sidepanel8);
        sidepanel8.setLayout(sidepanel8Layout);
        sidepanel8Layout.setHorizontalGroup(
            sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel8Layout.createSequentialGroup()
                .addGroup(sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel63))
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel67)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(sidepanel8Layout.createSequentialGroup()
                .addGroup(sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel68))
                    .addGroup(sidepanel8Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel65)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanel8Layout.setVerticalGroup(
            sidepanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addGap(117, 117, 117)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout bg3Layout = new javax.swing.GroupLayout(bg3);
        bg3.setLayout(bg3Layout);
        bg3Layout.setHorizontalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidepanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg3Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addGap(51, 51, 51)
                        .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtpassword1)
                            .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtforgotpassword)))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(bg3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))))
        );
        bg3Layout.setVerticalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtforgotpassword)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidepanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg1.add(bg3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        String email = txtEmail1.getText();
        String password = txtpassword1.getText();
        if (email.equals("deva123") && password.equals("deva123")) {
            Dashboard v1 = new Dashboard();
            setVisible(false);
            v1.setContentPane(v1.getBg1());
            v1.setTitle("Admin DashBoard");
            v1.setSize(1005, 720);
            v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            v1.setVisible(true);
        } else {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("DataBase Connection Success");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

                CustomerRegisterController c = new CustomerRegisterController();

                boolean isValidEmail = c.checkEmailExistence(con, email);

                if (isValidEmail) {
                    boolean isValidPassword = c.checkPassword(con, email, password);

                    if (isValidPassword) {
                        System.out.println("Login successful!");
                        JOptionPane.showMessageDialog(bg1, "Login successful!", "Success", 1);

                        CustomerHomePage v1 = new CustomerHomePage();
                        setVisible(false);
                        v1.setContentPane(v1.getLg1());
                        v1.setTitle("Customer Home Page");
                        v1.setSize(990, 520);
                        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        v1.setVisible(true);
                    } else {
                        System.out.println("Invalid password.");
                        JOptionPane.showMessageDialog(bg1, "Invalid password.", "Fail", 2);
                        txtpassword1.setText("");
                    }
                } else {
                    System.out.println("Invalid email address.");
                    JOptionPane.showMessageDialog(bg1, "Invalid email address.", "Fail", 2);
                    txtEmail1.setText("");
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login ui = new Login();
                ui.setContentPane(ui.bg1);
                ui.setTitle("Login");
                ui.setSize(970, 500);
                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ui.setVisible(true);
            }
        });
    }

    public JPanel getBg1() {
        return bg1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg3;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel sidepanel8;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JLabel txtforgotpassword;
    private javax.swing.JPasswordField txtpassword1;
    // End of variables declaration//GEN-END:variables
}
