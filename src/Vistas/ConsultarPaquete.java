/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudad;
import AccesoaDatos.CiudadData;
import AccesoaDatos.PaqueteData;
import modelo.Paquete;

/**
 *
 * @author dylan
 */
public class ConsultarPaquete extends javax.swing.JInternalFrame {

    private NonEditableTableModel modelo;
    /**
     * Creates new form ConsultarPaquete
     */
    public ConsultarPaquete() {
        initComponents();
        cargarComboPaises();
        modelo = new NonEditableTableModel();
        armarCabecera();
        jCprovincia.setEnabled(false);
        jCmes.setEnabled(false);
        jBbuscar.setEnabled(false);
        cargarMeses();
        //jScantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));

    }

    public enum Mes {
        JANUARY("Enero"),
        FEBRUARY("Febrero"),
        MARCH("Marzo"),
        APRIL("Abril"),
        MAY("Mayo"),
        JUNE("Junio"),
        JULY("Julio"),
        AUGUST("Agosto"),
        SEPTEMBER("Septiembre"),
        OCTOBER("Octubre"),
        NOVEMBER("Noviembre"),
        DECEMBER("Diciembre");

        private final String nombreEspañol;

        Mes(String nombreEspañol) {
            this.nombreEspañol = nombreEspañol;
        }

        public String getNombreEspañol() {
            return nombreEspañol;
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCpais = new javax.swing.JComboBox<>();
        jCprovincia = new javax.swing.JComboBox<>();
        jCmes = new javax.swing.JComboBox<>();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jBsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRestado = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultas de Paquetes");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione Pais de Destino");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione un Provincia");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione un Mes");

        jCpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpaisActionPerformed(evt);
            }
        });

        jCprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCprovinciaActionPerformed(evt);
            }
        });

        jCmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmesActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon search.png"))); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        jBsalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit icon.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar_paquete.png"))); // NOI18N

        jRestado.setText("Estado");
        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Files-Edit-File-icon.png"))); // NOI18N
        jButton1.setText("Modificar Estado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCmes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(56, 56, 56)
                                        .addComponent(jCpais, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(jRestado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jBbuscar))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel2)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jRestado))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCprovinciaActionPerformed
        jCmes.setEnabled(true);
    }//GEN-LAST:event_jCprovinciaActionPerformed

    private void jCpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpaisActionPerformed
        cargarComboProvincias();
        jCprovincia.setEnabled(true);
    }//GEN-LAST:event_jCpaisActionPerformed

    private void jCmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmesActionPerformed
        jBbuscar.setEnabled(true);
    }//GEN-LAST:event_jCmesActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        String pais = (String) jCpais.getSelectedItem();
        String provincia = (String) jCprovincia.getSelectedItem();
        String mes = (String) jCmes.getSelectedItem();

        CiudadData cData = new CiudadData();
        PaqueteData paqueteData = new PaqueteData();
        borrarFilas();

        List<Ciudad> ciudades = cData.listarPaisYProvincia(pais, provincia);

        for (Ciudad ciudad : ciudades) {
            int ciudadId = ciudad.getId_ciudad();
            List<Paquete> paquetes = paqueteData.listaPaquetesXciudad(ciudadId);

            for (Paquete paquete : paquetes) {
                String fechaIngreso = paquete.getAlojamiento().getFechaInicio().getMonth().toString();
                if (mes.equalsIgnoreCase(traducir(fechaIngreso))) {
                    double importeBase = paquete.getPasaje().getImporte() + paquete.getAlojamiento().getImporteDiario();
                    agregarPaqueteATabla(paquete, importeBase);
                }
            }
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        
    }//GEN-LAST:event_jRestadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCmes;
    private javax.swing.JComboBox<String> jCpais;
    private javax.swing.JComboBox<String> jCprovincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarComboPaises() {
        CiudadData cData = new CiudadData();
        List<String> paises = cData.listarPaises();
        for (String pais : paises) {
            jCpais.addItem(pais);
        }
    }

    private void cargarComboProvincias() {
        String selectedPais = (String) jCpais.getSelectedItem();
        CiudadData cData = new CiudadData();
        List<String> provincias = cData.listarProvinciasPorPaisC(selectedPais);
        jCprovincia.removeAllItems();
        for (String provincia : provincias) {
            jCprovincia.addItem(provincia);
        }
    }

    private void agregarPaqueteATabla(Paquete paquete, double importeBase) {
        PaqueteData paqueteData = new PaqueteData();
        List<String> turistas = paqueteData.listarTuristasPorPaquete(paquete.getId_paquete());
        String nombresTuristas = String.join(", ", turistas);
        int numeroTuristas = turistas.size();

        modelo.addRow(new Object[]{
            paquete.getCiudadDestino().getNombre(),
            paquete.getAlojamiento().getFechaInicio(),
            paquete.getAlojamiento().getFechaFin(),
            paquete.getPasaje().getTipoTransporte(),
            paquete.getAlojamiento().getTipoAlojamiento(),
            paquete.getAlojamiento().getServicio(),
            importeBase,
            importeBase,
            nombresTuristas,
            numeroTuristas
        });

    }

    private void armarCabecera() {
        modelo.addColumn("Ciudad");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        modelo.addColumn("Transporte");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Servicios");
        modelo.addColumn("Precio Total");
        modelo.addColumn("Importe Base");
        modelo.addColumn("Turistas");
        modelo.addColumn("Num.Turistas");
        jTabla.setModel(modelo);
        jTabla.getColumnModel().getColumn(7).setMinWidth(0);
        jTabla.getColumnModel().getColumn(7).setMaxWidth(0);

    }

    public String traducir(String fecha) {
        try {
            return Mes.valueOf(fecha.toUpperCase()).getNombreEspañol();
        } catch (IllegalArgumentException e) {
            return fecha;
        }
    }

    private void cargarMeses() {
        jCmes.addItem("Enero");
        jCmes.addItem("Febrero");
        jCmes.addItem("Marzo");
        jCmes.addItem("Abril");
        jCmes.addItem("Mayo");
        jCmes.addItem("Junio");
        jCmes.addItem("Julio");
        jCmes.addItem("Agosto");
        jCmes.addItem("Septiembre");
        jCmes.addItem("Octubre");
        jCmes.addItem("Noviembre");
        jCmes.addItem("Diciembre");
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    class NonEditableTableModel extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }

}
