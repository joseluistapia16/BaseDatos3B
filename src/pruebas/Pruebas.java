/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import dao.CrudProducto;
import domain.Producto;
import java.sql.Date;

public class Pruebas {
    public static void main(String[] args) {
        insertar();
    }
    private static void insertar(){
        CrudProducto dao = new CrudProducto();
        
        var obj = new Producto(1, "Aceite Girasol", "Alimetos",
                2.15, 10, Date.valueOf("2024-10-03"), "A");
        var msj = dao.save(obj);
        System.out.println(msj);
    }
}
