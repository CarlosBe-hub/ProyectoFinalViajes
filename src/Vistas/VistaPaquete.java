/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoaDatos.AlojamientoData;
import AccesoaDatos.CiudadData;
import AccesoaDatos.PaqueteData;
import AccesoaDatos.PasajeData;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelo.Alojamiento;
import modelo.Paquete;
import modelo.Pasaje;
/**
 *
 * @author carlo
 */
public class VistaPaquete extends javax.swing.JInternalFrame {

    private CiudadData cd;
//    private PasajeData pd;

    /**
     * Creates new form Paquete
     */
    public VistaPaquete() {
        initComponents();
        cd = new CiudadData();
//        pd = new PasajeData();
        
        cargarCombociudad();
        armarCabecera();
        cargarCombopaises();
        cargarComboprovincias();
//        cargarTabla();
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
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
        jTimporte = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jDfechadeinicio = new com.toedter.calendar.JDateChooser();

        jButton2.setText("jButton2");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar Paquete");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 590, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Inicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Paises");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudades");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jCprovincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCprovinciasActionPerformed(evt);
            }
        });
        jPanel1.add(jCprovincias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 160, -1));

        jCtransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Colectivo", "Tren" }));
        jPanel1.add(jCtransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 160, -1));

        jCciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCciudadesActionPerformed(evt);
            }
        });
        jPanel1.add(jCciudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 160, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 172, 580, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 242, 580, 0));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 130, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 560, 150));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Provincias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jCpaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpaisesActionPerformed(evt);
            }
        });
        jPanel1.add(jCpaises, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 160, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Transporte");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));
        jPanel1.add(jTimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 160, -1));

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        jBagregar.setText("AGREGAR");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 130, -1));
        jPanel1.add(jDfechadeinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        System.exit(0);
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
            CiudadData cd = new CiudadData();
            Ciudad c = cd.buscarCiudad(jCciudades.getSelectedItem().toString());
            cargarTabla(c.getId_ciudad(),jDfechadeinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        try {
            Ciudad ciudadOrigen = new Ciudad();
            Ciudad ciudadDestino = new Ciudad();
            ciudadOrigen = cd.buscarCiudad("San Luis");
            ciudadDestino = cd.buscarCiudad(jCciudades.getSelectedItem().toString());
            System.out.println(ciudadDestino.getId_ciudad()+"Importe"+ Double.parseDouble(jTimporte.getText()));
            
            // Cargamos un pasaje para el paquete
            Pasaje pasaje1 = new Pasaje(jCtransporte.getSelectedItem().toString(),Double.parseDouble(jTimporte.getText()),ciudadOrigen,true);
            PasajeData pd = new PasajeData();
            Pasaje pasaje2 = pd.guardarPasaje(pasaje1);
            
            //Obtenemos IdAlojamiento en la seleccion tabla
            Alojamiento alojamiento = new Alojamiento();
            AlojamientoData ad = new AlojamientoData();
            int fila = jTable1.getSelectedRow();
            Integer idAlojamiento = (Integer) jTable1.getValueAt(fila,0);
            alojamiento = ad.buscarAlojamiento(idAlojamiento);
            
         
            //Guardamos el paquete
            Paquete paquete = new Paquete("Paquete Viaje",ciudadOrigen,ciudadDestino,alojamiento,pasaje2,true);
            PaqueteData pdd = new PaqueteData();
            pdd.AgregarPaquete(paquete);
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato Invalido");
        }
    }//GEN-LAST:event_jBagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCciudades;
    private javax.swing.JComboBox<String> jCpaises;
    private javax.swing.JComboBox<String> jCprovincias;
    private javax.swing.JComboBox<String> jCtransporte;
    private com.toedter.calendar.JDateChooser jDfechadeinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTimporte;
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

    // Limpiamos el combo de provincias y de ciudades antes de cargar nuevos datos
    jCprovincias.removeAllItems();
    jCciudades.removeAllItems();

    // Agregamos opciones para que aparezcan de primera en los combos
    jCprovincias.addItem("Seleccione una provincia");
    jCciudades.addItem("Seleccione una ciudad");

    // Obtenemos las provincias del país seleccionado y las cargamos en el combo
    if (pai != null) {
        List<String> provincia = cd.listarProvinciasPorPaisC(pai);
        for (String Provincia : provincia) {
            jCprovincias.addItem(Provincia);
        }
    }
}

private void cargarCombociudad() {
    // Obtenemos el pais y la provincia seleccionada
    String pai = (String) jCpaises.getSelectedItem();
    String provincia = (String) jCprovincias.getSelectedItem();

    // Limpiamos el combo de ciudades antes de agregar nuevos datos para evitar que se dupliquen
    jCciudades.removeAllItems();
    jCciudades.addItem("Seleccione una ciudad");

    // Cargamos las ciudades solo si la provincia seleccionada no es nula o la opción predeterminada
    if (provincia != null && !provincia.equals("Seleccione una provincia")) {
        List<Ciudad> ciu = cd.listarPaisYProvincia(pai, provincia);
        for (Ciudad ciudad : ciu) {
            jCciudades.addItem(ciudad.getNombre());
        }
    }
}

    private void armarCabecera() {
        modelo.addColumn("id");
        modelo.addColumn("fecha de inicio");
        modelo.addColumn("fecha fin");
        modelo.addColumn("tipo alojamiento");
        modelo.addColumn("servicio");
        modelo.addColumn("importe diario");
        jTable1.setModel(modelo);

    }

    private void borrarfilas() {
        int filas = jTable1.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

   private  void cargarTabla (int ciudad, LocalDate fechainicio){
       AlojamientoData ad = new AlojamientoData();

       List<Alojamiento> al = ad.listarAlojamiento(ciudad, fechainicio);
       System.out.println("alojamiento encontrado :" +al.size());
       borrarfilas();
       for (Alojamiento alojamiento : al) {
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

           
           
           
           
             
    
   
}

          
