package javamail;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PCorreo extends JPanel {
    private JLabel etiAsunto = new JLabel();
    private JTextField asunto = new JTextField();
    private JLabel etiMensaje = new JLabel();
    private JTextArea mensaje = new JTextArea();
    private JButton botonEnviar = new JButton();
    public EnvioMail env = new EnvioMail("agroturismo8@gmail.com","1234567890123456789");
    private JLabel etiDireccionenvio = new JLabel();
    private JTextField direccionenvio = new JTextField();

    public PCorreo() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        etiAsunto.setText("Asunto");
        etiAsunto.setBounds(new Rectangle(25, 45, 70, 20));
        asunto.setBounds(new Rectangle(80, 45, 235, 20));
        etiMensaje.setText("Mensaje");
        etiMensaje.setBounds(new Rectangle(25, 70, 50, 20));
        mensaje.setBounds(new Rectangle(20, 90, 355, 105));
        mensaje.setLineWrap(true);
        botonEnviar.setText("enviar");
        botonEnviar.setBounds(new Rectangle(320, 25, 70, 40));
        botonEnviar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        botonEnviar_actionPerformed(e);
                    }
                });
        etiDireccionenvio.setText("Enviar a:");
        etiDireccionenvio.setBounds(new Rectangle(25, 20, 50, 15));
        direccionenvio.setBounds(new Rectangle(80, 20, 235, 20));
        this.add(direccionenvio, null);
        this.add(etiDireccionenvio, null);
        this.add(botonEnviar, null);
        this.add(mensaje, null);
        this.add(etiMensaje, null);
        this.add(asunto, null);
        this.add(etiAsunto, null);

    }

    private void botonEnviar_actionPerformed(ActionEvent e) {
        
        env.enviarmail(direccionenvio.getText(),asunto.getText(),mensaje.getText());
        
            }
}
