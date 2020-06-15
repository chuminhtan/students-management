/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LopHocUI;

import BUS.bus_LopHoc;
import DTO.dto_LopHoc;
import UI.LopHocUI.ChiTietLopHoc.UI_ChiTietLop;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ThinkPro
 */
public class UI_LopHoc extends javax.swing.JPanel {

    /**
     * Creates new form LopHocUI
     */
    BUS.bus_LopHoc busLH = new bus_LopHoc();
    dto_LopHoc dtoLH = new dto_LopHoc();

    public UI_LopHoc() {
        initComponents();
        tbLopHoc.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tbLopHoc.getTableHeader().setOpaque(false);
        tbLopHoc.getTableHeader().setForeground(new Color(22, 105, 158));
        tbLopHoc.setSelectionBackground(new Color(204, 204, 204));
        busLH.hienThiDanhSach(tbLopHoc);

        this.txtTimLop.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                this.search();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                this.search();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                this.search();
            }

            public void search() {
                DefaultTableModel table = (DefaultTableModel) tbLopHoc.getModel();
                String search = txtTimLop.getText();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
                tbLopHoc.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(search));
            }
        });
    }

    public JTable getTableLH() {
        return tbLopHoc;
    }

    public void showTable() {
        busLH.hienThiDanhSach(tbLopHoc);
    }

//    FormCapNhatLH jtRowData = new FormCapNhatLH();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLop = new javax.swing.JPanel();
        lblTimLop = new javax.swing.JLabel();
        txtTimLop = new javax.swing.JTextField();
        btnThemLop = new javax.swing.JButton();
        jspLH = new javax.swing.JScrollPane();
        tbLopHoc = new javax.swing.JTable();
        btnChiTietLop = new javax.swing.JButton();
        btnXoaLop = new javax.swing.JButton();
        btnUpdateLop = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 659));
        setMinimumSize(new java.awt.Dimension(1200, 659));
        setPreferredSize(new java.awt.Dimension(1200, 659));

        pnLop.setBackground(new java.awt.Color(255, 255, 255));

        lblTimLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTimLop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimLop.setText("TÌM LỚP HỌC");

        txtTimLop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimLop.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimLop.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtTimLop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimLopKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimLopKeyReleased(evt);
            }
        });

        btnThemLop.setBackground(new java.awt.Color(91, 155, 213));
        btnThemLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemLop.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/them lop.png"))); // NOI18N
        btnThemLop.setText("TẠO LỚP HỌC MỚI");
        btnThemLop.setContentAreaFilled(false);
        btnThemLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemLop.setFocusable(false);
        btnThemLop.setOpaque(true);
        btnThemLop.setPreferredSize(new java.awt.Dimension(183, 40));
        btnThemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLopActionPerformed(evt);
            }
        });

        jspLH.setBackground(new java.awt.Color(255, 255, 255));
        jspLH.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspLH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jspLH.setPreferredSize(new java.awt.Dimension(469, 400));

        tbLopHoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Lớp", "Mã Chương Trình", "Mã Nhân Viên", "Tên Lớp", "Bắt Đầu", "Kết Thúc", "Số HV", "Giáo Viên", "Phòng", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLopHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbLopHoc.setDoubleBuffered(true);
        tbLopHoc.setFocusable(false);
        tbLopHoc.setPreferredSize(new java.awt.Dimension(600, 450));
        tbLopHoc.setRowHeight(30);
        tbLopHoc.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tbLopHoc.getTableHeader().setReorderingAllowed(false);
        tbLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLopHocMouseClicked(evt);
            }
        });
        jspLH.setViewportView(tbLopHoc);
        if (tbLopHoc.getColumnModel().getColumnCount() > 0) {
            tbLopHoc.getColumnModel().getColumn(0).setMinWidth(100);
            tbLopHoc.getColumnModel().getColumn(0).setMaxWidth(100);
            tbLopHoc.getColumnModel().getColumn(1).setMinWidth(150);
            tbLopHoc.getColumnModel().getColumn(1).setMaxWidth(150);
            tbLopHoc.getColumnModel().getColumn(3).setMinWidth(150);
            tbLopHoc.getColumnModel().getColumn(3).setMaxWidth(150);
            tbLopHoc.getColumnModel().getColumn(4).setMinWidth(80);
            tbLopHoc.getColumnModel().getColumn(4).setMaxWidth(80);
            tbLopHoc.getColumnModel().getColumn(5).setMinWidth(80);
            tbLopHoc.getColumnModel().getColumn(5).setMaxWidth(80);
            tbLopHoc.getColumnModel().getColumn(6).setMinWidth(50);
            tbLopHoc.getColumnModel().getColumn(6).setMaxWidth(50);
            tbLopHoc.getColumnModel().getColumn(8).setMinWidth(100);
            tbLopHoc.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        btnChiTietLop.setBackground(new java.awt.Color(239, 158, 154));
        btnChiTietLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChiTietLop.setForeground(new java.awt.Color(255, 255, 255));
        btnChiTietLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lich su 3.png"))); // NOI18N
        btnChiTietLop.setText("QUẢN LÝ LỚP");
        btnChiTietLop.setActionCommand("");
        btnChiTietLop.setContentAreaFilled(false);
        btnChiTietLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChiTietLop.setFocusable(false);
        btnChiTietLop.setOpaque(true);
        btnChiTietLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietLopActionPerformed(evt);
            }
        });

        btnXoaLop.setBackground(new java.awt.Color(239, 158, 154));
        btnXoaLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaLop.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xoa.png"))); // NOI18N
        btnXoaLop.setText("XÓA");
        btnXoaLop.setContentAreaFilled(false);
        btnXoaLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaLop.setFocusable(false);
        btnXoaLop.setMaximumSize(new java.awt.Dimension(129, 49));
        btnXoaLop.setMinimumSize(new java.awt.Dimension(129, 49));
        btnXoaLop.setOpaque(true);
        btnXoaLop.setPreferredSize(new java.awt.Dimension(129, 49));
        btnXoaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLopActionPerformed(evt);
            }
        });

        btnUpdateLop.setBackground(new java.awt.Color(239, 158, 154));
        btnUpdateLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateLop.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cap nhat 1.png"))); // NOI18N
        btnUpdateLop.setText("CẬP NHẬT");
        btnUpdateLop.setContentAreaFilled(false);
        btnUpdateLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateLop.setFocusable(false);
        btnUpdateLop.setMaximumSize(new java.awt.Dimension(129, 49));
        btnUpdateLop.setMinimumSize(new java.awt.Dimension(129, 49));
        btnUpdateLop.setOpaque(true);
        btnUpdateLop.setPreferredSize(new java.awt.Dimension(129, 49));
        btnUpdateLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLopLayout = new javax.swing.GroupLayout(pnLop);
        pnLop.setLayout(pnLopLayout);
        pnLopLayout.setHorizontalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLopLayout.createSequentialGroup()
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnLopLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChiTietLop)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdateLop, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(pnLopLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspLH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnLopLayout.createSequentialGroup()
                                .addComponent(lblTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                                .addComponent(btnThemLop, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addGap(50, 50, 50))
        );
        pnLopLayout.setVerticalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLopLayout.createSequentialGroup()
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspLH, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChiTietLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLopActionPerformed
        int row = tbLopHoc.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần cập nhật!!!");
        } else {
            FormCapNhatLH formCapNhatLH = new FormCapNhatLH();

            dtoLH = this.busLH.getList().get(row);

            formCapNhatLH.insertOldDatainForm(this.dtoLH);
            formCapNhatLH.setLopHocCallback(new LopHocCallback() {
                @Override
                public void Callback() {
                    showTable();
                }
            });

            if (dtoLH != null) {
                formCapNhatLH.setVisible(true);
            }
        }

    }//GEN-LAST:event_btnUpdateLopActionPerformed

    private void btnThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLopActionPerformed
        FormThemLH formThemLH = new FormThemLH();
        formThemLH.setLopHocCallback(new LopHocCallback() {
            @Override
            public void Callback() {
                showTable();
            }
        });
        formThemLH.setVisible(true);
    }//GEN-LAST:event_btnThemLopActionPerformed

    private void btnChiTietLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietLopActionPerformed
        new UI_ChiTietLop().setVisible(true);
    }//GEN-LAST:event_btnChiTietLopActionPerformed

    private void btnXoaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLopActionPerformed
        int row = tbLopHoc.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần xóa!!!");
        } else {
            dtoLH = this.busLH.getList().get(row);
            if (dtoLH != null) {
                System.out.println(dtoLH.getMaLop());
                String message = "Bạn có muốn xóa lớp học " + dtoLH.gettenLop() + " không?";
                ImageIcon icon = new ImageIcon("images/trash.png");

                int result = JOptionPane.showConfirmDialog(null,
                        message,
                        "Xóa lớp học", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
                if (result == 0) {
                    boolean kq = busLH.xoaLH(dtoLH.getMaLop());
                    if (kq == true) {
                        busLH.hienThiDanhSach(tbLopHoc);
                    } else {
                        JOptionPane.showMessageDialog(null, "Không xóa được");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnXoaLopActionPerformed

    private void tbLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLopHocMouseClicked
//        int index = tbLopHoc.getSelectedRow();
//        TableModel model = tbLopHoc.getModel();
//        
//        String tenLop = model.getValueAt(index, 1).toString();
//        String maChuongTrinh = model.getValueAt(index, 2).toString();
//        String ngayBD = model.getValueAt(index, 3).toString();
//        String ngayKT = model.getValueAt(index, 4).toString();
//        String tenGiaoVien = model.getValueAt(index, 5).toString();
//        String phong = model.getValueAt(index, 6).toString();
//        
//        jtRowData.setVisible(true);
//        jtRowData.pack();
////        jtRowData.setLocationRelativeTo(null);
////        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        
//        
//        jtRowData.btnThemTenLop.setText(tenLop);
//        jtRowData.cbThemChuongTrinh.setSelectedItem(maChuongTrinh);
//        jtRowData.dateBDLop.setDateFormatString(ngayBD);
//        jtRowData.dateKTLop.setDateFormatString(ngayKT);
//        jtRowData.txtThemGV.setText(tenGiaoVien);
//        jtRowData.txtThemPH.setText(phong);
    }//GEN-LAST:event_tbLopHocMouseClicked

    private void txtTimLopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimLopKeyPressed
        //
    }//GEN-LAST:event_txtTimLopKeyPressed

    private void txtTimLopKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimLopKeyReleased
        //
    }//GEN-LAST:event_txtTimLopKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietLop;
    private javax.swing.JButton btnThemLop;
    private javax.swing.JButton btnUpdateLop;
    private javax.swing.JButton btnXoaLop;
    private javax.swing.JScrollPane jspLH;
    private javax.swing.JLabel lblTimLop;
    private javax.swing.JPanel pnLop;
    private javax.swing.JTable tbLopHoc;
    private javax.swing.JTextField txtTimLop;
    // End of variables declaration//GEN-END:variables
}
