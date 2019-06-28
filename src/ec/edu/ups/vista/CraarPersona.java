package ec.edu.ups.vista;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.controladorExepcion.ErrorNombreDosNomres;
import ec.edu.ups.controladorExepcion.ErrorEdad;
import ec.edu.ups.controladorExepcion.ErrorCedula;
import ec.edu.ups.controladorExepcion.ErrrorNombreLetras;
import ec.edu.ups.controladorExepcion.ErrorApellidoLetras;
import ec.edu.ups.controladorExepcion.ErrorApellidoDosApellidos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edison
 */
public class CraarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form CraarPersona
     */
    public CraarPersona() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Edad");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLCelular.setText("Celular");

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        jLFecha.setText("Fecha");

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        jLSalario.setText("Salario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCelular)
                            .addComponent(jLFecha)
                            .addComponent(jLSalario))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txtCelular)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(28, 28, 28)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String ruta = "Personas.ups";
        Persona persona = new Persona();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int c = 0;
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            System.out.println(archivo.length());

            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setCedula(txtCedula.getText());
            persona.setEdad(Integer.parseInt(txtEdad.getText()));

            if (txtCelular.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Ingrese los dies numeros del celular", "Error celular", JOptionPane.OK_OPTION);
            } else if (txtFecha.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Ingrese correctamente la fecha Ejm.(20/11/2000)", "Error fecha", JOptionPane.OK_OPTION);
            } else {
                archivo.seek(archivo.length());
                for (int i = txtNombre.getText().length() + 1; i <= 50; i++) {
                    nombre = nombre.substring(0) + " ";
                }
                archivo.seek(archivo.length());
                archivo.writeUTF(nombre);
                for (int i = txtApellido.getText().length() + 1; i <= 50; i++) {
                    apellido = apellido.substring(0) + " ";
                }
                archivo.writeUTF(apellido);
                archivo.writeUTF(txtCedula.getText());
                archivo.writeInt(Integer.parseInt(txtEdad.getText()));
                archivo.writeUTF(txtFecha.getText());
                archivo.writeUTF(txtCelular.getText());
                archivo.writeDouble(Double.parseDouble(txtSalario.getText()));
            }
            archivo.close();
            JOptionPane.showMessageDialog(this, "Persona Creada", "Crar Persona", JOptionPane.OK_OPTION);
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtCelular.setText("");
            txtEdad.setText("");
            txtFecha.setText("");
            txtSalario.setText("");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de escritura");
        } catch (ErrorApellidoDosApellidos e) {
            JOptionPane.showMessageDialog(this, "Ingrese dos apellidos", "Error apelldo", JOptionPane.OK_OPTION);
        } catch (ErrorApellidoLetras e) {
            JOptionPane.showMessageDialog(this, "apellidos", "Error apelldo", JOptionPane.OK_OPTION);
        } catch (ErrorCedula e) {
            JOptionPane.showMessageDialog(this, "CEDULA INCORRECTA", "Error Cedula", JOptionPane.OK_OPTION);
        } catch (ErrorEdad e) {
            JOptionPane.showMessageDialog(this, "Edad", "Error edad", JOptionPane.OK_OPTION);
        } catch (ErrorNombreDosNomres e) {
            JOptionPane.showMessageDialog(this, "Ingrese dos nombres", "Error nombre", JOptionPane.OK_OPTION);
        } catch (ErrrorNombreLetras e) {
            JOptionPane.showMessageDialog(this, "nombre", "Error nombre", JOptionPane.OK_OPTION);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (txtCedula.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (txtApellido.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        if (txtCelular.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        if (txtFecha.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
