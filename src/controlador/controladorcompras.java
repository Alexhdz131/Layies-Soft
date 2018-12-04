/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelocompras;
import vista.compras;
/**
 *
 * @author LENOVO
 */
public class controladorcompras {
    modelocompras modelAgenda;
    compras viewAgenda;

    
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
            viewAgenda.jtf_id_compras.setText(modelAgenda.getCompras());
            viewAgenda.jtf_id_proveedores.setText(modelAgenda.getProveedores());
            viewAgenda.jtf_fecha_compra.setText(modelAgenda.getFeccha_compra());
            viewAgenda.jtf_imprte_total.setText(modelAgenda.getImporte_total());
            viewAgenda.jtf_id_empleado.setText(modelAgenda.getEmpleado());
        System.out.println("Action del boton jbtn_primero");
        }

        private void jb_anterior_actionPerformed() {
            modelAgenda.moverAnteriorRegistro();
        viewAgenda.jtf_id_compras.setText(modelAgenda.getCompras());
        viewAgenda.jtf_id_proveedores.setText(modelAgenda.getProveedores());
        viewAgenda.jtf_fecha_compra.setText(modelAgenda.getFeccha_compra());
        viewAgenda.jtf_imprte_total.setText(modelAgenda.getImporte_total());
        viewAgenda.jtf_id_empleado.setText(modelAgenda.getEmpleado());
        System.out.println("Action del boton jbtn_anterior");
        }

        private void jb_siguiente_actionPerformed() {
            modelAgenda.moverUltimoRegistro();
        viewAgenda.jtf_id_compras.setText(modelAgenda.getCompras());
        viewAgenda.jtf_id_proveedores.setText(modelAgenda.getProveedores());
        viewAgenda.jtf_fecha_compra.setText(modelAgenda.getFeccha_compra());
        viewAgenda.jtf_imprte_total.setText(modelAgenda.getImporte_total());
        viewAgenda.jtf_id_empleado.setText(modelAgenda.getEmpleado());
        System.out.println("Action del boton jbtn_ultimo");
        }

        private void jb_ultimo_actionPerformed() {
             modelAgenda.moverSiguienteRegistro();
        viewAgenda.jtf_id_compras.setText(modelAgenda.getCompras());
        viewAgenda.jtf_id_proveedores.setText(modelAgenda.getProveedores());
        viewAgenda.jtf_fecha_compra.setText(modelAgenda.getFeccha_compra());
        viewAgenda.jtf_imprte_total.setText(modelAgenda.getImporte_total());
        viewAgenda.jtf_id_empleado.setText(modelAgenda.getEmpleado());
        System.out.println("Action del boton jbtn_siguiente");
        }

        private void jbtn_nuevo_actionPerformed() {
            viewAgenda.jtf_id_compras.setText(""); 
            viewAgenda.jtf_id_proveedores.setText("");
            viewAgenda.jtf_fecha_compra.setText("");
            viewAgenda.jtf_imprte_total.setText("");
            viewAgenda.jtf_id_empleado.setText("");
        }

        private void jb_insertar_actionPerformed() {
            modelAgenda.setCompras(viewAgenda.jtf_id_compras.getText()); 
        modelAgenda.setProveedores(viewAgenda.jtf_id_proveedores.getText());
        modelAgenda.setFeccha_compra(viewAgenda.jtf_fecha_compra.getText());
        modelAgenda.setImporte_total(viewAgenda.jtf_imprte_total.getText());
        modelAgenda.setEmpleado(viewAgenda.jtf_id_empleado.getText());
        modelAgenda.insertar();
        }

        private void jbtn_modificar_actionPerformed() {
             modelAgenda.setCompras(viewAgenda.jtf_id_compras.getText()); 
        modelAgenda.setProveedores(viewAgenda.jtf_id_proveedores.getText());
        modelAgenda.setFeccha_compra(viewAgenda.jtf_fecha_compra.getText());
        modelAgenda.setImporte_total(viewAgenda.jtf_imprte_total.getText());
        modelAgenda.setEmpleado(viewAgenda.jtf_id_empleado.getText()); 
        modelAgenda.modificar();
        }
        
        private void jb_eliminar_actionPerformed() {
              modelAgenda.borrar();
        initDB();
        }
    };
    
    public controladorcompras(modelocompras modelAgenda, compras viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
        setActionListener();
        initDB();
    }
     public void initDB(){
        modelAgenda.conectarDB();
        viewAgenda.jtf_id_compras.setText(modelAgenda.getCompras());
        viewAgenda.jtf_id_proveedores.setText(modelAgenda.getProveedores());
        viewAgenda.jtf_fecha_compra.setText(modelAgenda.getFeccha_compra());
        viewAgenda.jtf_imprte_total.setText(modelAgenda.getImporte_total());
        viewAgenda.jtf_id_empleado.setText(modelAgenda.getEmpleado());
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
