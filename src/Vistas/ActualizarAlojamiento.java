/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.AlojamientoData;
import AccesoaDatos.PaqueteData;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Alojamiento;

/**
 *
 * @author carlo
 */
public class ActualizarAlojamiento extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private PaqueteData pd;
    private AlojamientoData ad;

    /**
     * Creates new form Consultar
     */
    public ActualizarAlojamiento() {
        initComponents();
        armarCabezera();
        pd = new PaqueteData();
        ad = new AlojamientoData();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbCargarDatosTabla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcTAlojamiento = new javax.swing.JComboBox<>();
        jcServicio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfImporte = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jbEliminar = new javax.swing.JButton();
        jbActualizar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 147, -1));

        jbBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon search.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 20));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 118));

        jbCargarDatosTabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbCargarDatosTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check icon.png"))); // NOI18N
        jbCargarDatosTabla.setText("Cargar");
        jbCargarDatosTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarDatosTablaActionPerformed(evt);
            }
        });
        jPanel2.add(jbCargarDatosTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 352, 12));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Inicio");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Fin");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
        jPanel2.add(jtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 126, -1));
        jPanel2.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 126, -1));
        jPanel2.add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 126, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 352, 16));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Alojamiento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Servicio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jcTAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Hotel", "Hostel", "Cabaña", "Departamento" }));
        jcTAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTAlojamientoActionPerformed(evt);
            }
        });
        jPanel2.add(jcTAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 152, -1));

        jcServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Sin Pensión", "Desayuno", "Media Pensión", "Pensión Completa" }));
        jcServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcServicioActionPerformed(evt);
            }
        });
        jPanel2.add(jcServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 152, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Actualizar Alojamiento");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 352, 14));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Importe Diario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));
        jPanel2.add(jtfImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 158, -1));
        jPanel2.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 390, 10));

        jbEliminar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jbActualizar2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jbActualizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-aprobar-y-actualizar-64.png"))); // NOI18N
        jbActualizar2.setText("Actualizar");
        jbActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbActualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-edit-property-50.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            LocalDate fechaIngreso = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            List<Alojamiento> alojamientos = ad.listarAlojamientoPorFechas(fechaIngreso);
            borrarFilas();
            for (Alojamiento alojamiento : alojamientos) {
                String estadoTexto = alojamiento.isEstado() ? "Activo" : "Inactivo";
                modelo.addRow(new Object[]{
                    alojamiento.getId_alojamiento(),
                    alojamiento.getFechaInicio(),
                    alojamiento.getFechaFin(),
                    alojamiento.getServicio(),
                    alojamiento.getImporteDiario(),
                    alojamiento.getTipoAlojamiento(),
                    estadoTexto
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar alojamientos: " + e.getMessage());
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCargarDatosTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarDatosTablaActionPerformed

        int f = jTable1.getSelectedRow();

        if (f == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un alojamiento de la tabla.");
            return;
        }

        Integer id = (Integer) jTable1.getValueAt(f, 0);

        Alojamiento alojamiento = ad.buscarAlojamiento(id);

        if (alojamiento != null) {

            jtfID.setText(String.valueOf(alojamiento.getId_alojamiento()));
            fechaInicio.setDate(java.sql.Date.valueOf(alojamiento.getFechaInicio()));
            fechaFin.setDate(java.sql.Date.valueOf(alojamiento.getFechaFin()));

            String servicio = alojamiento.getServicio();
            if (servicio != null) {
                if(servicio.equalsIgnoreCase("---Seleccionar---")){
                    jcServicio.setSelectedIndex(0);
                }else if (servicio.equalsIgnoreCase("Sin Pensión")) {
                    jcServicio.setSelectedIndex(1);
                } else if (servicio.equalsIgnoreCase("Desayuno")) {
                    jcServicio.setSelectedIndex(2);
                } else if (servicio.equalsIgnoreCase("Media Pensión")) {
                    jcServicio.setSelectedIndex(3);
                } else if (servicio.equalsIgnoreCase("Pensión Completa")) {
                    jcServicio.setSelectedIndex(4);
                } else {

                    jcServicio.setSelectedIndex(-1);
                }
            }

            String tipoAlojamiento = alojamiento.getTipoAlojamiento();
            if (tipoAlojamiento != null) {
                if (tipoAlojamiento.equalsIgnoreCase("Hotel")) {
                    jcTAlojamiento.setSelectedIndex(0);
                } else if (tipoAlojamiento.equalsIgnoreCase("Hostel")) {
                    jcTAlojamiento.setSelectedIndex(1);
                } else if (tipoAlojamiento.equalsIgnoreCase("Cabaña")) {
                    jcTAlojamiento.setSelectedIndex(2);
                } else {
                    jcTAlojamiento.setSelectedIndex(3);
                }
            }

            jtfImporte.setText(String.valueOf(alojamiento.getImporteDiario()));
            jrbEstado.setSelected(alojamiento.isEstado());
        } else {
            JOptionPane.showMessageDialog(this, "Alojamiento no encontrado.");
        }
    }//GEN-LAST:event_jbCargarDatosTablaActionPerformed

    private void jcTAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTAlojamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTAlojamientoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAlojamiento = (int) modelo.getValueAt(filaSeleccionada, 0);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este Alojamiento?", "Confirme Por favor!", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                ad.eliminarAlojamiento(idAlojamiento);
                modelo.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "El Alojamiento se elimino con exito.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Alojamiento para eliminar.");

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizar2ActionPerformed
        if (jtfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.");
            return;
        }

        try {
            int id = Integer.parseInt(jtfID.getText());
            Alojamiento alojamiento = new Alojamiento();
            alojamiento.setId_alojamiento(id);

            if (fechaInicio.getDate() == null || fechaFin.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese fechas válidas.");
                return;
            }

            alojamiento.setFechaInicio(fechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alojamiento.setFechaFin(fechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alojamiento.setTipoAlojamiento((String) jcTAlojamiento.getSelectedItem());
            alojamiento.setServicio((String) jcServicio.getSelectedItem());

            String importeTexto = jtfImporte.getText();
            if (importeTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un importe válido.");
                return;
            }

            double importeDiario;
            try {
                importeDiario = Double.parseDouble(importeTexto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Formato de importe incorrecto. Ingrese un valor numérico.");
                return;
            }

            alojamiento.setImporteDiario(importeDiario);
            alojamiento.setEstado(jrbEstado.isSelected());

            ad.modificarAlojamientoPorId(id, alojamiento);

            int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada != -1) {
                modelo.setValueAt(alojamiento.getFechaInicio(), filaSeleccionada, 1);
                modelo.setValueAt(alojamiento.getFechaFin(), filaSeleccionada, 2);
                modelo.setValueAt(alojamiento.getServicio(), filaSeleccionada, 3);
                modelo.setValueAt(alojamiento.getImporteDiario(), filaSeleccionada, 4);
                modelo.setValueAt(alojamiento.getTipoAlojamiento(), filaSeleccionada, 5);
                modelo.setValueAt(alojamiento.isEstado() ? "Activo" : "Inactivo", filaSeleccionada, 6);
            }

            JOptionPane.showMessageDialog(this, "El alojamiento se actualizó correctamente.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de ID incorrecto.");
        }

    }//GEN-LAST:event_jbActualizar2ActionPerformed

    private void jcServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcServicioActionPerformed
        calcularImportePorServicio();
    }//GEN-LAST:event_jcServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbActualizar2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargarDatosTabla;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JComboBox<String> jcServicio;
    private javax.swing.JComboBox<String> jcTAlojamiento;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfImporte;
    // End of variables declaration//GEN-END:variables

    private void armarCabezera() {
        modelo.addColumn("ID Alojamiento");
        modelo.addColumn("Fecha de Inicio");
        modelo.addColumn("Fecha de Fin");
        modelo.addColumn("Servicio");
        modelo.addColumn("Importe Diario");
        modelo.addColumn("Tipo Alojamineto");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = jTable1.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    private void calcularImportePorServicio() {
        try {
            LocalDate fechaIngreso = fechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = fechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaSalida.isBefore(fechaIngreso)) {
                JOptionPane.showMessageDialog(this, "Fecha de salida incorrecta");
                return;
            }

            double importeBase = Double.parseDouble(jtfImporte.getText());
            double ajusteServicio = 1.0;
            String tipoServicio = jcServicio.getSelectedItem().toString();

            switch (tipoServicio) {
                case "Sin Pensión":
                    ajusteServicio = 1.0;
                    break;
                case "Desayuno":
                    ajusteServicio = 1.02;
                    break;
                case "Media Pensión":
                    ajusteServicio = 1.05;
                    break;
                case "Pensión Completa":
                    ajusteServicio = 1.10;
                    break;
                default:
                    ajusteServicio = 1.0;
                    break;
            }

            String temporada = ad.calculodeTemporada(fechaIngreso);
            double ajusteTemporada = 1.0;

            if ("temporada Alta".equals(temporada)) {
                ajusteTemporada = 1.30;
            } else if ("temporada Media".equals(temporada)) {
                ajusteTemporada = 1.15;
            }
            double importeTotal = importeBase * ajusteServicio * ajusteTemporada;

            jtfImporte.setText(String.format("%.2f", importeTotal));

        } catch (NumberFormatException e) {

        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Campos vacíos o formato incorrecto.");
        }
    }
}
