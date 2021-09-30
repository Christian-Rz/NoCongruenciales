package logica;

import javax.swing.table.DefaultTableModel;

public class Utilidades {
    
    //Metodos para el algoritmo de cuadrados medios
    //Agrega los datos a un arreglo y regresa este arreglo
    public static String[] agregarDatos(
            String fila[], int i, 
            String semillaStringTabla, 
            String semillaCuadradoString, String numerosCentrales,
            double numeroPseudoaleatorio)
    {
        fila[0] = Integer.toString(i);
        fila[1] = semillaStringTabla;
        fila[2] = semillaCuadradoString;
        fila[3] = numerosCentrales;
        fila[4] = Double.toString(numeroPseudoaleatorio);
        return fila;
    }
   
    //Algoritmo Cuadrados Medios cuando se ingresa el cero a la izquierda
    public static void izquierdaCuadrados(String semillaString, String repeticionesString, int sizeSemilla, DefaultTableModel modelo){
        //Declaracion de Variables e inicializacion
        int repeticionesInt = Integer.parseInt(repeticionesString);
        String [] fila= new String [5];
        long semillaLong = Long.parseLong(semillaString);
        long semillaCuadrado = 0;
        String semillaCuadradoString = Long.toString(semillaLong * semillaLong);
        int sizeSemillaCuadrado = semillaCuadradoString.length();
        //Dejamos vacia la variable
        semillaCuadradoString = "";
        int mitad = 0;
        double numeroPseudoaleatorio = 0.0;
        String numerosCentrales;
        String semillaStringTabla;
      
        //Verificamos si su residuo es 0 o 1
        int contador = 0;
        if(sizeSemilla % 2 == 0){
            ++contador;
        }
        //Entra aqui si es cero a la izquierda
        for(int i = 0; i < repeticionesInt; ++i){
            if(sizeSemillaCuadrado % 2 != 0 + contador){
                semillaCuadrado = semillaLong * semillaLong;
                semillaCuadradoString = Long.toString(semillaCuadrado);
                sizeSemillaCuadrado = semillaCuadradoString.length();
                mitad = (sizeSemillaCuadrado - sizeSemilla) / 2;
                numerosCentrales = semillaCuadradoString.substring(mitad,mitad+sizeSemilla);
                numeroPseudoaleatorio = Double.parseDouble(numerosCentrales) / (Math.pow(10, sizeSemilla));
                semillaStringTabla = Long.toString(semillaLong);
                
                //Agregamos los datos a las fila 
                modelo.addRow(agregarDatos(fila, i, 
                        semillaStringTabla, semillaCuadradoString, 
                        numerosCentrales, numeroPseudoaleatorio));
                            
                semillaLong = Long.parseLong(numerosCentrales);
                String temporal = Long.toString(semillaLong * semillaLong);
                sizeSemillaCuadrado = temporal.length();
              
            }else{
                semillaCuadrado = semillaLong * semillaLong;
                semillaCuadradoString = Long.toString(semillaCuadrado);
                //Metemos un cero a la izquierda
                semillaCuadradoString = "0" + semillaCuadradoString;
                sizeSemillaCuadrado = semillaCuadradoString.length();
                mitad = (sizeSemillaCuadrado - sizeSemilla) / 2;
                
                //
                numerosCentrales = semillaCuadradoString.substring(mitad ,(mitad+sizeSemilla));
                
                numeroPseudoaleatorio = Double.parseDouble(numerosCentrales) / (Math.pow(10, sizeSemilla));
                semillaStringTabla = Long.toString(semillaLong);
                
                //Agregamos los datos a las fila
                modelo.addRow(agregarDatos(fila, i, 
                    semillaStringTabla, semillaCuadradoString, 
                    numerosCentrales, numeroPseudoaleatorio));
                           
                semillaLong = Long.parseLong(numerosCentrales);
                String temporal = Long.toString(semillaLong * semillaLong);
                sizeSemillaCuadrado = temporal.length();
            }
        }
    }
    
    //Algoritmo Cuadrados Medios cuando se ingresa el cero a la derecha
    public static void derechaCuadrados(String semillaString, String repeticionesString, int sizeSemilla, DefaultTableModel modelo){
              //Declaracion de Variables e inicializacion
        int repeticionesInt = Integer.parseInt(repeticionesString);
        String [] fila= new String [5];
        long semillaLong = Long.parseLong(semillaString);
        long semillaCuadrado = 0;
        String semillaCuadradoString = Long.toString(semillaLong * semillaLong);
        int sizeSemillaCuadrado = semillaCuadradoString.length();
        //Dejamos vacia la variable
        semillaCuadradoString = "";
        int mitad = 0;
        double numeroPseudoaleatorio = 0.0;
        String numerosCentrales;
        String semillaStringTabla;
      
        //Verificamos si su residuo es 0 o 1
        int contador = 0;
        if(sizeSemilla % 2 == 0){
            ++contador;
        }
        //Entra aqui si es cero a la izquierda
        for(int i = 0; i < repeticionesInt; ++i){
            if(sizeSemillaCuadrado % 2 != 0 + contador){
                semillaCuadrado = semillaLong * semillaLong;
                semillaCuadradoString = Long.toString(semillaCuadrado);
                sizeSemillaCuadrado = semillaCuadradoString.length();
                mitad = (sizeSemillaCuadrado - sizeSemilla) / 2;
                numerosCentrales = semillaCuadradoString.substring(mitad,mitad+sizeSemilla);
                numeroPseudoaleatorio = Double.parseDouble(numerosCentrales) / (Math.pow(10, sizeSemilla));
                semillaStringTabla = Long.toString(semillaLong);
                
                //Agregamos los datos a las fila 
                modelo.addRow(agregarDatos(fila, i, 
                        semillaStringTabla, semillaCuadradoString, 
                        numerosCentrales, numeroPseudoaleatorio));
                            
                semillaLong = Long.parseLong(numerosCentrales);
                String temporal = Long.toString(semillaLong * semillaLong);
                sizeSemillaCuadrado = temporal.length();
              
            }else{
                semillaCuadrado = semillaLong * semillaLong;
                semillaCuadradoString = Long.toString(semillaCuadrado);
                //Metemos un cero a la izquierda
                semillaCuadradoString = semillaCuadradoString + "0";
                sizeSemillaCuadrado = semillaCuadradoString.length();
                mitad = (sizeSemillaCuadrado - sizeSemilla) / 2;
               
                //
                numerosCentrales = semillaCuadradoString.substring(mitad,(mitad+sizeSemilla));
               
                numeroPseudoaleatorio = Double.parseDouble(numerosCentrales) / (Math.pow(10, sizeSemilla));
                semillaStringTabla = Long.toString(semillaLong);
                
                //Agregamos los datos a las fila
                modelo.addRow(agregarDatos(fila, i, 
                    semillaStringTabla, semillaCuadradoString, 
                    numerosCentrales, numeroPseudoaleatorio));
                           
                semillaLong = Long.parseLong(numerosCentrales);
                String temporal = Long.toString(semillaLong * semillaLong);
                sizeSemillaCuadrado = temporal.length();
            }
        }
    }
}
