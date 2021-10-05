package logica;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Aditivo {
    //----------Metodos para el Algoritmo Aditivo-------------------------------    
    public static void algoritmoAditivo(int numeroSemillas, int semillasNuevas, 
            int modular, DefaultTableModel modelo, DefaultTableModel modelo2,
            JTable jTable)
    {
        int total = numeroSemillas + semillasNuevas; 
        long semillas[] = new long[total];
        String fila1[] = new String[2];
        boolean bandera = true;
        //Llenado de Primer Tabla
        for(int i = 0; i < numeroSemillas;){
            String verificaString = JOptionPane.showInputDialog(null,"Ingrese la semilla " + (i+1));
            boolean resultado = (verificaString != null && !verificaString.equals(""));
            if(!resultado){
                //Rompemos el ciclo si cierra el JOption o si no ingresa semilla
                bandera = false;
                break;
            }else{
                long verifica = Long.parseLong(verificaString);
                if(verifica < 2){
                    JOptionPane.showMessageDialog(null,"Ingrese un numero mayor a 1");
                }else{
                    semillas[i] = verifica;
                    fila1[0]=Integer.toString(i+1);
                    fila1[1]=Long.toString(semillas[i]);
                    modelo2.addRow(fila1);
                    ++i;
                }
            }
        } 
        //Entra si no ingresa una semilla o si cierra el Joption
        if(!bandera){
            JOptionPane.showMessageDialog(null,"Ingrese todas las semillas");
            for (int n = jTable.getRowCount() - 1; n >= 0;--n) {
                modelo2.removeRow(n);
            }
        }else{
            String fila2[]=new String[3];
            //Llenado de Segunda Tabla
            for(int j = numeroSemillas; j < total; ++j){
                long suma = semillas[j-numeroSemillas] + semillas[j - 1];
                long semillaNueva = suma % modular;
                semillas[j] = semillaNueva;
                String semillaNuevaString = Long.toString(semillaNueva);
                double pseudoNumero = Double.parseDouble(semillaNuevaString) / (modular - 1);
                fila2[0]=Integer.toString(j+1);
                fila2[1]=Long.toString(semillas[j]);
                fila2[2]=Double.toString(pseudoNumero);
                modelo.addRow(fila2);
            }
        }
    }
}
//---------------Fin de los Metodos para el Algoritmo Aditivo-------------------

