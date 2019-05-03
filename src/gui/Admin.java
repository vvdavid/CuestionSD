package gui;

import com.alee.laf.WebLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import jdbc.ExamenJDBC;
import jdbc.UsuarioJDBC;
import tools.DBTools;
import tools.GUITools;
import tools.GoBack;

public class Admin extends javax.swing.JFrame {

    private Driver driver;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.driver = new Driver();
        addListeners();
    }

    private void addListeners() {
        goBackJB.addActionListener(driver);
        adminExamenesJB.addActionListener(driver);
        adminReactivosJB.addActionListener(driver);
        adminUsuariosJB.addActionListener(driver);
        //panel examenes
        agregarExamenesJB.addActionListener(driver);
        modificarExamenesJB.addActionListener(driver);
        eliminarExamenesJB.addActionListener(driver);
        guardarAgregarExamenJB.addActionListener(driver);
        cancelarAgregarExamenJB.addActionListener(driver);
        //panel administracion
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        examenesJP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaExamenJT = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        agregarExamenesJB = new javax.swing.JButton();
        modificarExamenesJB = new javax.swing.JButton();
        eliminarExamenesJB = new javax.swing.JButton();
        usuariosJP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuariosJT = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        agregarUsuariosJB = new javax.swing.JButton();
        modificarUsuariosJB = new javax.swing.JButton();
        eliminarUsuariosJB1 = new javax.swing.JButton();
        verExamenJD = new javax.swing.JDialog();
        activoAgregarExamenJCB = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        idAgregarExamenJTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tituloAgregarExamenJTF = new javax.swing.JTextField();
        cancelarAgregarExamenJB = new javax.swing.JButton();
        guardarAgregarExamenJB = new javax.swing.JButton();
        adminExamenesJB = new javax.swing.JButton();
        adminUsuariosJB = new javax.swing.JButton();
        panelJTP = new javax.swing.JTabbedPane();
        goBackJB = new javax.swing.JButton();
        adminReactivosJB = new javax.swing.JButton();

        tablaExamenJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaExamenJT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaExamenJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaExamenJT);
        if (tablaExamenJT.getColumnModel().getColumnCount() > 0) {
            tablaExamenJT.getColumnModel().getColumn(0).setMaxWidth(45);
            tablaExamenJT.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        agregarExamenesJB.setText("Agregar");

        modificarExamenesJB.setText("Modificar");

        eliminarExamenesJB.setText("Eliminar");
        eliminarExamenesJB.setToolTipText("Solo es posible un examen si no tiene historial de algún usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarExamenesJB, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(agregarExamenesJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarExamenesJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarExamenesJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarExamenesJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarExamenesJB)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout examenesJPLayout = new javax.swing.GroupLayout(examenesJP);
        examenesJP.setLayout(examenesJPLayout);
        examenesJPLayout.setHorizontalGroup(
            examenesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examenesJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        examenesJPLayout.setVerticalGroup(
            examenesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examenesJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examenesJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaUsuariosJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Hash"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuariosJT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaUsuariosJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaUsuariosJT);
        if (tablaUsuariosJT.getColumnModel().getColumnCount() > 0) {
            tablaUsuariosJT.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel2.setPreferredSize(new java.awt.Dimension(178, 237));

        agregarUsuariosJB.setText("Agregar");

        modificarUsuariosJB.setText("Modificar");

        eliminarUsuariosJB1.setText("Eliminar");
        eliminarUsuariosJB1.setToolTipText("Solo es posible un examen si no tiene historial de algún usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarUsuariosJB, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(agregarUsuariosJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarUsuariosJB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarUsuariosJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarUsuariosJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarUsuariosJB1)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout usuariosJPLayout = new javax.swing.GroupLayout(usuariosJP);
        usuariosJP.setLayout(usuariosJPLayout);
        usuariosJPLayout.setHorizontalGroup(
            usuariosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usuariosJPLayout.setVerticalGroup(
            usuariosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuariosJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuariosJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        verExamenJD.setTitle("Examen");
        verExamenJD.setModal(true);
        verExamenJD.setResizable(false);

        activoAgregarExamenJCB.setSelected(true);
        activoAgregarExamenJCB.setText("Activo");

        jLabel3.setText("ID");

        idAgregarExamenJTF.setEnabled(false);

        jLabel4.setText("Título*");

        cancelarAgregarExamenJB.setText("Cancelar");

        guardarAgregarExamenJB.setText("Guardar");

        javax.swing.GroupLayout verExamenJDLayout = new javax.swing.GroupLayout(verExamenJD.getContentPane());
        verExamenJD.getContentPane().setLayout(verExamenJDLayout);
        verExamenJDLayout.setHorizontalGroup(
            verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verExamenJDLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verExamenJDLayout.createSequentialGroup()
                        .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloAgregarExamenJTF)
                            .addComponent(idAgregarExamenJTF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verExamenJDLayout.createSequentialGroup()
                        .addGap(0, 162, Short.MAX_VALUE)
                        .addComponent(cancelarAgregarExamenJB)
                        .addGap(18, 18, 18)
                        .addComponent(guardarAgregarExamenJB))
                    .addComponent(activoAgregarExamenJCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        verExamenJDLayout.setVerticalGroup(
            verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verExamenJDLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idAgregarExamenJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tituloAgregarExamenJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activoAgregarExamenJCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(verExamenJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarAgregarExamenJB)
                    .addComponent(cancelarAgregarExamenJB))
                .addGap(15, 15, 15))
        );

        verExamenJD.pack();

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
    private javax.swing.JCheckBox activoAgregarExamenJCB;
    private javax.swing.JButton adminExamenesJB;
    private javax.swing.JButton adminReactivosJB;
    private javax.swing.JButton adminUsuariosJB;
    private javax.swing.JButton agregarExamenesJB;
    private javax.swing.JButton agregarUsuariosJB;
    private javax.swing.JButton cancelarAgregarExamenJB;
    private javax.swing.JButton eliminarExamenesJB;
    private javax.swing.JButton eliminarUsuariosJB1;
    private javax.swing.JPanel examenesJP;
    private javax.swing.JButton goBackJB;
    private javax.swing.JButton guardarAgregarExamenJB;
    private javax.swing.JTextField idAgregarExamenJTF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarExamenesJB;
    private javax.swing.JButton modificarUsuariosJB;
    private javax.swing.JTabbedPane panelJTP;
    private javax.swing.JTable tablaExamenJT;
    private javax.swing.JTable tablaUsuariosJT;
    private javax.swing.JTextField tituloAgregarExamenJTF;
    private javax.swing.JPanel usuariosJP;
    private javax.swing.JDialog verExamenJD;
    // End of variables declaration//GEN-END:variables

    private class Driver implements ActionListener, GoBack {

        private Driver() {
            cargaTablas();
        }

        private void cargaTablas() {
            ExamenJDBC.cargaTabla(tablaExamenJT);
            UsuarioJDBC.cargaTabla(tablaUsuariosJT);
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton src = (JButton) ae.getSource();
            if (src == goBackJB) {
                goBack();
            } else if (src == adminExamenesJB) {
                addToPanel(examenesJP, src);
            } else if (src == adminUsuariosJB) {
                addToPanel(usuariosJP, src);
            } // panel examen
            else if (src == guardarAgregarExamenJB) {
                guarda(src.getText());
            } else if (src == cancelarAgregarExamenJB) {
                verExamenJD.setVisible(false);
            } else if (src == agregarExamenesJB) {
                handleAgregarExamenes();
            } else if (src == modificarExamenesJB) {
                if (haySeleccion(tablaExamenJT)) {
                    handleModificarExamenes();
                }
            } else if (src == eliminarExamenesJB) {
                if (haySeleccion(tablaExamenJT)) {
                    handleEliminarExamenes();
                }
            } else {
                throw new UnsupportedOperationException();
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

        private boolean haySeleccion(JTable tablaExamenJT) {
            return tablaExamenJT.getSelectedRow() != -1;
        }

        private void handleAgregarExamenes() {
            //presentation
            verExamenJD.setTitle("Agregar examen");

            guardarAgregarExamenJB.setText("Agregar");
            idAgregarExamenJTF.setText("");
            tituloAgregarExamenJTF.setText("");
            tituloAgregarExamenJTF.requestFocus();
            activoAgregarExamenJCB.setSelected(false);

            verExamenJD.setLocationRelativeTo(Admin.this);
            verExamenJD.setVisible(true);
        }

        private void handleModificarExamenes() {
            //variables
            int id = (int) tablaExamenJT.getValueAt(tablaExamenJT.getSelectedRow(), 0);
            String titulo = (String) tablaExamenJT.getValueAt(tablaExamenJT.getSelectedRow(), 1);
            boolean activo = (boolean) tablaExamenJT.getValueAt(tablaExamenJT.getSelectedRow(), 2);

            //presentation
            verExamenJD.setTitle("Modificar examen");

            guardarAgregarExamenJB.setText("Modificar");
            idAgregarExamenJTF.setText(id + "");
            tituloAgregarExamenJTF.setText(titulo);
            tituloAgregarExamenJTF.requestFocus();
            activoAgregarExamenJCB.setSelected(activo);

            verExamenJD.setLocationRelativeTo(Admin.this);
            verExamenJD.setVisible(true);
        }

        private void guarda(String text) {
            switch (text) {
                case "Agregar":
                    agregaExamen();
                    break;
                case "Modificar":
                    modificaExamen();
                    break;
                default:
                    throw new AssertionError();
            }
        }

        private void agregaExamen() {
            String titulo = tituloAgregarExamenJTF.getText();
            if (titulo.length() == 0) {
                JOptionPane.showMessageDialog(Admin.this, "Debe escribir un título para el examen", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (ExamenJDBC.agrega(titulo, activoAgregarExamenJCB.isSelected()) != 1) {
                JOptionPane.showMessageDialog(Admin.this, "Error agregando examen", "Error", JOptionPane.ERROR_MESSAGE);
            }
            ExamenJDBC.cargaTabla(tablaExamenJT);
            verExamenJD.setVisible(false);
        }

        private void modificaExamen() {
            int id = Integer.parseInt(idAgregarExamenJTF.getText());
            String titulo = tituloAgregarExamenJTF.getText();
            if (titulo.length() == 0) {
                JOptionPane.showMessageDialog(Admin.this, "Debe escribir un título para el examen", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (ExamenJDBC.modifica(id, titulo, activoAgregarExamenJCB.isSelected()) == 1) {
                JOptionPane.showMessageDialog(Admin.this, "Examen modificado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Admin.this, "Error modificando examen", "Error", JOptionPane.ERROR_MESSAGE);
            }
            ExamenJDBC.cargaTabla(tablaExamenJT);
            verExamenJD.setVisible(false);
        }

        private void handleEliminarExamenes() {
            DBTools.elimina("examen", "reactivo", "idExamen", "Los reactivos asociados con este examen también se eliminarán, ¿continuar?",
                    (int) tablaExamenJT.getValueAt(tablaExamenJT.getSelectedRow(), 0));
            ExamenJDBC.cargaTabla(tablaExamenJT);
        }

    }
}
