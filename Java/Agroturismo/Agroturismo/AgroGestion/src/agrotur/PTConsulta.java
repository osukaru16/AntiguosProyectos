package agrotur;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.sql.Date;


import java.sql.SQLException;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;

import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.security.auth.Subject;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.PlainDocument;

public class PTConsulta extends JPanel {
    TConsulta ww = new TConsulta();
    private JLabel id = new JLabel();
    private JLabel correoWeb = new JLabel();
    private JLabel telefono = new JLabel();
    private JLabel mensaje = new JLabel();
    private JLabel fecha = new JLabel();
    private JLabel consulta = new JLabel();
    private JLabel registro = new JLabel();
    private JButton previo = new JButton();
    private JButton next = new JButton();
    private JButton consultar = new JButton();
    private boolean dd= true,ee=true,sn=false;
    public int gg = 0,maxBar = 0,totalId;
    private int cuentaNR;
    private int cuentaTC;
    private boolean control= true,sentido=true;
   

    private JLabel consultaResuelta = new JLabel();
    private JCheckBox si = new JCheckBox();
    private JLabel textoCuentaNR = new JLabel();
    private JTextArea texoCorreo = new JTextArea();
    private JButton correos = new JButton();
    private JButton aTodos = new JButton();
    private JLabel correosEnviados = new JLabel();
    private String elMensajito="";
    private JButton download = new JButton();
    private JTextArea asunto = new JTextArea();
    public JProgressBar jProgressBar1 = new JProgressBar();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JSeparator jSeparator1 = new JSeparator();


    public PTConsulta() {
        try {
            jbInit();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(600, 350));
        this.setPreferredSize(new Dimension(600, 280));
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        this.setAutoscrolls(true);
        id.setText("Consulta :");
        id.setBounds(new Rectangle(500, 5, 90, 15));
        correoWeb.setText("Correo Web:");
        correoWeb.setBounds(new Rectangle(10, 45, 395, 15));
        correoWeb.setFont(new Font("Dialog", 1, 11));
        telefono.setText("Telefono :");
        telefono.setBounds(new Rectangle(10, 25, 400, 15));
        telefono.setFont(new Font("Dialog", 1, 11));
        mensaje.setText("Mensaje :");
        mensaje.setBounds(new Rectangle(10, 5, 410, 20));
        mensaje.setHorizontalAlignment(SwingConstants.LEFT);
        mensaje.setHorizontalTextPosition(SwingConstants.LEFT);
        mensaje.setVerticalAlignment(SwingConstants.TOP);
        mensaje.setVerticalTextPosition(SwingConstants.TOP);
        mensaje.setFont(new Font("Dialog", 1, 11));
        fecha.setText("Fecha .");
        fecha.setBounds(new Rectangle(10, 65, 400, 15));
        fecha.setFont(new Font("Dialog", 1, 11));
        consulta.setText("Consulta resuelta  :");
        consulta.setBounds(new Rectangle(10, 85, 395, 15));
        consulta.setFont(new Font("Dialog", 1, 11));
        registro.setText("Nº Registro :");
        registro.setBounds(new Rectangle(5, 325, 400, 15));
        previo.setText("Anterior");
        previo.setBounds(new Rectangle(5, 295, 85, 20));
        previo.setSize(new Dimension(85, 20));
        previo.addMouseListener(new MouseAdapter() {
                    public void mouseReleased(MouseEvent e) {
                        previoMouseReleased(e);
                    }
                });
        next.setText("Siguiente");
        next.setBounds(new Rectangle(90, 295, 85, 20));
        next.setSize(new Dimension(85, 20));
        next.addMouseListener(new MouseAdapter() {
                    public void mouseReleased(MouseEvent e) {
                        nextMouseReleased(e);
                    }
                });
        consultar.setText("Buscar");
        consultar.setBounds(new Rectangle(175, 295, 85, 20));
        consultar.setSize(new Dimension(85, 20));
        consultar.addMouseListener(new MouseAdapter() {
                    public void mouseReleased(MouseEvent e) {
                        consultarMouseReleased(e);
                    }
                });
        consultaResuelta.setText("La consulta esta resuelta ?");
        consultaResuelta.setBounds(new Rectangle(15, 250, 135, 20));
        consultaResuelta.setPreferredSize(new Dimension(131, 20));
        consultaResuelta.setSize(new Dimension(135, 20));
        si.setText("Si");
        si.setBounds(new Rectangle(150, 250, 35, 20));
        si.setSelected(sn);
        si.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        siActionPerformed(e);
                    }
                });
        textoCuentaNR.setText("Candidad de consultas no resueltas :");
        textoCuentaNR.setBounds(new Rectangle(15, 235, 375, 15));
        texoCorreo.setText("Mensaje........");
        texoCorreo.setLineWrap(true);
        texoCorreo.setWrapStyleWord(true);
        texoCorreo.setBorder(BorderFactory.createTitledBorder(""));
        correos.setText("Enviar");
        correos.setBounds(new Rectangle(315, 295, 85, 20));
        correos.setSize(new Dimension(85, 20));
        correos.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        correoMousePressed(e);
                    }

                    public void mouseReleased(MouseEvent e) {
                        correosMouseReleased(e);
                    }
                });
        aTodos.setText("A todos");
        aTodos.setBounds(new Rectangle(400, 295, 85, 20));
        aTodos.setSize(new Dimension(85, 20));
        aTodos.addMouseListener(new MouseAdapter() {
                    public void mouseReleased(MouseEvent e) {
                        aTodosMouseReleased(e);
                    }

                    public void mousePressed(MouseEvent e) {
                        aTodosMousePressed(e);
                    }
                });
        correosEnviados.setText("Correos enviados: 0");
        correosEnviados.setBounds(new Rectangle(310, 250, 120, 20));
        correosEnviados.setSize(new Dimension(120, 20));
        download.setText("Download");
        download.setBounds(new Rectangle(485, 295, 100, 20));
        download.setSize(new Dimension(100, 20));
        download.setPreferredSize(new Dimension(140, 23));
        download.setMaximumSize(new Dimension(130, 23));
        download.setMinimumSize(new Dimension(130, 23));
        download.addMouseListener(new MouseAdapter() {
                    public void mouseReleased(MouseEvent e) {
                        downloadMouseReleased(e);
                    }

                    public void mousePressed(MouseEvent e) {
                        downloadMousePressed(e);
                    }
                });
        asunto.setBounds(new Rectangle(15, 130, 550, 20));
        asunto.setText("Asunto :");
        jProgressBar1.setBounds(new Rectangle(135, 105, 300, 15));
        jProgressBar1.setSize(new Dimension(300, 15));
        jScrollPane1.setBounds(new Rectangle(15, 155, 550, 70));
        jSeparator1.setBounds(new Rectangle(95, 275, 400, 5));
        jScrollPane1.getViewport().add(texoCorreo, null);
        this.add(jSeparator1, null);
        this.add(jScrollPane1, null);
        this.add(jProgressBar1, null);
        this.add(asunto, null);
        this.add(download, null);
        this.add(correosEnviados, null);
        this.add(aTodos, null);
        this.add(correos, null);
        this.add(textoCuentaNR, null);
        this.add(si, null);
        this.add(consultaResuelta, null);
        this.add(consultar, null);
        this.add(next, null);
        this.add(previo, null);
        this.add(registro, null);
        this.add(consulta, null);
        this.add(fecha, null);
        this.add(mensaje, null);
        this.add(telefono, null);
        this.add(correoWeb, null);
        this.add(id, null);
        totalId = ww.getId();
        maxBar = jProgressBar1.getMaximum();
        cuentaNoResueltos();
        ponDatos();
        asunto.setDocument(new PlainDocument());
    }

    private void previoMouseReleased(MouseEvent e) {
        int kk= (int) 100*ww.getId()/totalId;
        jProgressBar1.setValue(kk);
        sentido = false;
        ww.anterior();
        ponDatos();
    }

    private void nextMouseReleased(MouseEvent e) {
        int kk= (int) 100*ww.getId()/totalId;
        jProgressBar1.setValue(kk);
        sentido = true;
        ww.siguiente();
        ponDatos();
    }

    private void consultarMouseReleased(MouseEvent e) {
        int kk;
        
        if(control) {ww.ultimo();control=false;}
        while(ww.isResuelto()){
                if(ww.getId()==0){ww.anterior();continue;}
                if(ww.getId()==1){control= true;break;}else{control=false;ww.anterior();}
            }
        if(ww.getId() !=1){
            kk= (int) 100*ww.getId()/totalId;
            jProgressBar1.setValue(kk);
            sentido=false;
            ponDatos();
            }
        ww.anterior();
    }
    private void ponDatos(){
        if(ww.hayRegistros()){
        if(sentido){while(ww.getId() ==0){ww.siguiente();}} else {while(ww.getId() ==0){ww.anterior();}}
            
            correoWeb.setText("Correo web : "+ww.getEmail());
            telefono.setText("Telefono : "+ww.getTelefono());
           // mensaje.setText("Mensaje : "+ww.getMensaje());
            texoCorreo.setText("Mensaje : "+ww.getMensaje());
            id.setText("Consulta Nº "+ ww.getId());
            registro.setText("Nº Registro"+ww.getReg());
            fecha.setText("Fecha : "+ww.getFecha());
            boolean ee = ww.isResuelto();
            si.setSelected(ee);
            if(ee){
                consulta.setText("Consulta resuelta : Si");
            }
            else{
                consulta.setText("Consulta resuelta : No");
            }
        }
        else{
                correoWeb.setText("");
                telefono.setText("");
                texoCorreo.setText("");
                id.setText("");
                registro.setText("");
                fecha.setText("");         
            }
    }
    private void cuentaNoResueltos(){
        int cuentaNR=cuentaTC=1;
        ww.primero();
        int pp=ww.getId();
        ww.ultimo();
        while(ww.getId() != pp){
            if(ww.getId()==0) continue;
            cuentaTC++;
            if(!ww.isResuelto()){ww.anterior();continue;}
            ww.anterior();
            cuentaNR++;
        }
        textoCuentaNR.setText("Cantidad de consultas  resueltas : "+cuentaNR+" de "+cuentaTC);
    }

    private void correo(String dirCorreo,String texto,String mensajito){
        try{  
            
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port","587");
            props.setProperty("mail.smtp.user", "agroturismo8@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("agroturismo8@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(dirCorreo));
            message.setSubject(mensajito);
            message.setText(texto);
            Transport t = session.getTransport("smtp");
            t.connect("agroturismo8@gmail.com","1234567890123456789");
            t.sendMessage(message,message.getAllRecipients());
            t.close();
            ww.cargaDatosRS();
            ww.modificar();
            ponDatos();
            cuentaNoResueltos();
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
    private void downLoad(){
            try{
                Properties prop = new Properties();
                prop.setProperty("mail.pop3.starttls.enable", "false"); // Deshabilitamos TLS
                prop.setProperty("mail.pop3.socketFactory.class","javax.net.ssl.SSLSocketFactory" ); // Hay que usar SSL
                prop.setProperty("mail.pop3.socketFactory.fallback", "false");
                prop.setProperty("mail.pop3.port","995");// Puerto 995 para conectarse.
                prop.setProperty("mail.pop3.socketFactory.port", "995");
                Session sesion = Session.getInstance(prop);
                sesion.setDebug(true);
                Store store = sesion.getStore("pop3");
                store.connect("pop.gmail.com","agroturismo8","1234567890123456789");
                Folder folder = store.getFolder("INBOX");
                folder.open(Folder.READ_ONLY);
                Message [] mensajes = folder.getMessages();
                texoCorreo.setText("Descargando correo...");
                
                Date hoy = new Date(0);
                java.util.Date fechaHoy = new java.util.Date();
                hoy = new Date(fechaHoy.getTime());
                
                for (int i=0;i<mensajes.length;i++){
                    Address []ldirs = mensajes[0].getFrom();
                    String dd =ldirs[0].toString();
                    dd= BuscaDireccion(dd);
                    String we = "Asunto : "+mensajes[i].getSubject();
                    if (mensajes[i].isMimeType("text/*")){
                        we += " Mensaje : "+mensajes[i].getContent();
                        }
                    ww.altas(dd,we,hoy);     
                    } 
              }
            catch(Exception edn){edn.printStackTrace();}
        }
    public JProgressBar getJProgressBar1() {
        return jProgressBar1;
    }
    public void setJProgressBar1(JProgressBar newjProgressBar1) {
        this.jProgressBar1 = newjProgressBar1;
    }
    private String BuscaDireccion(String direccion){
        int e= direccion.length();
        int ef =direccion.indexOf("<")+1;
        int ew = direccion.indexOf(">");
        String correo = direccion.substring(ef,ew);
        return correo;
        }
    private void correoMousePressed(MouseEvent e) {
        jProgressBar1.setValue(0);
        texoCorreo.setText("Enviando Correo...");
        correosEnviados.setText("Correos enviados : ");
    }
    private void correosMouseReleased(MouseEvent e) {
        try{
            Thread.currentThread().sleep(100);
            correo(ww.reg.getEmail(),texoCorreo.getText(),ww.reg.getMensaje());
            jProgressBar1.setValue(100);
            correosEnviados.setText("Correos enviados : 1");
            texoCorreo.setText("Correo enviado.....");
            }
        catch(InterruptedException eo){
            eo.printStackTrace();
            texoCorreo.setText("No está conectado a internet o servidor no disponible...");
            }
        
    }
    private void aTodosMousePressed(MouseEvent e) {
        jProgressBar1.setValue(0);
        texoCorreo.setText("Enviando un mensaje a todos.............");
        correosEnviados.setText("Correos enviados : ");
    }
    private void aTodosMouseReleased(MouseEvent e) {
        int contador=0;
        ww.ultimo();
        String mensaje =texoCorreo.getText();
        while(ww.getId() != 1){
            if(ww.getId()!=0)correo(ww.reg.getEmail(),mensaje,ww.reg.getMensaje());
            jProgressBar1.setValue(100*ww.getId()/maxBar);
            jProgressBar1.repaint();
            contador++;
            
            ww.anterior();
            }
        contador++;
        ww.primero();
        correo(ww.reg.getEmail(),mensaje,ww.reg.getMensaje());
        jProgressBar1.setValue(100);
        correosEnviados.setText("Correos enviados : "+contador);
        texoCorreo.setText("Se ha enviado un mensaje a todos...");
        
    }
    private void downloadMousePressed(MouseEvent e) {
        texoCorreo.setText("Descargando Correos web para alacenarlos en la base de datos Consulta");
        jProgressBar1.setValue(0);
    }
    private void downloadMouseReleased(MouseEvent e) {
        downLoad();
        jProgressBar1.setValue(100);  
        texoCorreo.setText("Se ha completado la descarga del correo a la base de datos.....");
    }

    private void siActionPerformed(ActionEvent e) {
    
            if(si.isSelected()){
                ww.cargaDatosRS();
                ww.modificar();
                ponDatos();
                cuentaNoResueltos();
                }
    }
    
}

//Controlar la no existencia de registros