/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delete;

import Actions.*;
import ClasesOthers.ConexionBD;
import Frame.Menus;
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
public class VehiculoDelete extends javax.swing.JFrame {

    /**
     * Creates new form Vehiculo
     */
    public VehiculoDelete() {
         setUndecorated(true);
        initComponents();
         setLocationRelativeTo(null);
         
         
           nummotor.setEnabled(false);
           numserie.setEnabled(false);
           tipo.setEnabled(false);
           numplacas.setEnabled(false);
           modelo.setEnabled(false);
           color.setEnabled(false);
           capacidad.setEnabled(false);
           observaciones.setEnabled(false);
           numunico.setEnabled(false);
           numsitio.setEnabled(false);
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
     sql = "SELECT numPlacas,capacidad,observaciones,numSitio,tipo,modelo,noMotor,noSerie,color,numUnico FROM vehiculo WHERE numSitio='"+valor+"' or numUnico='"+valor+"'";
    // sql = "SELECT idVehiculo,numPlacas,capacidad,observaciones,numSitio,tipo,modelo,noMotor,noSerie,color,numUnico FROM vehiculo WHERE numUnico='"+valor+"'";
    
     }
     try {
         
           java.sql.Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           if(rs.first())
           {
              // id.setText(rs.getString("idVehiculo"));
               numplacas.setText(rs.getString("numPlacas"));
               capacidad.setText(rs.getString("capacidad"));
               observaciones.setText(rs.getString("observaciones"));
               numsitio.setText(rs.getString("numSitio"));
               tipo.setText(rs.getString("tipo"));
               modelo.setText(rs.getString("modelo"));
               nummotor.setText(rs.getString("noMotor"));
               numserie.setText(rs.getString("noSerie"));
               color.setText(rs.getString("color"));
               numunico.setText(rs.getString("numUnico"));
                 
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
           PreparedStatement pat = cn.prepareStatement("DELETE FROM vehiculo "+ "WHERE idVehiculo=?");
          pat.setString(1, s);
           pat.executeUpdate();
           new rojerusan.RSNotifyFade("¡ELIMINADO!", "EL REGISTRO SE HA ELIMINADO DE FORMA EXITOSA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
          
           
           nummotor.setText("");
           numserie.setText("");
           tipo.setText("");
           numplacas.setText("");
           modelo.setText("");
           color.setText("");
           capacidad.setText("");
           observaciones.setText("");
           numunico.setText("");
           numsitio.setText("");
         
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
        txtBusqueda = new rojeru_san.RSMTextFull();
        buscar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nummotor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numserie = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        numplacas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numunico = new javax.swing.JTextField();
        observaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        numsitio = new javax.swing.JTextField();
        eliminar = new java.awt.Button();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Número de motor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        nummotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nummotor.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        nummotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nummotorActionPerformed(evt);
            }
        });
        jPanel1.add(nummotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 145, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Número de serie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        numserie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numserie.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numserieActionPerformed(evt);
            }
        });
        jPanel1.add(numserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 145, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Tipo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 145, 33));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel13.setText("Numero de placas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        numplacas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numplacas.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numplacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numplacasActionPerformed(evt);
            }
        });
        jPanel1.add(numplacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 33));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel16.setText("Modelo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        modelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 145, 33));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel10.setText("Color");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        color.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 145, 33));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel9.setText("Numero Unico");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        numunico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numunico.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numunico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numunicoActionPerformed(evt);
            }
        });
        jPanel1.add(numunico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 150, 33));

        observaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        observaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });
        jPanel1.add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 150, 33));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel8.setText("Observaciones");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setText("Capacidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        capacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadActionPerformed(evt);
            }
        });
        jPanel1.add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setText("Numero de sitio");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        numsitio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numsitio.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numsitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsitioActionPerformed(evt);
            }
        });
        jPanel1.add(numsitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, 33));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

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

    private void nummotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nummotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nummotorActionPerformed

    private void numserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numserieActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void numplacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numplacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numplacasActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void numunicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numunicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numunicoActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesActionPerformed

    private void capacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadActionPerformed

    private void numsitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsitioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsitioActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        try {
            //EVENTO PARA ELIMINAR
            Eliminar(txtBusqueda.getText());
            txtBusqueda.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(VehiculoDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiculoDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiculoDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiculoDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiculoDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField color;
    private java.awt.Button eliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nummotor;
    private javax.swing.JTextField numplacas;
    private javax.swing.JTextField numserie;
    private javax.swing.JTextField numsitio;
    private javax.swing.JTextField numunico;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField tipo;
    private rojeru_san.RSMTextFull txtBusqueda;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
