/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import modelo.modelocompras;
import vista.compras;
import controlador.controladorcompras;
/**
 *
 * @author LENOVO
 */
public class Maincompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       modelocompras modecompras = new modelocompras();
        compras vistacompras = new compras();
        controladorcompras contracompra = new controladorcompras(modecompras, vistacompras);
    }
    
    
}
