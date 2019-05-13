package gui.adminPanels;

import gui.adminPanels.tipoPaneles.*;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdbc.ExamenJDBC;
import jdbc.ReactivoJDBC;
import jdbc.RespuestaJDBC;
import jdbc.TipoJDBC;
import pojos.Examen;
import pojos.Respuesta;
import pojos.Tipo;

public class ReactivosJP extends javax.swing.JPanel implements Updateable {

    private Driver driver;

    /**
     * Creates new form ReactivosJP
     */
    public ReactivosJP() {
        initComponents();
        this.driver = new Driver();
        addListeners();
    }

    private void addListeners() {
        examenesJCB.addItemListener(driver);
        //admin reactivos
        descripcionJTA.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                driver.keyTyped();
            }

        });
        agregaTipoJCB.addItemListener(driver);
        agregarJB.addActionListener(driver);
        modificarJB.addActionListener(driver);
        eliminarJB.addActionListener(driver);
        verRespuestasJB.addActionListener(driver);
        jButton5.addActionListener(driver);
        jButton6.addActionListener(driver);
    }

    @Override
    public void updateData() {
        driver.updateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verReactivoJD = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        agregaTipoJCB = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionJTA = new javax.swing.JTextArea();
        respuestasJP = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        multipleJL = new javax.swing.JLabel();
        opcionJL = new javax.swing.JLabel();
        abiertaJL = new javax.swing.JLabel();
        completarJL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalJL = new javax.swing.JLabel();
        agregarJB = new javax.swing.JButton();
        modificarJB = new javax.swing.JButton();
        verRespuestasJB = new javax.swing.JButton();
        eliminarJB = new javax.swing.JButton();
        examenesJCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        verReactivoJD.setModal(true);
        verReactivoJD.setResizable(false);

        jLabel3.setText("Tipo:");

        jButton5.setText("Cancelar");

        jButton6.setText("Guardar");

        jLabel4.setText("ID:");

        idTF.setEditable(false);

        jLabel9.setText("Descripción:");

        descripcionJTA.setColumns(20);
        descripcionJTA.setLineWrap(true);
        descripcionJTA.setRows(5);
        descripcionJTA.setWrapStyleWord(true);
        jScrollPane2.setViewportView(descripcionJTA);

        respuestasJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        respuestasJP.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout verReactivoJDLayout = new javax.swing.GroupLayout(verReactivoJD.getContentPane());
        verReactivoJD.getContentPane().setLayout(verReactivoJDLayout);
        verReactivoJDLayout.setHorizontalGroup(
            verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verReactivoJDLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verReactivoJDLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(agregaTipoJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(verReactivoJDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(12, 12, 12))))
            .addGroup(verReactivoJDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respuestasJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(verReactivoJDLayout.createSequentialGroup()
                        .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))))
                .addContainerGap())
        );
        verReactivoJDLayout.setVerticalGroup(
            verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verReactivoJDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregaTipoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuestasJP, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(verReactivoJDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Examen"));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Múltiple respuesta:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Opción múltiple:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Abierta:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Completar:");

        multipleJL.setText("999,999");

        opcionJL.setText("999,999");

        abiertaJL.setText("999,999");

        completarJL.setText("999,999");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Reactivos totales:");

        totalJL.setText("999,999");

        agregarJB.setText("Agregar reactivo");

        modificarJB.setText("Modificar reactivo");

        verRespuestasJB.setText("Ver respuestas");

        eliminarJB.setText("Eliminar reactivo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalJL)
                            .addComponent(completarJL)
                            .addComponent(abiertaJL)
                            .addComponent(opcionJL)
                            .addComponent(multipleJL))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(modificarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verRespuestasJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verRespuestasJB)
                .addGap(18, 18, 18)
                .addComponent(eliminarJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(multipleJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(opcionJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(abiertaJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(completarJL))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalJL))
                .addGap(15, 15, 15))
        );

        jLabel7.setText("Examen:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
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
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(260);
            tabla.getColumnModel().getColumn(2).setMaxWidth(260);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(examenesJCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(examenesJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel abiertaJL;
    private javax.swing.JComboBox<Tipo> agregaTipoJCB;
    private javax.swing.JButton agregarJB;
    public javax.swing.JLabel completarJL;
    private javax.swing.JTextArea descripcionJTA;
    private javax.swing.JButton eliminarJB;
    public javax.swing.JComboBox<Examen> examenesJCB;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarJB;
    public javax.swing.JLabel multipleJL;
    public javax.swing.JLabel opcionJL;
    private javax.swing.JPanel respuestasJP;
    private javax.swing.JTable tabla;
    public javax.swing.JLabel totalJL;
    private javax.swing.JDialog verReactivoJD;
    private javax.swing.JButton verRespuestasJB;
    // End of variables declaration//GEN-END:variables

    private class Driver implements ItemListener, ActionListener, Updateable {

        private JPanel multipleJP, opcionJP, abiertaJP, completarJP;

        public Driver() {
            this.multipleJP = new MultipleJP();
            this.opcionJP = new OpcionJP();
            this.abiertaJP = new AbiertaJP();
            this.completarJP = new CompletarJP();

            respuestasJP.add(multipleJP, "1");
            respuestasJP.add(opcionJP, "2");
            respuestasJP.add(abiertaJP, "3");
            respuestasJP.add(completarJP, "4");
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton src = (JButton) ae.getSource();
            if (src == agregarJB) {
                abreAgregaJD();
            } else if (src == modificarJB) {
//                modifica();
            } else if (src == verRespuestasJB) {
                if (tabla.getSelectedRow() != -1) {
                    ver();
                }
            } else if (src == jButton5) {
                verReactivoJD.setVisible(false);
            } else if (src == jButton6) {
                agrega();
            } else if (src == eliminarJB) {
//                elimina();
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                JComboBox combo = (JComboBox) ie.getSource();
                if (combo == agregaTipoJCB) {
                    seleccionaCardTipo();
                } else if (combo == examenesJCB) {
                    cargaTablaYContadores();
                } else {
                    throw new UnsupportedOperationException();
                }
            }

        }

        @Override
        public void updateData() {
            examenesJCB.removeItemListener(this);
            ExamenJDBC.cargaCombo(examenesJCB);
            cargaTablaYContadores();
            examenesJCB.addItemListener(this);
        }

        private void cargaTablaYContadores() {
            int idExamen = ((Examen) examenesJCB.getSelectedItem()).getId();
            ReactivoJDBC.cargaTablaTipoCompleto(tabla, idExamen);
            ReactivoJDBC.cargaContadores(idExamen, totalJL, multipleJL, opcionJL, abiertaJL, completarJL);
        }

        private void abreAgregaJD() {
            verReactivoJD.setTitle("Agregar reactivo");

            descripcionJTA.setEnabled(true);

            agregaTipoJCB.removeItemListener(this);
            TipoJDBC.cargaCombo(agregaTipoJCB);
            agregaTipoJCB.addItemListener(this);
            agregaTipoJCB.setEnabled(true);

            idTF.setText("");
            descripcionJTA.setText("");
            
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            descripcionJTA.setEnabled(true);
            seleccionaCardTipo();

            verReactivoJD.pack();
            verReactivoJD.setLocationRelativeTo(ReactivosJP.this);

            verReactivoJD.setVisible(true);
        }

        private void seleccionaCardTipo() {
            CardLayout cl = (CardLayout) respuestasJP.getLayout();
            int id = ((Tipo) agregaTipoJCB.getSelectedItem()).getId();
            cl.show(respuestasJP, String.valueOf(id));
            getRespuestasPanel(id).limpia();
        }

        private void keyTyped() {
            int respuestas = 0;
            String descripcion = descripcionJTA.getText();
            for (char c : descripcion.toCharArray()) {
                if (c == '~') {
                    respuestas++;
                }
            }
            ((CompletarJP) completarJP).setRespuestas(respuestas);
        }

        private void ver() {
            verReactivoJD.setTitle("Ver reactivo y respuestas");
            //id
            int idReactivo = (int) tabla.getValueAt(tabla.getSelectedRow(), 0);
            idTF.setText(idReactivo + "");
            //descripcion
            descripcionJTA.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
            descripcionJTA.setEnabled(false);
            //combo de tipo
            agregaTipoJCB.removeItemListener(this);
            TipoJDBC.cargaCombo(agregaTipoJCB);
            agregaTipoJCB.addItemListener(this);
            agregaTipoJCB.setEnabled(false);
            Tipo tipo = (Tipo) tabla.getValueAt(tabla.getSelectedRow(), 2);
            String nombre = tipo.getNombre();
            for (int i = 0; i < agregaTipoJCB.getItemCount(); i++) {
                if (agregaTipoJCB.getItemAt(i).getNombre().equals(nombre)) {
                    agregaTipoJCB.setSelectedIndex(i);
                    break;
                }
            }
            //respuestas
            CardLayout cl = (CardLayout) respuestasJP.getLayout();
            cl.show(respuestasJP, String.valueOf(tipo.getId()));

            RespuestaJDBC.cargaRespuestas(getRespuestasPanel(tipo.getId()), idReactivo);

            //resto del JDialog
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);

            verReactivoJD.pack();
            verReactivoJD.setLocationRelativeTo(ReactivosJP.this);

            verReactivoJD.setVisible(true);
        }

        private SetRespuestas getRespuestasPanel(int idTipo){
        SetRespuestas panel;
            switch (idTipo) {
                case 1: panel = (SetRespuestas) multipleJP; break; 
                case 2: panel = (SetRespuestas) opcionJP; break;
                case 3: panel = (SetRespuestas) abiertaJP; break;
                case 4: panel = (SetRespuestas) completarJP; break;
                default:
                    throw new AssertionError();
            }
            return panel;
        }
        
        private void agrega() {
            //pre-conditions
            String descripcion = descripcionJTA.getText();
            if (descripcion.length() == 0) {
                JOptionPane.showMessageDialog(ReactivosJP.this, "Introduzca una descripción para el reactivo", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //registar reactivo
            int idExamen = ((Examen) examenesJCB.getSelectedItem()).getId();
            int idTipo = ((Tipo) agregaTipoJCB.getSelectedItem()).getId();
            SetRespuestas panel = getRespuestasPanel(idTipo);
            int idReactivo = ReactivoJDBC.agrega(idExamen, idTipo, descripcion);
            //registar respuestas
            ArrayList<Respuesta> respuestas = panel.getRespuestas(idReactivo);
            RespuestaJDBC.agrega(respuestas);
            //finish
            panel.limpia();
            limpiaVerReactivo();
            cargaTablaYContadores();
            
            verReactivoJD.setVisible(false);
            JOptionPane.showMessageDialog(ReactivosJP.this, "Reactivo agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }

        private void limpiaVerReactivo() {
            idTF.setText("");
            descripcionJTA.setText("");
            agregaTipoJCB.setSelectedIndex(0);
        }

    }
}
