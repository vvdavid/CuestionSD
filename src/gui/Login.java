package gui;

import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import javax.swing.SwingUtilities;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
         TextPassword.setEchoChar((char)0);
         TextPassword.setText("Contraseña");
         TextPassword.setForeground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonOlvidado = new javax.swing.JButton();
        BotonLog = new javax.swing.JButton();
        TextUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextPassword = new javax.swing.JPasswordField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        BotonOlvidado.setText("Olvidé mi contraseña");

        BotonLog.setText("Ingresar");

        TextUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(153, 153, 153));
        TextUsuario.setToolTipText("");
        TextUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextUsuarioFocusLost(evt);
            }
        });
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido, inicia sesión para continuar.");

        TextPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextPassword.setText("Contraseña");
        TextPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPasswordFocusLost(evt);
            }
        });

        jMenu3.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem3.setText("Acerca de...");
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonOlvidado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonLog))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextUsuario)
                    .addComponent(TextPassword))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonOlvidado)
                    .addComponent(BotonLog))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TextUsuario.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsuarioFocusGained
        if (TextUsuario.getText().equals("Usuario") && TextUsuario.getForeground() == Color.GRAY) {
            TextUsuario.setText("");
            TextUsuario.setForeground(Color.BLACK);
        } 
    }//GEN-LAST:event_TextUsuarioFocusGained

    private void TextUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUsuarioFocusLost
        if (TextUsuario.getText().equals("")) {
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextUsuarioFocusLost

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed

    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPasswordFocusGained
        if (TextPassword.getText().equals("Contraseña") && TextPassword.getForeground() == Color.GRAY) {
            TextPassword.setEchoChar('*');
            TextPassword.setText("");
            TextPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_TextPasswordFocusGained

    private void TextPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPasswordFocusLost
        if (TextPassword.getText().equals("")) {
            TextPassword.setEchoChar((char) 0);
            TextPassword.setText("Contraseña");
            TextPassword.setForeground(Color.GRAY);
        }   
    }//GEN-LAST:event_TextPasswordFocusLost

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLog;
    private javax.swing.JButton BotonOlvidado;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
    
    private class LoginDriver {
        private Login v;
        public LoginDriver(Login v) {
            this.v = v;
        }
        
    }
}
