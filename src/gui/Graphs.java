package gui;

import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.Graphics;
import tools.GUITools;

public class Graphs extends javax.swing.JFrame {

    public Object[][] listaPrueba = new Object[3][5];
    
    
    public Graphs() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0) listaPrueba[i][j] = (int) (Math.random() * 100000 + 1);
                if(i == 1) listaPrueba[i][j] = "Nombre"+String.valueOf((char) ((int)(Math.random()*100+1)));
                if(i == 2) listaPrueba[i][j] = (double) (Math.random() * 9 + 1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("listaPrueba["+i+"]["+j+"] = " + listaPrueba[i][j]);
            }
        }
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelGraph = new javax.swing.JPanel();
        botonRendimiento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        botonSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGraph.setBackground(new java.awt.Color(204, 204, 204));
        panelGraph.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        panelGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelGraph.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout panelGraphLayout = new javax.swing.GroupLayout(panelGraph);
        panelGraph.setLayout(panelGraphLayout);
        panelGraphLayout.setHorizontalGroup(
            panelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraphLayout.setVerticalGroup(
            panelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        botonRendimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonRendimiento.setText("Ver rendimiento general");
        botonRendimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRendimientoActionPerformed(evt);
            }
        });

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "A",  new Double(9.9)},
                { new Integer(2), "B",  new Double(2.2)}
            },
            new String [] {
                "Exámen", "Rango", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(0).setHeaderValue("Exámen");
            tablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(1).setHeaderValue("Rango");
            tablaRegistro.getColumnModel().getColumn(2).setResizable(false);
            tablaRegistro.getColumnModel().getColumn(2).setHeaderValue("Promedio");
        }

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRendimiento)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(panelGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonRendimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRendimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRendimientoActionPerformed

    }//GEN-LAST:event_botonRendimientoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        GUITools.openJFrame(this, new Menu());
    }//GEN-LAST:event_botonSalirActionPerformed
    
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.fillRect(panelGraph.getHeight(), panelGraph.getWidth(), 10, 10);
//    }
    
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
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                GUITools.openJFrame(null, new Graphs());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRendimiento;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelGraph;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
