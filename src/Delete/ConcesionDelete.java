/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delete;

import Actions.*;
import ClasesOthers.ConexionBD;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Hello
 */
public class ConcesionDelete extends javax.swing.JFrame {

    /**
     * Creates new form Concesion
     */
    public ConcesionDelete() {
         setUndecorated(true);
        initComponents();
        
        
           numac.setEnabled(false);
           nounico.setEnabled(false);
           mod.setEnabled(false);
           loc.setEnabled(false);
           fv.setEnabled(false);
           fa.setEnabled(false);
           cd.setEnabled(false);
        
    }

    void mostrarDatos(String valor)throws IOException
            
    {
        
     String sql="";
     if(valor.isEmpty())
     {
       new rojerusan.RSNotifyFade("ADVERTENCIA", "VERIFIQUE QUE HALLA ALGO PARA BUSCAR",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
     }
     else
     {
     sql = "SELECT noAcuerdo,noUnico,modalidad,fechaV,fechaAP,claveDistrito,localidad FROM concesion WHERE noUnico='"+valor+"'";
    
     }
     try {
         
           java.sql.Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           if(rs.first())
           {
              // id.setText(rs.getString("idVehiculo"));
               numac.setText(rs.getString("noAcuerdo"));
               nounico.setText(rs.getString("noUnico"));
               mod.setText(rs.getString("modalidad"));
               fv.setText(rs.getString("fechaV"));
               fa.setText(rs.getString("fechaAP"));
               cd.setText(rs.getString("claveDistrito"));
               loc.setText(rs.getString("localidad"));
                 
                 }
           else
             
         {
                    JOptionPane.showMessageDialog(null, "No existe el registro que está buscando o verifique que este bien escrita su busqueda");
           
        }
        } catch (SQLException ex) {
             new rojerusan.RSNotifyFade("ADVERTENCIA", "VERIFIQUE SU BUSQUEDA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
 }
    }
    
    
    

public void Eliminar(String s)throws SQLException
{
if(s.isEmpty())
{
    new rojerusan.RSNotifyFade("ADVERTENCIA", "VERIFIQUE SU BUSQUEDA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
}
    
else
{
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
    if(confirmar==JOptionPane.OK_OPTION){
   
        try {
           PreparedStatement pat = cn.prepareStatement("DELETE FROM concesion "+ "WHERE noUnico=?");
          pat.setString(1, s);
           pat.executeUpdate();
           new rojerusan.RSNotifyFade("¡ELIMINADO!", "EL REGISTRO SE HA ELIMINADO DE FORMA EXITOSA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
          
           //id.setText("");
           numac.setText("");
           nounico.setText("");
           mod.setText("");
           loc.setText("");
           fv.setText("");
           fa.setText("");
           cd.setText("");
         
        } catch (SQLException ex) {
        new rojerusan.RSNotifyFade("ERROR", "EL REGISTRO NO SE HA PODIDO ELIMINAR",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

   
        }
    }
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nounico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        numac = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        mod = new javax.swing.JTextField();
        txtBusqueda = new rojeru_san.RSMTextFull();
        buscar = new javax.swing.JLabel();
        eliminar = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nounico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nounico.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        nounico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nounicoActionPerformed(evt);
            }
        });
        jPanel2.add(nounico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 152, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setText("No. Unico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Clave de Distrito");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        cd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cd.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        jPanel2.add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 145, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Fecha de aprobación");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        fa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faActionPerformed(evt);
            }
        });
        jPanel2.add(fa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 145, 33));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel11.setText("Localidad");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        loc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loc.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        jPanel2.add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 145, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Fecha de Vencimiento");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        fv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fv.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvActionPerformed(evt);
            }
        });
        jPanel2.add(fv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 145, 33));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel16.setText("Num. Acuerdo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        numac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numac.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numacActionPerformed(evt);
            }
        });
        jPanel2.add(numac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 145, 33));

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

        txtBusqueda.setPlaceholder("Buscar...");
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
        });
        jPanel2.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar3.png"))); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 50));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Moon", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setLabel("E L I M I N A R");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

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

    private void nounicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nounicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nounicoActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdActionPerformed

    private void faActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void fvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fvActionPerformed

    private void numacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numacActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            try {
                // TODO add your handling code here
                mostrarDatos(txtBusqueda.getText());
            } catch (IOException ex) {

                new rojerusan.RSNotifyFade("ADVERTENCIA", "VERIFIQUE SU BUSQUEDA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

            }
        }
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        try {
            // TODO add your handling code here
            mostrarDatos(txtBusqueda.getText());
        } catch (IOException ex) {

            new rojerusan.RSNotifyFade("ADVERTENCIA", "VERIFIQUE SU BUSQUEDA",
                3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_buscarMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        try {
            //EVENTO PARA ELIMINAR
            Eliminar(txtBusqueda.getText());
            txtBusqueda.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(ConcesionDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConcesionDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConcesionDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConcesionDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConcesionDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JTextField cd;
    private java.awt.Button eliminar;
    private javax.swing.JTextField fa;
    private javax.swing.JTextField fv;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loc;
    private javax.swing.JTextField mod;
    private javax.swing.JTextField nounico;
    private javax.swing.JTextField numac;
    private rojeru_san.RSMTextFull txtBusqueda;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
