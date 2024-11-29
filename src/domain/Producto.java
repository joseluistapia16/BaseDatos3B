/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author user
 */
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private Integer id_producto;
    private String nombre_producto;
    private String categoria_producto;
    private Double precio;
    private Integer cantidad;
    private Date fecha_registro;
    private String estado;
}
