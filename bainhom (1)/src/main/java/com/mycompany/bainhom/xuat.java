/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bainhom;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class xuat extends javax.swing.JFrame {

    /**
     * Creates new form xuat
     */
    public xuat() {
        initComponents();
    }
void addDataToTable(String vehicle, String fromLocation, String toLocation, int ticketQuantity) {
        // Tạo mảng dữ liệu
        Object[][] data = {
    // Dữ liệu cho các chuyến đi bằng máy bay
    {"Máy bay", "Hà Nội", "Đà Nẵng", "1500000"},
    {"Máy bay", "Hà Nội", "Sài Gòn", "1370000"},
    {"Máy bay", "Đà Nẵng", "Hà Nội", "1500000"},
    {"Máy bay", "Đà Nẵng", "Sài Gòn", "1800000"},
    {"Máy bay", "Sài Gòn", "Hà Nội", "1370000"},
    {"Máy bay", "Sài Gòn", "Đà Nẵng", "1800000"},
    
    // Dữ liệu cho các chuyến đi bằng xe khách
    {"Xe khách", "Hà Nội", "Đà Nẵng", "500000"},
    {"Xe khách", "Hà Nội", "Sài Gòn", "1000000"},
    {"Xe khách", "Đà Nẵng", "Hà Nội", "500000"},
    {"Xe khách", "Đà Nẵng", "Sài Gòn", "800000"},
    {"Xe khách", "Sài Gòn", "Hà Nội", "1000000"},
    {"Xe khách", "Sài Gòn", "Đà Nẵng", "800000"},
    
    // Dữ liệu cho các chuyến đi bằng tàu hỏa
    {"Tàu hỏa", "Hà Nội", "Đà Nẵng", "300000"},
    {"Tàu hỏa", "Hà Nội", "Sài Gòn", "700000"},
    {"Tàu hỏa", "Đà Nẵng", "Hà Nội", "300000"},
    {"Tàu hỏa", "Đà Nẵng", "Sài Gòn", "450000"},
    {"Tàu hỏa", "Sài Gòn", "Hà Nội", "700000"},
    {"Tàu hỏa", "Sài Gòn", "Đà Nẵng", "450000"}
};


        // Lấy mô hình dữ liệu của JTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Thêm dữ liệu vào mô hình dữ liệu của JTable
        for (Object[] row : data) {
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Phương tiện", "Nơi đi", "Nơi đến", "Tổng tiền "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(xuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
