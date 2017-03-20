package agrotur;

public class ActProp {
        
    public int id_apropuestas;
    public int id_act;
    public int plazas;
    public String fecha;
    public String hora;
    public int numeroRegistro;
        
    public ActProp(int id_apropuestas, int id_act, int plazas, String fecha, String hora, int numeroRegistro) {
        this.id_apropuestas=id_apropuestas;
        this.id_act=id_act;
        this.plazas=plazas;
        this.fecha=fecha;
        this.hora=hora;
        this.numeroRegistro=numeroRegistro;
    }
    
    public ActProp(ActProp apr){
        this.id_apropuestas=apr.id_apropuestas;
        this.id_act=apr.id_act;
        this.plazas=apr.plazas;
        this.fecha=apr.fecha;
        this.hora=apr.hora;
        this.numeroRegistro=apr.numeroRegistro;
    }
    public ActProp() {
        this(0,0,0,"","",0);
    }
    public void asociaDatos(int id_apropuestas, int id_act, int plazas, String fecha, String hora, int numeroRegistro) {
        this.id_apropuestas=id_apropuestas;
        this.id_act=id_act;
        this.plazas=plazas;
        this.fecha=fecha;
        this.hora=hora;
        this.numeroRegistro=numeroRegistro;
    }
    
    public String toString(){
        return "--> "+id_act+" // "+hora+"h. // "+plazas+" plazas // "+fecha;
    }

    public void setid_apropuestas(int newid_apropuestas) {
        this.id_apropuestas = newid_apropuestas;
    }

    public int getid_apropuestas() {
        return id_apropuestas;
    }

    public void setid_act(int newid_act) {
        this.id_act = newid_act;
    }

    public int getid_act() {
        return id_act;
    }
    
    public void setplazas(int newplazas) {
        this.plazas = newplazas;
    }

    public int getplazas() {
        return plazas;
    }

    public void setfecha (String newfecha) {
        this.fecha = newfecha;
    }

    public String getfecha() {
        return fecha;
    }

    public void sethora (String newhora) {
        this.hora = newhora;
    }

    public String ishora() {
        return hora;
    }
    
    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
}
