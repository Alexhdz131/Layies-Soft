/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *se programan los botones
 * @author morenita
 */
public class ModelSucursal {
    
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    private int id_sucursal;
    
    private String estado;
    private String calle;
    private String colonia;
    private int numero_exterior;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public int getId_sucursales() {
        return id_sucursal;
    }

    public void setId_sucursales(int id_sucursales) {
        this.id_sucursal = id_sucursales;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public int getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(int numero_exterior) {
        this.numero_exterior = numero_exterior;
    }
    
    
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/acme", "morenita", "morenita");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM sucursales;");
            rs.next();
            this.id_sucursal = rs.getInt("id_sucursal");
            estado= rs.getString("estado");
            calle = rs.getString("calle_sucursal");
            colonia = rs.getString("colonia_sucursal");
            this.numero_exterior = rs.getInt("no_exterior");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }

    }
     public void moverPrimerRegistro(){
    
        try {
            rs.first();
            id_sucursal = rs.getInt("id_sucursal");
            estado= rs.getString("estado");
            calle = rs.getString("calle_sucursal");
            colonia = rs.getString("colonia_sucursal");
            numero_exterior = rs.getInt("no_exterior");
            
        } catch (SQLException ex) {
            Logger.getLogger(ModelSucursal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Error en el primer registro");
            
        }
        
        
        
        
}
     public void moverSiguienteRegistro(){
    
        try {
            
            if (!rs.isLast()){
            rs.first();
            id_sucursal = rs.getInt("id_sucursal");
            estado= rs.getString("estado");
            calle = rs.getString("calle_sucursal");
            colonia = rs.getString("colonia_sucursal");
            numero_exterior = rs.getInt("no_exterior");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ModelSucursal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Error al mover el siguiente registro");
            
        }
     
}
     
     public void moverAnteriorRegistro(){
    
        try {
            
            if (!rs.isFirst()){
            rs.previous();
            id_sucursal = rs.getInt("id_sucursal");
            estado= rs.getString("estado");
            calle = rs.getString("calle_sucursal");
            colonia = rs.getString("colonia_sucursal");
            numero_exterior = rs.getInt("no_exterior");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ModelSucursal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Error al mover el anterior registro");
            
        }
     }
     public void moverUltimoRegistro(){
        try {
            rs.last();
            id_sucursal = rs.getInt("id_sucursal");
            estado= rs.getString("estado");
            calle = rs.getString("calle_sucursal");
            colonia = rs.getString("colonia_sucursal");
            numero_exterior = rs.getInt("no_exterior");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
   
        System.out.print("error al mover el Ultimo Registro");
    }
     
     public void guardarRegistro(){
        try {
            id_sucursal = this.getId_sucursales();
            estado = this.getEstado();
            calle = this.getCalle();
            colonia = this.getColonia();
            numero_exterior = this.getNumero_exterior();
            st.executeUpdate("INSERT INTO sucursales (id_sucursal, estado, calle_sucursal, colonia_sucursal, no_exterior)" + " VALUES ('"+ id_sucursal +"','"+ estado +"','"+ calle+"','"+ colonia+"','"+ numero_exterior+"');");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage());
        }
        System.out.print("Programa insertar");
        }
     
     public void modificarRegistro(){
        try {
            id_sucursal = this.getId_sucursales();
            estado = this.getEstado();
            calle = this.getCalle();
            colonia = this.getColonia();
            numero_exterior = this.getNumero_exterior();
            st.executeUpdate("UPDATE sucursales SET id_sucursal = '"+ id_sucursal +"', estado = '"+ estado +"', calle_sucursal = '"+ calle +"', colonia_sucursal = '"+ colonia +"', no_exterior = '"+numero_exterior +"'  WHERE id_sucursal = "+ id_sucursal +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage());
        }
        System.out.print("Programa modificar");
        }
     
    /* public void insertarRegistro(){
        try {
            id_sucursal = this.getId_sucursales();
            estado = this.getEstado();
            calle = this.getCalle();
            colonia = this.getColonia();
            numero_exterior = this.getNumero_exterior();
            st.executeUpdate("UPDATE sucursales SET id_sucural = '"+ id_sucursal +"', estado = '"+ estado +"', calle_sucursal = '"+ calle +"', colonia_sucursal = '"+ colonia +"', no_exterior = '"+numero_exterior +"'  WHERE id_sucursales = "+ id_sucursal +"; ");
            this.conectarDB();
            this.moverUltimoRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage());
        }
        System.out.print("Programa insertar");
        }
*/
        
}
    



    
    //metodo que realiza las siguientes acciones.
//public void moverPrimerRegistro(){

//Método que realiza las siguiente acciones:
 //1.- Moverse al primer registro
//2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
//3.- obtener el valor del email de rs y guardarlo en la variable email
   
    


    

    
 


    

    
    
    
    
    
    

