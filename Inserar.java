
package proyecto2;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto2.conexion;
/**
 *
 * @author tatia
 */
public class Inserar extends javax.swing.JFrame {
DefaultTableModel modelo;
String[] titulos= {"Matricula", "Nombre" , "A.paterno" , "A.Marterno ", "Edad" , "Genero" , "Telefono" , "Direccion"};
String[] datos=new String[8];

   
    
    /**
     * Creates new form Inserar
     */
    public Inserar() {
        initComponents();
    }

    void CargarTabla(String valor) {
    String sSQL = "";
    modelo = new DefaultTableModel(null, titulos);
    conexion mysql = new conexion();
    Connection cn = mysql.conectar();
    sSQL = "SELECT * FROM alumno WHERE matricula LIKE '%" + valor + "%'";
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);
        while (rs.next()) {
            datos[0] = rs.getString("matricula");
            datos[1] = rs.getString("nombre");
            datos[2] = rs.getString("apellidop");
            datos[3] = rs.getString("apellidom");
            datos[4] = rs.getString("edad");
            datos[5] = rs.getString("genero");
            datos[6] = rs.getString("telefono");
            datos[7] = rs.getString("direccion");
            modelo.addRow(datos); 
        }
        tblalu.setModel((TableModel) modelo); 
        ((DefaultTableModel)tblalu.getModel()).fireTableDataChanged(); 
    } catch(SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);  
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtmat = new javax.swing.JTextField();
        txtapp = new javax.swing.JTextField();
        txtapm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxeda = new javax.swing.JComboBox<>();
        cbxgen = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblalu = new javax.swing.JTable();
        txttel = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRAR ALUMNO:");

        jLabel2.setText("MATRICULA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO PATERNO: ");

        jLabel5.setText("APELLIDO MATERNO:");

        jLabel6.setText("EDAD:");

        jLabel7.setText("GENERO:");

        jLabel8.setText("TELEFONO:");

        jLabel9.setText("DIRECCION:");

        cbxeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "15", "16", "17", "18", "19", "20", " ", " " }));

        cbxgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "HOMBRE", "MUJER" }));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        tblalu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tblalu);

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbxgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(cbxeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnactualizar)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btneliminar)
                                        .addComponent(btnguardar)))))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(txtapm, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtapp, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtnom)
                                    .addComponent(txtmat))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnactualizar)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(cbxgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminar))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnguardar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        conexion mysql= new conexion();
        Connection cn=mysql.conectar();
        String mat,nom,ap1,ap2,tel,dir,gen="";
        int eda=0;
        String sSQL="";
        mat=txtmat.getText();
        nom=txtnom.getText();
        ap1=txtapp.getText();
        ap2=txtapm.getText();
        tel=txttel.getText();
        dir=txtdir.getText();
        gen=cbxgen.getSelectedItem().toString();
        eda=Integer.parseInt(cbxeda.getSelectedItem().toString());
            sSQL="INSERT INTO alumno(matricula,nombre,apellidop,apellidom,edad,genero,telefono,direccion)"
            + "VALUES (?,?,?,?,?,?,?,?)";
            
            try { 
                PreparedStatement pst= cn.prepareStatement(sSQL);
                pst.setString(1, mat);
                pst.setString(2, nom);
                pst.setString(3, ap1);
                pst.setString(4, ap2);
                pst.setInt(5, eda);
                pst.setString(6, gen);
                pst.setString(7, tel);
                pst.setString(8, dir);
                int n=pst.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null, "El registro se ingreso","ingreso", JOptionPane.INFORMATION_MESSAGE);
                    CargarTabla(mat);
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error"+ex,"ingreso", JOptionPane.ERROR_MESSAGE); 
           }
            
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
   int filaSeleccionada = tblalu.getSelectedRow();

  
    if (filaSeleccionada >= 0) {
        // Obtener los nuevos datos de los campos de entrada
        String matricula = txtmat.getText();
        String nombre = txtnom.getText();
        String apellidoPaterno = txtapp.getText();
        String apellidoMaterno = txtapm.getText();
        String edadString = cbxeda.getSelectedItem().toString();
        String genero = cbxgen.getSelectedItem().toString();
        String telefono = txttel.getText();
        String direccion = txtdir.getText();

        if (edadString.equals("...")) {
            JOptionPane.showMessageDialog(null, "Seleccione una edad válida", "Actualizar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método
        }

        int edad = Integer.parseInt(edadString);


        conexion mysql = new conexion();
        Connection cn = mysql.conectar();
        String sSQL = "UPDATE alumno SET nombre=?, apellidop=?, apellidom=?, edad=?, genero=?, telefono=?, direccion=? WHERE matricula=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, nombre);
            pst.setString(2, apellidoPaterno);
            pst.setString(3, apellidoMaterno);
            pst.setInt(4, edad);
            pst.setString(5, genero);
            pst.setString(6, telefono);
            pst.setString(7, direccion);
            pst.setString(8, matricula);
            int resultado = pst.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                CargarTabla(""); // Actualizar la tabla después de la actualización
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro", "Actualizar", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + ex.getMessage(), "Actualizar", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar", "Actualizar", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = tblalu.getSelectedRow();


    if (filaSeleccionada >= 0) {
     
        String matricula = (String) tblalu.getValueAt(filaSeleccionada, 0);

        // Confirmar la eliminación
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
           
            conexion mysql = new conexion();
            Connection cn = mysql.conectar();
            String sSQL = "DELETE FROM alumno WHERE matricula=?";
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setString(1, matricula);
                int resultado = pst.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                    CargarTabla(""); // Actualizar la tabla después de la eliminación
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "Eliminar", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage(), "Eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btneliminarActionPerformed
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
        java.util.logging.Logger.getLogger(Inserar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Inserar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Inserar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Inserar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Inserar frame = new Inserar();
            frame.setVisible(true);
            frame.CargarTabla(""); // Llama al método CargarTabla en la instancia del frame
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbxeda;
    private javax.swing.JComboBox<String> cbxgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblalu;
    private javax.swing.JTextField txtapm;
    private javax.swing.JTextField txtapp;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtmat;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}