package agrotur;

public class ReservaActividad {
    public int idresact;
    
    public int actividad;
    public int cliente;
    public int plazas;
    public float precio;
    
    public ReservaActividad(int idresact, int actividad, int cliente, int plazas, float precio) {
    
    this.idresact=idresact;
    this.actividad=actividad;
    this.cliente=cliente;
    this.plazas=plazas;
    this.precio= (float) precio;
        
    }
    public ReservaActividad(ReservaActividad resact) {
        
        this.idresact=resact.idresact;
        this.actividad=resact.actividad;
        this.cliente=resact.cliente;
        this.plazas=resact.plazas;
        this.precio= (float) resact.precio;
    
        
    }
    public ReservaActividad() {
        
        this(0,0,0,0,0.0f);
    }
    
    public void asociaDatos(int idresact, int actividad, int cliente, int plazas, float precio) {
    
    this.idresact=idresact;
    this.actividad=actividad;
    this.cliente=cliente;
    this.plazas=plazas;
    this.precio= (float) precio;
        
    }
    
    public String toString(){
        
        TCliente cli1 = new TCliente("WHERE idcli ="+cliente);
        
        
        return idresact+" - "+actividad+" - "+cli1.getClassDatos().toString()+"-" +plazas+" - "+precio;

     }


    public void setIdresact(int newidresact) {
        this.idresact = newidresact;
    }

    public int getIdresact() {
        return idresact;
    }

    public void setActividad(int newactividad) {
        this.actividad = newactividad;
    }

    public int getActividad() {
        return actividad;
    }

    public void setCliente(int newcliente) {
        this.cliente = newcliente;
    }

    public int getCliente() {
        return cliente;
    }

    public void setPlazas(int newplazas) {
        this.plazas = newplazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPrecio(float newprecio) {
        this.precio = newprecio;
    }

    public float getPrecio() {
        return precio;
    }
}
