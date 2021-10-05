//Paquetes
package vistas;
//Clase
public class MenuCongruencial1 extends javax.swing.JFrame {
   
  //Constructor
    public MenuCongruencial1() {
        initComponents();
    }
     
    /**
     * Este metodo se llama desde dentro del constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este codigo. El contenido de este metodo es siempre
     * Regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        botonCuadrados = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonConstantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel1.setBackground(new java.awt.Color(40, 42, 54));

        label1.setFont(new java.awt.Font("Baskerville Old Face", 1, 50)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Algoritmos Congruenciales");

        label2.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        label2.setForeground(new java.awt.Color(184, 193, 236));
        label2.setText("Selecione el algoritmo que desea utilizar");

        botonCuadrados.setBackground(new java.awt.Color(0, 0, 0));
        botonCuadrados.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        botonCuadrados.setForeground(new java.awt.Color(255, 255, 255));
        botonCuadrados.setText("Lineal");
        botonCuadrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonCuadrados.setPreferredSize(new java.awt.Dimension(185, 82));
        botonCuadrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuadradosMouseClicked(evt);
            }
        });
        botonCuadrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadradosActionPerformed(evt);
            }
        });

        botonProductos.setBackground(new java.awt.Color(0, 0, 0));
        botonProductos.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonProductos.setText("Multiplicativo");
        botonProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonProductos.setPreferredSize(new java.awt.Dimension(185, 82));
        botonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosMouseClicked(evt);
            }
        });

        botonConstantes.setBackground(new java.awt.Color(0, 0, 0));
        botonConstantes.setFont(new java.awt.Font("Baskerville Old Face", 0, 20)); // NOI18N
        botonConstantes.setForeground(new java.awt.Color(255, 255, 255));
        botonConstantes.setText("Aditivo");
        botonConstantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonConstantes.setPreferredSize(new java.awt.Dimension(185, 82));
        botonConstantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConstantesMouseClicked(evt);
            }
        });
        botonConstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConstantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(botonCuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(botonConstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(label2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(label1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(label1)
                .addGap(77, 77, 77)
                .addComponent(label2)
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo botonCuadrados
    private void botonCuadradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuadradosMouseClicked
        this.dispose();
        CongruencialLineal vistaLineal = new CongruencialLineal(this,true);
        vistaLineal.setVisible(true); 
    }//GEN-LAST:event_botonCuadradosMouseClicked

    //Metodo botonProductos
    private void botonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseClicked
       this.dispose();
       CongruencialMultiplicativo vistaMultiplicativo = new CongruencialMultiplicativo(this,true);
       vistaMultiplicativo.setVisible(true);
    }//GEN-LAST:event_botonProductosMouseClicked

    //Metodo boton Multiplicador constante
    private void botonConstantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConstantesMouseClicked
        //Cerramos la anterior ventana para evitar multiventanas
        this.dispose();
        CongruencialAditivo vistaAditivo = new CongruencialAditivo(this,true);
        vistaAditivo.setVisible(true);    
    }//GEN-LAST:event_botonConstantesMouseClicked

    private void botonCuadradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCuadradosActionPerformed

    private void botonConstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConstantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConstantesActionPerformed

    /**
     * @param args the command line arguments
     */      
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuNoCongruencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuNoCongruencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuNoCongruencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuNoCongruencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuNoCongruencial().setVisible(true);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConstantes;
    private javax.swing.JButton botonCuadrados;
    private javax.swing.JButton botonProductos;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}