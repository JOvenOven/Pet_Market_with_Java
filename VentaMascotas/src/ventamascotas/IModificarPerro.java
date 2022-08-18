/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Owen
 */
public class IModificarPerro extends javax.swing.JFrame {

    private int indiceperro;
    private File ficheroPerros = new File("Perros.txt");
    private ArrayList<Perro> listaPerros;
    private Perro p;
    
    /**
     * Creates new form IModificarPerro
     */
    public IModificarPerro(){
        
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public IModificarPerro(int indice) {
        listaPerros=new ArrayList<Perro>();
        this.indiceperro=indice;
        System.out.println(indiceperro);
        
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        so=new SerializarObjetos();
        jTextFieldRaza = new javax.swing.JTextField();
        jTextFieldPromedioVida = new javax.swing.JTextField();
        jTextFieldTamaño = new javax.swing.JTextField();
        jTextFieldCuidados = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Raza: ");

        jLabel3.setText("Datos Perro");

        jLabel4.setText("Promedio de Vida: ");

        jLabel5.setText("Tamaño: ");

        jLabel6.setText("Cuidados Específicos: ");

        jLabel7.setText("Precio: ");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        listaPerros=so.deserializarArrayPerro(ficheroPerros);
        jTextFieldRaza.setText(listaPerros.get(indiceperro).getRaza()
        );

        jTextFieldPromedioVida.setText(listaPerros.get(indiceperro).getPromedioVida());
        jTextFieldPromedioVida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPromedioVidaKeyTyped(evt);
            }
        });

        jTextFieldTamaño.setText(listaPerros.get(indiceperro).getTamaño());

        String[] cuidados=listaPerros.get(indiceperro).getCuidados();
        String lcuidados="";
        for(int i=0;i< cuidados.length;i++){
            if(i==0){
                lcuidados=cuidados[i];
            }else{
                lcuidados=lcuidados.concat("," + cuidados[i]);
            }
        }
        jTextFieldCuidados.setText(lcuidados);

        String precio = Integer.toString(listaPerros.get(indiceperro).getPrecio());
        System.out.println(precio);
        jTextFieldPrecio.setText(precio);
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });

        jLabel8.setText("Separa cada cuidado con comas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRaza)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addComponent(jTextFieldTamaño)
                    .addComponent(jTextFieldPromedioVida)
                    .addComponent(jTextFieldCuidados, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPromedioVida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCuidados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Inventario i=new Inventario();
        i.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        Scanner s=null;
        p=new Perro();
        p.setRaza(jTextFieldRaza.getText());
        p.setPromedioVida(jTextFieldPromedioVida.getText());
        s=new Scanner(jTextFieldCuidados.getText());
        String linea=s.nextLine();
        String [] cortarlinea=linea.split(",");
        p.setCuidados(cortarlinea);
        p.setTamaño(jTextFieldTamaño.getText());
        String t=new String(jTextFieldPrecio.getText());
        int precio=Integer.parseInt(t);
        p.setPrecio(precio);
        so=new SerializarObjetos();
        listaPerros =so.deserializarArrayPerro(ficheroPerros);
        listaPerros.set(indiceperro, p);
        so.serializarArrayPerro(ficheroPerros, listaPerros);
        for(int i=0;i<listaPerros.size();i++){
           System.out.println(listaPerros.get(i).getRaza() + listaPerros.get(i).getPromedioVida() + listaPerros.get(i).getPrecio()+listaPerros.get(i).getCuidados()); 
        }
        this.dispose();
        Inventario i=new Inventario();
        i.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
        // TODO add your handling code here:
        char tecleada=evt.getKeyChar();//obtiene el caracter tecleado
        if((tecleada <'0' || tecleada>'9') && tecleada !=32 && tecleada !=8)
        {
            evt.consume(); //no permite consumar la escritura en caso de no cumplir con el if
            JOptionPane.showMessageDialog(null, "Por favor ingrese sólo números","Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void jTextFieldPromedioVidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPromedioVidaKeyTyped
        // TODO add your handling code here:
        char tecleada=evt.getKeyChar();//obtiene el caracter tecleado
        if((tecleada <'0' || tecleada>'9') && tecleada!='-' && tecleada !=32 && tecleada !=8)
        {
            evt.consume(); //no permite consumar la escritura en caso de no cumplir con el if
            JOptionPane.showMessageDialog(null, "Por favor ingrese sólo números y guiones","Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldPromedioVidaKeyTyped

    public int getIndiceperro() {
        return indiceperro;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IModificarPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IModificarPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IModificarPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IModificarPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IModificarPerro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCuidados;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldPromedioVida;
    private javax.swing.JTextField jTextFieldRaza;
    private SerializarObjetos so;
    private javax.swing.JTextField jTextFieldTamaño;
    // End of variables declaration//GEN-END:variables
}
