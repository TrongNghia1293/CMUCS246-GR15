/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidatve;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;


/**
 *
 * @author HP
 */
public class Maybayvip extends javax.swing.JFrame {

    /**
     * Creates new form Maybayvip
     */
    public Maybayvip() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        soluong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblKQ = new javax.swing.JLabel();
        xnve = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Đặt vé ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Số lượng vé:");

        from.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Đà Nẵng ", "Sài Gòn" }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        to.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Đà Nẵng ", "Sài Gòn" }));
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        soluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        soluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soluongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Đi từ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Đến:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Phương tiện:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Máy bay", "Xe khách", "Tàu hỏa" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Tra cứu chuyến đi ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setText("Tính Tiền");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        xnve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xnve.setText("Xác Nhận Vé");
        xnve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnveActionPerformed(evt);
            }
        });

        jButton7.setText("Đăng Xuất");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKQ)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(from, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soluong)
                                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(xnve)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(lblKQ)
                .addGap(55, 55, 55)
                .addComponent(xnve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        String selectedFrom = (String) from.getSelectedItem();

        System.out.println("Di tu: " + selectedFrom);
    }//GEN-LAST:event_fromActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        String selectedTo = (String) to.getSelectedItem();
        System.out.println("Den: " + selectedTo);
    }//GEN-LAST:event_toActionPerformed

    private void soluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soluongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String fromLocation = (String) from.getSelectedItem();
        String toLocation = (String) to.getSelectedItem();
    
    // Kiểm tra nếu hai thành phố giống nhau
    if (fromLocation.equals(toLocation)) {
        JOptionPane.showMessageDialog(this, "Điểm đến và điểm xuất phát không được giống nhau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    else{bangtimkiem tien = new bangtimkiem();
        tien.setVisible(true);
        setVisible(false);}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String fromLocation = (String) from.getSelectedItem();
    String toLocation = (String) to.getSelectedItem();
    String vehicle = (String) jComboBox1.getSelectedItem(); 
    // In ra các giá trị để kiểm tra
    System.out.println("fromLocation: " + fromLocation);
    System.out.println("toLocation: " + toLocation);
    System.out.println("vehicle: " + vehicle);
    
    if (fromLocation.equals(toLocation)) {
        JOptionPane.showMessageDialog(this, "Điểm đến và điểm xuất phát không được giống nhau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int ticketQuantity;
    try {
        ticketQuantity = Integer.parseInt(soluong.getText().trim());
        if (ticketQuantity <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng vé phải là số dương.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng vé hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int price = 0;
    if (vehicle.equals("Máy bay")) {
        if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Sài Gòn")) ||
            (fromLocation.equals("Sài Gòn") && toLocation.equals("Đà Nẵng "))) {
            price = 1800000;
        } else if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Hà Nội")) ||
                   (fromLocation.equals("Hà Nội") && toLocation.equals("Đà Nẵng "))) {
            price = 1500000;
        } else if ((fromLocation.equals("Hà Nội") && toLocation.equals("Sài Gòn")) ||
                   (fromLocation.equals("Sài Gòn") && toLocation.equals("Hà Nội"))) {
            price = 1370000;
        }
    } else if (vehicle.equals("Xe khách")) {
        if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Sài Gòn")) ||
            (fromLocation.equals("Sài Gòn") && toLocation.equals("Đà Nẵng "))) {
            price = 800000;
        } else if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Hà Nội")) ||
                   (fromLocation.equals("Hà Nội") && toLocation.equals("Đà Nẵng "))) {
            price = 500000;
        } else if ((fromLocation.equals("Hà Nội") && toLocation.equals("Sài Gòn")) ||
                   (fromLocation.equals("Sài Gòn") && toLocation.equals("Hà Nội"))) {
            price = 1000000;
        }
    } else if (vehicle.equals("Tàu hỏa")) {
        if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Sài Gòn")) ||
            (fromLocation.equals("Sài Gòn") && toLocation.equals("Đà Nẵng "))) {
            price = 450000;
        } else if ((fromLocation.equals("Đà Nẵng ") && toLocation.equals("Hà Nội")) ||
                   (fromLocation.equals("Hà Nội") && toLocation.equals("Đà Nẵng "))) {
            price = 300000;
        } else if ((fromLocation.equals("Hà Nội") && toLocation.equals("Sài Gòn")) ||
                   (fromLocation.equals("Sài Gòn") && toLocation.equals("Hà Nội"))) {
            price = 700000;
        }
    }

    if (price == 0) {
        JOptionPane.showMessageDialog(this, "Không thể xác định giá vé cho tuyến đường này.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int totalPrice = price * ticketQuantity;
    String message = "Phương tiện: " + vehicle +
                     "\nĐi từ: " + fromLocation +
                     "\nĐến: " + toLocation +
                     "\nSố lượng vé: " + ticketQuantity +
                     "\nGiá tiền mỗi vé: " + price +
                     "\nTổng tiền: " + totalPrice;

    lblKQ.setText("<html>" + message.replaceAll("\n", "<br>") + "</html>");
            hoadonve hd = new hoadonve();
            hd.saveInvoice(message);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void xnveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnveActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Xác Nhận Vé Bạn Đã Chọn !!", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if ( choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thành công!");
        }
        hoadonve hd = new hoadonve();
        hd.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_xnveActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Maybayvip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maybayvip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maybayvip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maybayvip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maybayvip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblKQ;
    private javax.swing.JTextField soluong;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JButton xnve;
    // End of variables declaration//GEN-END:variables
}
