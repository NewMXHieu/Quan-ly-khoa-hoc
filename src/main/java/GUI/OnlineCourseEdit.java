/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


/**
 *
 * @author HP
 */
public class OnlineCourseEdit extends javax.swing.JPanel {

    /**
     * Creates new form OnlineCourseEdit
     */
    public OnlineCourseEdit() {
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

        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_EmptyTitle_ = new javax.swing.JLabel();
        jTextField_Title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_EmptyCredits_ = new javax.swing.JLabel();
        jTextField_Credits = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_Department_ = new javax.swing.JComboBox<>();
        jLabel_EmptyTitle_1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Title1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("EXIT");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(0, 204, 0));
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Edit Onsite Course");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("EDIT");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Title:");

        jLabel_EmptyTitle_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyTitle_.setForeground(new java.awt.Color(254, 0, 0));
        jLabel_EmptyTitle_.setText("* Enter the title.");
        jLabel_EmptyTitle_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTitle_MouseClicked(evt);
            }
        });

        jTextField_Title.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Credits:");

        jLabel_EmptyCredits_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyCredits_.setForeground(new java.awt.Color(254, 0, 0));
        jLabel_EmptyCredits_.setText("* Enter the credits.");
        jLabel_EmptyCredits_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyCredits_MouseClicked(evt);
            }
        });

        jTextField_Credits.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Department:");

        jComboBox_Department_.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox_Department_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Department_ActionPerformed(evt);
            }
        });

        jLabel_EmptyTitle_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyTitle_1.setForeground(new java.awt.Color(254, 0, 0));
        jLabel_EmptyTitle_1.setText("* Enter the title.");
        jLabel_EmptyTitle_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTitle_1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("URL:");

        jTextField_Title1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyTitle_))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyCredits_))
                    .addComponent(jComboBox_Department_, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(jTextField_Credits, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyTitle_1))
                    .addComponent(jTextField_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_EmptyTitle_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_EmptyTitle_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Department_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_EmptyCredits_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Course ID:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("..................");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_EmptyTitle_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTitle_MouseClicked
        // hide this label on click
        jLabel_EmptyTitle_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyTitle_MouseClicked

    private void jLabel_EmptyCredits_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyCredits_MouseClicked
        // hide this label on click
        jLabel_EmptyCredits_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyCredits_MouseClicked

    private void jComboBox_Department_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Department_ActionPerformed

    }//GEN-LAST:event_jComboBox_Department_ActionPerformed

    private void jLabel_EmptyTitle_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTitle_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyTitle_1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_Department_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_EmptyCredits_;
    private javax.swing.JLabel jLabel_EmptyTitle_;
    private javax.swing.JLabel jLabel_EmptyTitle_1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Credits;
    private javax.swing.JTextField jTextField_Title;
    private javax.swing.JTextField jTextField_Title1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}