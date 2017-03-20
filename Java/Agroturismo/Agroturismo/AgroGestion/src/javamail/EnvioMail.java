package javamail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvioMail {
    public String correo;
    public String clave;     
    public EnvioMail(String correos, String claves) {
        correo=correos;
        clave=claves;
    }
    public void enviarmail(String dirCorreo,String texto,String mensajito){
        try{  
         //funcion envio correo   
            System.out.println (correo);
            System.out.println (clave);
            System.out.println ("mensaje enviado");
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port","587");
            props.setProperty("mail.smtp.user", correo);
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correo));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(dirCorreo));
            message.setSubject(mensajito);
            message.setText(texto);
            Transport t = session.getTransport("smtp");
            t.connect(correo,clave);
            t.sendMessage(message,message.getAllRecipients());
            t.close();
            System.out.println ("mensaje enviado2");
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
    
    
}
