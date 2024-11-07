/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.AlojamientoData;
import AccesoaDatos.CiudadData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Alojamiento;
import modelo.Ciudad;

/**
 *
 * @author carlo
 */
public class VistaAlojamiento extends javax.swing.JInternalFrame {

    private CiudadData cd;
    private AlojamientoData ad;

    /**
     * Creates new form Alojamiento
     */
    public VistaAlojamiento() {
        initComponents();
        cd = new CiudadData();
        ad = new AlojamientoData();
        cargarComboPaises();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jcbProvincias = new javax.swing.JComboBox<>();
        jcbTipoAlojamiento = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jcbPais = new javax.swing.JComboBox<>();
        jcbServicio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbCiudades = new javax.swing.JComboBox<>();
        jtImporte = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jdIngreso = new com.toedter.calendar.JDateChooser();
        jdSalida = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Alojamiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 540, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paises");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Provincias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Alojamiento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudades:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Ingreso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 530, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad - Destino");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jPanel1.add(jcbProvincias, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 150, -1));

        jcbTipoAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Hostel", "Cabaña", "Departamento" }));
        jPanel1.add(jcbTipoAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 150, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit icon.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 110, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 540, 30));

        jcbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaisActionPerformed(evt);
            }
        });
        jPanel1.add(jcbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, -1));

        jcbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Media Pensión", "Pensión Completa" }));
        jcbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbServicioActionPerformed(evt);
            }
        });
        jPanel1.add(jcbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 230, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de Salida");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Importe Diario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jPanel1.add(jcbCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, -1));
        jPanel1.add(jtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 160, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 530, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 530, 10));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Servicio");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));
        jPanel1.add(jrbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon search.png"))); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jbNuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new archive.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 110, -1));

        jbGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check icon.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 110, -1));
        jPanel1.add(jdIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, -1));
        jPanel1.add(jdSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 140, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hotel-50.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

         try {
            LocalDate fechaIng = jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jrbActivo.isSelected();
            String tipoServicio = jcbServicio.getSelectedItem().toString();
            String importe = jtImporte.getText().replace(",", ".").trim();
            double importeDiario = Double.parseDouble(importe);
            String ciudadDestino = jcbCiudades.getSelectedItem().toString();
            Ciudad ciudad1 = cd.buscarCiudad(ciudadDestino);
            String tipoAlojamiento = jcbTipoAlojamiento.getSelectedItem().toString();

            if (fechaSalida.isAfter(fechaIng)) {
                ad.calculodeVacaciones(fechaIng, fechaSalida);
                Alojamiento alojamiento2 = new Alojamiento(fechaIng, fechaSalida, estado, tipoServicio, importeDiario, ciudad1, tipoAlojamiento);
                ad.guardarAlojamiento(alojamiento2);
            } else {
                JOptionPane.showMessageDialog(this, "Fecha de salida incorrecta");
            }

        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Campos vacios y/o Formato no valido");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el formato del importe diario");
        }
    }                                         

    private void calcularImportePorServicio() {
        try {
            LocalDate fechaIngreso = jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (fechaSalida.isBefore(fechaIngreso)) {
                JOptionPane.showMessageDialog(this, "Fecha de salida incorrecta");
                return;
            }

            double importeBase = Double.parseDouble(jtImporte.getText()); 
            double ajusteServicio = 1.0;
            String tipoServicio = jcbServicio.getSelectedItem().toString();

            // Ajuste por tipo de servicio
            switch (tipoServicio) {
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

            // Ajuste por temporada
            String temporada = ad.calculodeTemporada(fechaIngreso);
            double ajusteTemporada = 1.0;

            if ("temporada Alta".equals(temporada)) {
                ajusteTemporada = 1.30;
            } else if ("temporada Media".equals(temporada)) {
                ajusteTemporada = 1.15;
            } 

            double importeTotal = importeBase * ajusteServicio * ajusteTemporada;

            jtImporte.setText(String.format("%.2f", importeTotal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato del importe base");
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese las fechas de ingreso y salida");
        }
    

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaisActionPerformed

        cargarComboProvincias();
        jcbProvincias.setEnabled(true);
    }//GEN-LAST:event_jcbPaisActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            String provincia = jcbProvincias.getSelectedItem().toString();
            String pais = jcbPais.getSelectedItem().toString();

            cargarComboCiudades(pais, provincia);
            jcbCiudades.setEnabled(true);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Combos Vacios");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbServicioActionPerformed
        calcularImportePorServicio();
    }//GEN-LAST:event_jcbServicioActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:

        jcbCiudades.removeAllItems();
        jcbTipoAlojamiento.setSelectedIndex(0);
        jtImporte.setText("");
        jdIngreso.setDate(null);
        jdSalida.setDate(null);
        jrbActivo.setSelected(false);
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<String> jcbCiudades;
    private javax.swing.JComboBox<String> jcbPais;
    private javax.swing.JComboBox<Ciudad> jcbProvincias;
    private javax.swing.JComboBox<String> jcbServicio;
    private javax.swing.JComboBox<String> jcbTipoAlojamiento;
    private com.toedter.calendar.JDateChooser jdIngreso;
    private com.toedter.calendar.JDateChooser jdSalida;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JTextField jtImporte;
    // End of variables declaration//GEN-END:variables

    private void cargarComboPaises() {

        List<String> pais = cd.listarPaises();

        jcbCiudades.setEnabled(false);
        jcbCiudades.removeAllItems();

        for (String pai : pais) {

            jcbPais.addItem(pai);

        }

    }

    private void cargarComboProvincias() {
        String pai = (String) jcbPais.getSelectedItem();

        List<Ciudad> ciudad = cd.listarProvinciasPorPaisCombo(pai);

        jcbCiudades.setEnabled(false);
        jcbProvincias.removeAllItems();
        jcbCiudades.removeAllItems();

        for (Ciudad ciudad1 : ciudad) {
            jcbProvincias.addItem(ciudad1);
        }
    }

    private void cargarComboCiudades(String pai, String prov) {

        List<Ciudad> ciu = cd.listarPaisYProvincia(pai, prov);

        for (Ciudad ciudad : ciu) {
            String ciudadx = ciudad.getNombre();
            jcbCiudades.addItem(ciudadx);

        }

    }


}
