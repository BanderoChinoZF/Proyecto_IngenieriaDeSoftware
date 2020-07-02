/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import ClasesOthers.ConexionBD;
import ClasesOthers.Validaciones;
import Frame.Menus;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Hello
 */
public class Vehiculo extends javax.swing.JFrame {

  
    public Vehiculo() {
         setUndecorated(true);
        initComponents();
         setLocationRelativeTo(null);
                
    }
    

            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_shipping = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nummotor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numserie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        btnAgregar = new java.awt.Button();
        cancelar = new java.awt.Button();
        jLabel14 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numunico = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        numsitio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        numplacas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_shipping.setFont(new java.awt.Font("Decker", 1, 16)); // NOI18N
        lbl_shipping.setForeground(new java.awt.Color(102, 102, 102));
        lbl_shipping.setText("REGISTRO VEHICULO");
        lbl_shipping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_shippingMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_shipping, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 169, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Número de motor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        nummotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nummotor.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        nummotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nummotorActionPerformed(evt);
            }
        });
        nummotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nummotorKeyTyped(evt);
            }
        });
        jPanel1.add(nummotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 145, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Número de serie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        numserie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numserie.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numserieActionPerformed(evt);
            }
        });
        numserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numserieKeyTyped(evt);
            }
        });
        jPanel1.add(numserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 145, 33));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 790, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setText("Capacidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        capacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadActionPerformed(evt);
            }
        });
        jPanel1.add(capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 150, 33));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel8.setText("Observaciones");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        observaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        observaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });
        jPanel1.add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 150, 33));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel10.setText("Color");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        color.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 145, 33));

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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 180, 33));

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
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 180, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Tipo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoKeyTyped(evt);
            }
        });
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 145, 33));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel16.setText("Modelo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        modelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 145, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel9.setText("Numero Unico");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

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
        jPanel1.add(numunico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setText("Numero de sitio");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        numsitio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numsitio.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numsitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numsitioActionPerformed(evt);
            }
        });
        numsitio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numsitioKeyTyped(evt);
            }
        });
        jPanel1.add(numsitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 33));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel13.setText("Numero de placas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        numplacas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numplacas.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        numplacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numplacasActionPerformed(evt);
            }
        });
        numplacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numplacasKeyTyped(evt);
            }
        });
        jPanel1.add(numplacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 33));

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

    private void lbl_shippingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_shippingMouseClicked
       
        lbl_shipping.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_lbl_shippingMouseClicked

    private void nummotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nummotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nummotorActionPerformed

    private void numserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numserieActionPerformed

    private void capacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    
         try {
           
            //FileInputStream  archivofoto;
          int a = Integer.parseInt(numsitio.getText());
           PreparedStatement pat = cn.prepareStatement("INSERT INTO vehiculo(numPlacas,capacidad,observaciones,numSitio,tipo,modelo,noMotor,noSerie,color,numUnico) VALUES(?,?,?,?,?,?,?,?,?,?)");
       
          // pat.setInt(1, a);
           pat.setString(1, numplacas.getText());
           pat.setString(2, capacidad.getText());
           pat.setString(3, observaciones.getText());
           pat.setInt(4,a);
           pat.setString(5, tipo.getText());
           pat.setString(6, modelo.getText());
           pat.setString(7, nummotor.getText());
           pat.setString(8, numserie.getText());
           pat.setString(9, color.getText());
           pat.setString(10,numunico.getText());

         //pat.setString(12, rutaa.getText());
         //archivofoto = new FileInputStream(rutaa.getText());
         //pat.setBinaryStream(13, archivofoto);

           pat.executeUpdate();
            new rojerusan.RSNotifyFade("¡AGREGADO!", "SE HA AGREGADO UN NUEVO VEHICULO A LA BASE DE DATOS",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
           
          // id.setText("");
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
         //  rutaa.setText("");
         //fotop.setText("");

        } catch (SQLException ex) {
             new rojerusan.RSNotifyFade("¡ERROR!", "NO SE HA PODIDO AGREGAR, VERIFIQUE SUS DATOS",
                    4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

       }
      
     
   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
//      id.setText("");
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
         
    }//GEN-LAST:event_cancelarActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void numunicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numunicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numunicoActionPerformed

    private void numsitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numsitioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numsitioActionPerformed

    private void numplacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numplacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numplacasActionPerformed

    private void nummotorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nummotorKeyTyped
        // TODO add your handling code here:
        int pValor = 20;
        if (nummotor.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_nummotorKeyTyped

    private void numserieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numserieKeyTyped
        // TODO add your handling code here:
         int pValor = 6;
        if (numserie.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_numserieKeyTyped

    private void tipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoKeyTyped
        // TODO add your handling code here:
         int pValor = 30;
        if (tipo.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_tipoKeyTyped

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        // TODO add your handling code here:
         int pValor = 18;
        if (color.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
        
        char validar = evt.getKeyChar();
        if(!Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"solo se pueden ingresar letras");
        }
         
    }//GEN-LAST:event_colorKeyTyped

    private void numplacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numplacasKeyTyped
        // TODO add your handling code here:
        int pValor = 9;
        if (numplacas.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_numplacasKeyTyped

    private void numsitioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numsitioKeyTyped
        // TODO add your handling code here:
         char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"solo se pueden ingresar números");
        }
        int pValor = 9;
        if (numsitio.getText().length()>=pValor)
      {
       evt.consume();
       
                          JOptionPane.showMessageDialog(null,"limite de acaracteres excedido");
      }
    }//GEN-LAST:event_numsitioKeyTyped

    private void numunicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numunicoKeyTyped
        
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
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAgregar;
    private java.awt.Button cancelar;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField color;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_shipping;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nummotor;
    private javax.swing.JTextField numplacas;
    private javax.swing.JTextField numserie;
    private javax.swing.JTextField numsitio;
    private javax.swing.JTextField numunico;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
