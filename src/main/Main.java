/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import modelo.modeloproveedor;
import vista.proveedores;
import controlador.controladorproveedor;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modeloproveedor modeproveedor = new modeloproveedor();
        proveedores vistaproveedor = new proveedores();
        controladorproveedor contraproveedor = new controladorproveedor(modeproveedor, vistaproveedor);
    }
    
}
