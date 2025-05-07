
package gui;

import gui.priorityNonPreemptive.PriorityNonPreemptive;
import gui.priorityNonPreemptive.ProcessManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class proc1 extends javax.swing.JFrame {
    
    
    public proc1() {
        initComponents();
        
        setResizable(false);   
       

          ganttPanel.setBackground(Color.decode("#f4f6f8"));
        //table colors
        jPanel2.setBackground(Color.decode("#f4f6f8"));
        table1.getTableHeader().setBackground(Color.decode("#455A64"));  
        table1.getTableHeader().setForeground(Color.white);       

        
       // Center the cell text
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table1.getColumnCount(); i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        setRowsButton = new javax.swing.JButton();
        processCountField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        computeButton = new javax.swing.JButton();
        ganttPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(250, 249, 246));

        table1.setAutoCreateRowSorter(true);
        table1.setForeground(new java.awt.Color(40, 100, 163));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Priority", "Burst", "WT", "TAT", "RT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table1.setShowGrid(true);
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(5).setResizable(false);
        }

        setRowsButton.setBackground(new java.awt.Color(100, 181, 163));
        setRowsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setRowsButton.setForeground(new java.awt.Color(255, 255, 255));
        setRowsButton.setText("Set Rows");
        setRowsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setRowsButtonActionPerformed(evt);
            }
        });
        setRowsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                setRowsButtonKeyPressed(evt);
            }
        });

        processCountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        processCountField.setToolTipText("");
        processCountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processCountFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Processes Number");

        resetButton.setBackground(new java.awt.Color(100, 181, 163));
        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        computeButton.setBackground(new java.awt.Color(100, 181, 163));
        computeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        computeButton.setForeground(new java.awt.Color(255, 255, 255));
        computeButton.setText("compute");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        ganttPanel.setBackground(new java.awt.Color(250, 249, 246));

        javax.swing.GroupLayout ganttPanelLayout = new javax.swing.GroupLayout(ganttPanel);
        ganttPanel.setLayout(ganttPanelLayout);
        ganttPanelLayout.setHorizontalGroup(
            ganttPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ganttPanelLayout.setVerticalGroup(
            ganttPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(processCountField)
                            .addComponent(setRowsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(computeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ganttPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(processCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setRowsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(computeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(ganttPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processCountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processCountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_processCountFieldActionPerformed

    private void setRowsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setRowsButtonActionPerformed
        
        
          
        try {
            
            int count = Integer.parseInt(processCountField.getText());
            if (count <= 0) throw new NumberFormatException();

            DefaultTableModel model = (DefaultTableModel) table1.getModel();

            for (int i = 1; i <= count; i++) {
            model.addRow(new Object[] { "P" + i, " ", " ", " " });  
                
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid positive integer.");
        }
    }//GEN-LAST:event_setRowsButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);    }//GEN-LAST:event_resetButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        priorityNonPreemptive.ProcessManager manager = new priorityNonPreemptive.ProcessManager();
        int rowCount = Integer.parseInt(processCountField.getText());
        for (int i = 0; i < rowCount; i++) {
            
            String id = model.getValueAt(i, 0).toString().trim();
            int priority = Integer.parseInt(model.getValueAt(i, 1).toString().trim());
            int burst = Integer.parseInt(model.getValueAt(i, 2).toString().trim());
            priorityNonPreemptive.ProcessManager.Process p = new priorityNonPreemptive.ProcessManager.Process(id, burst, priority);
            manager.getProcesses().add(p);
        }
        
        
         manager.scheduleProcesses();
         
        for ( int i = 0; i < rowCount; i++) {
           priorityNonPreemptive.ProcessManager.Process p = manager.getProcesses().get(i);
           model.setValueAt(p.waitingTime, i, 3);     // Waiting Time (WT)
           model.setValueAt(p.turnaroundTime, i, 4);  // Turnaround Time (TAT)
           model.setValueAt(p.responseTime, i, 5);    // Response Time (RT)
        }
    new GanttWindow(manager.getProcesses());
        
    }//GEN-LAST:event_computeButtonActionPerformed

    private void setRowsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setRowsButtonKeyPressed
         try {
            int count = Integer.parseInt(processCountField.getText());
            if (count <= 0) throw new NumberFormatException();

            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            for (int i = 1; i <= count; i++) {
                model.addRow(new Object[]{"P"  + i, " ", " ", " "}); 
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid positive integer.");
        }
    }//GEN-LAST:event_setRowsButtonKeyPressed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new proc1().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computeButton;
    private javax.swing.JPanel ganttPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField processCountField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton setRowsButton;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

    
}
