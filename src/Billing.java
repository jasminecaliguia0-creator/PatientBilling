
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Billing extends javax.swing.JFrame {

    ArrayList<String> patients = new ArrayList<>();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Billing.class.getName());

    public Billing() {
        initComponents();

        setSize(1000, 600);
        setLocationRelativeTo(null);//makes window appear sa center it screen.
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtDoctorFee = new javax.swing.JTextField();
        txtRoomRate = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtPharmacyFee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDischargeDate = new javax.swing.JTextField();
        txtPatientname = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Patient Name");

        txtPatientName.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientName.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtPatientName.addActionListener(this::txtPatientNameActionPerformed);

        txtDoctorFee.setBackground(new java.awt.Color(255, 255, 255));
        txtDoctorFee.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtDoctorFee.addActionListener(this::txtDoctorFeeActionPerformed);

        txtRoomRate.setBackground(new java.awt.Color(255, 255, 255));
        txtRoomRate.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtRoomRate.addActionListener(this::txtRoomRateActionPerformed);

        txtDiagnosis.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnosis.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtDiagnosis.addActionListener(this::txtDiagnosisActionPerformed);

        txtAdmitDate.setBackground(new java.awt.Color(255, 255, 255));
        txtAdmitDate.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtAdmitDate.addActionListener(this::txtAdmitDateActionPerformed);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("CLEAR ALL");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 105, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SAVE PATIENT");
        jButton3.setBorder(null);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        txtPharmacyFee.setBackground(new java.awt.Color(255, 255, 255));
        txtPharmacyFee.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtPharmacyFee.addActionListener(this::txtPharmacyFeeActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Diagnosis");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Admit Date (MM/dd/yy)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Room Rate/day");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Doctor Fee");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Pharmacy Fee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomRate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDoctorFee, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtPatientName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPharmacyFee)
                            .addComponent(txtDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAdmitDate))))
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoomRate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorFee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPharmacyFee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtDischargeDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDischargeDate.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtDischargeDate.addActionListener(this::txtDischargeDateActionPerformed);

        txtPatientname.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientname.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtPatientname.addActionListener(this::txtPatientnameActionPerformed);

        jButton6.setBackground(new java.awt.Color(0, 105, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("COMPUTE BILL");
        jButton6.setBorder(null);
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ENTER ADMITTED PATIENT");

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        jTextField10.addActionListener(this::jTextField10ActionPerformed);

        txtDiscount.setBackground(new java.awt.Color(255, 255, 255));
        txtDiscount.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtDiscount.addActionListener(this::txtDiscountActionPerformed);

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("DISCHARGE DATE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("(MM/dd/yyy)");

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("PHILHEALTH DEDUCTION");

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setColumns(20);
        txtTotal.setRows(5);
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        jScrollPane1.setViewportView(txtTotal);

        jButton5.setBackground(new java.awt.Color(0, 105, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SAVE RECEIPT");
        jButton5.setBorder(null);
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtPatientname, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BILLING");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("DISCHARGE & BILLING COMPUTATION");

        jButton4.setBackground(new java.awt.Color(0, 105, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PATIENT REPORT");
        jButton4.setBorder(null);
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorFeeActionPerformed

    private void txtRoomRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomRateActionPerformed

    private void txtDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosisActionPerformed

    private void txtAdmitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmitDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmitDateActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
    
    //SAVE PATIENT - BUTTON
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (txtPatientName.getText().trim().isEmpty()
                || txtDiagnosis.getText().trim().isEmpty()
                || txtAdmitDate.getText().trim().isEmpty()
                || txtDischargeDate.getText().trim().isEmpty()
                || txtRoomRate.getText().trim().isEmpty()
                || txtDoctorFee.getText().trim().isEmpty()
                || txtDiscount.getText().trim().isEmpty()
                || txtPharmacyFee.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,"Please fill out all fields.");
            return;
            
        }
        try {
            String patientInfo = txtPatientName.getText() + " | "   + txtDiagnosis.getText() + " | " + txtAdmitDate.getText();

            patients.add(patientInfo);//Gina add du String into the arrayList

            FileWriter writer = new FileWriter("patients.txt", true);

            writer.write("Patient Name: " + txtPatientName.getText() + "\n");
            writer.write("Discharge Date: " + txtDischargeDate.getText() + "\n");
            writer.write("Diagnosis: " + txtDiagnosis.getText() + "\n");
            writer.write("Admit Date: " + txtAdmitDate.getText() + "\n");
            writer.write("Room Rate: " + txtRoomRate.getText() + "\n");
            writer.write("Doctor Fee: " + txtDoctorFee.getText() + "\n");
            writer.write("Pharmacy Fee: " + txtPharmacyFee.getText() + "\n");
            writer.write("Discount: " + txtDiscount.getText() + "\n");
            writer.write("-----------------------------------\n");

            writer.close();

        JOptionPane.showMessageDialog(this, "Patient record saved successfully!");

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving file!");
    
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed
    
    //CLEAR ALL BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtPatientName.setText("");
        txtDiagnosis.setText("");
        txtAdmitDate.setText("");
        txtRoomRate.setText("");
        txtDoctorFee.setText("");
        txtPharmacyFee.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPharmacyFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPharmacyFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyFeeActionPerformed

    private void txtDischargeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDischargeDateActionPerformed

    private void txtPatientnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientnameActionPerformed
    
    //COMPUTE BILL - BUTTON
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (txtRoomRate.getText().trim().isEmpty()
                || txtDoctorFee.getText().trim().isEmpty()
                || txtPharmacyFee.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please enter all billing information.");
            return;
        }

        try {

            String admit = txtAdmitDate.getText();
            String discharge = txtDischargeDate.getText();

            int admitDay = Integer.parseInt(admit.substring(3, 5));
            int dischargeDay = Integer.parseInt(discharge.substring(3, 5));

            int daysStayed = dischargeDay - admitDay;

            double roomRate = Double.parseDouble(txtRoomRate.getText());
            double doctorFee = Double.parseDouble(txtDoctorFee.getText());
            double pharmacyFee = Double.parseDouble(txtPharmacyFee.getText());

            double roomTotal = roomRate * daysStayed;
            double doctorTotal = doctorFee * daysStayed;

            double total = roomTotal + doctorTotal + pharmacyFee;

            double deduction = total * 0.20;

            double netAmount = total - deduction;

           
            txtDiscount.setText(String.format("₱%.2f", deduction));

            // Display the Bill Breakdown
            txtTotal.setText(
                    "\nBILL BREAKDOWN\n\n"
                    + "Days Stayed: " + daysStayed
                    + "\n\nRoom Rate (" + daysStayed + " days): ₱"
                    + String.format("%.2f", roomTotal)
                    + "\nDoctor Fee (" + daysStayed + " days): ₱"
                    + String.format("%.2f", doctorTotal)
                    + "\nPharmacy Fee: ₱"
                    + String.format("%.2f", pharmacyFee)
                    + "\n\nTotal: ₱"
                    + String.format("%.2f", total)
                    + "\n\nPHILHEALTH DEDUCTION: DISCOUNT:\n₱"
                    + String.format("%.2f", deduction)
                    + "\n\nNET AMOUNT DUE:\n₱"
                    + String.format("%.2f", netAmount)
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Room Rate, Doctor Fee, and Pharmacy Fee must be numeric values.");

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtTotal.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please compute the bill first.");
            return;
        }

        
        try {

            FileWriter writer = new FileWriter("Receipt.txt");
            writer.write(txtTotal.getText());
            writer.close();

            JOptionPane.showMessageDialog(this, "Receipt saved successfully!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving receipt.");

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PatientReport report = new PatientReport();
        report.setVisible(true);

        this.dispose(); // closes Billing window
    }//GEN-LAST:event_jButton4ActionPerformed


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Billing().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtAdmitDate;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtDischargeDate;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDoctorFee;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientname;
    private javax.swing.JTextField txtPharmacyFee;
    private javax.swing.JTextField txtRoomRate;
    private javax.swing.JTextArea txtTotal;
    // End of variables declaration//GEN-END:variables
}
