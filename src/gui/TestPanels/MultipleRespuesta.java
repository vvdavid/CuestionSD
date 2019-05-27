package gui.TestPanels;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Box;
import javax.swing.JCheckBox;
import pojos.Respuesta;

public class MultipleRespuesta extends javax.swing.JPanel implements Responsable {

    private ArrayList<Respuesta> respuestas;
    private JCheckBox[] jCheckBoxes;

    public MultipleRespuesta() {
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
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
        jCheckBoxes = new JCheckBox[respuestas.size()];

        JCheckBox x = new JCheckBox();
        Font font = new Font(x.getFont().getName(), x.getFont().getStyle(), 16);

        for (int i = 0; i < jCheckBoxes.length; i++) {
            jCheckBoxes[i] = new JCheckBox(respuestas.get(i).getDescripcion());
            jCheckBoxes[i].setFont(font);
            jPanel1.add(jCheckBoxes[i]);
            jPanel1.add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }
}
