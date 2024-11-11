/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.TuristaData;
import modelo.Turista;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class VistaTurista extends javax.swing.JInternalFrame {

    private TuristaData td;

    /**
     * Creates new form VistaTurista
     */
    public VistaTurista() {
        initComponents();
        td = new TuristaData();

        jTnombre.setEnabled(false);
        jTedad.setEnabled(false);
        jRestado.setEnabled(false);
        jBagregar.setEnabled(false);
        jBeliminar.setEnabled(false);
        jbNuevo.setEnabled(false);
        jBeliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTedad = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Turista");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 430, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));
        jPanel1.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        jPanel1.add(jTedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 40, -1));

        jBagregar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check icon.png"))); // NOI18N
        jBagregar.setText("Guardar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 40));

        jBsalir.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit icon.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 40));

        jBeliminar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 40));

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });
        jPanel1.add(jRestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-user-30.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 80, -1));

        jbNuevo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed

        try {
            String nombre = jTnombre.getText();
            String dniText = jTdni.getText();
            String edadText = jTedad.getText();

            if (dniText.isEmpty() || nombre.isEmpty() || edadText.isEmpty()
                    || !nombre.matches("[a-zA-Z ]+")
                    || !dniText.matches("\\d+")
                    || !edadText.matches("\\d+")) {

                StringBuilder errorMessage = new StringBuilder("Por favor complete todos los campos correctamente:\n");

                if (nombre.isEmpty()) {
                    errorMessage.append("* El nombre no puede estar vacío.\n");
                } else if (!nombre.matches("[a-zA-Z ]+")) {
                    errorMessage.append("* El nombre solo puede contener letras y espacios.\n");
                }

                if (dniText.isEmpty()) {
                    errorMessage.append("* El DNI no puede estar vacío.\n");
                } else if (!dniText.matches("\\d+")) {
                    errorMessage.append("* El DNI debe contener solo números.\n");
                }

                if (edadText.isEmpty()) {
                    errorMessage.append("* La edad no puede estar vacía.\n");
                } else if (!edadText.matches("\\d+")) {
                    errorMessage.append("* La edad debe contener solo números.\n");
                }

                JOptionPane.showMessageDialog(this, errorMessage);
                return;
            }

            int dni = Integer.parseInt(dniText);
            int edad = Integer.parseInt(edadText);
            boolean estado = jRestado.isSelected();

            Turista turistaExistente = td.buscarTuristaPorDni(dni);

            if (turistaExistente != null) {

                td.actualizarTurista(dni, nombre, edad, estado);
                JOptionPane.showMessageDialog(this, "Turista actualizado exitosamente.");
            } else {

                Turista nuevoTurista = new Turista();
                nuevoTurista.setDni(dni);
                nuevoTurista.setNombre(nombre);
                nuevoTurista.setEdad(edad);
                nuevoTurista.setEstado(estado);

                td.agregarTurista(nuevoTurista);
            }

            jTdni.setText("");
            jTnombre.setText("");
            jTedad.setText("");
            jRestado.setSelected(false);
            jTnombre.setEnabled(false);
            jTedad.setEnabled(false);
            jRestado.setEnabled(false);
            jbNuevo.setEnabled(false);
            jBagregar.setEnabled(false);
            jBeliminar.setEnabled(false);

        } catch (NumberFormatException e) {
            
        }

    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
                                       
    try {
        if (jTdni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el DNI del turista que desea eliminar.");
            return;
        }

        int dni = Integer.parseInt(jTdni.getText());

        int confirm = JOptionPane.showInternalConfirmDialog(null, "¿Desea eliminar este turista?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            td.eliminarTuristaPorDni(dni);
            JOptionPane.showMessageDialog(this, "Turista eliminado exitosamente.");

            jTdni.setText("");
            jTnombre.setText("");
            jTedad.setText("");
        } else {

            JOptionPane.showMessageDialog(this, "Eliminación cancelada.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: Por favor ingrese un número válido para el DNI.");
    }
 

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed

    }//GEN-LAST:event_jRestadoActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        // TODO add your handling code here:                                        
        try {
            int dni = Integer.parseInt(jTdni.getText());
            Turista turistaEncontrado = td.buscarTuristaPorDni(dni);

            if (turistaEncontrado != null) {
                jTnombre.setText(turistaEncontrado.getNombre());
                jTedad.setText(String.valueOf(turistaEncontrado.getEdad()));
                jRestado.setSelected(turistaEncontrado.isEstado());

                jTnombre.setEnabled(true);
                jTedad.setEnabled(true);
                jRestado.setEnabled(true);
                jBsalir.setEnabled(false);
                jBagregar.setEnabled(true);
                jBeliminar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "DNI del turista no resgistrado");
                jbNuevo.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido para el DNI.");
        }

    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jTnombre.setEnabled(true);
        jTedad.setEnabled(true);
        jRestado.setEnabled(true);
        jbNuevo.setEnabled(false);
        jBagregar.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTedad;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbtBuscar;
    // End of variables declaration//GEN-END:variables
}
