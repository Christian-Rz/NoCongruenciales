package logica;

import javax.swing.table.DefaultTableModel;

public class Cuadrados {
    
    //--------Metodos para el algoritmo de cuadrados medios---------------------
    public static String[] agregarDatos(String fila[], int i, long semilla, 
            long semillaCuadrada, String numerosCentrales,
            double numeroPseudoaleatorio,String semillaCero)
    {
        if(semillaCero.isEmpty()){
            fila[0] = Integer.toString(i);
            fila[1] = Long.toString(semilla);
            fila[2] = Long.toString(semillaCuadrada);
            fila[3] = numerosCentrales;
            fila[4] = Double.toString(numeroPseudoaleatorio);
        }else{
            fila[0] = Integer.toString(i);
            fila[1] = Long.toString(semilla);
            fila[2] = semillaCero;
            fila[3] = numerosCentrales;
            fila[4] = Double.toString(numeroPseudoaleatorio);
        }
        return fila;
    }
    
    public static void cuadradosMediosIzq(long semilla, int digitos, 
            int repeticiones, DefaultTableModel modelo)
    {
        String [] fila= new String [5];
        for(int i = 0; i < repeticiones; ++i){
            long semillaCuadrada = semilla * semilla;
            int digitosSemillaCuadrada = Long.toString(semillaCuadrada).length();
            
            if(digitos % 2 == 0){
                //Digitos pares 
                if(digitosSemillaCuadrada % 2 == 0){
                    semilla = algoritmo(digitosSemillaCuadrada, digitos, 
                            semillaCuadrada, semilla, fila, i, modelo);
                }else{
                    //Se pone cero
                    semilla = algoritmoCeroIzq(digitosSemillaCuadrada, digitos, 
                            semillaCuadrada, semilla, fila, i, modelo);
                }
            }else{
                //Digitos impares
                if(digitosSemillaCuadrada % 2 == 0){
                    //Se pone cero
                    semilla = algoritmoCeroIzq(digitosSemillaCuadrada, digitos, 
                            semillaCuadrada, semilla, fila, i, modelo);
                }else{
                    semilla = algoritmo(digitosSemillaCuadrada, digitos, 
                            semillaCuadrada, semilla, fila, i, modelo);
                }
            }
        }
    }
    
    public static void cuadradosMediosDrc(long semilla, int digitos, 
            int repeticiones, DefaultTableModel modelo)
    {
        String [] fila= new String [5];
        for(int i = 0; i < repeticiones; ++i){ 
            long semillaCuadrada = semilla * semilla;
            int digitosSemillaCuadrada = Long.toString(semillaCuadrada).length();
            
            if(digitos % 2 == 0){
                //Digitos pares 
                if(digitosSemillaCuadrada % 2 == 0){
                    semilla = algoritmo(digitosSemillaCuadrada, digitos, 
                            semillaCuadrada, semilla, fila, i, modelo);
                }else{
                    //Se pone cero
                    semilla = algoritmoCeroDrc(digitosSemillaCuadrada, 
                            digitos, semillaCuadrada, semilla, fila, i, modelo);
                }
            }else{
                //Digitos impares
                if(digitosSemillaCuadrada % 2 == 0){
                    //Se pone cero
                    semilla = algoritmoCeroDrc(digitosSemillaCuadrada, 
                            digitos, semillaCuadrada, semilla, fila, i, modelo);
                }else{
                    semilla = algoritmo(digitosSemillaCuadrada, digitos,
                            semillaCuadrada, semilla, fila, i, modelo);
                }
            }
        }
    }
    
    public static long algoritmo(int digitosSemillaCuadrada, int digitos, 
            long semillaCuadrada, long semilla, String fila[], int i,  
            DefaultTableModel modelo)
    {
        int mitad = (digitosSemillaCuadrada - digitos) / 2;
        String numerosCentrales = Long.toString(semillaCuadrada).substring(mitad ,(mitad + digitos));
        double numeroPseudoaletorio = Double.parseDouble(numerosCentrales) / Math.pow(10, digitos);
        modelo.addRow(agregarDatos(fila, i, semilla, semillaCuadrada, 
                numerosCentrales, numeroPseudoaletorio,""));
        return semilla = Long.parseLong(numerosCentrales);
    }
    
    public static long algoritmoCeroIzq(int digitosSemillaCuadrada, int digitos,
            long semillaCuadrada, long semilla, String fila[], int i,  
            DefaultTableModel modelo)
    {
        digitosSemillaCuadrada = ("0" + Long.toString(semillaCuadrada)).length();
        int mitad = (digitosSemillaCuadrada - digitos) / 2;
        String numerosCentrales = Long.toString(semillaCuadrada).substring(mitad - 1 ,((mitad + digitos) - 1));
        double numeroPseudoaletorio = Double.parseDouble(numerosCentrales) / Math.pow(10, digitos);
        String semillaString = "0" + Long.toString(semillaCuadrada);
        modelo.addRow(agregarDatos(fila, i, semilla, semillaCuadrada, 
                numerosCentrales, numeroPseudoaletorio,semillaString));
        return semilla = Long.parseLong(numerosCentrales);
    }
    
    public static long algoritmoCeroDrc(int digitosSemillaCuadrada, int digitos,
            long semillaCuadrada, long semilla, String fila[], int i,  
            DefaultTableModel modelo)
    {
        digitosSemillaCuadrada = (Long.toString(semillaCuadrada) + "0").length();
        int mitad = (digitosSemillaCuadrada - digitos) / 2;
        String numerosCentrales = Long.toString(semillaCuadrada).substring(mitad ,((mitad + digitos)));
        double numeroPseudoaletorio = Double.parseDouble(numerosCentrales) / Math.pow(10, digitos);
        String semillaString = Long.toString(semillaCuadrada) + "0";
        modelo.addRow(agregarDatos(fila, i, semilla, semillaCuadrada, 
                numerosCentrales, numeroPseudoaletorio,semillaString));
        return semilla = Long.parseLong(numerosCentrales);
    }
    
    //-------Fin de los Metodos para el algoritmo de cuadrados medios-----------
}
