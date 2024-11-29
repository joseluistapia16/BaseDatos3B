package dao;


import domain.Producto;
import impl.DaoProducto;
import java.util.List;
import java.sql.Connection;


public class CrudProducto implements DaoProducto{
    private Conexion conexion;
    private String base = "prueba3b";
    
    public CrudProducto(){
          this.conexion = new Conexion();
    }
    
    @Override
    public String save(Producto obj) {
        var sql = "insert into producto (nombre_producto, categoria_producto, precio, "
               + "cantidad, fecha_registro, estado) values (?, ?, ?, ?, ?, ?)";
        return null;
    }

    @Override
    public String update(Producto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(Integer idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto getOne(Integer idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getId(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
