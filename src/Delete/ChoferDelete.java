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
public class ChoferDelete extends javax.swing.JFrame {

    /**
     * Creates new form Persona
     */
    public ChoferDelete() {
         setUndecorated(true);
        initComponents();
        status.setEnabled(false);
           antiguedad.setEnabled(false);
           noLicencia.setEnabled(false);
           tipoLicencia.setEnabled(false);
           nombre.setEnabled(false);
           ap.setEnabled(false);
           am.setEnabled(false);
           fechan.setEnabled(false);
           curp.setEnabled(false);
           domicilio.setEnabled(false);
           telefono.setEnabled(false);
           escolaridad.setEnabled(false);
           sexo.setEnabled(false);
           teleme.setEnabled(false);
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
     sql = "SELECT estatus,antiguedad,noLicencia,tipoLicencia,nombre,ap,am,fechan,curp,domicilio,telefono,telefonoe,escolaridad,sexo FROM chofer WHERE nombre='"+valor+"'";
     
     }
     try {
         
           java.sql.Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           if(rs.first())
           {
              // id.setText(rs.getString("idVehiculo"));
               //status.setSelectedIndex(rs.getString("status"));
               antiguedad.setText(rs.getString("antiguedad"));
               noLicencia.setText(rs.getString("noLicencia"));
               tipoLicencia.setText(rs.getString("tipoLicencia"));
               nombre.setText(rs.getString("nombre"));
               ap.setText(rs.getString("ap"));
               am.setText(rs.getString("am"));
               fechan.setText(rs.getString("fechan"));
               curp.setText(rs.getString("curp"));
               domicilio.setText(rs.getString("domicilio"));
               telefono.setText(rs.getString("telefono"));
               teleme.setText(rs.getString("telefonoe"));
               //escolaridad.setText(rs.getString("escolaridad"));
               //sexo.setText(rs.getString("sexo"));
               
                       
                 
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
           PreparedStatement pat = cn.prepareStatement("DELETE FROM chofer "+ "WHERE nombre=?");
          pat.setString(1, s);
           pat.executeUpdate();
           new rojerusan.RSNotifyFade("¡ELIMINADO!", "EL REGISTRO SE HA ELIMINADO DE FORMA EXITOSA",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
          
           //id.setText("");
          status.setSelectedIndex(0);
           antiguedad.setText("");
           noLicencia.setText("");
           tipoLicencia.setText("");
           nombre.setText("");
           ap.setText("");
           am.setText("");
           fechan.setText("");
           curp.setText("");
           domicilio.setText("");
           telefono.setText("");
           escolaridad.setSelectedIndex(0);
           sexo.setSelectedIndex(0);
           teleme.setText("");
         
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
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        noLicencia = new javax.swing.JTextField();
        teleme = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tipoLicencia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        escolaridad = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        fechan = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        antiguedad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBusqueda = new rojeru_san.RSMTextFull();
        buscar = new javax.swing.JLabel();
        eliminar = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(790, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setText("Nombre(s)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 20));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 152, 33));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel15.setText("Sexo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        sexo.setBackground(new java.awt.Color(222, 184, 135));
        sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Femenino", "Masculino" }));
        sexo.setToolTipText("");
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setText("Domicilio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        domicilio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        domicilio.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });
        jPanel1.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 145, 33));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel20.setText("No.Licencia");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 90, -1));

        noLicencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noLicencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        noLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noLicenciaActionPerformed(evt);
            }
        });
        jPanel1.add(noLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 145, 33));

        teleme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teleme.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        teleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telemeActionPerformed(evt);
            }
        });
        jPanel1.add(teleme, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 33));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel22.setText("Telefono de emergencia");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 170, -1));

        tipoLicencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLicencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        tipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoLicenciaActionPerformed(evt);
            }
        });
        jPanel1.add(tipoLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 145, 33));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel21.setText("Tipo de licencia");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, -1));

        ap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ap.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apActionPerformed(evt);
            }
        });
        jPanel1.add(ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 145, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Apellido Materno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        am.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        am.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });
        jPanel1.add(am, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 145, 33));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel18.setText("Escolaridad");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        escolaridad.setBackground(new java.awt.Color(222, 184, 135));
        escolaridad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        escolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Preescolar", "Primaria", "Secundaria", "Bachillerato", "Licenciatura" }));
        escolaridad.setToolTipText("");
        escolaridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolaridadActionPerformed(evt);
            }
        });
        jPanel1.add(escolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 150, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel23.setText("Fechan");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 90, -1));

        fechan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechan.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        fechan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechanActionPerformed(evt);
            }
        });
        jPanel1.add(fechan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 145, 33));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 145, 33));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel24.setText("Num. Telefonico");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 130, -1));

        antiguedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        antiguedad.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        antiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguedadActionPerformed(evt);
            }
        });
        jPanel1.add(antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 145, 33));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel19.setText("Antiguedad");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        status.setBackground(new java.awt.Color(222, 184, 135));
        status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Activo", "Inactivo" }));
        status.setToolTipText("");
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 150, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        curp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        curp.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpActionPerformed(evt);
            }
        });
        jPanel1.add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 145, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel14.setText("Curp");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

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

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioActionPerformed

    private void noLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noLicenciaActionPerformed

    private void telemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telemeActionPerformed

    private void tipoLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoLicenciaActionPerformed

    private void apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apActionPerformed

    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amActionPerformed

    private void escolaridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolaridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolaridadActionPerformed

    private void fechanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechanActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void antiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antiguedadActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpActionPerformed

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ChoferDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoferDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoferDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoferDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoferDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField am;
    private javax.swing.JTextField antiguedad;
    private javax.swing.JTextField ap;
    private javax.swing.JLabel buscar;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField domicilio;
    private java.awt.Button eliminar;
    private javax.swing.JComboBox<String> escolaridad;
    private javax.swing.JTextField fechan;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField noLicencia;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField teleme;
    private javax.swing.JTextField tipoLicencia;
    private rojeru_san.RSMTextFull txtBusqueda;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection();
}
