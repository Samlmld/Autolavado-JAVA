/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Samlml
 */
public class JFAutoLavado extends javax.swing.JFrame {

    /**
     * Creates new form JFAutoLavado
     */
    public JFAutoLavado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngLavados = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlacas = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        ckbAspirado = new javax.swing.JCheckBox();
        ckbLavadoMotor = new javax.swing.JCheckBox();
        ckbLavadoDeInterior = new javax.swing.JCheckBox();
        RbLavado = new javax.swing.JRadioButton();
        RbLavadoYEncerado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarros = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnConsultarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("AutoLavado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(221, 26, 74, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 78, 54, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 121, 41, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 168, 48, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Placas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 207, 42, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 252, 35, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(134, 77, 80, 21);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtMarca);
        txtMarca.setBounds(134, 120, 80, 21);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtModelo);
        txtModelo.setBounds(134, 167, 80, 21);

        txtPlacas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtPlacas);
        txtPlacas.setBounds(134, 206, 80, 21);

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lbTotal);
        lbTotal.setBounds(134, 252, 80, 30);

        ckbAspirado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbAspirado.setText("Aspirado $50");
        getContentPane().add(ckbAspirado);
        ckbAspirado.setBounds(289, 167, 105, 25);

        ckbLavadoMotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbLavadoMotor.setText("Lavado de Motor $200");
        getContentPane().add(ckbLavadoMotor);
        ckbLavadoMotor.setBounds(289, 210, 165, 25);

        ckbLavadoDeInterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ckbLavadoDeInterior.setText("Lavado de interior $100");
        getContentPane().add(ckbLavadoDeInterior);
        ckbLavadoDeInterior.setBounds(289, 253, 171, 25);

        btngLavados.add(RbLavado);
        RbLavado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbLavado.setSelected(true);
        RbLavado.setText("Lavado $50");
        getContentPane().add(RbLavado);
        RbLavado.setBounds(289, 74, 99, 25);

        btngLavados.add(RbLavadoYEncerado);
        RbLavadoYEncerado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbLavadoYEncerado.setText("Lavado y Encerado $80");
        RbLavadoYEncerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbLavadoYEnceradoActionPerformed(evt);
            }
        });
        getContentPane().add(RbLavadoYEncerado);
        RbLavadoYEncerado.setBounds(289, 117, 173, 25);

        jtCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "MARCA", "MODELO", "PLACAS", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jtCarros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 380, 460, 100);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(170, 320, 100, 25);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(280, 320, 90, 30);

        btnConsultarTodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultarTodo.setText("Consultar Todo");
        getContentPane().add(btnConsultarTodo);
        btnConsultarTodo.setBounds(380, 320, 130, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbLavadoYEnceradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbLavadoYEnceradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbLavadoYEnceradoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFAutoLavado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAutoLavado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAutoLavado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAutoLavado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAutoLavado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton RbLavado;
    public javax.swing.JRadioButton RbLavadoYEncerado;
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnConsultarTodo;
    public javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btngLavados;
    public javax.swing.JCheckBox ckbAspirado;
    public javax.swing.JCheckBox ckbLavadoDeInterior;
    public javax.swing.JCheckBox ckbLavadoMotor;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtCarros;
    public javax.swing.JLabel lbTotal;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables
}
