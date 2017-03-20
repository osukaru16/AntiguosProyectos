package appverdura;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PTRegimenCopiaVieja extends JPanel {
    private TRegimen tr = new TRegimen();

    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jList1 = new JList(tr.toArray());

    public PTRegimenCopiaVieja() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        jScrollPane1.setBounds(new Rectangle(15, 35, 210, 65));
        jList1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        jList1_mouseClicked(e);
                    }
                });
        jScrollPane1.getViewport().add(jList1, null);
        this.add(jScrollPane1, null);
    }


    private void jList1_mouseClicked(MouseEvent e) {
        System.out.println(jList1.getSelectedIndex());

        Regimen reg1 = (Regimen)jList1.getSelectedValue();
        System.out.println(reg1);
        System.out.println(reg1.getNumeroRegistro());
    }
}
