
import java.awt.Component;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alfonso
 */
public class InterfazBanco extends javax.swing.JFrame {
    public static ColaCajas colaCorreo;
    public static ColaCajas colaCaja;
    public static ColaPrioridad cola;
    public static ColaPrioridad colaC;
    static int cantidadCajeros;
    private Component frame;
    private static Component frame2;
    String [] BancoImagen;
    ImageIcon imagen;
    JLabel etiquetaFondo;
    /**
     * Creates new form InterfazBanco
     */
    
    /**
     * 
     * @param cajeros la cantidad de cajeros disponibles
     */
    public InterfazBanco(int cajeros) {
        frame2=frame;
        cantidadCajeros=cajeros;
        cola=new ColaPrioridad(15);
        colaC=new ColaPrioridad(15);
        colaCaja=new ColaCajas(cantidadCajeros);
        colaCorreo=new ColaCajas(cantidadCajeros);
        initComponents();
        this.setResizable(false);
        setDefaultCloseOperation(0);
        setTitle("Banco");
    }
    /**
     * Agrega los clientes en orden de prioridad
     * @param nombre nombre del cliente
     * @param tipo  tipo de cliente
     * @param correo correo del cliente
     */
    public static void manejarCola(String nombre, String tipo, String correo){
        int valor;
        int estadoCorreo;
        if(tipo.equals("Discapacidad")){
            valor=cola.agregarDiscapacidad(nombre);
            estadoCorreo=colaC.agregarDiscapacidad(correo);
            if (valor==0){
                JOptionPane.showMessageDialog(frame2,"No hay clientes en la cola"); 
            }
        }
        else if(tipo.equals("Adulto Mayor")){
            valor=cola.agregarMayor(nombre);
            estadoCorreo=colaC.agregarMayor(correo);
            if (valor==0){
                JOptionPane.showMessageDialog(frame2,"No hay clientes en la cola"); 
            }
        }
        else if(tipo.equals("Mujer embarazada")){
            valor=cola.agregarEmbarazada(nombre);
            estadoCorreo=colaC.agregarEmbarazada(correo);
            if (valor==0){
                JOptionPane.showMessageDialog(frame2,"No hay clientes en la cola"); 
            }
        }
        else if(tipo.equals("Cliente corporativo")){
            valor=cola.agregarCorporativo(nombre);
            estadoCorreo=colaC.agregarCorporativo(correo);
            if (valor==0){
                JOptionPane.showMessageDialog(frame2,"No hay clientes en la cola"); 
            }
        }
        else{
            valor=cola.agregarRegular(nombre);
            estadoCorreo=colaC.agregarRegular(correo);
            if (valor==0){
                JOptionPane.showMessageDialog(frame2,"No hay clientes en la cola"); 
            }
        }
        manejoClientes();
    }
    
    /**
     * Para pasar a los clientes a las cajas
     */
    public static void manejoClientes(){
        int valor;
        String nombreCliente;
        if (colaCaja.getSize()>=cantidadCajeros){
            JOptionPane.showMessageDialog(frame2,"No hay cajas disponibles, proceda ha sacar clientes");
        }
        else{
            if(!(nombreCliente=cola.sacarDiscapacidad()).equals("0")){
                valor=colaCaja.agregarCliente(nombreCliente);
                colaCorreo.agregarCliente(colaC.sacarDiscapacidad());
                //AQUI SE PONE LO DE MANDAR EL CORREO colaCorreo.sacarCliente(); para obtener el correo
                }
            else if(!(nombreCliente=cola.sacarMayor()).equals("0")){
                valor=colaCaja.agregarCliente(nombreCliente);
                colaCorreo.agregarCliente(colaC.sacarMayor());
                //AQUI SE PONE LO DE MANDAR EL CORREO colaCorreo.sacarCliente(); para obtener el correo
            }
            else if(!(nombreCliente=cola.sacarEmbarazada()).equals("0")){
                valor=colaCaja.agregarCliente(nombreCliente);
                colaCorreo.agregarCliente(colaC.sacarEmbarazada());
                //AQUI SE PONE LO DE MANDAR EL CORREO colaCorreo.sacarCliente(); para obtener el correo
            }
            else if(!(nombreCliente=cola.sacarCorporativo()).equals("0")){
                valor=colaCaja.agregarCliente(nombreCliente);
                colaCorreo.agregarCliente(colaC.sacarCorporativo());
                //AQUI SE PONE LO DE MANDAR EL CORREO colaCorreo.sacarCliente(); para obtener el correo
            }
            else if(!(nombreCliente=cola.sacarRegular()).equals("0")){
                valor=colaCaja.agregarCliente(nombreCliente);
                colaCorreo.agregarCliente(colaC.sacarRegular());
                //AQUI SE PONE LO DE MANDAR EL CORREO colaCorreo.sacarCliente(); para obtener el correo
                }
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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Desocupar Caja");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        String cajasString= Integer.toString(cantidadCajeros);
        jTextField1.setText("Cajas disponibles: "+cajasString);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton5.setText("Solicitar tiquete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 2, 24)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(162, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String cliente=colaCaja.sacarCliente();
        if(!cliente.equals("0")){
            JOptionPane.showMessageDialog(frame,"El cliente: "+cliente+"  fue atendido exitosamente y procedera a salir del banco");
            manejoClientes();
        }
        else{
            JOptionPane.showMessageDialog(frame,"No hay clientes en la cola");  
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String cajasString= Integer.toString(cantidadCajeros);
        jTextField1.setText("Cajas disponibles: "+cajasString); 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Interfaz_Ingreso_informacion_usuario Informacion = new Interfaz_Ingreso_informacion_usuario();
        Informacion.main();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Interfaz_Ingreso_informacion_usuario.DevolverContador()!=0){
        Interfaz_Tabla Tabla = new Interfaz_Tabla();
        Tabla.main();}
        else{
            JOptionPane.showMessageDialog(frame,"No hay clientes que mostrar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
        BancoImagen = InterfazBienvenida.Retornar_lista();
        jLabel1.setText(BancoImagen[1]);
        ImageIcon icon = new ImageIcon(BancoImagen[0]);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono);
    }//GEN-LAST:event_jLabel1AncestorAdded
    
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
            java.util.logging.Logger.getLogger(InterfazBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazBanco(cantidadCajeros).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
