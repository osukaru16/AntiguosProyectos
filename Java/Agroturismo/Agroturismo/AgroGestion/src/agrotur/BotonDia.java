package agrotur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class BotonDia extends JButton {
    private Date fecha;
    
    public BotonDia(String text) {
        super(text, null);
        fecha=null;
        this.configurar();
    }

    public BotonDia(Date fecha) {
        super(null, null);
        this.fecha=fecha;
        configurar();
    }
    
    public BotonDia(String text,Date fecha) {
        super(text, null);
        this.fecha=fecha;
        configurar();
    }
    
    public BotonDia() {
       super(null, null);
       fecha=null;
        configurar();
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFecha(Date newfecha) {
        this.fecha = newfecha;
    }

    public Date getFecha() {
        return fecha;
    }
    private void configurar(){
        this.setIconTextGap(0);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setMaximumSize(new Dimension(20, 20));
        this.setMinimumSize(new Dimension(20,20));
        this.setPreferredSize(new Dimension(20, 20));
        this.setSize(new Dimension(20, 20));
        this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        this.setBackground(new Color(181, 231, 255));
        this.setRolloverEnabled(true);
    }

    private void jbInit() throws Exception {
        this.setForeground(new Color(0, 107, 165));
        this.setBackground(new Color(115, 0, 231));
    }
}
