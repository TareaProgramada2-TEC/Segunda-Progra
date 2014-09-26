/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonson
 */
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
public class Enviar_Correo {
    
    public void enviar_correo(String Correo){
        Properties  props= new Properties();                        
        // Nombre del host de correo, es smtp.gmail.com      
        props.setProperty("mail.smtp.host", "smtp.gmail.com");                          
        // TLS establecerlo disponible      
        props.setProperty("mail.smtp.starttls.enable", "true");                     
        // Puerto de gmail para envio de correos
        //este es el que usa google            
        props.setProperty("mail.smtp.port","587");    
        // Cuenta de correo en gmail una cuenta que
        //tengas  que va a ser la que se autentique
        //con el servidor.      
       props.setProperty("mail.smtp.user","bankito.2014.aviso@gmail.com");                       
      // Si requiere o no usuario y password para    
      //conectarse.  
     props.setProperty("mail.smtp.auth", "true"); 
     //props.put("mail.smtp.auth", "true");                      
   // Se obtiene una sesión con las propiedades
   //anteriormente definidas      
   Session sesion =Session.getDefaultInstance(props,null);
   sesion.setDebug(true);      
   // Se crea un mensaje vacío      
   Message mensaje = new MimeMessage(sesion);      
  try {                
   // Cuerpo del mensaje      
    mensaje.setText("Prueba de envio de mensaje");                             
    String dt="tecnologicodecostarica";            
    Address address = new InternetAddress(dt,"Banco");      
    mensaje.setFrom(address);                      
  //La direccion de la persona a quien le
  //van a enviar el correo.      
    Address address2 =
        new InternetAddress(Correo,false);
    mensaje.addRecipient(Message.RecipientType.TO,address2);
 
    // Se envía el mensaje      
    Transport t = sesion.getTransport("smtp");
    t.connect("smtp.gmail.com", "bankito.2014.aviso@gmail.com", "tecnologicodecostarica");        
 
    t.sendMessage(mensaje,mensaje.getAllRecipients());      
    t.close();           
   }
   catch (MessagingException | UnsupportedEncodingException e)
  {             
                 
 }                       
 }//end main
 
}//end class envio correo
    
    

