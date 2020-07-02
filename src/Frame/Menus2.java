/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import ClasesOthers.CambiaPanel;
import Paneles.CambioAdd;
import com.sun.awt.AWTUtilities;

/**
 *
 * @author Hello
 */
public class Menus2 extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    public Menus2() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        
        //AWTUtilities.setWindowOpaque(this, false);
       // setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        formatos = new rojeru_san.RSButtonRiple();
        actualizar = new rojeru_san.RSButtonRiple();
        eliminar = new rojeru_san.RSButtonRiple();
        agregar = new rojeru_san.RSButtonRiple();
        pnl1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PnlPrincipal.setOpaque(false);
        PnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 36, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniminizar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, 30));

        PnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 30));

        pnlMenu.setBackground(new java.awt.Color(72, 207, 47));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formatos.setBackground(new java.awt.Color(72, 207, 47));
        formatos.setBorder(null);
        formatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AddFile.png"))); // NOI18N
        formatos.setText("Formatos");
        formatos.setColorHover(new java.awt.Color(37, 36, 64));
        formatos.setColorText(new java.awt.Color(0, 0, 0));
        formatos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pnlMenu.add(formatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 150, 40));

        actualizar.setBackground(new java.awt.Color(72, 207, 47));
        actualizar.setBorder(null);
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-update-48.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.setColorHover(new java.awt.Color(37, 36, 64));
        actualizar.setColorText(new java.awt.Color(0, 0, 0));
        actualizar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pnlMenu.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 150, 40));

        eliminar.setBackground(new java.awt.Color(72, 207, 47));
        eliminar.setBorder(null);
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setColorHover(new java.awt.Color(37, 36, 64));
        eliminar.setColorText(new java.awt.Color(0, 0, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        pnlMenu.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 150, 40));

        agregar.setBackground(new java.awt.Color(72, 207, 47));
        agregar.setBorder(null);
        agregar.setForeground(new java.awt.Color(0, 0, 0));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.setColorHover(new java.awt.Color(37, 36, 64));
        agregar.setColorText(new java.awt.Color(0, 0, 0));
        agregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        pnlMenu.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 150, 40));

        PnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 990, 40));

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setMaximumSize(new java.awt.Dimension(990, 470));
        pnl1.setMinimumSize(new java.awt.Dimension(990, 470));
        pnl1.setLayout(new javax.swing.BoxLayout(pnl1, javax.swing.BoxLayout.LINE_AXIS));
        PnlPrincipal.add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 990, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
       new  CambiaPanel(pnl1, new CambioAdd());
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          this.setExtendedState(Menus2.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Menus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlPrincipal;
    private rojeru_san.RSButtonRiple actualizar;
    private rojeru_san.RSButtonRiple agregar;
    private rojeru_san.RSButtonRiple eliminar;
    private rojeru_san.RSButtonRiple formatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
