package gui.TestPanels;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import pojos.Respuesta;

public class OpcionMultiple extends javax.swing.JPanel implements Responsable {

    private ArrayList<Respuesta> respuestas;
    private JRadioButton[] radios;

    public OpcionMultiple() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargaRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;

        Collections.shuffle(respuestas);
        JRadioButton[] radios = new JRadioButton[respuestas.size()];
        ButtonGroup group = new ButtonGroup();
        
        JRadioButton x = new JRadioButton();
        Font font = new Font(x.getFont().getName(), x.getFont().getStyle(), 16);

        for (int i = 0; i < radios.length; i++) {
            radios[i] = new JRadioButton(respuestas.get(i).getDescripcion());
            radios[i].setFont(font);
            group.add(radios[i]);
            jPanel1.add(radios[i]);
            jPanel1.add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }
}
