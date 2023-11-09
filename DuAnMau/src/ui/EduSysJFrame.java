/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author sang
 */
public class EduSysJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EduSysJFrame
     */
    void init(){
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Hệ Thống Quản Lý Đào Tạo");
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
        this.openWelcome();
        this.openLogin();
    }
    public EduSysJFrame() {
        initComponents();
        init();
    }
    void openWelcome(){
        new ChaoJDialog(this, true).setVisible(true);
    }
    void openLogin(){
        new DangNhapJDialog(this, true).setVisible(true);
    }
    void openDoiMatKhau(){
        if (Auth.isLogin()) {
            new DoiMatKhauJDialog(this, true).setVisible(true);
        } else{
            MsgBox.alert(this, "Vui long đăng nhập");
        }
    }
    void dangXuat(){
        Auth.clear();
        openLogin();
    }
    void ketThuc(){
        if(MsgBox.confirm(this, "Ban muon ket thuc khong ?")){
            System.exit(0);
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        BTNDANGXUAT = new javax.swing.JButton();
        BTNKETTHUC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BTNCHUYENDE = new javax.swing.JButton();
        BTNNGUOIHOC = new javax.swing.JButton();
        BTNKHOAHOC = new javax.swing.JButton();
        BTNHOCVIEN = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BTNHUONGDAN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        LBLTRANGTHAI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        MNIDOIMATKHAU = new javax.swing.JMenuItem();
        MNIDANGXUAT = new javax.swing.JMenuItem();
        MNIKETTHUC = new javax.swing.JMenuItem();
        MNUQUANLY = new javax.swing.JMenu();
        MNICHUYENDE = new javax.swing.JMenuItem();
        MNIKHOAHOC = new javax.swing.JMenuItem();
        MNINGUOIHOC = new javax.swing.JMenuItem();
        MNIHOCVIEN = new javax.swing.JMenuItem();
        MNINHANVIEN = new javax.swing.JMenuItem();
        MNUTHONGKE = new javax.swing.JMenu();
        MNIBANGDIEM = new javax.swing.JMenuItem();
        MNILUONGNGUOIHOC = new javax.swing.JMenuItem();
        MNIDIEMCHUYENDE = new javax.swing.JMenuItem();
        MNIDOANHTHU = new javax.swing.JMenuItem();
        MNUTROGIUP = new javax.swing.JMenu();
        MNIHUONGDAN = new javax.swing.JMenuItem();
        MNIGIOITHIEU = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        BTNDANGXUAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        BTNDANGXUAT.setText("Đăng Xuất");
        BTNDANGXUAT.setFocusable(false);
        BTNDANGXUAT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNDANGXUAT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNDANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDANGXUATActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNDANGXUAT);

        BTNKETTHUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        BTNKETTHUC.setText("Kết Thúc");
        BTNKETTHUC.setFocusable(false);
        BTNKETTHUC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNKETTHUC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNKETTHUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNKETTHUCActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNKETTHUC);
        jToolBar1.add(jSeparator1);

        BTNCHUYENDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        BTNCHUYENDE.setText("Chuyên Đề");
        BTNCHUYENDE.setFocusable(false);
        BTNCHUYENDE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNCHUYENDE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNCHUYENDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCHUYENDEActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNCHUYENDE);

        BTNNGUOIHOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        BTNNGUOIHOC.setText("Người Học");
        BTNNGUOIHOC.setFocusable(false);
        BTNNGUOIHOC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNNGUOIHOC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNNGUOIHOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNGUOIHOCActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNNGUOIHOC);

        BTNKHOAHOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        BTNKHOAHOC.setText("Khóa Học");
        BTNKHOAHOC.setFocusable(false);
        BTNKHOAHOC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNKHOAHOC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNKHOAHOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNKHOAHOCActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNKHOAHOC);

        BTNHOCVIEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        BTNHOCVIEN.setText("Học Viên");
        BTNHOCVIEN.setFocusable(false);
        BTNHOCVIEN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNHOCVIEN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNHOCVIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHOCVIENActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNHOCVIEN);
        jToolBar1.add(jSeparator2);

        BTNHUONGDAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        BTNHUONGDAN.setText("Hướng Dẫn");
        BTNHUONGDAN.setFocusable(false);
        BTNHUONGDAN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNHUONGDAN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNHUONGDAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHUONGDANActionPerformed(evt);
            }
        });
        jToolBar1.add(BTNHUONGDAN);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N
        lblDongHo.setText("12:12:12:AM");

        LBLTRANGTHAI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        LBLTRANGTHAI.setText("HỆ QUẢN LÝ ĐÀO TẠO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LBLTRANGTHAI, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDongHo)
                    .addComponent(LBLTRANGTHAI)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        mnuHeThong.setText("Hệ thống");
        mnuHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHeThongActionPerformed(evt);
            }
        });

        MNIDOIMATKHAU.setText("Đổi mật khẩu");
        MNIDOIMATKHAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIDOIMATKHAUActionPerformed(evt);
            }
        });
        mnuHeThong.add(MNIDOIMATKHAU);

        MNIDANGXUAT.setText("Đăng Xuất");
        MNIDANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIDANGXUATActionPerformed(evt);
            }
        });
        mnuHeThong.add(MNIDANGXUAT);

        MNIKETTHUC.setText("Kết thúc");
        MNIKETTHUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIKETTHUCActionPerformed(evt);
            }
        });
        mnuHeThong.add(MNIKETTHUC);

        jMenuBar1.add(mnuHeThong);

        MNUQUANLY.setText("Quản lý");

        MNICHUYENDE.setText("Chuyên Đề");
        MNICHUYENDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNICHUYENDEActionPerformed(evt);
            }
        });
        MNUQUANLY.add(MNICHUYENDE);

        MNIKHOAHOC.setText("Khóa Học");
        MNIKHOAHOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIKHOAHOCActionPerformed(evt);
            }
        });
        MNUQUANLY.add(MNIKHOAHOC);

        MNINGUOIHOC.setText("Người Học");
        MNINGUOIHOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNINGUOIHOCActionPerformed(evt);
            }
        });
        MNUQUANLY.add(MNINGUOIHOC);

        MNIHOCVIEN.setText("Học Viên");
        MNIHOCVIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIHOCVIENActionPerformed(evt);
            }
        });
        MNUQUANLY.add(MNIHOCVIEN);

        MNINHANVIEN.setText("Nhân Viên");
        MNINHANVIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNINHANVIENActionPerformed(evt);
            }
        });
        MNUQUANLY.add(MNINHANVIEN);

        jMenuBar1.add(MNUQUANLY);

        MNUTHONGKE.setText("Thống kê");
        MNUTHONGKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNUTHONGKEActionPerformed(evt);
            }
        });

        MNIBANGDIEM.setText("Bảng Điểm");
        MNIBANGDIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIBANGDIEMActionPerformed(evt);
            }
        });
        MNUTHONGKE.add(MNIBANGDIEM);

        MNILUONGNGUOIHOC.setText("Lượng Người Học");
        MNILUONGNGUOIHOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNILUONGNGUOIHOCActionPerformed(evt);
            }
        });
        MNUTHONGKE.add(MNILUONGNGUOIHOC);

        MNIDIEMCHUYENDE.setText("Điểm Chuyên Đề");
        MNIDIEMCHUYENDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIDIEMCHUYENDEActionPerformed(evt);
            }
        });
        MNUTHONGKE.add(MNIDIEMCHUYENDE);

        MNIDOANHTHU.setText("Doanh Thu");
        MNIDOANHTHU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIDOANHTHUActionPerformed(evt);
            }
        });
        MNUTHONGKE.add(MNIDOANHTHU);

        jMenuBar1.add(MNUTHONGKE);

        MNUTROGIUP.setText("Trợ giúp");

        MNIHUONGDAN.setText("Hướng dẫn sử dụng");
        MNIHUONGDAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIHUONGDANActionPerformed(evt);
            }
        });
        MNUTROGIUP.add(MNIHUONGDAN);

        MNIGIOITHIEU.setText("Giới Thiệu Sản Phẩm");
        MNIGIOITHIEU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNIGIOITHIEUActionPerformed(evt);
            }
        });
        MNUTROGIUP.add(MNIGIOITHIEU);

        jMenuBar1.add(MNUTROGIUP);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MNIKHOAHOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIKHOAHOCActionPerformed
        openKhoaHoc();
    }//GEN-LAST:event_MNIKHOAHOCActionPerformed
    void openHuongDan(){
        
    }
    private void MNIHUONGDANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIHUONGDANActionPerformed
        openHuongDan();
    }//GEN-LAST:event_MNIHUONGDANActionPerformed

    private void MNIKETTHUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIKETTHUCActionPerformed
        ketThuc();
    }//GEN-LAST:event_MNIKETTHUCActionPerformed

    private void mnuHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHeThongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuHeThongActionPerformed

    private void MNIDOIMATKHAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIDOIMATKHAUActionPerformed
        openDoiMatKhau();
    }//GEN-LAST:event_MNIDOIMATKHAUActionPerformed

    private void MNUTHONGKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNUTHONGKEActionPerformed

    }//GEN-LAST:event_MNUTHONGKEActionPerformed
    void openThongKe(int index){
        if(Auth.isLogin()){
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "bạn không có quyên xem thông tin doanh thu");
            } else {
                ThongKeJDialog tkwin = new ThongKeJDialog(this, true);
                tkwin.setVisible(true);
//                tkwin.selectTab(index);
            }
        }
        else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }
    private void MNIBANGDIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIBANGDIEMActionPerformed
        openThongKe(0);
    }//GEN-LAST:event_MNIBANGDIEMActionPerformed

    private void MNILUONGNGUOIHOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNILUONGNGUOIHOCActionPerformed
        openThongKe(1);
    }//GEN-LAST:event_MNILUONGNGUOIHOCActionPerformed

    private void MNIDIEMCHUYENDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIDIEMCHUYENDEActionPerformed
        openThongKe(2);
    }//GEN-LAST:event_MNIDIEMCHUYENDEActionPerformed

    private void MNIDOANHTHUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIDOANHTHUActionPerformed
        openThongKe(3);
    }//GEN-LAST:event_MNIDOANHTHUActionPerformed
    void openGioiThieu(){
        new GioiThieuJDialog(this, true).setVisible(true);
    }
    private void MNIGIOITHIEUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIGIOITHIEUActionPerformed
        openGioiThieu();
    }//GEN-LAST:event_MNIGIOITHIEUActionPerformed

    private void BTNHUONGDANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHUONGDANActionPerformed
        openHuongDan();
    }//GEN-LAST:event_BTNHUONGDANActionPerformed
    void openNhanVien(){
        new NhanVienJDialog(this, true).setVisible(true);
    }
    private void MNINHANVIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNINHANVIENActionPerformed
        openNhanVien();
    }//GEN-LAST:event_MNINHANVIENActionPerformed
    void openHocVien(){
        
    }
    private void BTNHOCVIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHOCVIENActionPerformed
        openHocVien();
    }//GEN-LAST:event_BTNHOCVIENActionPerformed

    private void MNIHOCVIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIHOCVIENActionPerformed
        openHocVien();
    }//GEN-LAST:event_MNIHOCVIENActionPerformed
    void openKhoaHoc(){
        new KhoaHocJDialog(this, true).setVisible(true);
    }
    private void BTNKHOAHOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNKHOAHOCActionPerformed
        openKhoaHoc();
    }//GEN-LAST:event_BTNKHOAHOCActionPerformed
    void openNguoiHoc(){
        new NguoiHocJDialog(this, true).setVisible(true);
    }
    private void MNINGUOIHOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNINGUOIHOCActionPerformed
        openNguoiHoc();
    }//GEN-LAST:event_MNINGUOIHOCActionPerformed

    private void BTNNGUOIHOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNGUOIHOCActionPerformed
        openNguoiHoc();
    }//GEN-LAST:event_BTNNGUOIHOCActionPerformed
    void openChuyenDe(){
        new ChuyenDeJDialog(this, true).setVisible(true);
    }
    private void MNICHUYENDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNICHUYENDEActionPerformed
        openChuyenDe();
    }//GEN-LAST:event_MNICHUYENDEActionPerformed

    private void BTNCHUYENDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCHUYENDEActionPerformed
        openChuyenDe();
    }//GEN-LAST:event_BTNCHUYENDEActionPerformed

    private void BTNKETTHUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNKETTHUCActionPerformed
        ketThuc();
    }//GEN-LAST:event_BTNKETTHUCActionPerformed

    private void BTNDANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDANGXUATActionPerformed
        dangXuat();
    }//GEN-LAST:event_BTNDANGXUATActionPerformed

    private void MNIDANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNIDANGXUATActionPerformed
        dangXuat();
    }//GEN-LAST:event_MNIDANGXUATActionPerformed

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
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduSysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCHUYENDE;
    private javax.swing.JButton BTNDANGXUAT;
    private javax.swing.JButton BTNHOCVIEN;
    private javax.swing.JButton BTNHUONGDAN;
    private javax.swing.JButton BTNKETTHUC;
    private javax.swing.JButton BTNKHOAHOC;
    private javax.swing.JButton BTNNGUOIHOC;
    private javax.swing.JLabel LBLTRANGTHAI;
    private javax.swing.JMenuItem MNIBANGDIEM;
    private javax.swing.JMenuItem MNICHUYENDE;
    private javax.swing.JMenuItem MNIDANGXUAT;
    private javax.swing.JMenuItem MNIDIEMCHUYENDE;
    private javax.swing.JMenuItem MNIDOANHTHU;
    private javax.swing.JMenuItem MNIDOIMATKHAU;
    private javax.swing.JMenuItem MNIGIOITHIEU;
    private javax.swing.JMenuItem MNIHOCVIEN;
    private javax.swing.JMenuItem MNIHUONGDAN;
    private javax.swing.JMenuItem MNIKETTHUC;
    private javax.swing.JMenuItem MNIKHOAHOC;
    private javax.swing.JMenuItem MNILUONGNGUOIHOC;
    private javax.swing.JMenuItem MNINGUOIHOC;
    private javax.swing.JMenuItem MNINHANVIEN;
    private javax.swing.JMenu MNUQUANLY;
    private javax.swing.JMenu MNUTHONGKE;
    private javax.swing.JMenu MNUTROGIUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenu mnuHeThong;
    // End of variables declaration//GEN-END:variables

}
