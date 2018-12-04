 
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class modelocompras {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    private String compras;
    private String proveedores;
    private String fecha_compra;
    private String importe_total;
    private String empleado;
    private int id;

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

    public String getProveedores() {
        return proveedores;
    }

    public void setProveedores(String proveedores) {
        this.proveedores = proveedores;
    }

    public String getFeccha_compra() {
        return fecha_compra;
    }

    public void setFeccha_compra(String feccha_compra) {
        this.fecha_compra = feccha_compra;
    }

    public String getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(String importe_total) {
        this.importe_total = importe_total;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/acme", "root", ""); //cambiar nombre de la base de datos
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM compras;");//cambiar nombre de la tabla
            rs.next();
            compras = rs.getString("id_compras");
            proveedores = rs.getString("id_proveedor");
            fecha_compra = rs.getString("fecha_compra");
            importe_total = rs.getString("importe_total");
            empleado = rs.getString("id_empleadoC");
           
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }

    }
    
     public void moverPrimerRegistro(){
        try {
            rs.first();
            compras = rs.getString("id_compras");
            proveedores = rs.getString("id_proveedor");
            fecha_compra = rs.getString("fecha_compra");
            importe_total = rs.getString("importe_total");
            empleado = rs.getString("id_empleadoC");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
        System.out.print("Programa accion moverPrimerRegistro");
    }
     
     public void moverSiguienteRegistro(){
        try {
            if (!rs.isLast()) {
                rs.next();
            compras = rs.getString("id_compras");
            proveedores = rs.getString("id_proveedor");
            fecha_compra = rs.getString("fecha_compra");
            importe_total = rs.getString("importe_total");
            empleado = rs.getString("id_empleadoC");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
        System.out.print("Programa accion moverSiguienteRegistro");
    }
     
     public void moverAnteriorRegistro(){
        try {
            if (!rs.isFirst()) {
                rs.previous();
            compras = rs.getString("id_compras");
            proveedores = rs.getString("id_proveedor");
            fecha_compra = rs.getString("fecha_compra");
            importe_total = rs.getString("importe_total");
            empleado = rs.getString("id_empleadoC");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
        System.out.print("Programa accion moverAnteriorRegistro");
    }
     
     public void moverUltimoRegistro(){
        try {
            rs.last();
            compras = rs.getString("id_compras");
            proveedores = rs.getString("id_proveedor");
            fecha_compra = rs.getString("fecha_compra");
            importe_total = rs.getString("importe_total");
            empleado = rs.getString("id_empleadoC");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error mover ultimo registro" + ex.getMessage());
        }
   
        System.out.print("Programa accion moverUltimoRegistro");
    }
   
    public void insertar(){
        try {
            compras = this.getCompras();
            proveedores = this.getProveedores();
            fecha_compra = this.getFeccha_compra();
            importe_total = this.getImporte_total();
            empleado = this.getEmpleado();
            st.executeUpdate("INSERT INTO compras (id_compras, id_proveedor, fecha_compra, importe_total, id_empleadoC)" + " VALUES ('"+ compras +"','"+ proveedores +"','"+ fecha_compra +"','"+ importe_total +"','"+ empleado +"');");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage());
        }
   
        System.out.print("Programa insertar");
    }
    public void modificar(){
        try {
            id = rs.getInt("id_compras");
            compras = this.getCompras();
            proveedores = this.getProveedores();
            fecha_compra = this.getFeccha_compra();
            importe_total = this.getImporte_total();
            empleado = this.getEmpleado();
            st.executeUpdate("UPDATE compras SET id_compras = '"+ compras +"', id_proveedor = '"+ proveedores +"', fecha_compra = '"+ fecha_compra +"', importe_total = '"+ importe_total +"'id_empleadoC = '"+ empleado +"' WHERE id_compra = "+ id +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar" + ex.getMessage());
        }
   
        System.out.print("Programa modificar");
    }
    public void borrar(){
        try {
            id = rs.getInt("id_compra");
            st.executeUpdate("DELETE FROM compras WHERE id_compra = "+ id +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar" + ex.getMessage());
        }
   
        System.out.print("Programa borrar");
    } 
}
