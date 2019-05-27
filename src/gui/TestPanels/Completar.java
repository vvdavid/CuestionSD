package gui.TestPanels;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JTextField;
import pojos.Respuesta;

public class Completar extends javax.swing.JPanel implements Responsable {

    private ArrayList<Respuesta> respuestas;

    public Completar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
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
        JLabel[] labels = new JLabel[respuestas.size()];
        JTextField[] textFields = new JTextField[respuestas.size()];

        JLabel x = new JLabel();
        Font font = new Font(x.getFont().getName(), x.getFont().getStyle(), 16);
        jPanel1.setLayout(new java.awt.GridLayout(respuestas.size(), 2));
        for (int i = 0; i < respuestas.size(); i++) {
            labels[i] = new JLabel("Espacio " + (i + 1) + ":");
            textFields[i] = new JTextField(3);
            
            labels[i].setFont(font);
            textFields[i].setFont(font);
            
            jPanel1.add(labels[i]);
            jPanel1.add(textFields[i]);
        }
    }
}
