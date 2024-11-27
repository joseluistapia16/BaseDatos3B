package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {

    private Connection connect = null;

    public Connection conectar(String base) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + base;
            connect = DriverManager.getConnection(url, "root","");
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
        return connect;
    }
    
    public static void main(String[] args) {
        Conexion pr = new Conexion();
        System.out.println(pr.conectar("prueba3b"));
    }
}
