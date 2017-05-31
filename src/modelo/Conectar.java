package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    private String driver = "org.postgresql.Driver";
    private String usuario = "postgres";
    private String clave = "123";
    private String base_de_datos = "bd_eval";
    private String url = "jdbc:postgresql://localhost:5432/" + base_de_datos;

    Connection cc = null;
    Connection cn = conexion();

    public Connection conexion() {
        try {

            Class.forName(driver);
            cc = (Connection) DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return cc;
    }
}

