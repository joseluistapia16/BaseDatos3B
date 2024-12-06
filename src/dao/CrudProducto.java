package dao;


import domain.Producto;
import impl.DaoProducto;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CrudProducto implements DaoProducto{
    private Conexion conexion;
    private String base = "prueba3b";
    
    public CrudProducto(){
          this.conexion = new Conexion();
    }
    
    @Override
    public String save(Producto obj) {
        var msj = "";
        var sql = "insert into producto (nombre_producto, categoria_producto, precio, "
               + "cantidad, fecha_registro, estado) values (?, ?, ?, ?, ?, ?)";
        try (Connection conect = this.conexion.conectar(base);
                PreparedStatement st = conect.prepareStatement(sql)){
            st.setString(1, obj.getNombre_producto());
            st.setString(2, obj.getCategoria_producto());
            st.setDouble(3, obj.getPrecio());
            st.setInt(4, obj.getCantidad());
            st.setDate(5, obj.getFecha_registro());
            st.setString(6, obj.getEstado());
            msj = "Sus datos han sido guardados";
            st.executeUpdate();
        } catch (SQLException ex) {
            msj = "Ha ocurrido un error";
            Logger.getLogger(CrudProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msj;
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
