
package quanlidatve;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author hoangtrongnghia
 */
public class Taotaikhoan extends javax.swing.JFrame {
    DanhSachUser dsu = new DanhSachUser();
    /**
     * Creates new form Taotaikhoan
     */
    public Taotaikhoan() {
        initComponents();
        myInit();
        this.setLocationRelativeTo(null);
    }
    
    public void myInit(){
        docFile();
    }
    
    public void docFile(){
        dsu.docFile("User.txt");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btndongy = new javax.swing.JButton();
        txtnhapmk = new javax.swing.JPasswordField();
        txtnhaplaimk = new javax.swing.JPasswordField();
        txtnhaptk = new javax.swing.JTextField();
        btnthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tạo Tài Khoản");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Nhập Tài Khoản");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Nhập Mật Khẩu");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Xác Nhận Mật Khẩu");

        btndongy.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btndongy.setText("Đồng Ý");
        btndongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndongyActionPerformed(evt);
            }
        });

        txtnhapmk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtnhaplaimk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtnhaplaimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhaplaimkActionPerformed(evt);
            }
        });

        txtnhaptk.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtnhaptk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhaptkActionPerformed(evt);
            }
        });

        btnthoat.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnhapmk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btndongy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthoat)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnhapmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndongy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndongyActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtnhaptk.getText().equals(""))
        {
            sb.append("\n Vui Lòng Nhập Tên Tài Khoản!!");
            txtnhaptk.setBackground(Color.yellow);
        }
        else
        {
            txtnhaptk.setBackground(Color.white); 
        }
        String nhapmk = new String(txtnhapmk.getPassword());
        if(nhapmk.equals(""))
        {
            sb.append("\n Vui Lòng Nhập Mật Khẩu!!");
            txtnhapmk.setBackground(Color.yellow);
        }
        else
        {
            txtnhapmk.setBackground(Color.white); 
        }
        String nhaplaimk = new String(txtnhaplaimk.getPassword());
        if(!nhapmk.equals(nhaplaimk))
        {
            sb.append(" Mật Khẩu Và Nhập Lại Mật Khẩu Phải Trùng Nhau!!");
            txtnhapmk.setBackground(Color.yellow);
            txtnhaplaimk.setBackground(Color.yellow);
        }
        else
        {
            txtnhapmk.setBackground(Color.white);
            txtnhaplaimk.setBackground(Color.white);
        }
        if(sb.length()>0)
        {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
        
        if(dsu.findUser(txtnhaptk.getText())){
            JOptionPane.showMessageDialog(null, "Trùng user");
        }else{
            String id = String.valueOf(dsu.lengthID()+1);
            String tk = id+ ',' +txtnhaptk.getText() + ',' +txtnhapmk.getText();
            JOptionPane.showMessageDialog(this, "Tạo Tài Khoản Thành Công!! ");
            dsu.ghiFile("User.txt", tk);  // Ghi tài khoản đăng ký thành công 
            
            
        }
        
         
    }//GEN-LAST:event_btndongyActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void txtnhaptkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhaptkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhaptkActionPerformed

    private void txtnhaplaimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhaplaimkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhaplaimkActionPerformed

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
            java.util.logging.Logger.getLogger(Taotaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taotaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taotaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taotaikhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taotaikhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndongy;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtnhaplaimk;
    private javax.swing.JPasswordField txtnhapmk;
    private javax.swing.JTextField txtnhaptk;
    // End of variables declaration//GEN-END:variables
}
