/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modeloproveedor;
import vista.proveedores;
/**
 *
 * @author LENOVO
 */
public class controladorproveedor {
    modeloproveedor modelAgenda;
    proveedores viewAgenda;
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jb_primero) {
                jb_primero_actionPerformed();
            } else if (e.getSource() == viewAgenda.jb_anterior) {
                jb_anterior_actionPerformed();
            } else if (e.getSource() == viewAgenda.jb_siguiente) {
                jb_siguiente_actionPerformed();
            
            } else if (e.getSource() == viewAgenda.jb_ultimo) {
                jb_ultimo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_nuevo) {
                jbtn_nuevo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_insertar) {
                jb_insertar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_modificar) {
                jbtn_modificar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jb_eliminar) {
                jb_eliminar_actionPerformed();
            }
        }

        private void jb_primero_actionPerformed() {
            modelAgenda.moverPrimerRegistro();
            viewAgenda.jtf_proveedor.setText(modelAgenda.getProeedores());
        viewAgenda.jtf_producto.setText(modelAgenda.getProducto());
        viewAgenda.jtf_ap_materno.setText(modelAgenda.getAp_materno());
        viewAgenda.jtf_ap_paterno.setText(modelAgenda.getAp_paterno());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        viewAgenda.jtf_correo.setText(modelAgenda.getCorreo());
        viewAgenda.jtf_calle.setText(modelAgenda.getCalle());
        viewAgenda.jtf_colonia.setText(modelAgenda.getColonia());
        viewAgenda.jtf_externo.setText(modelAgenda.getExterior());
        viewAgenda.jtf_estado.setText(modelAgenda.getEstado());
        System.out.println("Action del boton jbtn_primero");
        }

        private void jb_anterior_actionPerformed() {
           modelAgenda.moverAnteriorRegistro();
        viewAgenda.jtf_proveedor.setText(modelAgenda.getProeedores());
        viewAgenda.jtf_producto.setText(modelAgenda.getProducto());
        viewAgenda.jtf_ap_materno.setText(modelAgenda.getAp_materno());
        viewAgenda.jtf_ap_paterno.setText(modelAgenda.getAp_paterno());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        viewAgenda.jtf_correo.setText(modelAgenda.getCorreo());
        viewAgenda.jtf_calle.setText(modelAgenda.getCalle());
        viewAgenda.jtf_colonia.setText(modelAgenda.getColonia());
        viewAgenda.jtf_externo.setText(modelAgenda.getExterior());
        viewAgenda.jtf_estado.setText(modelAgenda.getEstado());
        System.out.println("Action del boton jbtn_anterior");
        }

        private void jb_siguiente_actionPerformed() {
            modelAgenda.moverUltimoRegistro();
         viewAgenda.jtf_proveedor.setText(modelAgenda.getProeedores());
        viewAgenda.jtf_producto.setText(modelAgenda.getProducto());
        viewAgenda.jtf_ap_materno.setText(modelAgenda.getAp_materno());
        viewAgenda.jtf_ap_paterno.setText(modelAgenda.getAp_paterno());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        viewAgenda.jtf_correo.setText(modelAgenda.getCorreo());
        viewAgenda.jtf_calle.setText(modelAgenda.getCalle());
        viewAgenda.jtf_colonia.setText(modelAgenda.getColonia());
        viewAgenda.jtf_externo.setText(modelAgenda.getExterior());
        viewAgenda.jtf_estado.setText(modelAgenda.getEstado());
        System.out.println("Action del boton jbtn_ultimo");
        }

        private void jb_ultimo_actionPerformed() {
             modelAgenda.moverSiguienteRegistro();
        viewAgenda.jtf_proveedor.setText(modelAgenda.getProeedores());
        viewAgenda.jtf_producto.setText(modelAgenda.getProducto());
        viewAgenda.jtf_ap_materno.setText(modelAgenda.getAp_materno());
        viewAgenda.jtf_ap_paterno.setText(modelAgenda.getAp_paterno());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        viewAgenda.jtf_correo.setText(modelAgenda.getCorreo());
        viewAgenda.jtf_calle.setText(modelAgenda.getCalle());
        viewAgenda.jtf_colonia.setText(modelAgenda.getColonia());
        viewAgenda.jtf_externo.setText(modelAgenda.getExterior());
        viewAgenda.jtf_estado.setText(modelAgenda.getEstado());
        System.out.println("Action del boton jbtn_siguiente");
        
        }

        private void jbtn_nuevo_actionPerformed() {
            viewAgenda.jtf_proveedor.setText("");
            viewAgenda.jtf_producto.setText("");
            viewAgenda.jtf_ap_materno.setText("");
            viewAgenda.jtf_ap_paterno.setText("");
            viewAgenda.jtf_telefono.setText("");
            viewAgenda.jtf_correo.setText("");
            viewAgenda.jtf_calle.setText("");
            viewAgenda.jtf_colonia.setText("");
            viewAgenda.jtf_externo.setText("");
            viewAgenda.jtf_estado.setText("");
        }

        private void jb_insertar_actionPerformed() {
            modelAgenda.setProeedores(viewAgenda.jtf_proveedor.getText());
            modelAgenda.setProducto(viewAgenda.jtf_producto.getText());
            modelAgenda.setAp_materno(viewAgenda.jtf_ap_materno.getText());
            modelAgenda.setAp_paterno(viewAgenda.jtf_ap_paterno.getText());
            modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());
            modelAgenda.setCorreo(viewAgenda.jtf_correo.getText());
            modelAgenda.setCalle(viewAgenda.jtf_calle.getText());
            modelAgenda.setColonia(viewAgenda.jtf_colonia.getText());
            modelAgenda.setExterior(viewAgenda.jtf_externo.getText());
            modelAgenda.setEstado(viewAgenda.jtf_estado.getText());
        modelAgenda.insertar();
        }

        private void jbtn_modificar_actionPerformed() {
            modelAgenda.setProeedores(viewAgenda.jtf_proveedor.getText());
            modelAgenda.setProducto(viewAgenda.jtf_producto.getText());
            modelAgenda.setAp_materno(viewAgenda.jtf_ap_materno.getText());
            modelAgenda.setAp_paterno(viewAgenda.jtf_ap_paterno.getText());
            modelAgenda.setTelefono(viewAgenda.jtf_telefono.getText());
            modelAgenda.setCorreo(viewAgenda.jtf_correo.getText());
            modelAgenda.setCalle(viewAgenda.jtf_calle.getText());
            modelAgenda.setColonia(viewAgenda.jtf_colonia.getText());
            modelAgenda.setExterior(viewAgenda.jtf_externo.getText());
            modelAgenda.setEstado(viewAgenda.jtf_estado.getText());
        modelAgenda.modificar();
        }

        private void jb_eliminar_actionPerformed() {
             modelAgenda.borrar();
        initDB();
        }
    };
    public controladorproveedor(modeloproveedor modelAgenda, proveedores viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
        setActionListener();
        initDB();
    }
     public void initDB(){
        modelAgenda.conectarDB();
        viewAgenda.jtf_proveedor.setText(modelAgenda.getProeedores());
        viewAgenda.jtf_producto.setText(modelAgenda.getProducto());
        viewAgenda.jtf_ap_materno.setText(modelAgenda.getAp_materno());
        viewAgenda.jtf_ap_paterno.setText(modelAgenda.getAp_paterno());
        viewAgenda.jtf_telefono.setText(modelAgenda.getTelefono());
        viewAgenda.jtf_correo.setText(modelAgenda.getCorreo());
        viewAgenda.jtf_calle.setText(modelAgenda.getCalle());
        viewAgenda.jtf_colonia.setText(modelAgenda.getColonia());
        viewAgenda.jtf_externo.setText(modelAgenda.getExterior());
        viewAgenda.jtf_estado.setText(modelAgenda.getEstado());
           
     }
     public void initComponents() {
        viewAgenda.setLocationRelativeTo(null);
        viewAgenda.setTitle("Ferreteria ACME");
        viewAgenda.setVisible(true);
    }
      public void setActionListener() {
        viewAgenda.jb_primero.addActionListener(actionListener);
        viewAgenda.jb_anterior.addActionListener(actionListener);
        viewAgenda.jb_siguiente.addActionListener(actionListener);
        viewAgenda.jb_ultimo.addActionListener(actionListener);
        viewAgenda.jb_nuevo.addActionListener(actionListener);
        viewAgenda.jb_insertar.addActionListener(actionListener);
        viewAgenda.jb_eliminar.addActionListener(actionListener);
        viewAgenda.jb_modificar.addActionListener(actionListener);
    
        }
}

