/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import ClasesOthers.ConexionBD;
import com.sun.awt.AWTUtilities;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojerusan.RSNotifyFade;


/**
 *
 * @author DaleDonDale
 */
public class Login extends javax.swing.JFrame {

   
    public Login() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this);
        
        AWTUtilities.setWindowOpaque(this, false);
    }

void acceder(String usuario, String pass)
    {
          if(usuario.isEmpty() && pass.isEmpty())
        {
          new rojerusan.RSNotifyFade("ERROR!!", "USUARIO O CONTRASEÑA INCORRECTOS",
                    6, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
    
           }
           else
           {
          
             
            String cap="";
            String sql="SELECT * FROM usuarios WHERE Usuario='"+usuario+"' && contraseña='"+pass+"'";
       
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cap=rs.getString("Usuario");
            }
            if(cap.equals("admin"))
            {
                  this.setVisible(false);
                    new rojerusan.RSNotifyFade("WELCOME!!", "BIENVENIDO PRESIDENTE",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                     Menus ingreso = new Menus();
                     ingreso.setVisible(true);
                     dispose();
                  
                
            }
            if(cap.equals("Usuario2"))
            {
            this.setVisible(false);
                  new rojerusan.RSNotifyFade("WELCOME!!", "BIENVENIDO",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                   Menus2 ingreso = new Menus2();
                     ingreso.setVisible(true);
                     dispose();
                   
            }
            if((!cap.equals("admin"))&& (!cap.equals("Usuario2")))
            {
                new rojerusan.RSNotifyFade("ERROR!!", "VERIFIQUE SUS DATOS",
                    3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

            }
            } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        enter = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JLCerrar = new javax.swing.JLabel();
        jLMinizar = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Rigth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_96px_2.png"))); // NOI18N
        jLabel2.setToolTipText("");
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, 80));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("USUARIO");
        Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_customer_32px_1.png"))); // NOI18N
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 30, 30));

        usuario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        usuario.setBorder(null);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        Login.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, 40));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Contraseña");
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Key_32px.png"))); // NOI18N
        Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        contraseña.setBorder(null);
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        Login.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 40));

        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_OFF.png"))); // NOI18N
        enter.setBorder(null);
        enter.setBorderPainted(false);
        enter.setContentAreaFilled(false);
        enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        enter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        enter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        enter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterKeyPressed(evt);
            }
        });
        Login.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 90, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forma-abstracta011.png"))); // NOI18N
        Login.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 290, 430, 280));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forma-abstracta011.png"))); // NOI18N
        Login.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 310, 360, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forma-abstracta011.png"))); // NOI18N
        Login.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 540, 230));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forma-abstracta011.png"))); // NOI18N
        Login.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 540, 230));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 280, 530));

        JLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        JLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(JLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 40, 30));

        jLMinizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLMinizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMinizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinizarMouseClicked(evt);
            }
        });
        getContentPane().add(jLMinizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, -1, 30));

        left.setBackground(new java.awt.Color(130, 66, 66));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Moon 2.0", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sitio El “Manantial” A.C.");
        left.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-lease-96.png"))); // NOI18N
        left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 110));

        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 460, 380));

        Rigth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.png"))); // NOI18N
        getContentPane().add(Rigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 460, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()== KeyEvent.VK_ENTER)
         {
              String usu=usuario.getText();
       String pas=new String(contraseña.getPassword());
       acceder(usu, pas);
         }
        
      
    }//GEN-LAST:event_contraseñaKeyPressed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String usu=usuario.getText();
       String pas=new String(contraseña.getPassword());
       acceder(usu, pas);
    }//GEN-LAST:event_enterActionPerformed

    private void enterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_enterKeyPressed

    private void JLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_JLCerrarMouseClicked

    private void jLMinizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinizarMouseClicked
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinizarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCerrar;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Rigth;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLMinizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel left;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
ConexionBD cc = new ConexionBD();
    Connection cn = cc.getConnection(); 
}
