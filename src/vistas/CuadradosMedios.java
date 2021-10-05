package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Cuadrados;

public class CuadradosMedios extends javax.swing.JDialog {
    DefaultTableModel modelo;
    Cuadrados utilidades;
    
    //Constructor
    public CuadradosMedios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Alineamos a la vistaPrincipal
        setLocationRelativeTo(parent);
        this.setLocationRelativeTo(null);
        modelo= new DefaultTableModel();
        modelo.addColumn("Iteraccion");
        modelo.addColumn("Semilla Xi0");
        modelo.addColumn("Semilla^2");
        modelo.addColumn("Semilla Xi+1");
        modelo.addColumn("Pseudonumero");
        this.jTable1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        textField3 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        radioDerecha = new javax.swing.JRadioButton();
        radioIzquierda = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel1.setBackground(new java.awt.Color(40, 42, 54));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Baskerville Old Face", 1, 40)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Algoritmo Cuadrados Medios");

        label2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(184, 193, 236));
        label2.setText("Ingrese la semilla x0");

        label4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        label4.setForeground(new java.awt.Color(184, 193, 236));
        label4.setText("Ingrese las repeticiones");

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });

        textField3.setBackground(new java.awt.Color(255, 255, 255));
        textField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField3KeyTyped(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("Generar");
        boton1.setMaximumSize(new java.awt.Dimension(100, 50));
        boton1.setMinimumSize(new java.awt.Dimension(100, 50));
        boton1.setPreferredSize(new java.awt.Dimension(100, 50));
        boton1.setRequestFocusEnabled(false);
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("Limpiar");
        boton2.setMaximumSize(new java.awt.Dimension(100, 50));
        boton2.setMinimumSize(new java.awt.Dimension(100, 50));
        boton2.setPreferredSize(new java.awt.Dimension(100, 50));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        radioDerecha.setBackground(new java.awt.Color(40, 42, 54));
        grupo1.add(radioDerecha);
        radioDerecha.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        radioDerecha.setForeground(new java.awt.Color(255, 255, 255));
        radioDerecha.setText("Cero a la derecha");

        radioIzquierda.setBackground(new java.awt.Color(40, 42, 54));
        grupo1.add(radioIzquierda);
        radioIzquierda.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        radioIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        radioIzquierda.setText("Cero a la izquierda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteración ", "Semilla Xi", "Semilla^2", "Semilla Xi+1", "Pseudonumero"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(label1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(radioIzquierda)
                                .addGap(30, 30, 30)
                                .addComponent(radioDerecha)
                                .addGap(53, 53, 53)
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(textField3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label1)
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4))
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioIzquierda)
                    .addComponent(radioDerecha)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo boton1
    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
      boolean selecion1 = radioIzquierda.isSelected();
        boolean selecion2 = radioDerecha.isSelected();

        if(textField1.getText().isEmpty() || textField3.getText().isEmpty() || (!selecion1 && !selecion2)){
            JOptionPane.showMessageDialog(null,"Complete todos los campos");
        }else{
            long semilla = Integer.parseInt(textField1.getText());
            int digitos = (Long.toString(semilla)).length();
            int repeticiones = Integer.parseInt(textField3.getText());
            if(digitos < 4 || textField1.getText().equals("1000") || textField1.getText().equals("1100") || textField1.getText().equals("1110")){
                JOptionPane.showMessageDialog(null,"La semilla debe ser mayor de 3 digitos");
            }else{
                //Borramos los datos de las celdas
                try {
                    for (int n = jTable1.getRowCount() - 1; n >= 0;--n) {
                        modelo.removeRow(n);
                    }
                } catch (Exception e) {
                }
                if(selecion1){
                    utilidades.cuadradosMediosIzq(semilla, digitos, repeticiones, modelo);
                }else{
                    utilidades.cuadradosMediosDrc(semilla, digitos, repeticiones, modelo);
                }
            }
        }
    }//GEN-LAST:event_boton1MouseClicked
    
    //Metodo boton2
    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
    // Limpiamos todos los campos y las celdas
    try {
        for (int n = jTable1.getRowCount() - 1; n >= 0;--n) {
            modelo.removeRow(n);
        }
        grupo1.clearSelection();
        textField1.setText("");
        textField3.setText("");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Hubo dificultades en el programa","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_boton2MouseClicked

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        //Verificamos que solo haya escrito digitos
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_textField1KeyTyped

    private void textField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField3KeyTyped
        //Verificamos que solo haya escrito digitos
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_textField3KeyTyped
    
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
//            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                CuadradosMedios dialog = new CuadradosMedios(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel panel1;
    private javax.swing.JRadioButton radioDerecha;
    private javax.swing.JRadioButton radioIzquierda;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField3;
    // End of variables declaration//GEN-END:variables
}
