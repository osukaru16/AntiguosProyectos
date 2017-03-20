package agrotur;

import java.sql.SQLException;

public class TActProp extends MotorBD {
    ActProp apr = new ActProp();
    
    private String tabla="tactividadespropuestas";

    public TActProp(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public TActProp() {
        consulta("SELECT * FROM "+tabla);
    }
    
    public void cargaDatos(){
        try{
            apr.id_apropuestas=rs.getInt("idactpro");
            apr.plazas=rs.getInt("plazas");
            apr.fecha=rs.getString("fecha");
            apr.hora=rs.getString("hora");
            apr.numeroRegistro=rs.getRow();
            apr.id_act=rs.getInt("idact");
        }
        catch(SQLException ex){
            apr = new ActProp();
        }
     }

    public void cargaDatosRS(){
        try{
            rs.updateInt("idact",apr.id_act);
            rs.updateInt("plazas",apr.plazas);
            rs.updateString("fecha",apr.fecha);
            rs.updateString("hora",apr.hora);   
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
     }

    public String getTabla() {
        return tabla;
    }
    public void setid_apropuestas(int newid_apropuestas) {
        apr.id_apropuestas = newid_apropuestas;
    }

    public int getid_apropuestas() {
        return apr.id_apropuestas;
    }

    public void setplazas(int newplazas) {
        apr.plazas = newplazas;
    }

    public int getplazas() {
        return apr.plazas;
    }

    public void setfecha (String newfecha) {
        apr.fecha = newfecha;
    }

    public String getfecha() {
        return apr.fecha;
    }

    public void sethora (String newhora) {
        apr.hora = newhora;
    }

    public String ishora() {
        return apr.hora;
    }
    
    public void setid_act(int newid_act) {
        apr.id_act = newid_act;
    }

    public int getid_act() {
        return apr.id_act;
    }
    
    public void asociaDatos(int id_apropuestas, int id_act, int plazas, String fecha, String hora){
        apr.id_apropuestas=id_apropuestas;
        apr.id_act=id_act;
        apr.plazas=plazas;
        apr.fecha=fecha;
        apr.hora=hora;
    }
    
    public ActProp getClassDatos(){
        return apr;
    }
    
    public ActProp[] toArray(){
        ActProp vapr[] = new ActProp[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vapr[c]=new ActProp(apr);
              siguiente();
        }
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vapr;
    }
}