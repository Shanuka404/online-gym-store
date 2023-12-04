/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AddWorkoutPlanController;
import Controller.AutoGenerateIDController;
import Models.WorkoutPlans;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cyber Park
 */
public class ManageWorkoutPlans extends javax.swing.JFrame {

    AddWorkoutPlanController PlanC;
    WorkoutPlans[] PlanArray;
    ArrayList<WorkoutPlans> PlanList;
    int PlanCount;
    
    Component bdg1 = null;

    public ManageWorkoutPlans() {
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
        sidepanel = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ComboBoxCategory = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtWorkID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtday1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtday2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtday3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtday4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtday5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtday6 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnManageSupplements = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();
        btnManageWorkoutPlans = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepanel.setBackground(new java.awt.Color(51, 51, 51));

        bg2.setBackground(java.awt.Color.white);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Workout Plans");

        btnSignOut.setText("Sign Out");
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
                .addGap(55, 55, 55)
                .addComponent(btnSignOut)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnSignOut))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel15.setText("Category");

        ComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginners", "Intermediate", "Advanced" }));
        ComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategoryActionPerformed(evt);
            }
        });

        jLabel17.setText("Day 01");

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

        jLabel21.setText("Workout ID");

        txtday1.setColumns(20);
        txtday1.setRows(5);
        jScrollPane1.setViewportView(txtday1);

        jLabel4.setText("Day 02");

        txtday2.setColumns(20);
        txtday2.setRows(5);
        jScrollPane2.setViewportView(txtday2);

        txtday3.setColumns(20);
        txtday3.setRows(5);
        jScrollPane3.setViewportView(txtday3);

        txtday4.setColumns(20);
        txtday4.setRows(5);
        jScrollPane4.setViewportView(txtday4);

        txtday5.setColumns(20);
        txtday5.setRows(5);
        jScrollPane5.setViewportView(txtday5);

        jLabel5.setText("Day 03");

        jLabel7.setText("Day 04");

        jLabel8.setText("Day 05");

        txtday6.setColumns(20);
        txtday6.setRows(5);
        jScrollPane6.setViewportView(txtday6);

        jLabel9.setText("Day 06");

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addComponent(txtWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGroup(bg2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGroup(bg2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWorkID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel15))
                                .addGap(55, 55, 55)
                                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bg2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel4))
                                    .addGroup(bg2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addComponent(ComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
                            .addGroup(bg2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("BOOKER GYM");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.lightGray);
        jLabel11.setText("__________________________________");

        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("(ADMIN)");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageWorkoutPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel2))
                            .addComponent(jLabel11)
                            .addComponent(btnManageSupplements, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12))
                    .addComponent(jLabel2)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel11)))
                .addGap(69, 69, 69)
                .addComponent(btnDashboard)
                .addGap(23, 23, 23)
                .addComponent(btnManageSupplements)
                .addGap(30, 30, 30)
                .addComponent(btnManageCustomer)
                .addGap(27, 27, 27)
                .addComponent(btnManageWorkoutPlans)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            // Connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DataBase Connection Success");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

            // Prompt the user for the record ID to delete
            String WorkID = txtWorkID.getText();

            // Prepare the delete query
            String deleteQuery = "DELETE FROM workoutplans WHERE workoutID = ?";
            PreparedStatement statement = con.prepareStatement(deleteQuery);
            statement.setString(1, WorkID);

            // Execute the delete query
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("workoutplans deleted successfully.");
                JOptionPane.showMessageDialog(bdg1, "workoutplans deleted successfully", "Success", 1);
            } else {
                System.out.println("No record found with the specified ID.");
                JOptionPane.showMessageDialog(bdg1, "No record found with the specified ID", "Error", 2);
            }

            // Close the resources
            statement.close();
            con.close();

            txtWorkID.setText("");

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String WorkoutID = txtWorkID.getText();
        String category = (String) ComboBoxCategory.getSelectedItem();
        String day1 = txtday1.getText();
        String day2 = txtday2.getText();
        String day3 = txtday3.getText();
        String day4 = txtday4.getText();
        String day5 = txtday5.getText();
        String day6 = txtday6.getText();

        if (WorkoutID.isEmpty() || day1.isEmpty()) {
            JOptionPane.showMessageDialog(bdg1, "Fill the Blanks", "Fail", 1);

        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("DataBase Connection Success");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookergym", "root", "");

                String updateQuery1 = "UPDATE workoutplans"
                        + " SET category = ?,day1 = ?,day2 = ?,day3 = ?,day4 = ?,day5 = ?,day6 = ?"
                        + "WHERE WorkoutID = ?";
                PreparedStatement statement1 = con.prepareStatement(updateQuery1);
                statement1.setString(1, category);
                statement1.setString(2, day1);
                statement1.setString(3, day2);
                statement1.setString(4, day3);
                statement1.setString(5, day4);
                statement1.setString(6, day5);
                statement1.setString(7, day6);
                statement1.setString(8, WorkoutID);
                // Execute the update statement
                int rowsAffected1 = statement1.executeUpdate();

                if (rowsAffected1 > 0) {
                    System.out.println("workoutplans details updated successfully.");
                    JOptionPane.showMessageDialog(bdg1, "workoutplans updated successfully", "Success", 1);
                } else {
                    System.out.println("Failed to update workoutplans details.");
                    JOptionPane.showMessageDialog(bdg1, "Failed to update workoutplans details", "Fail", 2);
                }

                // Close the resources
                statement1.close();
                con.close();

                txtWorkID.setText("");
                txtday1.setText("");
                txtday2.setText("");
                txtday3.setText("");
                txtday4.setText("");
                txtday5.setText("");
                txtday6.setText("");

            } catch (SQLException ex) {
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AutoGenerateIDController AutoGenerateIDController = new AutoGenerateIDController();
        PlanC = new AddWorkoutPlanController();
        PlanArray = new WorkoutPlans[100];
        PlanCount = 0;
        PlanList = new ArrayList<>();

        String WorkoutID = AutoGenerateIDController.generateWorkoutID();
        String category = (String) ComboBoxCategory.getSelectedItem();
        String day1 = txtday1.getText();
        String day2 = txtday2.getText();
        String day3 = txtday3.getText();
        String day4 = txtday4.getText();
        String day5 = txtday5.getText();
        String day6 = txtday6.getText();

        int NoOfOrders = 0;
        if (day1.isEmpty()) {
            
            JOptionPane.showMessageDialog(bdg1, "Fill the Blanks", "Fail", 1);

        } else {
            WorkoutPlans PlanB = PlanC.AddWorkoutPlans(WorkoutID,category,day1,day2,day3,day4,day5,day6);
            PlanArray[PlanCount] = PlanB;
            PlanList.add(PlanB);
            PlanCount++;
            if (PlanC.AddWorkoutPlanToDataBase()) {
                JOptionPane.showMessageDialog(bdg1, "WorkoutPlan Successfully Added to the DataBase", "Success", 1);

                
                txtWorkID.setText("");
                txtday1.setText("");
                txtday2.setText("");
                txtday3.setText("");
                txtday4.setText("");
                txtday5.setText("");
                txtday6.setText("");

            } else {
                JOptionPane.showMessageDialog(bdg1, "Cannot insert to the DB", "Error", 1);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void ComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCategoryActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        Login v1 = new Login();
        setVisible(false);
        v1.setContentPane(v1.getBg1());
        v1.setTitle("Manage Supplements");
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
        v1.setSize(1005,720);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ManageWorkoutPlans ui = new ManageWorkoutPlans();
                ui.setContentPane(ui.bg1);
                ui.setTitle("Manage Workoutplans");
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
    private javax.swing.JComboBox<String> ComboBoxCategory;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTextField txtWorkID;
    private javax.swing.JTextArea txtday1;
    private javax.swing.JTextArea txtday2;
    private javax.swing.JTextArea txtday3;
    private javax.swing.JTextArea txtday4;
    private javax.swing.JTextArea txtday5;
    private javax.swing.JTextArea txtday6;
    // End of variables declaration//GEN-END:variables
}
