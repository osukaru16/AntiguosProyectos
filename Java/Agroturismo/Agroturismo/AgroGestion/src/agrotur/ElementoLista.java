package agrotur;

public class ElementoLista {
    String datoAmostrar;
    String valorAsociado;
    public ElementoLista(String datoAmostrar,String valorAsociado){
        this.datoAmostrar=datoAmostrar;
        this.valorAsociado=valorAsociado;
        
    }    
    public ElementoLista() {
        this("","");
    }

    public void setDatoAmostrar(String newdatoAmostrar) {
        this.datoAmostrar = newdatoAmostrar;
    }

    public String getDatoAmostrar() {
        return datoAmostrar;
    }

    public void setValorAsociado(String newvalorAsociado) {
        this.valorAsociado = newvalorAsociado;
    }

    public String getValorAsociado() {
        return valorAsociado;
    }
    
    public String toString() {
        return datoAmostrar;
    }

}

