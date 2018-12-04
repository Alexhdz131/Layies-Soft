/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vista.proveedores;
/**
 *
 * @author LENOVO
 */
public class modeloproveedor {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    private String proeedores;
    private String producto;
    private String ap_paterno;
    private String ap_materno;
    private String telefono;
    private String correo;
    private String calle;
    private String colonia;
    private String exterior;
    private String ciudad;
    private String estado;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getProeedores() {
        return proeedores;
    }

    public void setProeedores(String proeedores) {
        this.proeedores = proeedores;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://raspberry-tic41.zapto.org:3306/layies_soft", "tic41", "tic41"); 
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM proveedores;");
            rs.next();
            proeedores = rs.getString("id_proveedor");
            producto = rs.getString("nombre_pro");
            ap_materno = rs.getString("ap_materno_pro");
            ap_paterno = rs.getString("ap_paterno_pro");
            telefono= rs.getString("telefono");
            correo= rs.getString("correo");
            calle= rs.getString("calle");
            colonia= rs.getString("colonia");
            exterior= rs.getString("no_exterior");
            estado= rs.getString("estado");
            
            
           
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }

    }
    public void moverPrimerRegistro(){
        try {
            rs.first();
            proeedores = rs.getString("id_proveedor");
            producto = rs.getString("nombre_pro");
            ap_materno = rs.getString("ap_materno_pro");
            ap_paterno = rs.getString("ap_paterno_pro");
            telefono= rs.getString("telefono");
            correo= rs.getString("correo");
            calle= rs.getString("calle");
            colonia= rs.getString("colonia");
            exterior= rs.getString("no_exterior");
            estado= rs.getString("estado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
        System.out.print("Programa accion moverPrimerRegistro");
    }
    public void moverSiguienteRegistro(){
        try {
            if (!rs.isLast()) {
                rs.next();
            proeedores = rs.getString("id_proveedor");
            producto = rs.getString("nombre_pro");
            ap_materno = rs.getString("ap_materno_pro");
            ap_paterno = rs.getString("ap_paterno_pro");
            telefono= rs.getString("telefono");
            correo= rs.getString("correo");
            calle= rs.getString("calle");
            colonia= rs.getString("colonia");
            exterior= rs.getString("no_exterior");
            estado= rs.getString("estado");
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
            proeedores = rs.getString("id_proveedor");
            producto = rs.getString("nombre_pro");
            ap_materno = rs.getString("ap_materno_pro");
            ap_paterno = rs.getString("ap_paterno_pro");
            telefono= rs.getString("telefono");
            correo= rs.getString("correo");
            calle= rs.getString("calle");
            colonia= rs.getString("colonia");
            exterior= rs.getString("no_exterior");
            estado= rs.getString("estado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
        System.out.print("Programa accion moverAnteriorRegistro");
    }
     
     public void moverUltimoRegistro(){
        try {
            rs.last();
            proeedores = rs.getString("id_proveedor");
            producto = rs.getString("nombre_pro");
            ap_materno = rs.getString("ap_materno_pro");
            ap_paterno = rs.getString("ap_paterno_pro");
            telefono= rs.getString("telefono");
            correo= rs.getString("correo");
            calle= rs.getString("calle");
            colonia= rs.getString("colonia");
            exterior= rs.getString("no_exterior");
            estado= rs.getString("estado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error mover ultimo registro" + ex.getMessage());
        }
   
        System.out.print("Programa accion moverUltimoRegistro");
    }
   
    public void insertar(){
        try {
            proeedores = this.getProeedores();
            producto = this.getProducto();
             ap_materno= this.getAp_materno();
            ap_paterno = this.getAp_paterno();
             telefono= this.getTelefono();
             correo= this.getCorreo();
             calle= this.getCalle();
             colonia= this.getColonia();
             exterior= this.getExterior();
             estado= this.getEstado();
             
            st.executeUpdate("INSERT INTO proveedores (id_proveedor, nombre_pro, ap_materno_pro, ap_paterno_pro, telefono, correo, calle, colonia, no_exterior, estado)" + " VALUES ('"+ proeedores +"','"+ producto +"','"+ ap_materno +"','"+ ap_paterno +"','"+ telefono +"','"+correo +"','"+ calle+"','"+ colonia+"','"+ exterior +"','"+ estado +"');");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage());
        }
   
        System.out.print("Programa insertar");
    }
    public void modificar(){
        try {
            id = rs.getInt("id_proveedor");
            proeedores = this.getProeedores();
            producto = this.getProducto();
             ap_materno= this.getAp_materno();
            ap_paterno = this.getAp_paterno();
             telefono= this.getTelefono();
             correo= this.getCorreo();
             calle= this.getCalle();
             colonia= this.getColonia();
             exterior= this.getExterior();

             estado= this.getEstado();
            st.executeUpdate("UPDATE proveedores SET id_proveedor = '"+ proeedores +"', nombre_pro = '"+ producto +"', ap_materno_pro = '"+ ap_materno +"', ap_paterno_pro = '"+ ap_paterno +"', telefono = '"+ telefono +"', correo = '"+ correo +"', calle = '"+ calle +"', colonia = '"+ colonia +"', no_exterior = '"+ exterior +"', estado = '"+ estado +"' WHERE id_proveedor = "+ id +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar" + ex.getMessage());
        }
   
        System.out.print("Programa modificar");
    }
    public void borrar(){
        try {
            id = rs.getInt("id_proveedor");
            st.executeUpdate("DELETE FROM proveedores WHERE id_proveedor = "+ id +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar" + ex.getMessage());
        }
   
        System.out.print("Programa borrar");
    }  
    public void transfer(InputStream input, OutputStream output) throws Exception {
        byte[] buf = new byte[1024];
        int len;
        while ((len = input.read(buf)) > 0) {
          output.write(buf, 0, len);
        }
        input.close();
        output.close();
}
}
    
    
    
    
    
    
    

