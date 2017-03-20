package appverdura;

public class DatosComboBox {
    private String datoAMostrar;
    private String datoInterno;
    
    public DatosComboBox(String datoAMostrar, String datoInterno) {
        this.datoAMostrar = datoAMostrar;
        this.datoInterno =datoInterno;
    }
    public DatosComboBox() {
        this("","");
    }
    
    public void setDatoAMostrar(String newdatoAMostrar) {
        this.datoAMostrar = newdatoAMostrar;
    }

    public String getDatoAMostrar() {
        return datoAMostrar;
    }

    public void setDatoInterno(String newdatoInterno) {
        this.datoInterno = newdatoInterno;
    }

    public String getDatoInterno() {
        return datoInterno;
    }
    public String toString(){
        return datoAMostrar;
    }
    
    
}
