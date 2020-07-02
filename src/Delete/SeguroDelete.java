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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Hello
 */
public class SeguroDelete extends javax.swing.JFrame {

    /**
     * Creates new form Seguro
     */
    public SeguroDelete() {
         setUndecorated(true);
        initComponents();
        numpoliza.setEnabled(false);
           beneficiario.setEnabled(false);
           fechainicio.setEnabled(false);
           vencimineto.setEnabled(false);
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
     sql = "SELECT noPoliza,beneficiario,fechaCont,vencimiento FROM seguro WHERE noPoliza='"+valor+"'";
     
     }
     try {
         
           java.sql.Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           if(rs.first())
           {
              // id.setText(rs.getString("idVehiculo"));
               numpoliza.setText(rs.getString("noPoliza"));
               beneficiario.setText(rs.getString("beneficiario"));
               fechainicio.setText(rs.getString("fechaCont"));
               vencimineto.setText(rs.getString("vencimiento"));
               
                 
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
           PreparedStatement pat = cn.prepareStatement("DELETE FROM seguro "+ "WHERE noPoliza=?");
           pat.setString(1, s);
           pat.executeUpdate();
           new rojerusan.RSNotifyFade("¡ELIMINADO!", "EL REGISTRO SE HA ELIMINADO DE FORMA EXITOSA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
          
          
           numpoliza.setText("");
           beneficiario.setText("");
           fechainicio.setText("");
           vencimineto.setText("");
          
         
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

        jPanel1 = new javax.swing.JPanel();
        numpoliza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechainicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vencimineto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        beneficiario = new javax.swing.JTextField();
        txtBusqueda = new rojeru_san.RSMTextFull();
        buscar = new javax.swing.JLabel();
        eliminar = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numpoliza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numpoliza.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numpoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numpolizaActionPerformed(evt);
            }
        });
        jPanel1.add(numpoliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 152, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setText("Número de poliza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Fecha cont");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        fechainicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechainicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainicioActionPerformed(evt);
            }
        });
        jPanel1.add(fechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 145, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Vencimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        vencimineto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vencimineto.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        vencimineto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venciminetoActionPerformed(evt);
            }
        });
        jPanel1.add(vencimineto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 145, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Beneficiario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        beneficiario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        beneficiario.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        beneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beneficiarioActionPerformed(evt);
            }
        });
        jPanel1.add(beneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 145, 33));

        txtBusqueda.setPlaceholder("Buscar...");
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar3.png"))); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 50));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Moon", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setLabel("E L I M I N A R");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numpolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numpolizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numpolizaActionPerformed

    private void fechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainicioActionPerformed

    private void venciminetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venciminetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venciminetoActionPerformed

    private void beneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beneficiarioActionPerformed

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
            java.util.logging.Logger.getLogger(SeguroDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguroDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguroDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguroDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguroDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beneficiario;
    private javax.swing.JLabel buscar;
    private java.awt.Button eliminar;
    private javax.swing.JTextField fechainicio;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numpoliza;
    private rojeru_san.RSMTextFull txtBusqueda;
    private javax.swing.JTextField vencimineto;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
