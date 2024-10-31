/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.PasajeData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pasaje;

/**
 *
 * @author carlo
 */
public class PasajeVista extends javax.swing.JInternalFrame {

    private PasajeData pd;

    /**
     * Creates new form PasajeVista
     */
    public PasajeVista() {
        initComponents();
        pd = new PasajeData();
        armarCabecera();
        jTpasaje.setModel(modelo);
        llenarComboTransportes();
    }
    private DefaultTableModel modelo = new DefaultTableModel();

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
        jTciudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTpasaje = new javax.swing.JTable();
        jBcargar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBmodificar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTimporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTidpasaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCtransportes = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Pasaje");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 510, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tranporte:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jTciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTciudadKeyReleased(evt);
            }
        });
        jPanel1.add(jTciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 270, 30));

        jTpasaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTpasaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 170));

        jBcargar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBcargar.setText("Cargar");
        jBcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcargarActionPerformed(evt);
            }
        });
        jPanel1.add(jBcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jBsalir.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 60, -1));

        jBeliminar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jBmodificar1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jBmodificar1.setText("Modificar");
        jBmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 470, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Importe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 60, -1));
        jPanel1.add(jTimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 130, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Transporte");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 160, -1));
        jPanel1.add(jTidpasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número de pasaje");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 160, -1));

        jPanel1.add(jCtransportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcargarActionPerformed
       int filaSeleccionada = jTpasaje.getSelectedRow();
       
       if( filaSeleccionada == -1){
           JOptionPane.showMessageDialog(null, "Seleccione un pasaje de la tabla!");
           return;
       }
       
       Integer id = (Integer) jTpasaje.getValueAt(filaSeleccionada, 0);
       
       Pasaje pasaje = pd.buscarPasaje(id);
       
       if(pasaje != null){
           jTidpasaje.setText(String.valueOf(pasaje.getId_pasaje()));
           jTimporte.setText(String.valueOf(pasaje.getImporte()));
           
           String tipoTransporte = pasaje.getTipoTransporte();
           if (tipoTransporte != null) {
               
            if (tipoTransporte.equalsIgnoreCase("Avion")) {
                jCtransportes.setSelectedIndex(1);
            } else if (tipoTransporte.equalsIgnoreCase("Colectivo")) {
                jCtransportes.setSelectedIndex(2);
            } else if (tipoTransporte.equalsIgnoreCase("Tren")) {
                jCtransportes.setSelectedIndex(3);
            } else {
                jCtransportes.setSelectedIndex(0); 
            }
        } else {
            jCtransportes.setSelectedIndex(0); 
        }
    }

    }//GEN-LAST:event_jBcargarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        int filaSeleccionada = jTpasaje.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idPasaje = (int) modelo.getValueAt(filaSeleccionada, 0);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este pasaje?", "Confirme Por favor!", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                pd.eliminarPasaje(idPasaje);
                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "El Pasaje se elimino con exito.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un pasaje para eliminar.");
        }

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTciudadKeyReleased
        // TODO add your handling code here:
        String transporte = jTciudad.getText().trim();
        modelo.setRowCount(0);

        System.out.println("transporte: " + transporte);

        if (!transporte.isEmpty()) {
            List<Pasaje> pasajes = pd.buscarPasajePorTipoTransporte(transporte);

            if (!pasajes.isEmpty()) {
                for (Pasaje p : pasajes) {
                    Object[] fila = new Object[6];
                    fila[0] = p.getId_pasaje();
                    fila[1] = p.getCiudadOrigen().getNombre();
                    fila[2] = p.getCiudadDestino().getNombre();
                    fila[3] = p.getImporte();
                    fila[4] = p.getTipoTransporte();
                    fila[5] = p.isEstado();

                    modelo.addRow(fila);
                }
            } else {

            }
        } else {

            modelo.setRowCount(0);
        }

    }//GEN-LAST:event_jTciudadKeyReleased

    private void jBmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificar1ActionPerformed
      int filaSeleccionada = jTpasaje.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un pasaje para modificar.");
        return;
    }
    
    try {
        int idPasaje = Integer.parseInt(jTidpasaje.getText());
        double importe = Double.parseDouble(jTimporte.getText());
        String tipoTransporte = jCtransportes.getSelectedItem().toString();
        
        if (tipoTransporte.equals("---Seleccionar---")) {
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de transporte válido.");
            return;
        }
        
        // Crear el objeto Pasaje con los nuevos datos
        Pasaje pasaje = new Pasaje();
        pasaje.setId_pasaje(idPasaje);
        pasaje.setImporte(importe);
        pasaje.setTipoTransporte(tipoTransporte);
        
        // Actualizar en la base de datos
        if (pd.modificarPasaje(idPasaje, pasaje)) { 
            JOptionPane.showMessageDialog(null, "El pasaje se modificó con éxito.");
            
            // Actualizar los datos en la tabla
            modelo.setValueAt(importe, filaSeleccionada, 3);
            modelo.setValueAt(tipoTransporte, filaSeleccionada, 4);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el pasaje.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para el ID y el importe.");
    }

    }//GEN-LAST:event_jBmodificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcargar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCtransportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTciudad;
    private javax.swing.JTextField jTidpasaje;
    private javax.swing.JTextField jTimporte;
    private javax.swing.JTable jTpasaje;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("id");
        modelo.addColumn("Ciudad origen");
        modelo.addColumn("Ciudad Destino");
        modelo.addColumn("importe");
        modelo.addColumn("T.Transporte");
        modelo.addColumn("Estado");

    }
private void llenarComboTransportes() {
    jCtransportes.addItem("---Seleccionar---"); 
    jCtransportes.addItem("Avion");
    jCtransportes.addItem("Colectivo");
    jCtransportes.addItem("Tren");
}
}
