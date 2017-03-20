package agrotur;

import java.sql.SQLException;

public class TReservaActividad extends MotorBD {

    ReservaActividad resact = new ReservaActividad();
    private String tabla = "treservaactividad";

    public TReservaActividad(String filtro) {
        consulta("SELECT * FROM " + tabla + " " + filtro);
    }


    public TReservaActividad() {
        consulta("SELECT * FROM " + tabla);
    }


    public void cargaDatos() {

        try {
            //Obtenemos el valor del campo entre parentesis en la BD
            //y lo guardamos en el objeto resact
            resact.idresact = rs.getInt("idresact");
            resact.actividad = rs.getInt("actividad");
            resact.precio = (float)rs.getFloat("precio");
            resact.plazas = rs.getInt("plazas");
            resact.cliente = rs.getInt("cliente");
        }

        catch (SQLException ex) {
            resact = new ReservaActividad();

        }

    }


    public void cargaDatosRS() {
        try {
            //Obtenemos el valor del campo del panel
            //y lo guardamos en el campo correspondiente de la BD

            rs.updateInt("actividad", resact.actividad);
            rs.updateFloat("precio", resact.precio);
            rs.updateInt("plazas", resact.plazas);
            rs.updateInt("cliente", resact.cliente);


        }

        catch (SQLException ex) {

            ex.printStackTrace();
        }


    }


    public void setIdresact(int newidresact) {
        resact.idresact = newidresact;
    }

    public int getIdresact() {
        return resact.idresact;
    }

    public void setActividad(int newactividad) {
        resact.actividad = newactividad;
    }

    public int getActividad() {
        return resact.actividad;
    }

    public void setCliente(int newcliente) {
        resact.cliente = newcliente;
    }

    public int getCliente() {
        return resact.cliente;
    }

    public void setPlazas(int newplazas) {
        resact.plazas = newplazas;
    }

    public int getPlazas() {
        return resact.plazas;
    }

    public void setPrecio(float newprecio) {
        resact.precio = newprecio;
    }

    public float getPrecio() {
        return resact.precio;
    }

    public ReservaActividad getClassDatos() {
        return resact;
    }
    
    public ReservaActividad[] toArray(){
        ReservaActividad vact[] = new ReservaActividad[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vact[c]=new ReservaActividad(resact);
              siguiente();
        }
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vact;
    }  
}
