/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AutoLavadoModDao;
import Vista.JFAutoLavado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samlml
 */
public class ControlAutolavado implements ActionListener {
    private JFAutoLavado jfauto;
    private AutoLavadoModDao autoDAO;
    double total;
    
    public ControlAutolavado (JFAutoLavado jfauto,AutoLavadoModDao autoDAO ){
        this.autoDAO=autoDAO;
        this.jfauto=jfauto;
        
        this.jfauto.btnCalcular.addActionListener(this);
         this.jfauto.btnConsultarTodo.addActionListener(this);
          this.jfauto.btnGuardar.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent ae) {
    //To change body of generated methods, choose Tools | Templates.
        if (ae.getSource()==jfauto.btnCalcular) {
            double total=0;
            
            if (jfauto.RbLavado.isSelected()) {
                total+=50;
            }else if (jfauto.RbLavadoYEncerado.isSelected()) {
                total+=80;
            }
            if (jfauto.ckbLavadoMotor.isSelected()) {
                total+=200;
            }
            if (jfauto.ckbAspirado.isSelected()) {
                total+=50;
            }if (jfauto.ckbLavadoDeInterior.isSelected()) {
                total+=100;
            }
            
            jfauto.lbTotal.setText("$" + total);
            
            
            
        }
        if (ae.getSource()==jfauto.btnGuardar) {
            autoDAO.agregar_carro(jfauto.txtNombre.getText(), jfauto.txtMarca.getText(), jfauto.txtModelo.getText(), jfauto.txtPlacas.getText(),Double.parseDouble(jfauto.lbTotal.getText().replace("$", "")));
        }
        if (ae.getSource()==jfauto.btnConsultarTodo) {
            DefaultTableModel TablaModelol=new DefaultTableModel();
            
            jfauto.jtCarros.setModel(TablaModelol);
            
            TablaModelol.addColumn("NOMBRE");
            TablaModelol.addColumn("MARCA");
            TablaModelol.addColumn("MODELO");
            TablaModelol.addColumn("PLACAS");
            TablaModelol.addColumn("TOTAL");
            
            if (autoDAO.mostrar_carros().size()>0) {
                Object[] columna = new Object[5];
                
                for (int i = 0; i < autoDAO.mostrar_carros().size(); i++) {
                    columna[0]=autoDAO.mostrar_carros().get(i).getNombre();
                    columna[1]=autoDAO.mostrar_carros().get(i).getMarca();
                    columna[2]=autoDAO.mostrar_carros().get(i).getModelo();
                    columna[3]=autoDAO.mostrar_carros().get(i).getPlacas();
                    columna[4]=autoDAO.mostrar_carros().get(i).getTotal();
                            
                   TablaModelol.addRow(columna);
                }
                
            }
            
        }
    }
    
    
    
}
