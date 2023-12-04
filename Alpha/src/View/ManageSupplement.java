/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

import Controller.AddSupplementController;
import Models.Supplements;
import Controller.AutoGenerateIDController;
import java.awt.Component;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cyber Park
 */
public class ManageSupplement extends javax.swing.JFrame {

    AddSupplementController SupC;
    Supplements[] SupArray;
    ArrayList<Supplements> SupList;
    int SupCount;
    String path2 = null;

    private Component bdg1;

    /**
     * Creates new form ManageSupplement
     */
    public ManageSupplement() {
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

        bg1 = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        ComboBoxCategory = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        ComboBoxFlavor = new javax.swing.JComboBox<>();
        ComboBoxSize = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtPic = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        sidepanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnManageSupplements = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();
        btnManageWorkoutPlans = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg2.setBackground(java.awt.Color.white);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Supplements");

        btnSignOut.setText("Sign out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignOut)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnSignOut))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel4.setText("Supplement ID");

        jLabel5.setText("Name");

        jLabel7.setText("Category");

        jLabel8.setText("Price (LKR)");

        jLabel9.setText("Flavor");

        jLabel10.setText("Size");

        txtSupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupIDActionPerformed(evt);
            }
        });

        ComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Whey Protien", "Mass Gainer", "Creatine", "Vitomin", "Others" }));

        ComboBoxFlavor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Chocolate", "Strawberry", "Vanilla", "Banana" }));

        ComboBoxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "5Lbs", "3Lbs" }));

        jLabel11.setText("Description");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel12.setText("Picture");

        txtPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPic.setPreferredSize(new java.awt.Dimension(134, 172));

        btnUpload.setBackground(new java.awt.Color(0, 0, 0));
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove))
                    .addComponent(txtSupID)
                    .addComponent(txtName)
                    .addComponent(ComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(ComboBoxFlavor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxSize, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpload)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPic, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnRemove))
                        .addGap(43, 43, 43)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(31, 31, 31)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        bg1.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 790, 580));

        sidepanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("BOOKER GYM");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.lightGray);
        jLabel14.setText("__________________________________");

        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("(ADMIN)");

        btnManageSupplements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supplementary-food (1).png"))); // NOI18N
        btnManageSupplements.setText("Manage Supplements");
        btnManageSupplements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSupplementsActionPerformed(evt);
            }
        });

        btnManageCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/people.png"))); // NOI18N
        btnManageCustomer.setText("Manage Customers");
        btnManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomerActionPerformed(evt);
            }
        });

        btnManageWorkoutPlans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weightlifting.png"))); // NOI18N
        btnManageWorkoutPlans.setText("Manage Workout Plans");
        btnManageWorkoutPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkoutPlansActionPerformed(evt);
            }
        });

        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weightlifting (1).png"))); // NOI18N

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageWorkoutPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2))
                            .addComponent(jLabel14)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnManageSupplements, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15))
                    .addComponent(jLabel2)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel14))
                    .addComponent(jLabel13))
                .addGap(69, 69, 69)
                .addComponent(btnDashboard)
                .addGap(23, 23, 23)
                .addComponent(btnManageSupplements)
                .addGap(30, 30, 30)
                .addComponent(btnManageCustomer)
                .addGap(27, 27, 27)
                .addComponent(btnManageWorkoutPlans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(470, 470, 470))
        );

        bg1.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        AutoGenerateIDController AutoGenerateIDController = new AutoGenerateIDController();
        SupC = new AddSupplementController();
        SupArray = new Supplements[100];
        SupCount = 0;
        SupList = new ArrayList<>();

        String p=txtPrice.getText();
        String supplementID = AutoGenerateIDController.generatesupID();
        String supplementName = txtName.getText();
        String category = (String) ComboBoxCategory.getSelectedItem();
        String flavor = (String) ComboBoxFlavor.getSelectedItem();
        String size = (String) ComboBoxSize.getSelectedItem();
        double price = Double.parseDouble(txtPrice.getText());
        String description = txtDescription.getText();

        int NoOfOrders = 0;
        if (supplementName.isEmpty() || description.isEmpty()||path2.isEmpty()||p.isEmpty()) {
            JOptionPane.showMessageDialog(bdg1, "Fill the Blanks", "Fail", 1);

        } else {
            Supplements SupB = SupC.AddSupplements(supplementID, supplementName, category, path2,
                    flavor, size, price, description);
            SupArray[SupCount] = SupB;
            SupList.add(SupB);
            SupCount++;
            if (SupC.AddSupplementsToDataBase()) {
                JOptionPane.showMessageDialog(bdg1, "Supplement Successfully Added to the DataBase", "Success", 1);

                txtName.setText("");
                txtSupID.setText("");
                txtPrice.setText("");
                txtDescription.setText("");
                txtPic.setIcon(null);

            } else {
                JOptionPane.showMessageDialog(bdg1, "Cannot insert to the DB", "Error", 1);
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String supplementID = txtSupID.getText();
        String supplementName = txtName.getText();
        String category = (String) ComboBoxCategory.getSelectedItem();
        String flavor = (String) ComboBoxFlavor.getSelectedItem();
        String size = (String) ComboBoxSize.getSelectedItem();
        double price = Double.parseDouble(txtPrice.getText());
        String description = txtDescription.getText();

        if (supplementID.isEmpty() || supplementName.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(bdg1, "Fill the Blanks", "Fail", 1);

        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("DataBase Connection Success");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

                String updateQuery1 = "UPDATE supplements"
                        + " SET supplementName = ?,category = ?,flavor = ?,picture = ?,size = ?,price = ?,description = ?"
                        + "WHERE supplementID = ?";
                PreparedStatement statement1 = con.prepareStatement(updateQuery1);
                statement1.setString(1, supplementName);
                statement1.setString(2, category);
                statement1.setString(3, flavor);
                statement1.setString(4, path2);
                statement1.setString(5, size);
                statement1.setDouble(6, price);
                statement1.setString(7, description);
                statement1.setString(8, supplementID);
                // Execute the update statement
                int rowsAffected1 = statement1.executeUpdate();

                if (rowsAffected1 > 0) {
                    System.out.println("Supplement details updated successfully.");
                    JOptionPane.showMessageDialog(bdg1, "Supplement updated successfully", "Success", 1);
                } else {
                    System.out.println("Failed to update Supplement details.");
                    JOptionPane.showMessageDialog(bdg1, "Failed to update Supplement details", "Fail", 2);
                }

                // Close the resources
                statement1.close();
                con.close();

                txtName.setText("");
                txtSupID.setText("");
                txtPrice.setText("");
                txtDescription.setText("");
                txtPic.setIcon(null);

            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            // Connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            // Prompt the user for the record ID to delete
            String supplementID = txtSupID.getText();

            // Prepare the delete query
            String deleteQuery = "DELETE FROM supplements WHERE supplementID = ?";
            PreparedStatement statement = con.prepareStatement(deleteQuery);
            statement.setString(1, supplementID);

            // Execute the delete query
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Supplement deleted successfully.");
                JOptionPane.showMessageDialog(bdg1, "Supplement deleted successfully", "Success", 1);
            } else {
                System.out.println("No record found with the specified ID.");
                JOptionPane.showMessageDialog(bdg1, "No record found with the specified ID", "Error", 2);
            }

            // Close the resources
            statement.close();
            con.close();

            txtSupID.setText("");

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        String filename = f.getName(); // Get the name of the file

        String relativePath = "Image/" + filename; // Assuming the "Image" directory is in your project

        try {
            String destinationPath = "C:\\xampp\\htdocs\\index\\Booker Gym Cusstomer\\Image\\" + filename; // Full path where the image will be stored on your system
            Files.copy(f.toPath(), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);

            // Display the image in your GUI
            BufferedImage bi = ImageIO.read(f);
            Image img = bi.getScaledInstance(134, 172, Image.SCALE_SMOOTH);
            ImageIcon Icone = new ImageIcon(img);
            txtPic.setIcon(Icone);
            path2 = relativePath;
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle any exceptions
        }

    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        Login v1 = new Login();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("Login");
        v1.setSize(970, 500);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnManageSupplementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSupplementsActionPerformed
        ManageSupplement v1 = new ManageSupplement();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("Manage Supplements");
        v1.setSize(1000, 600);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnManageSupplementsActionPerformed

    private void btnManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomerActionPerformed
        ManageCustomer v1 = new ManageCustomer();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("Manage Customer");
        v1.setSize(970, 500);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnManageCustomerActionPerformed

    private void btnManageWorkoutPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkoutPlansActionPerformed
        ManageWorkoutPlans v1 = new ManageWorkoutPlans();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("Manage Workout Plans");
        v1.setSize(970, 500);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnManageWorkoutPlansActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Dashboard v1 = new Dashboard();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("DashBoard");
        v1.setSize(1005, 720);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        try {
            // Connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            // Prompt the user for the record ID to view
            String supplementID = txtSupID.getText();
            
            // Prepare the View query
            String viewQuery = "SELECT * FROM supplements WHERE supplementID = ?";
            PreparedStatement statement = con.prepareStatement(viewQuery);
            statement.setString(1, supplementID);

            // Execute the delete query
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {

                // Set the ImageIcon to your JLabel or wherever you want to display it
                
                txtName.setText(rs.getString("supplementName"));
                txtPrice.setText(rs.getString("price"));
                txtDescription.setText(rs.getString("description"));
                
            }

            // Close the resources
            statement.close();
            con.close();

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtSupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupIDActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSupplement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSupplement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSupplement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSupplement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageSupplement ui = new ManageSupplement();
                ui.setContentPane(ui.bg1);
                ui.setTitle("Manage Workoutplans");
                ui.setSize(1000, 600);
                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ui.setVisible(true);
            }
        });
    }

    public JPanel getBg1() {
        return bg1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCategory;
    private javax.swing.JComboBox<String> ComboBoxFlavor;
    private javax.swing.JComboBox<String> ComboBoxSize;
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JButton btnManageSupplements;
    private javax.swing.JButton btnManageWorkoutPlans;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnView;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtPic;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSupID;
    // End of variables declaration//GEN-END:variables
}
