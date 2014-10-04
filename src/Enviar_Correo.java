/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.internet.*;

/**
 *
 * @author jhonson
 */
public class Enviar_Correo {
    String direccion;
    String [] arreglo;
    String NombreBanco;
    /**
     * Metodo para enviar un correo electronico
     * @param Correo Correo del cliente
     * @param Nombre Nombre del cliente
     * @param Tipo   Tipo de usuario que es el cliente
     * @param Fecha Resive la fecha de ingreso del cliente
     * 
     */
     
    public void enviar_correo(String Correo, String Nombre, String Tipo, String Fecha){
        arreglo = InterfazBienvenida.Retornar_lista();
        direccion = arreglo[0];
        NombreBanco = arreglo[1];
        
        Properties  props= new Properties();                        
        // Nombre del servidor     
        props.setProperty("mail.smtp.host", "smtp.gmail.com");                          
        // TLS establecerlo disponible      
        props.setProperty("mail.smtp.starttls.enable", "true");                     
        // Puerto de gmail para envio de correos 
        //Autenticacion de usuario y uso del puesto para enviar
        props.setProperty("mail.smtp.port","587");        
        props.setProperty("mail.smtp.user","bankito.2014.aviso@gmail.com");                       
        props.setProperty("mail.smtp.auth", "true");      
        Session sesion =Session.getDefaultInstance(props,null);
        sesion.setDebug(true);      
        // Se crea un mensaje vacío  
        Message mensaje = new MimeMessage(sesion);      
        try {   
            

        BodyPart texto = new MimeBodyPart();

        // Texto del mensaje
        texto.setText("Nombre del banco: "+arreglo[1]+"\n"+"Nombre: "+Nombre+"\n"+Fecha+"\n"+"Tipo de cliente: "+Tipo);
        BodyPart adjunto = new MimeBodyPart();

        // Cargamos la imagen
        adjunto.setDataHandler(new DataHandler(new FileDataSource(arreglo[0])));

        // Opcional. De esta forma transmitimos al receptor el nombre original del
        // fichero de imagen.
        adjunto.setFileName("a.gif");
        MimeMultipart multiParte = new MimeMultipart();
        multiParte.addBodyPart(texto);
        multiParte.addBodyPart(adjunto);
        // Cuerpo del mensaje     
        mensaje.setSubject("Tiquete asignado del banco");                                 
        String dt="tecnologicodecostarica";            
        Address address = new InternetAddress(dt,"Banco");      
            mensaje.setFrom(address);                            
            Address address2 = new InternetAddress(Correo,false);
            mensaje.addRecipient(Message.RecipientType.TO,address2);
            mensaje.setContent(multiParte);
            // Se envía el mensaje      
            Transport InicioSecion = sesion.getTransport("smtp");
            InicioSecion.connect("smtp.gmail.com", "bankito.2014.aviso@gmail.com", "tecnologicodecostarica");        
            InicioSecion.sendMessage(mensaje,mensaje.getAllRecipients());      
            InicioSecion.close();  
        }
        catch (MessagingException | UnsupportedEncodingException e)
        {                            
 }                       
 }
}
    
    

