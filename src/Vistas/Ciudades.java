/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.CiudadData;
import javax.swing.JOptionPane;
import modelo.Ciudad;

/**
 *
 * @author carlo
 */
public class Ciudades extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ciudades
     */
    public Ciudades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTciudad = new javax.swing.JTextField();
        jTprovincia = new javax.swing.JTextField();
        jTpais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jBsalir = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administraciones de Ciudad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 500, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ciudad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Provincia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pais:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel1.add(jTciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, -1));
        jPanel1.add(jTprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 250, -1));
        jPanel1.add(jTpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 250, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disponibilidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel1.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 70, -1));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 80, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 80, -1));

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 40));

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jTciudad.setText("");
        jTprovincia.setText("");
        jTpais.setText("");
        jrEstado.setSelected(false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
    if (!jTpais.getText().isEmpty() && !jTprovincia.getText().isEmpty() && !jTciudad.getText().isEmpty()) {
        CiudadData cd = new CiudadData();
        String pais = jTpais.getText();
        String provincia = jTprovincia.getText();
        String ciudad = jTciudad.getText();
        boolean estado = jrEstado.isSelected();

        
        if (cd.buscarCiudad(ciudad) != null) {
            JOptionPane.showMessageDialog(this, "La ciudad ya existe en la base de datos.");
        } else {
            
            Ciudad nuevaCiudad = new Ciudad(ciudad, pais, estado, provincia);
            cd.agregarCiudad(nuevaCiudad);
            JOptionPane.showMessageDialog(this, "Ciudad guardada exitosamente.");
            limpiarCampos();
        }
    } else {
        JOptionPane.showMessageDialog(this, "No deje campos vacios!");
    }

        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        String nombreCiudad = jTciudad.getText();
    CiudadData cd = new CiudadData();
    
    Ciudad ciudad = cd.buscarCiudad(nombreCiudad);
    if (ciudad != null) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar la ciudad seleccionada?", "Confirme Por favor!", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            cd.eliminarCiudadPorNombre(ciudad.getNombre());
            limpiarCampos();
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Busque la ciudad que desea eliminar!");
    }  

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
         CiudadData cd = new CiudadData();
    
    Ciudad ciudad = cd.buscarCiudad(jTciudad.getText());
    if (ciudad != null) {
 
        jTprovincia.setText(ciudad.getProvincia());
        jTpais.setText(ciudad.getPais());
        jrEstado.setSelected(ciudad.isEstado()); 
        
      
        jrEstado.setEnabled(true);
        
        
        jrEstado.addActionListener(e -> {
            ciudad.setEstado(jrEstado.isSelected()); 
            cd.actualizarEstadoCiudad(ciudad); 
        });
    } else {
        JOptionPane.showMessageDialog(this, "Ciudad No Encontrada!.");
    }


    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTciudad;
    private javax.swing.JTextField jTpais;
    private javax.swing.JTextField jTprovincia;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JRadioButton jrEstado;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){
    jTpais.setText(""); 
    jTprovincia.setText("");
    jTciudad.setText("");
    jrEstado.setSelected(false);
}
}
