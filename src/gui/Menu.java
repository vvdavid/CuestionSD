package gui;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.optionpane.WebOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jdbc.ExamenJDBC;
import jdbc.ReactivoJDBC;
import jdbc.TestJDBC;
import pojos.Examen;
import pojos.Usuario;
import tools.GUITools;

public class Menu extends javax.swing.JFrame {

    private Driver driver;
    private Usuario usuario;

    public Menu(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        driver = new Driver();
        addListeners();

        rangoRS.setBackground(Color.getColor("#f0ecec"));
        nombreJL.setText(usuario.getNombre());
    }

    private void addListeners() {
        rendimientoJB.addActionListener(driver);
        comenzarJB.addActionListener(driver);
        examenesJCB.addItemListener(driver);
        rangoRS.addMouseListener(driver);
        desdeJS.addChangeListener(driver);
        hastaJS.addChangeListener(driver);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrarSesionJB = new javax.swing.JButton();
        panelJTP = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        examenesJCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        mimimoJL = new javax.swing.JLabel();
        actualLowJL = new javax.swing.JLabel();
        aleatorioJCB = new javax.swing.JCheckBox();
        comenzarJB = new javax.swing.JButton();
        rangoRS = new slider.RangeSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        reactivosJT = new javax.swing.JTable();
        actualLowJL1 = new javax.swing.JLabel();
        desdeJS = new javax.swing.JSpinner();
        hastaJS = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historialJT = new javax.swing.JTable();
        rendimientoJB = new javax.swing.JButton();
        grafica1JP = new javax.swing.JPanel();
        grafica2JP = new javax.swing.JPanel();
        bienvenidaJL = new javax.swing.JLabel();
        nombreJL = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        cerrarSesionJB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        cerrarSesionJB.setText("Cerrar sesión");
        cerrarSesionJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionJBActionPerformed(evt);
            }
        });

        jLabel1.setText("Exámen:");

        mimimoJL.setText("Rango seleccionado:");

        actualLowJL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        actualLowJL.setText("Desde:");

        aleatorioJCB.setText("Orden aleatorio");

        comenzarJB.setText("Comenzar");

        rangoRS.setMajorTickSpacing(10);
        rangoRS.setMinimum(1);
        rangoRS.setPaintTicks(true);

        reactivosJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selección", "Número", "Descripción", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reactivosJT.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        reactivosJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(reactivosJT);
        if (reactivosJT.getColumnModel().getColumnCount() > 0) {
            reactivosJT.getColumnModel().getColumn(0).setPreferredWidth(80);
            reactivosJT.getColumnModel().getColumn(1).setPreferredWidth(80);
            reactivosJT.getColumnModel().getColumn(2).setPreferredWidth(400);
            reactivosJT.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        actualLowJL1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        actualLowJL1.setText("Hasta:");

        desdeJS.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));

        hastaJS.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aleatorioJCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comenzarJB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(examenesJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mimimoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rangoRS, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualLowJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desdeJS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualLowJL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hastaJS, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examenesJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mimimoJL)
                            .addComponent(rangoRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualLowJL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualLowJL1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desdeJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hastaJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aleatorioJCB)
                    .addComponent(comenzarJB))
                .addGap(9, 9, 9))
        );

        panelJTP.addTab("Inicio de Test", jPanel1);

        historialJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha y hora", "Calificación", "Duración", "Reactivos correctos", "Reactivos incorrectos", "Reactivos totales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historialJT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        historialJT.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(historialJT);
        if (historialJT.getColumnModel().getColumnCount() > 0) {
            historialJT.getColumnModel().getColumn(0).setPreferredWidth(50);
            historialJT.getColumnModel().getColumn(1).setPreferredWidth(250);
            historialJT.getColumnModel().getColumn(2).setPreferredWidth(150);
            historialJT.getColumnModel().getColumn(3).setPreferredWidth(240);
            historialJT.getColumnModel().getColumn(4).setPreferredWidth(180);
            historialJT.getColumnModel().getColumn(5).setPreferredWidth(180);
            historialJT.getColumnModel().getColumn(6).setPreferredWidth(180);
        }

        rendimientoJB.setText("Ver rendimiento general");

        grafica1JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout grafica1JPLayout = new javax.swing.GroupLayout(grafica1JP);
        grafica1JP.setLayout(grafica1JPLayout);
        grafica1JPLayout.setHorizontalGroup(
            grafica1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        grafica1JPLayout.setVerticalGroup(
            grafica1JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        grafica2JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout grafica2JPLayout = new javax.swing.GroupLayout(grafica2JP);
        grafica2JP.setLayout(grafica2JPLayout);
        grafica2JPLayout.setHorizontalGroup(
            grafica2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        grafica2JPLayout.setVerticalGroup(
            grafica2JPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grafica2JP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grafica1JP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rendimientoJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rendimientoJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grafica1JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grafica2JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        panelJTP.addTab("Historial", jPanel3);

        bienvenidaJL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bienvenidaJL.setText("Bienvenido, ");

        nombreJL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreJL.setText("nombreDelUsuario");

        jMenu3.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Comenzar test");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelJTP)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bienvenidaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesionJB)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bienvenidaJL))
                    .addComponent(cerrarSesionJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJTP)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Mostrar en título el texto del JMenuItem
        WebOptionPane.showMessageDialog(this, "Cuestion 0.1",
                ((JMenuItem) evt.getSource()).getText(),
                WebOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        panelJTP.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cerrarSesionJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionJBActionPerformed
        GUITools.openJFrame(this, new Login());
    }//GEN-LAST:event_cerrarSesionJBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                GUITools.openJFrame(null, new Menu(new Usuario(1, "poncho")));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualLowJL;
    private javax.swing.JLabel actualLowJL1;
    private javax.swing.JCheckBox aleatorioJCB;
    private javax.swing.JLabel bienvenidaJL;
    private javax.swing.JButton cerrarSesionJB;
    private javax.swing.JButton comenzarJB;
    private javax.swing.JSpinner desdeJS;
    private javax.swing.JComboBox<Examen> examenesJCB;
    private javax.swing.JPanel grafica1JP;
    private javax.swing.JPanel grafica2JP;
    private javax.swing.JSpinner hastaJS;
    private javax.swing.JTable historialJT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mimimoJL;
    private javax.swing.JLabel nombreJL;
    private javax.swing.JTabbedPane panelJTP;
    private slider.RangeSlider rangoRS;
    private javax.swing.JTable reactivosJT;
    private javax.swing.JButton rendimientoJB;
    // End of variables declaration//GEN-END:variables

    private class Driver extends MouseAdapter implements ActionListener, ItemListener, ChangeListener {

        int desdeCU, hastaCU;

        public Driver() {
            //carga pestaña de seleccion de reactivos
            ExamenJDBC.cargaComboActivos(examenesJCB);
            Examen examen = (Examen) examenesJCB.getSelectedItem();
            if (examen != null) {
                cargaReactivos(examen);
                inicializaSliderYSpinners();
                desdeCU = (int) desdeJS.getValue();
                hastaCU = (int) hastaJS.getValue();
            }
            //cargar datos del panel de historial
            cargaTablaHistorial();
        }

        //actualizar datos
        private void cargaReactivos(Examen examen) {
            ReactivoJDBC.cargaReactivosTest(reactivosJT, examen.getId());
        }

        private void inicializaSliderYSpinners() {
            int max = reactivosJT.getRowCount();

            rangoRS.setMaximum(max);
            rangoRS.setValue(1);
            rangoRS.setUpperValue(max);

            desdeJS.setModel(new SpinnerNumberModel(1, 1, max, 1));
            hastaJS.setModel(new SpinnerNumberModel(max, 1, max, 1));
            desdeJS.setValue(1);
            hastaJS.setValue(max);
        }

        private void cargaTablaHistorial() {
            TestJDBC.cargaTests(usuario.getId(), historialJT);
        }

        //acciones
        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton src = (JButton) ae.getSource();
            if (src == comenzarJB) {
                System.out.println("comenzar");
            } else if (src == rendimientoJB) {
                System.out.println("rendimiento");
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            cargaReactivos((Examen) examenesJCB.getSelectedItem());
            inicializaSliderYSpinners();
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            desdeJS.setValue(rangoRS.getValue());
            hastaJS.setValue(rangoRS.getUpperValue());
        }

        @Override
        public void stateChanged(ChangeEvent ce) {
            if ((int) desdeJS.getValue() == ((int) hastaJS.getValue() + 1)) {
                desdeJS.setValue(desdeCU);
                hastaJS.setValue(hastaCU);
            }
            desdeCU = (int) desdeJS.getValue();
            hastaCU = (int) hastaJS.getValue();
            rangoRS.setValue((int) desdeJS.getValue());
            rangoRS.setUpperValue((int) hastaJS.getValue());
        }
    }
}
