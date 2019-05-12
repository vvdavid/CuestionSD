package gui.adminPanels.tipoPaneles;

import javax.swing.DefaultListModel;

public class OpcionJP extends javax.swing.JPanel implements AdminJList {

    DefaultListModel<String> modelo = new DefaultListModel();

    /**
     * Creates new form OpcionJP
     */
    public OpcionJP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionJPIncorrectasEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        opcionJPIncorrectas = new javax.swing.JList<String>(modelo);
        opcionJPIncorrectasAgregar = new javax.swing.JButton();
        opcionJPCorrecta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        opcionJPIncorrectasEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/remove.png"))); // NOI18N
        opcionJPIncorrectasEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionJPIncorrectasEliminarActionPerformed(evt);
            }
        });

        jLabel13.setText("Respuestas incorrectas");

        jScrollPane6.setViewportView(opcionJPIncorrectas);

        opcionJPIncorrectasAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        opcionJPIncorrectasAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionJPIncorrectasAgregarActionPerformed(evt);
            }
        });

        jLabel12.setText("Respuesta correcta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionJPCorrecta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionJPIncorrectasEliminar)
                            .addComponent(opcionJPIncorrectasAgregar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionJPCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcionJPIncorrectasAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionJPIncorrectasEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opcionJPIncorrectasAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionJPIncorrectasAgregarActionPerformed
        addItem(modelo);
    }//GEN-LAST:event_opcionJPIncorrectasAgregarActionPerformed

    private void opcionJPIncorrectasEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionJPIncorrectasEliminarActionPerformed
        removeItem(opcionJPIncorrectas, modelo);
    }//GEN-LAST:event_opcionJPIncorrectasEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField opcionJPCorrecta;
    private javax.swing.JList<String> opcionJPIncorrectas;
    private javax.swing.JButton opcionJPIncorrectasAgregar;
    private javax.swing.JButton opcionJPIncorrectasEliminar;
    // End of variables declaration//GEN-END:variables
}
