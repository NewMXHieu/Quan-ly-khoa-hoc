/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import BLL.CourseBLL;
import BLL.OnsiteCourseBLL;
import DTO.CourseDTO;
import DTO.OnsiteCourseDTO;
import oracle.net.aso.c;

/**
 *
 * @author HP
 */
public class OnsiteCourseMainForm extends javax.swing.JPanel {
    private OnsiteCourseBLL onSiteCourseBLL;
    private CourseBLL courseBLL;
    /**
     * Creates new form OnsiteCourseMainForm
     */
    Main main;

    public OnsiteCourseMainForm(Main main) {
        initComponents();
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Search by ID ");
        jTextField4.setPreferredSize(new java.awt.Dimension(82, 32));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "All Course", "Online Course", "Onsite Course", " " }));
        jComboBox1.setSelectedIndex(2);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 204, 51));
        btnSearch.setText("Search");

        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String searchValue = jTextField4.getText() + "";
                String[] columnNames = { "Course ID", "Title", "Location", "Days", "Time" };

                List<OnsiteCourseDTO> searchResults = OnsiteCourseBLL.getInstance().searchModel(searchValue,
                        columnNames);
                showSearchResult(searchResults);

            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 359,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE)));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Course ID", "Title", "Location", "Days ", "Time"
                }));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(jTable2);

        btnAdd.setBackground(new java.awt.Color(0, 204, 51));
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 204, 51));
        btnUpdate.setText("Edit");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
                int index = jTable2.getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(null, "Please choose a course for update", "Attention",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else {
                    int modelIndex = jTable2.convertRowIndexToModel(index);
                    int id = (int) jTable2.getModel().getValueAt(modelIndex, 0);
                    OnsiteCourseEdit onsiteCourseEdit = new OnsiteCourseEdit();
                    OnsiteCourseDTO onsiteCourseDTO = onSiteCourseBLL.getInstance().getModelById(id);
                    CourseDTO courseDTO = courseBLL.getInstance().getModelById(id);
                    if (courseDTO != null || onsiteCourseDTO != null) {
                        onsiteCourseEdit.txtCourseID.setText(courseDTO.getCourseId() + "");
                        onsiteCourseEdit.txtTitle.setText(courseDTO.getTitle());
                        onsiteCourseEdit.txtCredits.setText(String.valueOf(courseDTO.getCredits()));
                        onsiteCourseEdit.jComboBoxDepartmentID
                        .setSelectedItem(String.valueOf(courseDTO.getDepartmentId()));
                        onsiteCourseEdit.txtLocation.setText(onsiteCourseDTO.getLocation());
                        onsiteCourseEdit.txtDay.setText(onsiteCourseDTO.getDays());
                        onsiteCourseEdit.txtTime.setText(onsiteCourseDTO.getTime().toString());
                    }
                    else  {
                        System.out.println("Error: OnsiteCourseDTO is null for courseId: " + id);
                    }
                    onsiteCourseEdit.setVisible(true);
                }
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(0, 204, 51));
        btnDel.setText("Delete");
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
                int selectedRow = jTable2.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Please choose a course for deletion", "Attention",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this course?",
                        "Confirm Deletion",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    int courseId = (int) jTable2.getModel().getValueAt(selectedRow, 0);
                    deleteOnsiteCourse(courseId);
                    updateOnsiteCourseFromList();
                }
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 204, 51));
        btnRefresh.setText("Refresh");
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
                updateOnsiteCourseFromList();
            }
        });
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnRefresh,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnDel,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnUpdate,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(168, 168, 168)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        updateOnsiteCourseFromList();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSearchActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String selectedValue = jComboBox1.getSelectedItem().toString();

        main.ChangeContent(selectedValue);
    }// GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        OnsiteCourseAdd customPanel = new OnsiteCourseAdd();
        String dialogTitle = "Add New Onsite Course";

        JDialogGUI customDialog = new JDialogGUI(this, customPanel, dialogTitle);
        customDialog.showDialog();
    }// GEN-LAST:event_btnAddMouseClicked

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if (jTextField4.getText().equals("Search by ID")) {
            jTextField4.setText("");
            jTextField4.setForeground(Color.BLACK);
        }
    }// GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if (jTextField4.getText().isEmpty()) {
            jTextField4.setText("Search by ID");
            jTextField4.setForeground(Color.GRAY);
        }
    }// GEN-LAST:event_jTextField4FocusLost

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnUpdateMouseClicked
        OnsiteCourseEdit customPanel = new OnsiteCourseEdit();
        String dialogTitle = "Edit New Onsite Course";

        JDialogGUI customDialog = new JDialogGUI(this, customPanel, dialogTitle);
        customDialog.showDialog();
    }// GEN-LAST:event_btnUpdateMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnAddActionPerformed

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDelMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_btnDelMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRefreshMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_btnRefreshMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnUpdateActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    public void updateOnsiteCourseFromList() {
        CourseBLL.getInstance().refresh();
        OnsiteCourseBLL.getInstance().refresh();
        DefaultTableModel model_table = (DefaultTableModel) jTable2.getModel();
        model_table.setRowCount(0);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (CourseDTO courseDTO : CourseBLL.getInstance().getAllModels()) {
            for (OnsiteCourseDTO onsiteCourseDTO : OnsiteCourseBLL.getInstance().getAllModels()) {
                if (onsiteCourseDTO != null && courseDTO.getCourseId() == onsiteCourseDTO.getCourseId()) {
                    model_table.addRow(
                            new Object[] { courseDTO.getCourseId(), courseDTO.getTitle(), onsiteCourseDTO.getLocation(),
                                    onsiteCourseDTO.getDays(), onsiteCourseDTO.getTime() });
                }
            }

        }

    }

    public void deleteOnsiteCourse(int courseId) {
        try {
            int deletedRow = onSiteCourseBLL.getInstance().deleteCourse(courseId);
            if (deletedRow > 0) {
                JOptionPane.showMessageDialog(null, "Delete successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete failed");
        }
    }

    public void showSearchResult(List<OnsiteCourseDTO> search) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (OnsiteCourseDTO onsite : search) {
            model.addRow(new Object[] {
                    onsite.getCourseId(),
                    onsite.getTitle(),
                    onsite.getLocation(),
                    onsite.getDays(),
                    onsite.getTime()
            });
        }
    }
}
