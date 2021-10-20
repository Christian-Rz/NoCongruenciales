package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arturo Campos
 */
public class CMultiplicativo extends javax.swing.JDialog {

    DefaultTableModel modelo;

    /**
     * Creates new form CongruenciaMultiplicativo
     */
    public CMultiplicativo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Semilla");
        modelo.addColumn("Semilla Nueva");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRI = new javax.swing.JTextField();
        txtG = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        btnTres = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Algoritmo Lineal y Multiplicativo");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 193, 236));
        jLabel2.setText("Indique ri:");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(184, 193, 236));
        jLabel3.setText("Valor de g:");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(184, 193, 236));
        jLabel4.setText("Semilla X0:");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(184, 193, 236));
        jLabel5.setText("Valor de K:");

        txtRI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRIKeyTyped(evt);
            }
        });

        txtG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGKeyTyped(evt);
            }
        });

        txtX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtXKeyTyped(evt);
            }
        });

        txtK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKKeyTyped(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(0, 0, 0));
        btnTres.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3+8k");
        btnTres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTres.setMaximumSize(new java.awt.Dimension(100, 50));
        btnTres.setMinimumSize(new java.awt.Dimension(100, 50));
        btnTres.setPreferredSize(new java.awt.Dimension(100, 50));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(0, 0, 0));
        btnCinco.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5+8k");
        btnCinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCinco.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCinco.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCinco.setPreferredSize(new java.awt.Dimension(100, 50));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(184, 193, 236));
        jLabel6.setText("Seleccione la formula para el proceso ");

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if(txtRI.getText().isEmpty() || txtX.getText().isEmpty() || txtK.getText().isEmpty() 
        || txtG.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Complete todos los campos");
        }else{
            long xi = Long.parseLong(txtX.getText());
            int rep = Integer.parseInt(txtRI.getText());
            int gg = Integer.parseInt(txtG.getText());
            int kk = Integer.parseInt(txtK.getText());
            long f, Xi0, Xi1;
            int a, m, n, i;
            double ps;
            String x;
            
            if(xi < 2 || rep < 2 || gg < 2 || kk < 2){
                JOptionPane.showMessageDialog(null,"Los valores deben ser mayores a 1");
            }else{
                try {
                    int b1 = jTable1.getRowCount();
                    for (int n1 = b1 - 1; n1 >= 0;) {
                        modelo.removeRow(n1);
                        n1 = n1 - 1;
                    }
               }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo dificultades en el programa", "ERROR", JOptionPane.ERROR_MESSAGE);
               }
                if (xi % 2 == 0) {
                   JOptionPane.showMessageDialog(null, "Este algoritmo solo acepta números impares");
                }else {
                    a = 3 + (8 * kk); //Operador para el algoritmos
                    m = (int) (Math.pow(2, gg));
                    n = m / 4;
                    Xi0 = xi;

                    String fila[] = new String[4];
                    for (i = 1; i <= n && i <= rep; i++) {
                        f = (a * Xi0);
                        Xi1 = f % m;
                        x = Long.toString(Xi1);
                        ps = (Double.parseDouble(x)) / (m - 1);
                        fila[0] = Integer.toString(i);
                        fila[1] = Long.toString(Xi0);
                        fila[2] = Long.toString(Xi1);
                        fila[3] = Double.toString(ps);
                        modelo.addRow(fila);
                        Xi0 = Xi1;
                    }
                }
            }            
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if(txtRI.getText().isEmpty() || txtX.getText().isEmpty() || txtK.getText().isEmpty() 
        || txtG.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Complete todos los campos");
        }else{
            long xi = Long.parseLong(txtX.getText());
            int rep = Integer.parseInt(txtRI.getText());
            int gg = Integer.parseInt(txtG.getText());
            int kk = Integer.parseInt(txtK.getText());
            long f, Xi0, Xi1;
            int a, m, n, i;
            double ps;
            String x;
            if(xi < 2 || rep < 2 || gg < 2 || kk < 2){
                JOptionPane.showMessageDialog(null,"Los valores deben ser mayores a 1");
            }else{
                try {
                    int b1 = jTable1.getRowCount();
                    for (int n1 = b1 - 1; n1 >= 0;) {
                        modelo.removeRow(n1);
                        n1 = n1 - 1;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo dificultades en el programa", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                if (xi % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "Este algoritmo solo acepta números impares");
                }else {
                    a = 5 + (8 * kk); //Operador para el algoritmos
                    m = (int) (Math.pow(2, gg));
                    n = m / 4;
                    Xi0 = xi;

                    String fila[] = new String[4];
                    for (i = 1; i <= n && i <= rep; i++) {
                        f = (a * Xi0);
                        Xi1 = f % m;
                        x = Long.toString(Xi1);
                        ps = (Double.parseDouble(x)) / (m - 1);
                        fila[0] = Integer.toString(i);
                        fila[1] = Long.toString(Xi0);
                        fila[2] = Long.toString(Xi1);
                        fila[3] = Double.toString(ps);
                        modelo.addRow(fila);
                        Xi0 = Xi1;
                    }
                }
            }
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        try {
            txtRI.setText("");
            txtX.setText("");
            txtK.setText("");
            txtG.setText("");
             int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo dificultades en el programa", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRIKeyTyped
       //Verificamos que solo haya escrito digitos
       char caracter = evt.getKeyChar();
       if(!Character.isDigit(caracter)){
            evt.consume();
       }
    }//GEN-LAST:event_txtRIKeyTyped

    private void txtXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXKeyTyped
       //Verificamos que solo haya escrito digitos
       char caracter = evt.getKeyChar();
       if(!Character.isDigit(caracter)){
            evt.consume();
       }
    }//GEN-LAST:event_txtXKeyTyped

    private void txtKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKeyTyped
        //Verificamos que solo haya escrito digitos
       char caracter = evt.getKeyChar();
       if(!Character.isDigit(caracter)){
            evt.consume();
       }
    }//GEN-LAST:event_txtKKeyTyped

    private void txtGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyTyped
        //Verificamos que solo haya escrito digitos
       char caracter = evt.getKeyChar();
       if(!Character.isDigit(caracter)){
            evt.consume();
       }
    }//GEN-LAST:event_txtGKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtRI;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
