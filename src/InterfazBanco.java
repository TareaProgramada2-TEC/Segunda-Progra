
import java.awt.Component;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
