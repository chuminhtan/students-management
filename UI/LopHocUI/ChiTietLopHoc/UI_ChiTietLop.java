/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LopHocUI.ChiTietLopHoc;

import BUS.bus_ChiTietLop;
import DTO.dto_ChiTiet_KH;
import DTO.dto_ChiTiet_TT;
import DTO.dto_LopHoc;
import UI.LopHocUI.ChiTietLopHoc.FormThemVaoLop;
import UI.LopHocUI.FormCapNhatLH;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThinkPro
 */
public class UI_ChiTietLop extends javax.swing.JFrame {

    /**
     * Creates new form FormLichSuLH
     */
    public UI_ChiTietLop() {
        initComponents();
        setThongTinLop();
    }

    /**
     * Khu vực của Tân
     */
    
    static dto_LopHoc dto_lop = new dto_LopHoc(2);
    static bus_ChiTietLop bus_chiTiet =  new bus_ChiTietLop();
    static DefaultTableModel dtmChiTiet  = new DefaultTableModel();
    static int stt = 0;
    
    // Hàm truyền Mã lớp yêu cầu bus lấy dữ liệu đẩy lên bảng
    public void requestReloadTable(){
        bus_chiTiet.getListChiTietLop(dto_lop);
    }
    
    // Hàm set thông tin cho lớp học
    public void setThongTinLop(){
        dto_ChiTiet_TT thongTinLop = new bus_ChiTietLop().getLopHoc(dto_lop);
        lblTenLop.setText(thongTinLop.getTenLop() + " | " + thongTinLop.getMaCT());
        this.setTitle("Lớp " + thongTinLop.getTenLop());
        
        String strThongTin = ""; 
        strThongTin += "Chương trình: " + thongTinLop.getTenCt();
                if(thongTinLop.getTrangThai() == 0){
            strThongTin += "\t\tTrạng thái: Đóng";
            hideBtn();
        }
        else{
            strThongTin += "\t\tTrạng thái: Mở";
        }
                
        strThongTin += "\n\nGiảng viên: " + thongTinLop.getGiaoVien();
        strThongTin += "\t\tPhòng: " + thongTinLop.getPhong();
        strThongTin += "\n\nNgày bắt đầu: " + thongTinLop.getNgayBD();
        strThongTin += "\t\tNgày kết thúc: " + thongTinLop.getNgayKT();
     
        txtThongTinLop.setText(strThongTin);     
        
        setupTable();
        requestReloadTable();
    }
    
    // Hàm ẩn button khi lớp đóng
    public void hideBtn(){

        btnThemVaoLop.setVisible(false);
        btnChuyenLop.setVisible(false);
        btnXoaKhoiLop.setVisible(false);
    }
    
    // Hàm đẩy dữ liệu lên bảng - được gọi từ lớp bus.
    public static void reloadTable(ArrayList<dto_ChiTiet_KH> listChiTiet){
        stt = 0;
        dtmChiTiet.setRowCount(0);
        for(dto_ChiTiet_KH ct : listChiTiet){
            stt++;
            Vector<Object> vc = new Vector<Object>();
            
            vc.add(stt);
            vc.add(ct.getMa());
            vc.add(ct.getHoTen());
            vc.add(ct.getGioiTinh());
            vc.add(ct.getSdt());
            vc.add(ct.getNghe());
            vc.add(ct.getNoi());
            vc.add(ct.getDoc());
            vc.add(ct.getViet());
            vc.add(ct.getTb());
            dtmChiTiet.addRow(vc);
        }
    }
    
    // Setup Bảng: Tạo column - setModel - chỉnh độ rộng cột - chỉnh màu.
    public void setupTable(){

        dtmChiTiet.addColumn("STT");
        dtmChiTiet.addColumn("Mã KH");
        dtmChiTiet.addColumn("Họ Tên");
        dtmChiTiet.addColumn("Giới Tính");
        dtmChiTiet.addColumn("Điện Thoại");
        dtmChiTiet.addColumn("Nghe");
        dtmChiTiet.addColumn("Nói");
        dtmChiTiet.addColumn("Đọc");
        dtmChiTiet.addColumn("Viết");
        dtmChiTiet.addColumn("Trung Bình");
           
        tbChiTiet.setModel(dtmChiTiet);
        
        
        tbChiTiet.getColumnModel().getColumn(0).setMaxWidth(50);
	tbChiTiet.getColumnModel().getColumn(1).setMinWidth(80);
	tbChiTiet.getColumnModel().getColumn(2).setMinWidth(150);
	tbChiTiet.getColumnModel().getColumn(4).setMinWidth(100);
        
        tbChiTiet.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tbChiTiet.getTableHeader().setOpaque(false);
        tbChiTiet.getTableHeader().setForeground(new Color(22, 105, 158));
        tbChiTiet.setSelectionBackground(new Color(204,204,204));
    }
    
    //----------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLop = new javax.swing.JPanel();
        btnThemVaoLop = new javax.swing.JButton();
        jspLH = new javax.swing.JScrollPane();
        tbChiTiet = new javax.swing.JTable(dtmChiTiet);
        btnChuyenLop = new javax.swing.JButton();
        btnXoaKhoiLop = new javax.swing.JButton();
        btnCapNhatBangDiem = new javax.swing.JButton();
        lblTenLop = new javax.swing.JLabel();
        txtThongTinLop = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHI TIẾT LỚP HỌC");
        setResizable(false);

        pnLop.setBackground(new java.awt.Color(255, 255, 255));

        btnThemVaoLop.setBackground(new java.awt.Color(91, 155, 213));
        btnThemVaoLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemVaoLop.setForeground(new java.awt.Color(255, 255, 255));
        btnThemVaoLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/them lop.png"))); // NOI18N
        btnThemVaoLop.setText("THÊM VÀO LỚP");
        btnThemVaoLop.setContentAreaFilled(false);
        btnThemVaoLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemVaoLop.setFocusable(false);
        btnThemVaoLop.setOpaque(true);
        btnThemVaoLop.setPreferredSize(new java.awt.Dimension(183, 40));
        btnThemVaoLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemVaoLopMouseClicked(evt);
            }
        });
        btnThemVaoLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoLopActionPerformed(evt);
            }
        });

        jspLH.setBackground(new java.awt.Color(255, 255, 255));
        jspLH.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspLH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jspLH.setPreferredSize(new java.awt.Dimension(450, 400));

        tbChiTiet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbChiTiet.setDoubleBuffered(true);
        tbChiTiet.setFocusable(false);
        tbChiTiet.setPreferredSize(new java.awt.Dimension(600, 450));
        tbChiTiet.setRowHeight(30);
        tbChiTiet.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tbChiTiet.getTableHeader().setReorderingAllowed(false);
        jspLH.setViewportView(tbChiTiet);

        btnChuyenLop.setBackground(new java.awt.Color(239, 158, 154));
        btnChuyenLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChuyenLop.setForeground(new java.awt.Color(255, 255, 255));
        btnChuyenLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lich su 3.png"))); // NOI18N
        btnChuyenLop.setText("CHUYỂN LỚP");
        btnChuyenLop.setActionCommand("");
        btnChuyenLop.setContentAreaFilled(false);
        btnChuyenLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChuyenLop.setFocusable(false);
        btnChuyenLop.setOpaque(true);
        btnChuyenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenLopActionPerformed(evt);
            }
        });

        btnXoaKhoiLop.setBackground(new java.awt.Color(239, 158, 154));
        btnXoaKhoiLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaKhoiLop.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaKhoiLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xoa.png"))); // NOI18N
        btnXoaKhoiLop.setText("XÓA KHỎI LỚP");
        btnXoaKhoiLop.setContentAreaFilled(false);
        btnXoaKhoiLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaKhoiLop.setFocusable(false);
        btnXoaKhoiLop.setMaximumSize(new java.awt.Dimension(129, 49));
        btnXoaKhoiLop.setMinimumSize(new java.awt.Dimension(129, 49));
        btnXoaKhoiLop.setOpaque(true);
        btnXoaKhoiLop.setPreferredSize(new java.awt.Dimension(129, 49));
        btnXoaKhoiLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiLopActionPerformed(evt);
            }
        });

        btnCapNhatBangDiem.setBackground(new java.awt.Color(239, 158, 154));
        btnCapNhatBangDiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCapNhatBangDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhatBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cap nhat 1.png"))); // NOI18N
        btnCapNhatBangDiem.setText("CẬP NHẬT BẢNG ĐIỂM");
        btnCapNhatBangDiem.setContentAreaFilled(false);
        btnCapNhatBangDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatBangDiem.setFocusable(false);
        btnCapNhatBangDiem.setMaximumSize(new java.awt.Dimension(129, 49));
        btnCapNhatBangDiem.setMinimumSize(new java.awt.Dimension(129, 49));
        btnCapNhatBangDiem.setOpaque(true);
        btnCapNhatBangDiem.setPreferredSize(new java.awt.Dimension(129, 49));
        btnCapNhatBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatBangDiemActionPerformed(evt);
            }
        });

        lblTenLop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenLop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenLop.setText("LỚP AV1 - 12343432");

        txtThongTinLop.setEditable(false);
        txtThongTinLop.setColumns(20);
        txtThongTinLop.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtThongTinLop.setRows(5);
        txtThongTinLop.setText("<KHU VỰC THÔNG TIN LỚP HỌC>");
        txtThongTinLop.setBorder(null);

        javax.swing.GroupLayout pnLopLayout = new javax.swing.GroupLayout(pnLop);
        pnLop.setLayout(pnLopLayout);
        pnLopLayout.setHorizontalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jspLH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLopLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(txtThongTinLop, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(btnThemVaoLop, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCapNhatBangDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnChuyenLop)
                .addGap(54, 54, 54)
                .addComponent(btnXoaKhoiLop, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(pnLopLayout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(lblTenLop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnLopLayout.setVerticalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenLop)
                .addGap(41, 41, 41)
                .addComponent(txtThongTinLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jspLH, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatBangDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaKhoiLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(pnLopLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnThemVaoLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemVaoLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoLopActionPerformed
        new FormThemVaoLop().show();
    }//GEN-LAST:event_btnThemVaoLopActionPerformed

    private void btnChuyenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenLopActionPerformed
        new FormChuyenLop().show();
    }//GEN-LAST:event_btnChuyenLopActionPerformed

    private void btnXoaKhoiLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoiLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaKhoiLopActionPerformed

    private void btnCapNhatBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatBangDiemActionPerformed
        new FormCapNhatBangDiem().show();
    }//GEN-LAST:event_btnCapNhatBangDiemActionPerformed

    private void btnThemVaoLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemVaoLopMouseClicked
        
    }//GEN-LAST:event_btnThemVaoLopMouseClicked

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
            java.util.logging.Logger.getLogger(UI_ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_ChiTietLop().setVisible(true);
            }
        });
    }
    //biến tự định nghĩa
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatBangDiem;
    private javax.swing.JButton btnChuyenLop;
    private javax.swing.JButton btnThemVaoLop;
    private javax.swing.JButton btnXoaKhoiLop;
    private javax.swing.JScrollPane jspLH;
    private javax.swing.JLabel lblTenLop;
    private javax.swing.JPanel pnLop;
    public static javax.swing.JTable tbChiTiet;
    private javax.swing.JTextArea txtThongTinLop;
    // End of variables declaration//GEN-END:variables
}
