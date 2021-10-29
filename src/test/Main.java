package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import vistas.VistaPrincipal;

public class Main {

    public static Connection getConnection() {
        Connection connection = null;
        String bdName = "Distribuccion";
        String user = "sa";
        String pass = "1234";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionBD = "jdbc:sqlserver://localhost;databaseName="
                    + bdName + ";user=" + user + "password=" + pass + ";";
            connection = DriverManager.getConnection(connectionBD);

        } catch (ClassNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        if (Main.getConnection() != null) {
            System.out.println("Conexion Exitosa");
            //Creación de la ventana
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //Hacemos visible la ventana
            vistaPrincipal.setVisible(true);
        }
        else {
            System.out.println("Sin conexion");
        }
    }
}
