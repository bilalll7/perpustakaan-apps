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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.perpustakaanApps.database.Koneksi;

/**
 *
 * @author Farhan Habibi
 */
public class PengembalianBuku extends javax.swing.JFrame {

    /**
     * Creates new form JFrameKembaliBuku
     */
    public PengembalianBuku() {
        initComponents();
        load_data();
    }
    private void load_data()
    {
        Connection con=Koneksi.getConnection();
        Object header[]={"ID","Nama Peminjam","Nama Buku","Tgl Peminjaman","Tgl Pengembalian","Lama Pinjam","Denda","Status","Jumlah Buku"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        TabelPengembalian.setModel(data);
        String sql_data="SELECT * FROM peminjaman";
        try
        {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql_data);
            while(rs.next())
            {
                String d1=rs.getString(1);
                String d2=rs.getString(2);
                String d3=rs.getString(3);
                String d4=rs.getString(4);
                String d5=rs.getString(5);
                String d6=rs.getString(6);
                String d7=rs.getString(7);
                String d8=rs.getString(8);
                String d9=rs.getString(9);
                
                
                
                
                String d[]={d1,d2,d3,d4,d5,d6,d7,d8,d9};
                data.addRow(d);
                
            }
        }
        catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                          
    }
   public void update() {
    try {
        Connection con = Koneksi.getConnection();
        Statement st = con.createStatement();

        // Get the current tglPengembalian date
        Date tglPengembalianDate = this.tglpengembalian.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tglPengembalian = (tglPengembalianDate != null) ? sdf.format(tglPengembalianDate) : null;

        // Fetch the tglPinjam date and jumlah buku from the database
        String fetchDataQuery = "SELECT tgl_peminjaman, nama_buku, jumlah_buku FROM peminjaman WHERE id='" + txtidpeminjam.getText() + "'";
        ResultSet rs = st.executeQuery(fetchDataQuery);
        LocalDate tglPinjam = null;
        String namaBuku = null;
        int jumlahBukuDipinjam = 0;
        
        if (rs.next()) {
            java.sql.Date tglPinjamDate = rs.getDate("tgl_peminjaman");
            tglPinjam = tglPinjamDate.toLocalDate();
            namaBuku = rs.getString("nama_buku");
            jumlahBukuDipinjam = rs.getInt("jumlah_buku");
        }

        // Calculate the difference in days
        LocalDate tglPengembalianLocal = tglPengembalianDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long lamaPinjam = ChronoUnit.DAYS.between(tglPinjam, tglPengembalianLocal);
        String status = "dikembalikan";

        // Calculate fine if lamaPinjam is greater than 7 days
        long denda = 0;
        if (lamaPinjam > 7) {
            denda = (lamaPinjam - 7) * 5000;
        }

        // Update the database with the new values
        String sql_update = "UPDATE peminjaman SET tgl_pengembalian='" + tglPengembalian
                + "', lama_pinjam='" + lamaPinjam
                + "', denda='" + denda
                + "', status='" + status
                + "' WHERE id='" + txtidpeminjam.getText() + "'";
        
        st.executeUpdate(sql_update);

        // Update the stock of the book
        String updateStockQuery = "UPDATE buku SET stok = stok + ? WHERE judul_buku = ?";
        PreparedStatement updateStockStmt = con.prepareStatement(updateStockQuery);
        updateStockStmt.setInt(1, jumlahBukuDipinjam);
        updateStockStmt.setString(2, namaBuku);
        
        if (updateStockStmt.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(null, "Stok buku telah diperbarui.");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal memperbarui stok buku.");
        }

        JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPengembalian = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tglpengembalian = new com.toedter.calendar.JDateChooser();
        btnKonfirmasi = new rojerusan.RSMaterialButtonRectangle();
        btnReset = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        txtidpeminjam = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 176, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "", "", null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA PEMINJAM", "NAMA BUKU", "TGL PEMINJAMAN", "TGL PENGEMBALIAN", "LAMA PINJAM", "DENDA", "STATUS", "JUMLAH BUKU"
            }
        ));
        TabelPengembalian.setColorBackgoundHead(new java.awt.Color(0, 176, 255));
        TabelPengembalian.setColorBordeFilas(new java.awt.Color(0, 176, 255));
        TabelPengembalian.setColorBordeHead(new java.awt.Color(255, 255, 255));
        TabelPengembalian.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        TabelPengembalian.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        TabelPengembalian.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        TabelPengembalian.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        TabelPengembalian.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        TabelPengembalian.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        TabelPengembalian.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TabelPengembalian.setRowHeight(40);
        jScrollPane2.setViewportView(TabelPengembalian);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1280, 360));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM PENGEMBALIAN BUKU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 1320, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TANGGAL PENGEMBALIAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        tglpengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tglpengembalianMouseClicked(evt);
            }
        });
        jPanel1.add(tglpengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 290, 30));

        btnKonfirmasi.setBackground(new java.awt.Color(255, 255, 255));
        btnKonfirmasi.setForeground(new java.awt.Color(0, 176, 255));
        btnKonfirmasi.setText("KONFIRMASI");
        btnKonfirmasi.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKonfirmasiMouseClicked(evt);
            }
        });
        jPanel1.add(btnKonfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 160, 50));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setForeground(new java.awt.Color(0, 176, 255));
        btnReset.setText("RESET");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 160, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARI ID PEMINJAM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txtidpeminjam.setBackground(new java.awt.Color(0, 176, 255));
        txtidpeminjam.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtidpeminjam.setForeground(new java.awt.Color(255, 255, 255));
        txtidpeminjam.setBorder(null);
        txtidpeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpeminjamActionPerformed(evt);
            }
        });
        jPanel1.add(txtidpeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 30));

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

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("____________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        setSize(new java.awt.Dimension(1300, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKonfirmasiMouseClicked
        // TODO add your handling code here:
        int update = JOptionPane.showOptionDialog(this,
                "Apakah Buku akan di kembalikan?",
                "Update Data",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(update==JOptionPane.YES_OPTION)
        {
        update();
        load_data();
        }
        
        
    }//GEN-LAST:event_btnKonfirmasiMouseClicked

    private void txtidpeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpeminjamActionPerformed
       String idPeminjam = txtidpeminjam.getText();
    if (idPeminjam.isEmpty()) {
        // If the search field is empty, load all data
        load_data();
        return;
    }

    Connection con = Koneksi.getConnection();
    Object header[] = {"ID", "Nama Peminjam", "Nama Buku", "Tgl Peminjaman", "Tgl Pengembalian", "Lama Pinjam", "Denda", "Status", "Judul Buku"};
    DefaultTableModel data = new DefaultTableModel(null, header);
    TabelPengembalian.setModel(data);

    // SQL query with a WHERE clause to filter by exact match of nama_peminjam
    String sql_data = "SELECT * FROM peminjaman WHERE id = ?";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql_data);
        pst.setString(1, idPeminjam);
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            String d1 = rs.getString(1);
            String d2 = rs.getString(2);
            String d3 = rs.getString(3);
            String d4 = rs.getString(4);
            String d5 = rs.getString(5);
            String d6 = rs.getString(6);
            String d7 = rs.getString(7);
            String d8 = rs.getString(8);
            String d9 = rs.getString(9);
            
            String d[] = {d1, d2, d3, d4, d5, d6, d7, d8, d9};
            data.addRow(d);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_txtidpeminjamActionPerformed

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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        DashboardUser dashboard = new DashboardUser();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        txtidpeminjam.setText("");
        tglpengembalian.setDate(null);
    }//GEN-LAST:event_btnResetMouseClicked

    private void tglpengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglpengembalianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tglpengembalianMouseClicked

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
            java.util.logging.Logger.getLogger(PengembalianBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengembalianBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengembalianBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengembalianBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PengembalianBuku().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro TabelPengembalian;
    private rojerusan.RSMaterialButtonRectangle btnKonfirmasi;
    private rojerusan.RSMaterialButtonRectangle btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser tglpengembalian;
    private javax.swing.JTextField txtidpeminjam;
    // End of variables declaration//GEN-END:variables
}
