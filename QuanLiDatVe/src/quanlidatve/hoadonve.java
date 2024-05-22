/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidatve;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class hoadonve extends javax.swing.JFrame {

    /**
     * Creates new form hoadonve
     */
    public hoadonve() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void displayBookedFlights() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            StringBuilder bookedFlights = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                bookedFlights.append(line).append("\n");
            }
            reader.close();
            // Hiển thị thông tin các chuyến đi đã đặt
            JOptionPane.showMessageDialog(null, "Các chuyến đi đã đặt:\n" + bookedFlights.toString());
        } catch (IOException e) {
            e.printStackTrace();
            // Xử lý lỗi khi đọc từ tệp
        }
    }

    // Lưu hóa đơn mới vào tệp
    void saveInvoice(String invoiceData) {
        try (FileWriter writer = new FileWriter("data.txt", true)) { // Mở tệp ở chế độ ghi tiếp (append)
            writer.write(invoiceData + "\n"); // Ghi dữ liệu hóa đơn vào tệp và thêm dòng mới
        } catch (IOException e) {
            e.printStackTrace();
            // Xử lý lỗi khi ghi vào tệp
        }
    }

    // Làm sạch dữ liệu trong tệp
    private void clearData() {
        try (FileWriter writer = new FileWriter("data.txt")) { // Mở tệp ở chế độ ghi đè (overwrite)
            writer.write(""); // Ghi chuỗi rỗng vào tệp
            hoadon.setForeground(Color.BLACK); // Thiết lập màu chữ cho nhãn
            hoadon.setText("Dữ liệu đã được làm sạch."); // Thông báo rằng dữ liệu đã được làm sạch
        } catch (IOException e) {
            e.printStackTrace();
            // Xử lý lỗi khi ghi vào tệp
            hoadon.setForeground(Color.RED); // Thiết lập màu chữ đỏ để biểu thị lỗi
            hoadon.setText("Lỗi: Không thể làm sạch dữ liệu.");
        }
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
        xuatchuyendi = new javax.swing.JButton();
        hoadon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Hóa đơn vé đã mua");

        xuatchuyendi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xuatchuyendi.setText("Xuất hóa đơn");
        xuatchuyendi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatchuyendiActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Làm mới hóa đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnthoat.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Mua hàng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthoat)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(xuatchuyendi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(xuatchuyendi)
                    .addComponent(jButton3))
                .addGap(69, 69, 69)
                .addComponent(hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthoat)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xuatchuyendiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatchuyendiActionPerformed
        saveInvoice("Hóa đơn mới");
        displayBookedFlights();
        
    }//GEN-LAST:event_xuatchuyendiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Maybayvip vip = new Maybayvip();
        vip.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(hoadonve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hoadonve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hoadonve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hoadonve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hoadonve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel hoadon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton xuatchuyendi;
    // End of variables declaration//GEN-END:variables
}
