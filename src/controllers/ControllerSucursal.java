/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;//se llaman los metodos y clases del model

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelSucursal;
import views.ViewSucursal;


/**
 *
 * @author morenita
 */
public class ControllerSucursal {
    
    ModelSucursal modelSucursal;
    ViewSucursal viewSucursal;
    //public ControllerSucursal(ModelSucursal modelSucursal, ViewSucursal viewSucursal) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.}
    ActionListener actionListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == viewSucursal.jb_primero){//se verifica que boton se preciona en la interfaz
                jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewSucursal.jb_anterior){
                jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewSucursal.jb_siguiente){
                jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewSucursal.jb_ultimo){
                jbtn_ultimo_actionPerfomed();
            } else if (e.getSource()== viewSucursal.jb_guardar){
                jbtn_guardar();
            } else if (e.getSource() == viewSucursal.jb_modificar){
                jbtn_modificar();
                
                
                
            }
        }
    };
            

        private void jbtn_anterior_actionPerformed() {
            modelSucursal.moverAnteriorRegistro();
        viewSucursal.jtf_id_sucursal.setText(""+modelSucursal.getId_sucursales());
        viewSucursal.jtf_calle.setText(modelSucursal.getCalle());
        viewSucursal.jtf_colonia.setText(modelSucursal.getColonia());
        viewSucursal.jtf_numero_exterior.setText(""+modelSucursal.getNumero_exterior());
        viewSucursal.jtf_estado.setText(modelSucursal.getEstado());
        System.out.println("Action del boton jbtn_anterior");
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void jbtn_siguiente_actionPerformed() {
            modelSucursal.moverSiguienteRegistro();
        viewSucursal.jtf_id_sucursal.setText(""+modelSucursal.getId_sucursales());
        viewSucursal.jtf_calle.setText(modelSucursal.getCalle());
        viewSucursal.jtf_colonia.setText(modelSucursal.getColonia());
        viewSucursal.jtf_numero_exterior.setText(""+modelSucursal.getNumero_exterior());
        viewSucursal.jtf_estado.setText(modelSucursal.getEstado());
        System.out.println("Action del boton jbtn_siguiente");
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void jbtn_ultimo_actionPerfomed() {
            modelSucursal.moverUltimoRegistro();
        viewSucursal.jtf_id_sucursal.setText(""+modelSucursal.getId_sucursales());
        viewSucursal.jtf_calle.setText(modelSucursal.getCalle());
        viewSucursal.jtf_colonia.setText(modelSucursal.getColonia());
        viewSucursal.jtf_numero_exterior.setText(""+modelSucursal.getNumero_exterior());
        viewSucursal.jtf_estado.setText(modelSucursal.getEstado());
        System.out.println("Action del boton jbtn_ultimo");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void jbtn_guardar() {
            modelSucursal.setId_sucursales(Integer.parseInt(viewSucursal.jtf_id_sucursal.getText()));
        modelSucursal.setCalle(viewSucursal.jtf_calle.getText());
        modelSucursal.setColonia(viewSucursal.jtf_colonia.getText());
        modelSucursal.setNumero_exterior(Integer.parseInt(viewSucursal.jtf_numero_exterior.getText()));
        modelSucursal.setEstado(viewSucursal.jtf_estado.getText());
        modelSucursal.guardarRegistro();
        modelSucursal.conectarDB();
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void jbtn_modificar() {
            modelSucursal.setId_sucursales(Integer.parseInt(viewSucursal.jtf_id_sucursal.getText()));
        modelSucursal.setCalle(viewSucursal.jtf_calle.getText());
        modelSucursal.setColonia(viewSucursal.jtf_colonia.getText());
        modelSucursal.setNumero_exterior(Integer.parseInt(viewSucursal.jtf_numero_exterior.getText()));
        modelSucursal.setEstado(viewSucursal.jtf_estado.getText());
        modelSucursal.modificarRegistro();
        modelSucursal.conectarDB();
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
            
        

        private void jbtn_primero_actionPerformed() {
            modelSucursal.moverPrimerRegistro();
        viewSucursal.jtf_id_sucursal.setText(""+modelSucursal.getId_sucursales());
        viewSucursal.jtf_calle.setText(modelSucursal.getCalle());
        viewSucursal.jtf_colonia.setText(modelSucursal.getColonia());
        viewSucursal.jtf_numero_exterior.setText(""+modelSucursal.getNumero_exterior());
        viewSucursal.jtf_estado.setText(modelSucursal.getEstado());
        System.out.println("Action del boton jbtn_primero");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public ControllerSucursal(ModelSucursal modelSucursal,ViewSucursal viewSucursal) {
        
           this.viewSucursal = viewSucursal;
           this.modelSucursal = modelSucursal;
           initComponents();
           setActionListener();
            initDB();
           
           viewSucursal.setVisible(true);
    
    }

    private void initComponents() {
        //throw new UnsupportedOperationException("Not supported yet.");
        viewSucursal.setLocationRelativeTo(null);
        viewSucursal.setTitle("sucursales");
       viewSucursal.setVisible(true);
        
    }

    private void setActionListener() {
        viewSucursal.jb_primero.addActionListener(actionListener);
        viewSucursal.jb_anterior.addActionListener(actionListener);
        viewSucursal.jb_siguiente.addActionListener(actionListener);
        viewSucursal.jb_ultimo.addActionListener(actionListener);
        viewSucursal.jb_guardar.addActionListener(actionListener);
        viewSucursal.jb_modificar.addActionListener(actionListener);
        
        
    }

    private void initDB() {
        modelSucursal.conectarDB();
        viewSucursal.jtf_id_sucursal.setText(""+modelSucursal.getId_sucursales());
        viewSucursal.jtf_calle.setText(modelSucursal.getCalle());
        viewSucursal.jtf_colonia.setText(modelSucursal.getColonia());
        viewSucursal.jtf_numero_exterior.setText(""+modelSucursal.getNumero_exterior());
        viewSucursal.jtf_estado.setText(modelSucursal.getEstado());
        //viewSucursal.jtf_id_sucursal.setText(modelSucursal.getId_sucursales());
        
        //modelSucursal
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    };
    

    
            
}
