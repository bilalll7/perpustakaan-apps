/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.perpustakaanApps.app.view.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.java.com.perpustakaanApps.database.Koneksi;

/**
 *
 * @author Farhan Habibi
 */
public class PeminjamanBuku extends javax.swing.JFrame {

        
    public PeminjamanBuku() {
        initComponents();
        updateCombo();
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtjumlahbuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnKonfirmasi = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle4 = new rojerusan.RSMaterialButtonRectangle();
        comboBox = new javax.swing.JComboBox<>();
        tglPeminjaman = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        txtnamapeminjam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        rSMaterialButtonRectangle1.setText("rSMaterialButtonRectangle1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 176, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM PEMINJAMAN BUKU\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 830, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/huhu.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 530, 350));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JUMLAH BUKU");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 30));

        txtjumlahbuku.setBackground(new java.awt.Color(0, 176, 255));
        txtjumlahbuku.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtjumlahbuku.setForeground(new java.awt.Color(255, 255, 255));
        txtjumlahbuku.setBorder(null);
        txtjumlahbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbukuActionPerformed(evt);
            }
        });
        jPanel1.add(txtjumlahbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 570, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA BUKU PINJAMAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 320, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TANGGAL PEMINJAMAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________________________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnKonfirmasi.setBackground(new java.awt.Color(255, 255, 255));
        btnKonfirmasi.setForeground(new java.awt.Color(0, 176, 255));
        btnKonfirmasi.setText("KONFIRMASI");
        btnKonfirmasi.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKonfirmasiMouseClicked(evt);
            }
        });
        btnKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmasiActionPerformed(evt);
            }
        });
        jPanel1.add(btnKonfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 160, 50));

        rSMaterialButtonRectangle4.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonRectangle4.setForeground(new java.awt.Color(0, 176, 255));
        rSMaterialButtonRectangle4.setText("RESET");
        rSMaterialButtonRectangle4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rSMaterialButtonRectangle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle4MouseClicked(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 140, 50));

        comboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Buku" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 570, 40));
        jPanel1.add(tglPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 570, 40));

        jTextField2.setBackground(new java.awt.Color(0, 176, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 560, 20));

        txtnamapeminjam.setBackground(new java.awt.Color(0, 176, 255));
        txtnamapeminjam.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtnamapeminjam.setForeground(new java.awt.Color(255, 255, 255));
        txtnamapeminjam.setBorder(null);
        txtnamapeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapeminjamActionPerformed(evt);
            }
        });
        jPanel1.add(txtnamapeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 570, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAMA PEMINJAM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_________________________________________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1130, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKonfirmasiActionPerformed

    private void txtjumlahbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahbukuActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        
    }//GEN-LAST:event_comboBoxActionPerformed

    private void btnKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKonfirmasiMouseClicked
    String namaPeminjam = txtnamapeminjam.getText();
    String namaBuku = String.valueOf(comboBox.getSelectedItem());
    Date tglPeminjamanDate = this.tglPeminjaman.getDate();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String tglPinjam = (tglPeminjamanDate != null) ? sdf.format(tglPeminjamanDate) : null;
    String tglKembali = null; // Mengatur tglKembali sebagai null
    int lamaPinjam = 0;
    int denda = 0;
    String status = "pinjam";
    int jumlahBuku = Integer.valueOf(txtjumlahbuku.getText());
    

    PreparedStatement ps;
    String query = "INSERT INTO `peminjaman`(`nama_peminjam`,`nama_buku`, `tgl_peminjaman`, `tgl_pengembalian`,`lama_pinjam`,`denda`,`status`,`jumlah_buku`) VALUES (?,?,?,?,?,?,?,?)";
    try {
        ps = Koneksi.getConnection().prepareStatement(query);
        
        ps.setString(1, namaPeminjam);
        ps.setString(2, namaBuku);
        ps.setString(3, tglPinjam);

        // Mengatur tglKembali sebagai null jika tidak ada tanggal pengembalian
        if (tglKembali == null) {
            ps.setNull(4, java.sql.Types.DATE);
        } else {
            ps.setString(4, tglKembali);
        }

        ps.setInt(5, lamaPinjam);
        ps.setInt(6, denda);
        ps.setString(7, status);
        ps.setInt(8, jumlahBuku);
        
        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(null, "Peminjaman Buku Berhasil !!!");
            
            // Mengurangi stok buku berdasarkan jumlah buku yang dipinjam
            String updateStokQuery = "UPDATE buku SET stok = stok - ? WHERE judul_buku = ?";
            PreparedStatement updateStokStmt = Koneksi.getConnection().prepareStatement(updateStokQuery);
            updateStokStmt.setInt(1, jumlahBuku);
            updateStokStmt.setString(2, namaBuku);
            
            if (updateStokStmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Stok buku telah diperbarui.");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memperbarui stok buku.");
            }
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(RegisterUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnKonfirmasiMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        DashboardUser dashboard = new DashboardUser();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtnamapeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamapeminjamActionPerformed

    private void rSMaterialButtonRectangle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle4MouseClicked
        // TODO add your handling code here:
        txtnamapeminjam.setText("");
        comboBox.setSelectedIndex(0);
        tglPeminjaman.setDate(null);
        txtjumlahbuku.setText("");
    }//GEN-LAST:event_rSMaterialButtonRectangle4MouseClicked
    private void updateCombo(){
        // TODO add your handling code here:
        Connection con=Koneksi.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from buku";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                comboBox.addItem(rs.getString("judul_buku"));
            }
        }catch(Exception e){
                System.out.println("error");
        }
    }
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
            java.util.logging.Logger.getLogger(PeminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnKonfirmasi;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle4;
    private com.toedter.calendar.JDateChooser tglPeminjaman;
    private javax.swing.JTextField txtjumlahbuku;
    private javax.swing.JTextField txtnamapeminjam;
    // End of variables declaration//GEN-END:variables
}
