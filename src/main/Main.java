/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.ControllerSucursal;
import models.ModelSucursal;
import views.ViewSucursal;

/**
 *importas modelos controles vistas para que se ejecute
 * @author Salvador Hernández Mendoza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelSucursal modelSucursal = new ModelSucursal();
        ViewSucursal viewSucursal = new ViewSucursal();
        ControllerSucursal controllerSucursal = new ControllerSucursal(modelSucursal, viewSucursal);
        // TODO code application logic here
    }
    
}
