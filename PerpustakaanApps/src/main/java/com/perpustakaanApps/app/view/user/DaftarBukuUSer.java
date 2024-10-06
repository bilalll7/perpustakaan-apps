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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.perpustakaanApps.database.Koneksi;

/**
 *
 * @author Farhan Habibi
 */
public class DaftarBukuUSer extends javax.swing.JFrame {

    /**
     * Creates new form DaftarBukuUSer
     */
    public DaftarBukuUSer() {
        initComponents();
        load_data();
    }
    private void load_data()
    {
        Connection con=Koneksi.getConnection();
        Object header[]={"KODE BUKU","JUDUL BUKU","ISBN","PENULIS","PENGARANG","STOK"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tableBuku.setModel(data);
        String sql_data="SELECT * FROM buku";
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
                
                
                
                
                String d[]={d1,d2,d3,d4,d5,d6};
                data.addRow(d);
                
            }
        }
        catch(SQLException e)
                {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtjudulbuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBuku = new rojeru_san.complementos.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DAFTAR BUKU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cari Judul Buku");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtjudulbuku.setBackground(new java.awt.Color(0, 176, 255));
        txtjudulbuku.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtjudulbuku.setForeground(new java.awt.Color(255, 255, 255));
        txtjudulbuku.setBorder(null);
        txtjudulbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulbukuActionPerformed(evt);
            }
        });
        jPanel1.add(txtjudulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 540, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 560, 20));

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KODE BUKU", "JUDUL BUKU", "ISBN", "PENULIS", "PENGARANG", "STOK"
            }
        ));
        tableBuku.setColorBackgoundHead(new java.awt.Color(0, 176, 255));
        tableBuku.setColorBordeFilas(new java.awt.Color(0, 176, 255));
        tableBuku.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tableBuku.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tableBuku.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tableBuku.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        tableBuku.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tableBuku.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tableBuku.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        tableBuku.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableBuku.setRowHeight(40);
        tableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBukuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBuku);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1110, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/undraw_Web_search_re_efla-removebg-preview(2)(1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 440, 270));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel5.setText("Back");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 665));

        setSize(new java.awt.Dimension(1126, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtjudulbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulbukuActionPerformed
       // TODO add your handling code here:
    String judulBuku = txtjudulbuku.getText();
    if (judulBuku.isEmpty()) {
        // If the search field is empty, load all data
        load_data();
        return;
    }

    Connection con = Koneksi.getConnection();
    Object header[] = {"KODE BUKU", "JUDUL BUKU", "ISBN", "PENULIS", "PENERBIT", "STOK"};
    DefaultTableModel data = new DefaultTableModel(null, header);
    tableBuku.setModel(data);

    // SQL query with a WHERE clause to filter by partial match of judul_buku
    String sql_data = "SELECT * FROM buku WHERE judul_buku LIKE ?";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql_data);
        // Include wildcards for partial match
        pst.setString(1, "%" + judulBuku + "%");
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            String d1 = rs.getString(1);
            String d2 = rs.getString(2);
            String d3 = rs.getString(3);
            String d4 = rs.getString(4);
            String d5 = rs.getString(5);
            String d6 = rs.getString(6);

            String d[] = {d1, d2, d3, d4, d5, d6};
            data.addRow(d);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_txtjudulbukuActionPerformed

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        //TODO add your handling code here:
        

        
    }//GEN-LAST:event_tableBukuMouseClicked

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        DashboardUser dashboard = new DashboardUser();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(DaftarBukuUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBukuUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBukuUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBukuUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DaftarBukuUSer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private rojeru_san.complementos.RSTableMetro tableBuku;
    private javax.swing.JTextField txtjudulbuku;
    // End of variables declaration//GEN-END:variables
}
