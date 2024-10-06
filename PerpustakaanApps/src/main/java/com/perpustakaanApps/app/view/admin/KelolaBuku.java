/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.com.perpustakaanApps.app.view.admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.com.perpustakaanApps.app.controller.admin.AdminModel;
import main.java.com.perpustakaanApps.database.Koneksi;
/**
 *
 * @author ASUS
 */
public class KelolaBuku extends javax.swing.JFrame {
    AdminModel adminModel = new AdminModel();
    /** Creates new form KelolaBuku */
    public KelolaBuku() {
        initComponents();
        load_data();
    }
    
     private void load_data()
    {
        Connection con=Koneksi.getConnection();
        Object header[]={"KODE BUKU","JUDUL BUKU","ISBN","PENULIS","PENGARANG","TAHUN TERBIT"};
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
     private void update()
    {try
        {
            Connection con=Koneksi.getConnection();
            Statement st=con.createStatement();
           
            
            String sql_update="UPDATE buku SET judul_buku='"+judulbuku.getText()
                    +"',isbn='"+txt_isbn.getText()
                    +"',penulis='"+txt_penulis.getText()
                    +"',pengarang='"+txt_pengarang.getText()
                    +"',stok='"+txt_year.getText()
                    +"'WHERE kode_buku='"+kodebuku.getText()+"'";
                    
            st.execute(sql_update);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
        }
        catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                          
    }
    
    private void delete()
    {
        try
        {
            Connection con=Koneksi.getConnection();
            Statement st=con.createStatement();
            String sql_delete="DELETE from buku WHERE kode_buku='"+kodebuku.getText()+"'";
            st.executeUpdate(sql_delete);
            JOptionPane.showMessageDialog(null, "Data Berhasil DIhapus");
            
            
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kodebuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        judulbuku = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_pengarang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnReset = new rojerusan.RSMaterialButtonRectangle();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        btnEdit = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBuku = new rojeru_san.complementos.RSTableMetro();
        jLabel16 = new javax.swing.JLabel();
        txt_penulis = new javax.swing.JTextField();
        btnBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 176, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 802));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KODE BUKU");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 308, -1));

        kodebuku.setBackground(new java.awt.Color(0, 176, 255));
        kodebuku.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        kodebuku.setForeground(new java.awt.Color(255, 255, 255));
        kodebuku.setBorder(null);
        kodebuku.setCaretColor(new java.awt.Color(255, 255, 255));
        kodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebukuActionPerformed(evt);
            }
        });
        jPanel1.add(kodebuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 40));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JUDUL BUKU");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 308, -1));

        judulbuku.setBackground(new java.awt.Color(0, 176, 255));
        judulbuku.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        judulbuku.setForeground(new java.awt.Color(255, 255, 255));
        judulbuku.setBorder(null);
        judulbuku.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(judulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_______________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PENULIS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 308, -1));

        txt_year.setBackground(new java.awt.Color(0, 176, 255));
        txt_year.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_year.setForeground(new java.awt.Color(255, 255, 255));
        txt_year.setBorder(null);
        txt_year.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 270, 40));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_______________________________________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 280, 37));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PENGARANG");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 308, -1));

        txt_pengarang.setBackground(new java.awt.Color(0, 176, 255));
        txt_pengarang.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_pengarang.setForeground(new java.awt.Color(255, 255, 255));
        txt_pengarang.setBorder(null);
        txt_pengarang.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_______________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 280, 37));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STOK");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 308, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("_______________________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 280, 37));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ISBN");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 308, -1));

        txt_isbn.setBackground(new java.awt.Color(0, 176, 255));
        txt_isbn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(255, 255, 255));
        txt_isbn.setBorder(null);
        txt_isbn.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 270, 40));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_______________________________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 280, 37));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setForeground(new java.awt.Color(0, 176, 255));
        btnReset.setText("RESET");
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 150, 50));

        btnTambah.setBackground(new java.awt.Color(0, 0, 0));
        btnTambah.setText("TAMBAH");
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 150, 50));

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setText("EDIT");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 150, 50));

        btnHapus.setBackground(new java.awt.Color(255, 51, 51));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/keolabuku.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 520, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KELOLA BUKU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 240, 50));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 720, 250));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_______________________________________");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 280, 37));

        txt_penulis.setBackground(new java.awt.Color(0, 176, 255));
        txt_penulis.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_penulis.setForeground(new java.awt.Color(255, 255, 255));
        txt_penulis.setBorder(null);
        txt_penulis.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_penulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 270, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/perpustakaanApps/icons/icons8_Rewind_48px.png"))); // NOI18N
        btnBack.setText("BACK");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        setSize(new java.awt.Dimension(1300, 802));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
        String kodeBuku = kodebuku.getText();
        String judulBuku = judulbuku.getText();
        String isbn = txt_isbn.getText();
        String penulis = txt_year.getText();
        String pengarang = txt_pengarang.getText();
        String tahun_terbit = String.valueOf(txt_year.getText());
        if(kodeBuku.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan Kode Buku");
        }
        
        else if(judulBuku.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan Judul Buku");
        }
        else if(isbn.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan ISBN");
        }
        else if(penulis.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan PENULIS");
        }
        else if(pengarang.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan PENGARANG");
        }
        else if(tahun_terbit.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Masukkan STOK");
        }

        PreparedStatement ps;
        String query = "INSERT INTO `buku`(`kode_buku`, `judul_buku`, `isbn`,`penulis`, `pengarang`, `stok`) VALUES (?,?,?,?,?,?)";
        try  {
            ps = Koneksi.getConnection().prepareStatement(query);
            
            ps.setString(1, kodeBuku);
            ps.setString(2, judulBuku);
            ps.setString(3, isbn);
            ps.setString(4, penulis);
            ps.setString(5, pengarang);
            ps.setString(6, tahun_terbit);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Tambah Buku Berhasil !!!");
                load_data();

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahMouseClicked

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

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        // TODO add your handling code here:
        int bar= tableBuku.getSelectedRow();
        String a=tableBuku.getValueAt(bar, 0).toString();
        String b=tableBuku.getValueAt(bar, 1).toString();
        String c=tableBuku.getValueAt(bar, 2).toString();
        String d=tableBuku.getValueAt(bar, 3).toString();
        String e=tableBuku.getValueAt(bar, 4).toString();
        String f=tableBuku.getValueAt(bar, 5).toString();
        
        kodebuku.setText(a);
        judulbuku.setText(b);
        txt_isbn.setText(c);
        txt_penulis.setText(d);
        txt_pengarang.setText(e);
        txt_year.setText(f);
    }//GEN-LAST:event_tableBukuMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        String username = adminModel.getUsername();
        DashboardAdmin dashboard = new DashboardAdmin();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        int update = JOptionPane.showOptionDialog(this,
            "Apakah Data akan Di Update?",
            "Update Data",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(update==JOptionPane.YES_OPTION)
        {
            update();
            load_data();
//            btnTambah.setEnabled(true);
//            btnEdit.setEnabled(false);
//            btnHapus.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        int delete = JOptionPane.showOptionDialog(this,
            "Apakah Data akan Di Hapus?",
            "Hapus Data",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(delete==JOptionPane.YES_OPTION)
        {
            delete();
            load_data();
//            btnTambah.setEnabled(true);
//            btnEdit.setEnabled(false);
//            btnHapus.setEnabled(false);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void kodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebukuActionPerformed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
                kodebuku.setText("");
                judulbuku.setText("");
                txt_isbn.setText("");
                txt_year.setText("");
                txt_pengarang.setText("");
                txt_penulis.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

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
            java.util.logging.Logger.getLogger(KelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private rojerusan.RSMaterialButtonRectangle btnEdit;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnReset;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField judulbuku;
    private javax.swing.JTextField kodebuku;
    private rojeru_san.complementos.RSTableMetro tableBuku;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_pengarang;
    private javax.swing.JTextField txt_penulis;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables

}
