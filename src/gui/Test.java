package gui;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.optionpane.WebOptionPane;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.WebNotification;
import gui.TestPanels.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import jdbc.RespuestaJDBC;
import pojos.Reactivo;
import pojos.Usuario;
import tools.GUITools;

public class Test extends javax.swing.JFrame {

    private Driver driver;
    private Usuario usuario;
    private ArrayList<Reactivo> reactivos;

    public Test(Usuario usuario, ArrayList<Reactivo> reactivos) {
        this.usuario = usuario;
        this.reactivos = reactivos;
        initComponents();
        driver = new Driver();
        addListeners();
    }

    private void addListeners() {
        jButton1.addActionListener(driver);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultadosJD = new javax.swing.JDialog();
        porcentajeJL = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        incorrectosJL = new javax.swing.JLabel();
        correctosJL = new javax.swing.JLabel();
        tiempoJL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalesJL = new javax.swing.JLabel();
        contestadosJL = new javax.swing.JLabel();
        restantesJL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionJTA = new javax.swing.JTextArea();
        respuestasJP = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        resultadosJD.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        resultadosJD.setTitle("Resultados del test");
        resultadosJD.setModal(true);
        resultadosJD.setResizable(false);
        resultadosJD.getContentPane().setLayout(new java.awt.BorderLayout(20, 20));

        porcentajeJL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        porcentajeJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        porcentajeJL.setText("100.00%");
        resultadosJD.getContentPane().add(porcentajeJL, java.awt.BorderLayout.NORTH);

        jButton2.setText("Terminar test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        resultadosJD.getContentPane().add(jButton2, java.awt.BorderLayout.PAGE_END);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadísticas"));

        jLabel1.setText("Correctos:");

        jLabel2.setText("Incorrectos:");

        jLabel3.setText("Tiempo:");

        incorrectosJL.setText("999,999");

        correctosJL.setText("999,999");

        tiempoJL.setText("0");

        jLabel4.setText("Totales:");

        jLabel5.setText("Contestados:");

        jLabel6.setText("Restantes:");

        totalesJL.setText("999,999");

        contestadosJL.setText("999,999");

        restantesJL.setText("999,999");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctosJL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiempoJL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(incorrectosJL, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restantesJL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalesJL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(contestadosJL)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalesJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contestadosJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(restantesJL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correctosJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(incorrectosJL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tiempoJL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Reactivo actual"));

        descripcionJTA.setEditable(false);
        descripcionJTA.setColumns(20);
        descripcionJTA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descripcionJTA.setLineWrap(true);
        descripcionJTA.setRows(5);
        descripcionJTA.setText("RangeSlider is a slider that can be used to select a range. A regular slider has only one thumb. So it can only be used to select one value. RangeSlider has two thumbs. Each one can be moved independently or both are moved together.\ngetLowValue() will return the value of low range and getHighValue() is the high range.");
        descripcionJTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descripcionJTA);

        respuestasJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        respuestasJP.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Contestar y siguiente");

        jLabel7.setText("Respuestas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respuestasJP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuestasJP, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resultadosJD.setVisible(false);
        GUITools.openJFrame(this, new Menu(usuario));
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<Reactivo> array = new ArrayList<Reactivo>();
                array.add(new Reactivo(1, 1, 4, "En la mitologia ~ loki era el dios del ~"));
                array.add(new Reactivo(2, 1, 2, "¿Qué tipo de arma le dieron a thor de la mitologia nordica?"));
                array.add(new Reactivo(4, 1, 1, "Menciona los dos hermanos de Zeus en la mitologia griega"));
                array.add(new Reactivo(5, 1, 3, "¿En que parte esta situada la morada de hades en el inframundo?"));
                new Test(new Usuario(1, "poncho"), array).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contestadosJL;
    private javax.swing.JLabel correctosJL;
    private javax.swing.JTextArea descripcionJTA;
    private javax.swing.JLabel incorrectosJL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel porcentajeJL;
    private javax.swing.JPanel respuestasJP;
    private javax.swing.JLabel restantesJL;
    private javax.swing.JDialog resultadosJD;
    private javax.swing.JLabel tiempoJL;
    private javax.swing.JLabel totalesJL;
    // End of variables declaration//GEN-END:variables

    private class Driver implements ActionListener {

        private int i = 0;
        private int time = 0;
        private Timer timer;

        public Driver() {
            //inicializa labels
            totalesJL.setText("" + reactivos.size());
            contestadosJL.setText("0");
            restantesJL.setText("" + reactivos.size());

            correctosJL.setText("0");
            incorrectosJL.setText("0");

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    time+=1000;
                    String sign = "";
                    if (time < 0) {
                        sign = "-";
                        time = Math.abs(time);
                    }

                    long minutes = time / TimeUnit.MINUTES.toMillis(1);
                    long seconds = time % TimeUnit.MINUTES.toMillis(1) / TimeUnit.SECONDS.toMillis(1);

                    StringBuilder formatted = new StringBuilder(20);
                    formatted.append(sign);
                    formatted.append(String.format("%02d", minutes));
                    formatted.append(String.format(":%02d", seconds));

                    tiempoJL.setText(formatted.toString());
                }
            });
            timer.start();
            //carga primer reactivo
            cargaReactivo();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Responsable respuestasActuales = (Responsable) respuestasJP.getComponent(0);
            boolean correcto = respuestasActuales.esCorrecta();

            califica(correcto);
            actualizaEstadisticas(correcto);
            if (i + 1 == reactivos.size()) {
                terminar();
            } else {
                i++;
                cargaReactivo();
            }
        }

        private void cargaReactivo() {
            descripcionJTA.setText(reactivos.get(i).getDescripcion());
            respuestasJP.removeAll();
            JPanel panelRespuestas = getPanelRespuestasByReactivo(reactivos.get(i));
            respuestasJP.add(panelRespuestas);
            respuestasJP.revalidate();
        }

        private JPanel getPanelRespuestasByReactivo(Reactivo reactivo) {
            JPanel panel;
            switch (reactivo.getIdTipo()) {
                case 1:
                    panel = new MultipleRespuesta();
                    break;
                case 2:
                    panel = new OpcionMultiple();
                    break;
                case 3:
                    panel = new Abierta();
                    break;
                case 4:
                    panel = new Completar();
                    break;
                default:
                    throw new AssertionError();
            }
            ((Responsable) panel).cargaRespuestas(RespuestaJDBC.cargaRespuestas(reactivo.getId()));
            return panel;
        }

        private void califica(boolean correcto) {
            WebNotification notificationPopup = new WebNotification();
            notificationPopup.setIcon(correcto ? NotificationIcon.plus : NotificationIcon.cross);
            notificationPopup.setDisplayTime(2000);
            notificationPopup.setContent("Respuesta " + (!correcto ? "in" : "") + "correcta");

            NotificationManager.showNotification(notificationPopup);
        }

        private void actualizaEstadisticas(boolean correcto) {
            //contestados
            contestadosJL.setText("" + (Integer.parseInt(contestadosJL.getText()) + 1));
            //restantes
            restantesJL.setText("" + (Integer.parseInt(restantesJL.getText()) - 1));
            //correstos o incorrectos
            JLabel label = correcto ? correctosJL : incorrectosJL;
            label.setText("" + (Integer.parseInt(label.getText()) + 1));

        }

        private void terminar() {
            timer.stop();
            resultadosJD.add(jPanel1, BorderLayout.CENTER);
            double calificacion = Double.parseDouble(correctosJL.getText()) / Integer.parseInt(totalesJL.getText());
            porcentajeJL.setText(String.format("%.2f%%", calificacion));
            porcentajeJL.setForeground(calificacion > 60 ? Color.GREEN : Color.RED);

            resultadosJD.pack();
            resultadosJD.setLocationRelativeTo(Test.this);
            resultadosJD.setVisible(true);
        }

    }
}
