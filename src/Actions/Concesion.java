/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import ClasesOthers.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Hello
 */
public class Concesion extends javax.swing.JFrame {

    /**
     * Creates new form Concesion
     */
    public Concesion() {
         setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl_shipping = new javax.swing.JLabel();
        numunico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        localidad = new javax.swing.JTextField();
        clavedist = new javax.swing.JTextField();
        btnAgregar = new java.awt.Button();
        cancelar = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        numac = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        mod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_shipping.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        lbl_shipping.setForeground(new java.awt.Color(102, 102, 102));
        lbl_shipping.setText("REGISTRO CONCESION");
        lbl_shipping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_shippingMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_shipping, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 200, 40));

        numunico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numunico.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numunico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numunicoActionPerformed(evt);
            }
        });
        numunico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numunicoKeyTyped(evt);
            }
        });
        jPanel2.add(numunico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 152, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setText("No. Unico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Fecha de aprobación");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        fa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faActionPerformed(evt);
            }
        });
        jPanel2.add(fa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 145, 33));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 790, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel11.setText("Localidad");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 70, -1));

        localidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        localidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadActionPerformed(evt);
            }
        });
        jPanel2.add(localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 145, 33));

        clavedist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clavedist.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        clavedist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavedistActionPerformed(evt);
            }
        });
        clavedist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clavedistKeyTyped(evt);
            }
        });
        jPanel2.add(clavedist, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 145, 33));

        btnAgregar.setActionCommand("btn_complete");
        btnAgregar.setBackground(new java.awt.Color(36, 193, 93));
        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setLabel("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 180, 33));

        cancelar.setActionCommand("btn_cancel");
        cancelar.setBackground(new java.awt.Color(255, 0, 51));
        cancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setLabel("Cancelar ");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 180, 33));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel13.setText("Clave distrito");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Fecha de Vencimiento");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        fv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fv.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvActionPerformed(evt);
            }
        });
        jPanel2.add(fv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 145, 33));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel16.setText("Num. Acuerdo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        numac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numac.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numacActionPerformed(evt);
            }
        });
        numac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numacKeyTyped(evt);
            }
        });
        jPanel2.add(numac, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 145, 33));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel17.setText("Modalidad");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        mod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mod.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel2.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 145, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_shippingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_shippingMouseClicked
        // TODO add your handling code here:
        // lbl_shipping.setFont();
        lbl_shipping.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_lbl_shippingMouseClicked

    private void numunicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numunicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numunicoActionPerformed

    private void faActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faActionPerformed

    private void localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadActionPerformed

    private void clavedistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavedistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavedistActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
           
            //FileInputStream  archivofoto;
           int a = Integer.parseInt(numunico.getText());
           //int b = Integer.parseInt(id.getText());
           PreparedStatement pat = cn.prepareStatement("INSERT INTO concesion(noAcuerdo,noUnico,modalidad,fechaV,fechaAP,claveDistrito,localidad) VALUES(?,?,?,?,?,?,?)");
       
           pat.setInt(1, a);
           pat.setString(2, numac.getText());
          // pat.setInt(3, b);
           pat.setString(3, mod.getText());
           pat.setString(4, fv.getText());
           pat.setString(5, fa.getText());
           pat.setString(6, clavedist.getText());
           pat.setString(7, localidad.getText());
          

         //pat.setString(12, rutaa.getText());
         //archivofoto = new FileInputStream(rutaa.getText());
         //pat.setBinaryStream(13, archivofoto);

           pat.executeUpdate();
            new rojerusan.RSNotifyFade("¡AGREGADO!", "SE HA AGREGADO UNA NUEVA CONCESION A LA BASE DE DATOS",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
           
        // id.setText("");
           numunico.setText("");
           numac.setText("");
           fv.setText("");
           fa.setText("");
           clavedist.setText("");
           localidad.setText("");
           mod.setText("");
         

        } catch (SQLException ex) {
             new rojerusan.RSNotifyFade("¡ERROR!", "NO SE HA PODIDO AGREGAR, VERIFIQUE SUS DATOS",
                    4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

       }
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       
          // id.setText("");
           numunico.setText("");
           numac.setText("");
           fv.setText("");
           fa.setText("");
           clavedist.setText("");
           localidad.setText("");
           mod.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void fvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fvActionPerformed

    private void numacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numacActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

    private void numunicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numunicoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"solo se pueden ingresar números");
        }
        int pValor = 20;
        if (numunico.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_numunicoKeyTyped

    private void clavedistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clavedistKeyTyped
        // TODO add your handling code here:
        int pValor = 20;
        if (clavedist.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_clavedistKeyTyped

    private void numacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numacKeyTyped
        // TODO add your handling code here:
        int pValor = 20;
        if (numac.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_numacKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        dispose();
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
            java.util.logging.Logger.getLogger(Concesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Concesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Concesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Concesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Concesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAgregar;
    private java.awt.Button cancelar;
    private javax.swing.JTextField clavedist;
    private javax.swing.JTextField fa;
    private javax.swing.JTextField fv;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_shipping;
    private javax.swing.JTextField localidad;
    private javax.swing.JTextField mod;
    private javax.swing.JTextField numac;
    private javax.swing.JTextField numunico;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
