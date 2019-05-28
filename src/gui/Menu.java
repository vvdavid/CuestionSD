package gui;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.optionpane.WebOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jdbc.ExamenJDBC;
import jdbc.ReactivoJDBC;
import jdbc.TestJDBC;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import pojos.Examen;
import pojos.Reactivo;
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
        historialJT.addMouseListener(driver);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rendimientoJD = new javax.swing.JDialog();
        graficaRendimiento1JP = new javax.swing.JPanel();
        graficaRendimiento3JP = new javax.swing.JPanel();
        graficaRendimiento2JP = new javax.swing.JPanel();
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

        rendimientoJD.setTitle("Rendimiento general");
        rendimientoJD.setModal(true);

        graficaRendimiento1JP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graficaRendimiento1JP.setLayout(new java.awt.BorderLayout());

        graficaRendimiento3JP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graficaRendimiento3JP.setLayout(new java.awt.BorderLayout());

        graficaRendimiento2JP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graficaRendimiento2JP.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout rendimientoJDLayout = new javax.swing.GroupLayout(rendimientoJD.getContentPane());
        rendimientoJD.getContentPane().setLayout(rendimientoJDLayout);
        rendimientoJDLayout.setHorizontalGroup(
            rendimientoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendimientoJDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rendimientoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficaRendimiento3JP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rendimientoJDLayout.createSequentialGroup()
                        .addComponent(graficaRendimiento1JP, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graficaRendimiento2JP, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rendimientoJDLayout.setVerticalGroup(
            rendimientoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendimientoJDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rendimientoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficaRendimiento1JP, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graficaRendimiento2JP, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(graficaRendimiento3JP, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
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
        grafica1JP.setLayout(new java.awt.BorderLayout());

        grafica2JP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grafica2JP.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(grafica1JP, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(grafica2JP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rendimientoJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(grafica1JP, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grafica2JP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
    private javax.swing.JPanel graficaRendimiento1JP;
    private javax.swing.JPanel graficaRendimiento2JP;
    private javax.swing.JPanel graficaRendimiento3JP;
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
    private javax.swing.JDialog rendimientoJD;
    // End of variables declaration//GEN-END:variables

    private class Driver extends MouseAdapter implements ActionListener, ItemListener, ChangeListener {

        int desdeActual, hastaActual;
        DefaultPieDataset dataset = new DefaultPieDataset();
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createPieChart(null, dataset);
        JFreeChart chart2 = ChartFactory.createBarChart("Tipos por test", "Tipo de reactivo", "Cantidad", dataset2);

        public Driver() {
            //carga pestaña de seleccion de reactivos
            ExamenJDBC.cargaComboActivos(examenesJCB);
            Examen examen = (Examen) examenesJCB.getSelectedItem();
            if (examen != null) {
                cargaReactivos(examen);
                inicializaSliderYSpinners();
                desdeActual = (int) desdeJS.getValue();
                hastaActual = (int) hastaJS.getValue();
            }
            //cargar datos del panel de historial
            cargaTablaHistorial();
            ChartPanel cp = new ChartPanel(chart);
            ChartPanel cp2 = new ChartPanel(chart2);
            cp.setPreferredSize(grafica1JP.getSize());
            cp2.setPreferredSize(grafica2JP.getSize());
            grafica1JP.add(cp, BorderLayout.CENTER);
            grafica2JP.add(cp2, BorderLayout.CENTER);
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

        private void iniciaTest() {
            ArrayList<Reactivo> array = new ArrayList<>();
            for (int i = 0; i < reactivosJT.getRowCount(); i++) {
                if ((boolean) reactivosJT.getValueAt(i, 0)) {
                    array.add((Reactivo) reactivosJT.getValueAt(i, 2));
                }
            }
            if (aleatorioJCB.isSelected()) {
                Collections.shuffle(array);
                System.out.println("aleatorio");
            }
            GUITools.openJFrame(Menu.this, new Test(usuario, array));
        }

        //acciones
        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton src = (JButton) ae.getSource();
            if (src == comenzarJB) {
                iniciaTest();
            } else if (src == rendimientoJB) {
                abreRendimiento();
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            cargaReactivos((Examen) examenesJCB.getSelectedItem());
            inicializaSliderYSpinners();
        }

//        llamado cuando se suelta el click en el selector de rango
        @Override
        public void mouseReleased(MouseEvent me) {
            desdeJS.setValue(rangoRS.getValue());
            hastaJS.setValue(rangoRS.getUpperValue());
            actulizaSeleccion();
        }

        //llamado cuando se selecciona una fila de la tabla del historial
        @Override
        public void mousePressed(MouseEvent me) {
            if (historialJT.getSelectedRow() != -1) {
                dataset.clear();
                dataset.setValue("Correctos", (int) historialJT.getValueAt(historialJT.getSelectedRow(), 4));
                dataset.setValue("Incorrectos", (int) historialJT.getValueAt(historialJT.getSelectedRow(), 5));

                dataset2.clear();
//                TestJDBC.cargaCuentaDeTipo(dataset2);

                grafica1JP.revalidate();
                grafica2JP.revalidate();
            }
        }

        @Override
        public void stateChanged(ChangeEvent ce) {
            if ((int) desdeJS.getValue() == ((int) hastaJS.getValue() + 1)) {
                desdeJS.setValue(desdeActual);
                hastaJS.setValue(hastaActual);
            }
            desdeActual = (int) desdeJS.getValue();
            hastaActual = (int) hastaJS.getValue();
            rangoRS.setValue((int) desdeJS.getValue());
            rangoRS.setUpperValue((int) hastaJS.getValue());
            actulizaSeleccion();
        }

        private void actulizaSeleccion() {
            int desde = (int) desdeJS.getValue();
            int hasta = (int) hastaJS.getValue();
            for (int i = 0; i < reactivosJT.getRowCount(); i++) {
                reactivosJT.setValueAt(false, i, 0);
            }
            for (int i = desde; i <= hasta; i++) {
                reactivosJT.setValueAt(true, i - 1, 0);
            }
        }

        private void abreRendimiento() {
            //grafica 1
            DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
            for (int i = 0; i < historialJT.getRowCount(); i++) {
                dataset1.addValue((double) historialJT.getValueAt(i, 2), "Calificación", (String) historialJT.getValueAt(i, 1));
            }
            JFreeChart g1 = ChartFactory.createLineChart("Calificación por test", "Fecha de test", "Calificación", dataset1);
            wea(g1, graficaRendimiento1JP);

            //grafica 2
            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            for (int i = 0; i < historialJT.getRowCount(); i++) {
                dataset2.addValue((int) historialJT.getValueAt(i, 4), "Correctos", (String) historialJT.getValueAt(i, 1));
                dataset2.addValue((int) historialJT.getValueAt(i, 6), "Totales", (String) historialJT.getValueAt(i, 1));
            }
            JFreeChart g2 = ChartFactory.createLineChart("Relación total-correctos por test", "Fecha de test", "Número de reactivos", dataset2);

            wea(g2, graficaRendimiento2JP);
            //grafica 3
            DefaultCategoryDataset dataset3 = TestJDBC.cargaBarras(usuario.getId());
            JFreeChart g3 = ChartFactory.createBarChart("Tests por día", "Día del test", "Cantidad de tests", dataset3);

            wea(g3, graficaRendimiento3JP);
            //abrir dialog
            rendimientoJD.pack();
            rendimientoJD.setLocationRelativeTo(Menu.this);
            rendimientoJD.setVisible(true);
        }

        private void wea(JFreeChart chart, JPanel target) {
            CategoryAxis axis1 = chart.getCategoryPlot().getDomainAxis();
            axis1.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            
            ChartPanel cp = new ChartPanel(chart);
            cp.setSize(target.getSize());
            target.add(cp);
        }
    }
}
