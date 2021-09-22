//Paquetes
package vistas;

//Clase
public class VistaPrincipal extends javax.swing.JFrame {
    
    //Constructor
    public VistaPrincipal() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(35, 41, 70));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Algoritmos No Congruenciales");

        label2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        label2.setForeground(new java.awt.Color(184, 193, 236));
        label2.setText("Selecione el algoritmo que desea utilizar");

        botonCuadrados.setBackground(new java.awt.Color(238, 187, 195));
        botonCuadrados.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonCuadrados.setForeground(new java.awt.Color(35, 41, 70));
        botonCuadrados.setText("Cuadrados  Medios");
        botonCuadrados.setPreferredSize(new java.awt.Dimension(185, 82));
        botonCuadrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuadradosMouseClicked(evt);
            }
        });

        botonProductos.setBackground(new java.awt.Color(238, 187, 195));
        botonProductos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonProductos.setForeground(new java.awt.Color(35, 41, 70));
        botonProductos.setText("Productos Medios");
        botonProductos.setPreferredSize(new java.awt.Dimension(185, 82));
        botonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosMouseClicked(evt);
            }
        });

        botonConstantes.setBackground(new java.awt.Color(238, 187, 195));
        botonConstantes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonConstantes.setForeground(new java.awt.Color(35, 41, 70));
        botonConstantes.setText("Productos Constantes");
        botonConstantes.setPreferredSize(new java.awt.Dimension(185, 82));
        botonConstantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConstantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(155, 155, 155))))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(botonCuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(label1)
                .addGap(67, 67, 67)
                .addComponent(label2)
                .addGap(97, 97, 97)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo botonCuadrados
    private void botonCuadradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuadradosMouseClicked
        //Creamos la ventana
        CuadradosMedios vistaCuadradosMedios = new CuadradosMedios(this,true);
        //Hacemos visible la ventana
        vistaCuadradosMedios.setVisible(true);
        
    }//GEN-LAST:event_botonCuadradosMouseClicked

    //Metodo botonProductos
    private void botonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseClicked
        
    }//GEN-LAST:event_botonProductosMouseClicked

    //Metodo botonProductos
    private void botonConstantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConstantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConstantesMouseClicked

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
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaPrincipal().setVisible(true);
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
