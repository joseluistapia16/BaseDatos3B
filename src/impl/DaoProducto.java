/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;

import domain.Producto;
import java.util.List;


public interface DaoProducto {

    String save(Producto obj);

    String update(Producto obj);

    String delete(Integer idProducto);

    Producto getOne(Integer idProducto);
    
    Integer getId(String name);

    List<Producto> getAll();
}


