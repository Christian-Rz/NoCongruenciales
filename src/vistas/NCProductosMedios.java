package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arturo Campos
 */
public class NCProductosMedios extends javax.swing.JDialog {

    DefaultTableModel modelo;

    /**
     * Creates new form NewJDialog
     */
    public NCProductosMedios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Iteraccion");
        modelo.addColumn("Semilla Xi0");
        modelo.addColumn("Iteraccion");
        modelo.addColumn("Semilla Xi1");
        modelo.addColumn("Semilla^2");
        modelo.addColumn("Semilla Xi+1");
        modelo.addColumn("Pseudonumero");
        this.jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        rbtnIzq = new javax.swing.JRadioButton();
        rbtnDer = new javax.swing.JRadioButton();
        txtSem1 = new javax.swing.JTextField();
        txtRep = new javax.swing.JTextField();
        txtSem2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Interacion", "Semilla Xi0", "Interacion", "Semilla Xi1", "Semilla ^2", "Semilla Xi+1", "Pseudonumero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnGenerar.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerar.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnGenerar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnGenerar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        rbtnIzq.setBackground(new java.awt.Color(40, 42, 54));
        direccionGroup.add(rbtnIzq);
        rbtnIzq.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        rbtnIzq.setForeground(new java.awt.Color(255, 255, 255));
        rbtnIzq.setText("Izquierda");

        rbtnDer.setBackground(new java.awt.Color(40, 42, 54));
        direccionGroup.add(rbtnDer);
        rbtnDer.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        rbtnDer.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDer.setText("Derecha");

        txtSem1.setBackground(new java.awt.Color(255, 255, 255));
        txtSem1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtRep.setBackground(new java.awt.Color(255, 255, 255));
        txtRep.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSem2.setBackground(new java.awt.Color(255, 255, 255));
        txtSem2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(184, 193, 236));
        jLabel1.setText("Semilla 1");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 193, 236));
        jLabel2.setText("Repeticiones");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(184, 193, 236));
        jLabel3.setText("Semilla 2");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Productos Medios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSem1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnIzq)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnDer)))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSem2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel4)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnIzq)
                            .addComponent(rbtnDer)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String se = txtSem1.getText();
        String re = txtRep.getText();
        String se1 = txtSem2.getText();
        String snum, snum2, snum3, snum4;
        int ciclo = Integer.parseInt(re);
        int dato = se.length();
        int dato2, i, pch;
        long num1, num2, num3;
        double num4;

        if (dato < 4) {
            JOptionPane.showMessageDialog(null, "Debe indicar un numero mayor de 3 cifras.");
        }
        if (se.isEmpty() || re.isEmpty()) {
            JOptionPane.showMessageDialog(null, "no debe dejar ningun campo vacio.");
        }
        if (!rbtnIzq.isSelected() && !rbtnDer.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccione en donde quiere el cero", "Falta el cero", HEIGHT);
        } else if (rbtnIzq.isSelected()) {
            try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
            direccionGroup.clearSelection();
            num1 = Long.parseLong(se);
            num2 = Long.parseLong(se1);

            String[] fila = new String[6];
            for (i = 0; i < Integer.parseInt(re); i++) {
                num3 = (long) (num1 * num2);
                snum3 = Long.toString(num3);
                dato2 = snum3.length();
                pch = (dato2 - dato) / 2;
                snum4 = snum3.substring(pch, pch + dato);
                num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                snum = Long.toString(num1);
                snum2 = Long.toString(num2);
                fila[0] = Integer.toString(i);
                fila[1] = snum;
                fila[2] = snum2;
                fila[3] = snum3;
                fila[4] = snum4;
                fila[5] = Double.toString(num4);
                modelo.addRow(fila);
                num1 = Long.parseLong(snum2);
                num2 = Long.parseLong(snum4);

            }
        } else if (rbtnDer.isSelected()) {
            try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
            direccionGroup.clearSelection();
            num1 = Long.parseLong(se);
            num2 = Long.parseLong(se1);
            String[] fila = new String[6];
            if (dato % 2 == 0) {
                for (i = 0; i < Integer.parseInt(re); i++) {
                    num3 = (long) (num1 * num2);
                    snum3 = Long.toString(num3);
                    dato2 = snum3.length();
                    pch = (dato2 - dato) / 2;
                    if (dato % 2 != 0) {
                        snum4 = snum3.substring(pch + 1, (pch + 1) + dato);
                    } else {
                        snum4 = snum3.substring(pch, pch + dato);
                    }
                    num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                    snum = Long.toString(num1);
                    snum2 = Long.toString(num2);
                    fila[0] = Integer.toString(i);
                    fila[1] = snum;
                    fila[2] = snum2;
                    fila[3] = snum3;
                    fila[4] = snum4;
                    fila[5] = Double.toString(num4);
                    modelo.addRow(fila);
                    num1 = Long.parseLong(snum2);
                    num2 = Long.parseLong(snum4);
                }
            }
            if (dato % 2 != 0) {
                for (i = 0; i < Integer.parseInt(re); i++) {
                    num3 = (long) (num1 * num2);
                    snum3 = Long.toString(num3);
                    dato2 = snum3.length();
                    pch = (dato2 - dato) / 2;
                    if (dato % 2 == 0) {
                        snum4 = snum3.substring(pch + 1, (pch + 1) + dato);
                    } else {
                        snum4 = snum3.substring(pch, pch + dato);
                    }
                    num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                    snum = Long.toString(num1);
                    snum2 = Long.toString(num2);
                    fila[0] = Integer.toString(i);
                    fila[1] = snum;
                    fila[2] = snum2;
                    fila[3] = snum3;
                    fila[4] = snum4;
                    fila[5] = Double.toString(num4);
                    modelo.addRow(fila);
                    num1 = Long.parseLong(snum2);
                    num2 = Long.parseLong(snum4);
                }
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
        direccionGroup.clearSelection();
        txtSem1.setText("");
        txtSem2.setText("");
        txtRep.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   //     try {
   //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
   //             if ("Nimbus".equals(info.getName())) {
   //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
   //                 break;
   //             }
   //         }
    //    } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(NCProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (InstantiationException ex) {
     //       java.util.logging.Logger.getLogger(NCProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (IllegalAccessException ex) {
     //       java.util.logging.Logger.getLogger(NCProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     //       java.util.logging.Logger.getLogger(NCProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
          //      NCProductosMedios dialog = new NCProductosMedios(new javax.swing.JFrame(), true);
          //      dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          //          @Override
          //          public void windowClosing(java.awt.event.WindowEvent e) {
          //              System.exit(0);
           //         }
            //    });
            //    dialog.setVisible(true);
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup direccionGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnDer;
    private javax.swing.JRadioButton rbtnIzq;
    private javax.swing.JTextField txtRep;
    private javax.swing.JTextField txtSem1;
    private javax.swing.JTextField txtSem2;
    // End of variables declaration//GEN-END:variables
}
