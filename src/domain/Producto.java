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
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {

    private Integer id_producto;
    @NonNull
    private String nombre_producto;
    @NonNull
    private String categoria_producto;
    @NonNull
    private Double precio;
    @NonNull
    private Integer cantidad;
    @NonNull
    private Date fecha_registro;
    @NonNull
    private String estado;
}
