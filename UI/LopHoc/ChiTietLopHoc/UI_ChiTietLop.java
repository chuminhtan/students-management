/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LopHoc.ChiTietLopHoc;

import DTO.dto_ChuongTrinh;
import UI.LopHoc.ChiTietLopHoc.FormThemVaoLop;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
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
        
        tbLopHoc.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tbLopHoc.getTableHeader().setOpaque(false);
        tbLopHoc.getTableHeader().setForeground(new Color(22, 105, 158));
        tbLopHoc.setSelectionBackground(new Color(204,204,204));
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLop = new javax.swing.JPanel();
        btnThemLop = new javax.swing.JButton();
        jspLH = new javax.swing.JScrollPane();
        tbLopHoc = new javax.swing.JTable();
        btnChiTietLop = new javax.swing.JButton();
        btnXoaLop = new javax.swing.JButton();
        btnUpdateLop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHI TIẾT LỚP HỌC");
        setResizable(false);

        pnLop.setBackground(new java.awt.Color(230, 245, 255));

        btnThemLop.setBackground(new java.awt.Color(230, 245, 255));
        btnThemLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemLop.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/taomoi.png"))); // NOI18N
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
        jspLH.setPreferredSize(new java.awt.Dimension(450, 400));

        tbLopHoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "a", null, null, null, null, null, null, null, null},
                {"2", "a", null, null, null, null, null, null, null, null},
                {"3", "a", null, null, null, null, null, null, null, null},
                {"4", "a", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã KH", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại", "Nghe", "Nói", "Đọc", "Viết", "TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, false
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
        jspLH.setViewportView(tbLopHoc);
        if (tbLopHoc.getColumnModel().getColumnCount() > 0) {
            tbLopHoc.getColumnModel().getColumn(0).setMaxWidth(50);
            tbLopHoc.getColumnModel().getColumn(1).setMaxWidth(100);
            tbLopHoc.getColumnModel().getColumn(2).setMinWidth(150);
            tbLopHoc.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnChiTietLop.setBackground(new java.awt.Color(230, 245, 255));
        btnChiTietLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChiTietLop.setForeground(new java.awt.Color(255, 255, 255));
        btnChiTietLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chuyenlop.png"))); // NOI18N
        btnChiTietLop.setText("CHUYỂN LỚP");
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

        btnXoaLop.setBackground(new java.awt.Color(230, 245, 255));
        btnXoaLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaLop.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xoa.png"))); // NOI18N
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

        btnUpdateLop.setBackground(new java.awt.Color(230, 245, 255));
        btnUpdateLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateLop.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capnhatbangdiem.png"))); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LỚP AV1 - 12343432");

        jTextArea1.setBackground(new java.awt.Color(230, 245, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("<KHU VỰC THÔNG TIN LỚP HỌC>");

        javax.swing.GroupLayout pnLopLayout = new javax.swing.GroupLayout(pnLop);
        pnLop.setLayout(pnLopLayout);
        pnLopLayout.setHorizontalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLopLayout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnLopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLopLayout.createSequentialGroup()
                        .addComponent(jspLH, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnLopLayout.createSequentialGroup()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addComponent(btnUpdateLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChiTietLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        pnLopLayout.setVerticalGroup(
            pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLopLayout.createSequentialGroup()
                        .addGroup(pnLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChiTietLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGap(7, 7, 7)
                .addComponent(jspLH, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLopActionPerformed
        new FormThemVaoLop().show();
    }//GEN-LAST:event_btnThemLopActionPerformed

    private void btnChiTietLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietLopActionPerformed
        new FormChuyenLop().show();
    }//GEN-LAST:event_btnChiTietLopActionPerformed

    private void btnXoaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaLopActionPerformed

    private void btnUpdateLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLopActionPerformed
        new FormCapNhatBangDiem().show();
    }//GEN-LAST:event_btnUpdateLopActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietLop;
    private javax.swing.JButton btnThemLop;
    private javax.swing.JButton btnUpdateLop;
    private javax.swing.JButton btnXoaLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jspLH;
    private javax.swing.JPanel pnLop;
    private javax.swing.JTable tbLopHoc;
    // End of variables declaration//GEN-END:variables
}
