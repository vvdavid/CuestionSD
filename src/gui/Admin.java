package gui;

import com.alee.laf.WebLookAndFeel;
import gui.adminPanels.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import tools.GUITools;
import tools.GoBack;

public class Admin extends javax.swing.JFrame {

    private Driver driver;
    private ExamenJP examenesJP;
    private UsuariosJP usuariosJP;
    private ReactivosJP reactivosJP;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.examenesJP = new ExamenJP();
        this.usuariosJP = new UsuariosJP();
        this.reactivosJP = new ReactivosJP();
        this.driver = new Driver();
        addListeners();
    }

    private void addListeners() {
        //jtabbedpane
        panelJTP.addChangeListener(driver);
        //jframe
        goBackJB.addActionListener(driver);
        adminExamenesJB.addActionListener(driver);
        adminReactivosJB.addActionListener(driver);
        adminUsuariosJB.addActionListener(driver);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminExamenesJB = new javax.swing.JButton();
        adminUsuariosJB = new javax.swing.JButton();
        panelJTP = new javax.swing.JTabbedPane();
        goBackJB = new javax.swing.JButton();
        adminReactivosJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuestion - Administrador");

        adminExamenesJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test.png"))); // NOI18N
        adminExamenesJB.setText("Administrar examenes");

        adminUsuariosJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N
        adminUsuariosJB.setText("Administrar usuarios");

        goBackJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        goBackJB.setText("Salir");

        adminReactivosJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reactivo.png"))); // NOI18N
        adminReactivosJB.setText("Administrar reactivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJTP)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminExamenesJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adminUsuariosJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adminReactivosJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                        .addComponent(goBackJB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminExamenesJB)
                    .addComponent(adminUsuariosJB)
                    .addComponent(goBackJB)
                    .addComponent(adminReactivosJB))
                .addGap(18, 18, 18)
                .addComponent(panelJTP, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                GUITools.openJFrame(null, new Admin());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminExamenesJB;
    private javax.swing.JButton adminReactivosJB;
    private javax.swing.JButton adminUsuariosJB;
    private javax.swing.JButton goBackJB;
    private javax.swing.JTabbedPane panelJTP;
    // End of variables declaration//GEN-END:variables

    private class Driver implements ActionListener, GoBack, ChangeListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton src = (JButton) ae.getSource();
            if (src == goBackJB) {
                goBack();
            } else if (src == adminReactivosJB) {
                addToPanel(reactivosJP, src);
            } else if (src == adminExamenesJB) {
                addToPanel(examenesJP, src);
            } else if (src == adminUsuariosJB) {
                addToPanel(usuariosJP, src);
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void stateChanged(ChangeEvent ce) {
            Updateable selectedJPanel = (Updateable) panelJTP.getSelectedComponent();
            if (selectedJPanel != null) {
                selectedJPanel.updateData();
            }
        }

        public void goBack() {
            GUITools.openJFrame(Admin.this, new Login());
        }

        private void addToPanel(JPanel newPanel, JButton src) {
            panelJTP.add(newPanel);
            panelJTP.setTitleAt(panelJTP.getTabCount() - 1, src.getText());
            panelJTP.setIconAt(panelJTP.getTabCount() - 1, src.getIcon());
            panelJTP.setSelectedComponent(newPanel);
        }

    }
}
