package gui;

import com.alee.extended.layout.VerticalFlowLayout;
import com.alee.extended.window.WebPopOver;
import com.alee.laf.label.WebLabel;
import com.alee.laf.optionpane.WebOptionPane;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import jdbc.UsuarioJDBC;
import pojos.Usuario;
import tools.GUITools;

public class Login extends javax.swing.JFrame {

    private WebPopOver popOver;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);

        //inicializa passwordJPF a vacio
        passwordJPF.setEchoChar((char) 0);
        passwordJPF.setText("Contraseña");
        passwordJPF.setForeground(Color.GRAY);

        //Inicializar pop-up
        popOver = new WebPopOver();

        popOver.setMargin(10);
        popOver.setCloseOnFocusLoss(true);
        popOver.setMovable(false);
        popOver.setLayout(new VerticalFlowLayout());
        popOver.add(new WebLabel("Contacta al administrador para recuperar el acceso"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        olvideJB = new javax.swing.JButton();
        ingresarJB = new javax.swing.JButton();
        usuarioJTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordJPF = new javax.swing.JPasswordField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        olvideJB.setText("Olvidé mi contraseña");
        olvideJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olvideJBActionPerformed(evt);
            }
        });

        ingresarJB.setText("Ingresar");
        ingresarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarJBActionPerformed(evt);
            }
        });

        usuarioJTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioJTF.setForeground(new java.awt.Color(0, 0, 0));
        usuarioJTF.setToolTipText("");
        usuarioJTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioJTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioJTFFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido, inicia sesión para continuar.");

        passwordJPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordJPF.setText("Contraseña");
        passwordJPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordJPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJPFFocusLost(evt);
            }
        });
        passwordJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJPFActionPerformed(evt);
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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem3.setText("Acerca de...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
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
                        .addComponent(olvideJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingresarJB))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioJTF)
                    .addComponent(passwordJPF))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(usuarioJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordJPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(olvideJB)
                    .addComponent(ingresarJB))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        usuarioJTF.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioJTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioJTFFocusGained
        if (usuarioJTF.getText().equals("Usuario") && usuarioJTF.getForeground() == Color.GRAY) {
            usuarioJTF.setText("");
            usuarioJTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_usuarioJTFFocusGained

    private void usuarioJTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioJTFFocusLost
        if (usuarioJTF.getText().equals("")) {
            usuarioJTF.setText("Usuario");
            usuarioJTF.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_usuarioJTFFocusLost

    private void passwordJPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJPFFocusGained
        if (passwordJPF.getText().equals("Contraseña") && passwordJPF.getForeground() == Color.GRAY) {
            passwordJPF.setEchoChar('*');
            passwordJPF.setText("");
            passwordJPF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passwordJPFFocusGained

    private void passwordJPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJPFFocusLost
        if (passwordJPF.getText().equals("")) {
            passwordJPF.setEchoChar((char) 0);
            passwordJPF.setText("Contraseña");
            passwordJPF.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_passwordJPFFocusLost

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void olvideJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olvideJBActionPerformed
        popOver.show(olvideJB);
    }//GEN-LAST:event_olvideJBActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Mostrar en título el texto del JMenuItem
        WebOptionPane.showMessageDialog(this, "Cuestion 0.1",
                ((JMenuItem) evt.getSource()).getText(),
                WebOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void passwordJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJPFActionPerformed
        ingresar();
    }//GEN-LAST:event_passwordJPFActionPerformed

    private void ingresarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarJBActionPerformed
        ingresar();
    }//GEN-LAST:event_ingresarJBActionPerformed

    private void ingresar() {
        JFrame next;
        Usuario usuario = UsuarioJDBC.ingresa(usuarioJTF.getText(), GUITools.encrypt(passwordJPF.getText()));
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        next = usuario.getId() == 0 ? new Admin() : new Menu(usuario);
        GUITools.openJFrame(this, next);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton olvideJB;
    private javax.swing.JPasswordField passwordJPF;
    private javax.swing.JTextField usuarioJTF;
    // End of variables declaration//GEN-END:variables

}
