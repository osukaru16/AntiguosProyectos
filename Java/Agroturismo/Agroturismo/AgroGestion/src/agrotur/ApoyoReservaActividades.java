package agrotur;

import java.sql.Date;

import java.util.Vector;

//Para mostrar una lista con los datos de abajo, algunos procedentes de la tabla Actividades y 
//otros procedentes de la tabla Actividades Propuestas

public class ApoyoReservaActividades {
    
    public int idActividadPro;
    public String nombreActividad;
    public float precio;
    public int plazas;
    public String hora;
    public String fecha;
    public int plazasOcupadas;

    public ApoyoReservaActividades(int idActividadPro,String nombreActividad,float precio,int plazas,String hora,String fecha,int plazasOcupadas) {
        this.idActividadPro = idActividadPro;
        this.nombreActividad = nombreActividad;
        this.precio = precio;
        this.plazas = plazas;
        this.hora = hora;
        this.fecha = fecha;
        this.plazasOcupadas = plazasOcupadas;

    }
    
    public ApoyoReservaActividades() {
        this(0,"",0f,0,"","",0);
    }
    
    public static ApoyoReservaActividades idToObj(int id){
        
        TActProp tactprop = new TActProp("WHERE idactpro ="+id);
        
        int idActividad = tactprop.getid_act();
        TActividades tact = new TActividades("WHERE idact ="+idActividad);
        int i = tactprop.getid_apropuestas();
        String n=tact.getNombre();
        float pr=tact.getPrecio() ;
        int pl=tactprop.getplazas();
        String h=tactprop.ishora();
        String f=tactprop.getfecha();
        int po=0;
        ApoyoReservaActividades aRA = new ApoyoReservaActividades(i,n,pr,pl,h,f,po);
        return aRA;
    }
    
    public static Vector toVector(){
    //Para guardar los datos necesarios en el vector datos
        TActProp tactprop = new TActProp();
        ActProp[] listadoAct = tactprop.toArray();
    //guardamos los datos de las actividades prop en un array
        
        Vector datos = new Vector();

        for(int c=0;c<listadoAct.length;c++){
    //Para cada uno de los campos de las actividades propuestas
            int idActividad = listadoAct[c].getid_act();
            TActividades tact = new TActividades("WHERE idact ="+idActividad);
            
            int i = listadoAct[c].getid_apropuestas();
           
            String n=tact.getNombre();
            float pr=tact.getPrecio() ;
            int pl=listadoAct[c].getplazas();
            String h=listadoAct[c].ishora();
            String f=listadoAct[c].getfecha();
            int po=0;
            ApoyoReservaActividades aRA = new ApoyoReservaActividades(i,n,pr,pl,h,f,po);
            
            datos.add(aRA);
            
            
        }
        
        
        return datos;
    }

    public String toString(){
            return fecha+" - "+nombreActividad+" - "+hora+" -- "+precio;
    }

    public void setIdActividadPro(int newidActividadPro) {
        this.idActividadPro = newidActividadPro;
    }

    public int getIdActividadPro() {
        return idActividadPro;
    }

    public void setNombreActividad(String newnombreActividad) {
        this.nombreActividad = newnombreActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setPrecio(float newprecio) {
        this.precio = newprecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPlazas(int newplazas) {
        this.plazas = newplazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setHora(String newhora) {
        this.hora = newhora;
    }

    public String getHora() {
        return hora;
    }

    public void setFecha(String newfecha) {
        this.fecha = newfecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setPlazasOcupadas(int newplazasOcupadas) {
        this.plazasOcupadas = newplazasOcupadas;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }
}
