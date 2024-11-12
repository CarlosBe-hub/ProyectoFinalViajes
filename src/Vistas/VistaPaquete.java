/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.AlojamientoData;
import AccesoaDatos.CiudadData;
import AccesoaDatos.PaqueteData;
import AccesoaDatos.PasajeData;
import AccesoaDatos.TuristaData;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alojamiento;
import modelo.Paquete;
import modelo.Pasaje;
import modelo.Turista;

/**
 *
 * @author carlo
 */
public class VistaPaquete extends javax.swing.JInternalFrame {

    private CiudadData cd;
    private PaqueteData pd;
    private PasajeData ps;
    private AlojamientoData ad;
    private TuristaData td;

    private static final double PRECIO_AVION = 150000;
    private static final double PRECIO_COLECTIVO = 55000;
    private static final double PRECIO_TREN = 75000;

    /**
     * Creates new form Paquete
     */
    public VistaPaquete() {
        initComponents();
        cd = new CiudadData();
        ad = new AlojamientoData();
        ps = new PasajeData();
        pd = new PaqueteData();
        td = new TuristaData();

        cargarCombociudad();
        armarCabecera();
        cargarCombopaises();
        cargarComboprovincias();
        cargarComboTuristas();
        cargarImporteTransporte();
        jcbTurista1.setSelectedIndex(-1);
        jcbTurista2.setSelectedIndex(-1);
        jcbTurista3.setSelectedIndex(-1);
        jcbTurista4.setSelectedIndex(-1);
        DescuentoXMenores();
        CalculoParaImporteTotal();
        jTimporteTransporte.setEditable(false);
        ImporteTotalPaquete.setEditable(false);
        ImporteTotal.setEditable(false);
        jtAlojamiento.setEditable(false);

    }
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCprovincias = new javax.swing.JComboBox<>();
        jCtransporte = new javax.swing.JComboBox<>();
        jCciudades = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jCpaises = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtAlojamiento = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTimporteTransporte = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ImporteTotal = new javax.swing.JTextField();
        jBcargarimporte = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcbTurista2 = new javax.swing.JComboBox<>();
        jcbTurista1 = new javax.swing.JComboBox<>();
        jcbTurista3 = new javax.swing.JComboBox<>();
        jcbTurista4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ImporteTotalPaquete = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar Paquete");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 590, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Paises");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudades");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jCprovincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCprovinciasActionPerformed(evt);
            }
        });
        jPanel1.add(jCprovincias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 160, -1));

        jCtransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Avion", "Colectivo", "Tren" }));
        jCtransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtransporteActionPerformed(evt);
            }
        });
        jPanel1.add(jCtransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 160, -1));

        jCciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCciudadesActionPerformed(evt);
            }
        });
        jPanel1.add(jCciudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 160, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 172, 580, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 242, 580, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit icon.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, 150, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 650, 150));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Provincias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jCpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpaisesActionPerformed(evt);
            }
        });
        jPanel1.add(jCpaises, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 160, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Transporte");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));
        jPanel1.add(jtAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 160, -1));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon search.png"))); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 130, -1));

        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check icon.png"))); // NOI18N
        jBagregar.setText("AGREGAR");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 130, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Importe de Transporte");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, -1));
        jPanel1.add(jTimporteTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 160, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Importe total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 170, -1));
        jPanel1.add(ImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 160, -1));

        jBcargarimporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-aprobar-y-actualizar-48.png"))); // NOI18N
        jBcargarimporte.setText("Cargar");
        jBcargarimporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcargarimporteActionPerformed(evt);
            }
        });
        jPanel1.add(jBcargarimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Turista 1 ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Turista 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Turista 3");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Turista 4");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jPanel1.add(jcbTurista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 150, -1));

        jPanel1.add(jcbTurista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 150, -1));

        jPanel1.add(jcbTurista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 150, -1));

        jPanel1.add(jcbTurista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 150, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-worldwide-delivery-50.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 50));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Importe por persona");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 170, -1));
        jPanel1.add(ImporteTotalPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCpaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpaisesActionPerformed
//        jCprovincias.setEnabled(true);
//        
        cargarComboprovincias();
    }//GEN-LAST:event_jCpaisesActionPerformed

    private void jCciudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCciudadesActionPerformed
//        jCciudades.setEnabled(true);
//        
//        cargarCombociudad();
    }//GEN-LAST:event_jCciudadesActionPerformed

    private void jCprovinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCprovinciasActionPerformed
        jCciudades.setEnabled(true);

        cargarCombociudad();
    }//GEN-LAST:event_jCprovinciasActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        try {

            String paisSeleccionado = (String) jCpaises.getSelectedItem();
            String provinciaSeleccionada = (String) jCprovincias.getSelectedItem();
            String ciudadSeleccionada = (String) jCciudades.getSelectedItem();

            if (paisSeleccionado == null || provinciaSeleccionada == null || ciudadSeleccionada == null) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un país, una provincia y una ciudad válidos.");
                return;
            }

            Ciudad ciudad = cd.buscarCiudad(ciudadSeleccionada);
            if (ciudad == null) {
                JOptionPane.showMessageDialog(this, "Ciudad no encontrada.");
                return;
            }

            cargarTabla(ciudad.getId_ciudad());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage());
        }


    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
                                                
    try {
        // aca validamos que se selecciono un tipo de trasnportee
        String tipoTransporte = (String) jCtransporte.getSelectedItem();
        if ("---Seleccionar---".equals(tipoTransporte) || tipoTransporte == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de transporte valido.");
            return;
        }

        List<Turista> turistas = new ArrayList<>();

        if (jcbTurista1.getSelectedIndex() != -1) {
            turistas.add(td.buscarTuristaPorNombre(jcbTurista1.getSelectedItem().toString()));
        }
        if (jcbTurista2.getSelectedIndex() != -1) {
            turistas.add(td.buscarTuristaPorNombre(jcbTurista2.getSelectedItem().toString()));
        }
        if (jcbTurista3.getSelectedIndex() != -1) {
            turistas.add(td.buscarTuristaPorNombre(jcbTurista3.getSelectedItem().toString()));
        }
        if (jcbTurista4.getSelectedIndex() != -1) {
            turistas.add(td.buscarTuristaPorNombre(jcbTurista4.getSelectedItem().toString()));
        }

        // Validar que haya entre 1 y 4 turistas seleccionados
        int turistasSeleccionados = turistas.size();
        if (turistasSeleccionados < 1 || turistasSeleccionados > 4) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar entre 1 y 4 turistas.");
            return;
        }

        Ciudad ciudadOrigen = cd.buscarCiudad("San Luis");
        Ciudad ciudadDestino = cd.buscarCiudad(jCciudades.getSelectedItem().toString());

        if (ciudadOrigen == null || ciudadDestino == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione ciudades válidas.");
            return;
        }

        double importeTransporte = Double.parseDouble(jTimporteTransporte.getText());
        Pasaje pasaje = new Pasaje(tipoTransporte, importeTransporte, ciudadOrigen, ciudadDestino, true);
        pasaje = ps.guardarPasaje(pasaje);

        Alojamiento alojamiento = ad.buscarAlojamientoPorImporte(Double.parseDouble(jtAlojamiento.getText()));
        if (alojamiento == null) {
            JOptionPane.showMessageDialog(this, "Alojamiento no encontrado.");
            return;
        }

        double importePaquete = Double.parseDouble(ImporteTotal.getText());
        Paquete paquete = new Paquete();
        paquete.setNombrePaquete("Paquete Turistico");
        paquete.setCiudadOrigen(ciudadOrigen);
        paquete.setCiudadDestino(ciudadDestino);
        paquete.setAlojamiento(alojamiento);
        paquete.setPasaje(pasaje);
        paquete.setEstado(true);
        paquete.setImportePaquete(importePaquete);

        if (turistasSeleccionados > 0) {
            paquete.setId_turista1(turistas.get(0));
        }
        if (turistasSeleccionados > 1) {
            paquete.setId_turista2(turistas.get(1));
        }
        if (turistasSeleccionados > 2) {
            paquete.setId_turista3(turistas.get(2));
        }
        if (turistasSeleccionados > 3) {
            paquete.setId_turista4(turistas.get(3));
        }

        pd.AgregarPaquete(paquete);

        JOptionPane.showMessageDialog(this, "Paquete agregado exitosamente.");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Formato no valido: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrio un error: " + e.getMessage());
    }

    }//GEN-LAST:event_jBagregarActionPerformed

    private void jCtransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtransporteActionPerformed
        // TODO add your handling code here:
        cargarImporteTransporte();
        calcularImporteTotal();
    }//GEN-LAST:event_jCtransporteActionPerformed

    private void jBcargarimporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcargarimporteActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            double importe = (double) jTable1.getValueAt(filaSeleccionada, 5);

            jtAlojamiento.setText(String.valueOf(importe));
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para cargar el importe.");
        }
    }//GEN-LAST:event_jBcargarimporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImporteTotal;
    private javax.swing.JTextField ImporteTotalPaquete;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBcargarimporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCciudades;
    private javax.swing.JComboBox<String> jCpaises;
    private javax.swing.JComboBox<String> jCprovincias;
    private javax.swing.JComboBox<String> jCtransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTimporteTransporte;
    private javax.swing.JComboBox<String> jcbTurista1;
    private javax.swing.JComboBox<String> jcbTurista2;
    private javax.swing.JComboBox<String> jcbTurista3;
    private javax.swing.JComboBox<String> jcbTurista4;
    private javax.swing.JTextField jtAlojamiento;
    // End of variables declaration//GEN-END:variables

    public void cargarCombopaises() {
        jCpaises.removeAllItems();
        List<String> pais = cd.listarPaises();
        for (String pai : pais) {
            jCpaises.addItem(pai);

        }

    }

    public void cargarComboprovincias() {
        String pai = (String) jCpaises.getSelectedItem();

        jCprovincias.removeAllItems();
        jCciudades.removeAllItems();

        jCprovincias.addItem("Seleccione una provincia");
        jCciudades.addItem("Seleccione una ciudad");

        if (pai != null) {
            List<String> provincia = cd.listarProvinciasPorPaisC(pai);
            for (String Provincia : provincia) {
                jCprovincias.addItem(Provincia);
            }
        }
    }

    private void cargarCombociudad() {

        String pai = (String) jCpaises.getSelectedItem();
        String provincia = (String) jCprovincias.getSelectedItem();

        jCciudades.removeAllItems();
        jCciudades.addItem("Seleccione una ciudad");

        if (provincia != null && !provincia.equals("Seleccione una provincia")) {
            List<Ciudad> ciu = cd.listarPaisYProvincia(pai, provincia);
            for (Ciudad ciudad : ciu) {
                jCciudades.addItem(ciudad.getNombre());
            }
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo Paquete");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha fin");
        modelo.addColumn("Tipo alojamiento");
        modelo.addColumn("Servicio");
        modelo.addColumn("Importe diario");
        jTable1.setModel(modelo);

    }

    private void borrarfilas() {
        int filas = jTable1.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

    private void cargarTabla(int ciudadId) {
        AlojamientoData ad = new AlojamientoData();

        List<Alojamiento> alojamientos = ad.listarAlojamientosPorCiudad(ciudadId);

        System.out.println("Alojamientos encontrados: " + alojamientos.size());
        borrarfilas();
        for (Alojamiento alojamiento : alojamientos) {
            modelo.addRow(new Object[]{
                alojamiento.getId_alojamiento(),
                alojamiento.getFechaInicio(),
                alojamiento.getFechaFin(),
                alojamiento.getTipoAlojamiento(),
                alojamiento.getServicio(),
                alojamiento.getImporteDiario()
            });
        }
    }

    private void cargarImporteTransporte() {
        double precioTransporte;
        String tipoTransporte = (String) jCtransporte.getSelectedItem();

        switch (tipoTransporte) {
            case "Avion":
                precioTransporte = PRECIO_AVION;
                break;
            case "Colectivo":
                precioTransporte = PRECIO_COLECTIVO;
                break;
            case "Tren":
                precioTransporte = PRECIO_TREN;
                break;
            default:
                precioTransporte = 0;
                break;
        }

        jTimporteTransporte.setText(String.valueOf(precioTransporte));
    }

    private void calcularImporteTotal() {
    int precioTransporte;
    int importeAlojamiento = 0;

   
    String importe = jTimporteTransporte.getText().trim();
    if (importe.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el importe del transporte.");
        return;
    }

    
    try {
        precioTransporte = (int) Double.parseDouble(importe);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El importe del transporte no es un número válido.");
        return;
    }

    
    String alojamientoText = jtAlojamiento.getText().trim();
    if (!alojamientoText.isEmpty()) {
        try {
            importeAlojamiento = (int) Double.parseDouble(alojamientoText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El importe del alojamiento no es un número válido.");
            return;
        }
    }

   
    int importeTotal = precioTransporte + importeAlojamiento;
    ImporteTotalPaquete.setText(String.valueOf(importeTotal));

    
    String totalPaqueteTexto = ImporteTotalPaquete.getText().trim();
    if (totalPaqueteTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El importe total por persona está vacío.");
        return;
    }

    int importeTotalPaquete;
    try {
        importeTotalPaquete = Integer.parseInt(totalPaqueteTexto);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El importe total por persona no es un número válido.");
        return;
    }

    
    int cantidadTuristas = 0;
    if (jcbTurista1.getSelectedIndex() != -1) cantidadTuristas++;
    if (jcbTurista2.getSelectedIndex() != -1) cantidadTuristas++;
    if (jcbTurista3.getSelectedIndex() != -1) cantidadTuristas++;
    if (jcbTurista4.getSelectedIndex() != -1) cantidadTuristas++;

    
    int total = importeTotalPaquete * cantidadTuristas;
    ImporteTotal.setText(String.valueOf(total));
}

    

    private void cargarComboTuristas() {
        List<Turista> turistas = td.listarTuristas();
        for (Turista turista : turistas) {
            jcbTurista1.addItem(turista.getNombre());
            jcbTurista2.addItem(turista.getNombre());
            jcbTurista3.addItem(turista.getNombre());
            jcbTurista4.addItem(turista.getNombre());
        }
    }

    private void aplicarDescuentoPorMenores() {
        double importeTotal = Double.parseDouble(ImporteTotal.getText());
        int cantidadMenores = 0;

        
        if (jcbTurista1.getSelectedIndex() != -1) {
            Turista turista1 = td.buscarTuristaPorNombre(jcbTurista1.getSelectedItem().toString());
            if (turista1 != null && turista1.getEdad() <= 10) {
                cantidadMenores++;
            }
        }
        if (jcbTurista2.getSelectedIndex() != -1) {
            Turista turista2 = td.buscarTuristaPorNombre(jcbTurista2.getSelectedItem().toString());
            if (turista2 != null && turista2.getEdad() <= 10) {
                cantidadMenores++;
            }
        }
        if (jcbTurista3.getSelectedIndex() != -1) {
            Turista turista3 = td.buscarTuristaPorNombre(jcbTurista3.getSelectedItem().toString());
            if (turista3 != null && turista3.getEdad() <= 10) {
                cantidadMenores++;
            }
        }
        if (jcbTurista4.getSelectedIndex() != -1) {
            Turista turista4 = td.buscarTuristaPorNombre(jcbTurista4.getSelectedItem().toString());
            if (turista4 != null && turista4.getEdad() <= 10) {
                cantidadMenores++;
            }
        }

        
        if (cantidadMenores > 0) {
            double descuento = importeTotal * 0.5 * cantidadMenores;
            importeTotal -= descuento;
        }

        
        ImporteTotal.setText(String.valueOf(importeTotal));
    }

    private void DescuentoXMenores() {
        jcbTurista1.addActionListener(e -> aplicarDescuentoPorMenores());
        jcbTurista2.addActionListener(e -> aplicarDescuentoPorMenores());
        jcbTurista3.addActionListener(e -> aplicarDescuentoPorMenores());
        jcbTurista4.addActionListener(e -> aplicarDescuentoPorMenores());
    }

    private void CalculoParaImporteTotal() {
        jCtransporte.addActionListener(e -> calcularImporteTotal());
        jcbTurista1.addActionListener(e -> calcularImporteTotal());
        jcbTurista2.addActionListener(e -> calcularImporteTotal());
        jcbTurista3.addActionListener(e -> calcularImporteTotal());
        jcbTurista4.addActionListener(e -> calcularImporteTotal());
    }
}
