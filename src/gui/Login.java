package gui;

import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import javax.swing.SwingUtilities;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonLog = new javax.swing.JButton();
        BotonOlvidado = new javax.swing.JButton();
        TextUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        BotonLog.setText("Ingresar");
        BotonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar(evt);
                ingresar2(evt);
            }
        });

        BotonOlvidado.setText("Olvidé mi contraseña");

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
        TextPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPasswordFocusLost(evt);
            }
        });

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
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonOlvidado)
                    .addComponent(BotonLog))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void ingresar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresar

    private void ingresar2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar2
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresar2

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // You should work with UI (including installing L&F) inside Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Install WebLaF as application L&F
                WebLookAndFeel.install();

                // Create you Swing application here
                // JFrame frame = ...
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
    // End of variables declaration//GEN-END:variables
    
    private class LoginDriver {
        private Login v;
        public LoginDriver(Login v) {
            this.v = v;
        }
        
    }
}
