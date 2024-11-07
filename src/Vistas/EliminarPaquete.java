/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.CiudadData;
import AccesoaDatos.PaqueteData;
import AccesoaDatos.PasajeData;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import modelo.Paquete;

/**
 *
 * @author dylan
 */
public class EliminarPaquete extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo1 = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();

    CiudadData cd = new CiudadData();
    PaqueteData pqd = new PaqueteData();
    PasajeData psd = new PasajeData();

    /**
     * Creates new form EliminarPaquete
     */
    public EliminarPaquete() {
        initComponents();
        tablaCiudad();
        tablaPaquete();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtCiudades = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPaquete = new javax.swing.JTable();
        jbBorrarPaquete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Borrar Paquetes");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una Ciudad");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-aprobar-y-actualizar-64.png"))); // NOI18N
        jButton1.setText("Cargar Paquete Elejido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtCiudades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCiudadesKeyReleased(evt);
            }
        });

        jtPaquete.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtPaquete);

        jbBorrarPaquete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jbBorrarPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cross-mark-48.png"))); // NOI18N
        jbBorrarPaquete.setText("Borrar Paquete");
        jbBorrarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarPaqueteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_paquete.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jbBorrarPaquete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBorrarPaquete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCiudadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCiudadesKeyReleased

    borrarFilas();
    
    List<Ciudad> listasCiudad = cd.listarCiudades();
    
    String encuentra = jtCiudades.getText().toLowerCase();
    

    if (!encuentra.isEmpty()) {
        for (Ciudad ciudad : listasCiudad) {
            if (ciudad.getNombre().toLowerCase().contains(encuentra)) {
                modelo1.addRow(new Object[]{
                    ciudad.getId_ciudad(),
                    ciudad.getNombre(),
                    ciudad.getProvincia(),
                    ciudad.getPais()
                });
            }
        }
    }
    }//GEN-LAST:event_jtCiudadesKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            int fila = jTable1.getSelectedRow();
            Integer idCiudad = (Integer) jTable1.getValueAt(fila, 0);
            List<Paquete> lista = pqd.listaPaquetesXciudad(idCiudad);
            borrarFilas();
            for (Paquete paquete : lista) {
                modelo2.addRow(new Object[]{
                paquete.getId_paquete(),
                    paquete.getPasaje().getId_pasaje(),
                    paquete.getAlojamiento().getCiudadDestino(),
                    paquete.getAlojamiento().getFechaInicio()
                });
                
            }
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBorrarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarPaqueteActionPerformed

    try {
        int fila = jtPaquete.getSelectedRow();
        if (fila >= 0) {
            Integer idPaquete = (Integer) jtPaquete.getValueAt(fila, 0);
            Integer idPasaje = (Integer) jtPaquete.getValueAt(fila, 1);
            System.out.println(idPasaje);
            

            pqd.EliminarPaquete(idPaquete);
            psd.eliminarPasaje(idPasaje);
            
            borrarPaquete();
            
            int filaCiudad = jTable1.getSelectedRow();
            if (filaCiudad >= 0) {
                Integer idCiudad = (Integer) jTable1.getValueAt(filaCiudad, 0);
                List<Paquete> lista = pqd.listaPaquetesXciudad(idCiudad);
                for (Paquete paquete : lista) {
                    modelo2.addRow(new Object[]{
                        paquete.getId_paquete(),
                        paquete.getPasaje().getId_pasaje(),
                        paquete.getAlojamiento().getCiudadDestino(),
                        paquete.getAlojamiento().getFechaInicio()
                    });
                }
            }
        } else {
            System.out.println("No se ha seleccionado ningún paquete para borrar.");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
    }

    }//GEN-LAST:event_jbBorrarPaqueteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBorrarPaquete;
    private javax.swing.JTextField jtCiudades;
    private javax.swing.JTable jtPaquete;
    // End of variables declaration//GEN-END:variables

    private void tablaCiudad() {
        modelo1.addColumn("Id");
        modelo1.addColumn("Ciudad");
        modelo1.addColumn("Provincia");
        modelo1.addColumn("Pais");
        jTable1.setModel(modelo1);
    }

    private void tablaPaquete() {
        modelo2.addColumn("IdPaquete");
        modelo2.addColumn("IdPasaje");
        modelo2.addColumn("Ciudad Destino");
        modelo2.addColumn("Fecha de Inicio");
        jtPaquete.setModel(modelo2);
    }

    private void borrarFilas() {

        int f = jTable1.getRowCount() - 1;

        for (int i = f; i >= 0; i--) {
            modelo1.removeRow(i);
        }
    }
    
    private void borrarPaquete(){
        int f = jtPaquete.getRowCount() - 1;

        for (int i = f; i >= 0; i--) {
            modelo2.removeRow(i);
        }
        
    }
    
    
}
