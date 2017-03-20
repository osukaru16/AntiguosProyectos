package agrotur;

import java.sql.SQLException;

    public class THabitaciones extends MotorBD {
        Habitaciones hab = new Habitaciones();
        private String tabla="thabitaciones";


    public THabitaciones(String filtro) {
        consulta("SELECT * FROM "+tabla+" "+filtro);
    }
    public THabitaciones() {
        consulta("SELECT * FROM "+tabla);
    }
    

        public void cargaDatos(){
            try{
                hab.id_habitaciones=rs.getInt("idhab");
                hab.ocupacion_max=rs.getInt("ocumax");
                hab.nombre_habitacion=rs.getString("nombre");
                hab.detalles=rs.getString("detalles");
                hab.foto=rs.getString("foto");
                hab.precio=(float)rs.getFloat("precio");
                hab.numeroRegistro=rs.getRow();
            }
            catch(SQLException ex){
                hab = new Habitaciones();
            }
         }

    public void cargaDatosRS(){
        try{
            rs.updateInt("ocumax",hab.ocupacion_max);
            rs.updateString("nombre",hab.nombre_habitacion);
            rs.updateString("detalles",hab.detalles);
            rs.updateFloat("precio",hab.precio);
            rs.updateString("foto",hab.foto);
        }
        catch(SQLException ex){
            hab = new Habitaciones();
        }
     }

    public String getTabla() {
        return tabla;
    }
    public void setOcupacion_max(int newocupacion_max) {
        hab.ocupacion_max = newocupacion_max;
    }

    public int getOcupacion_max() {
        return hab.ocupacion_max;
    }
    public void setId_habitaciones(int newid_habitaciones) {
        hab.id_habitaciones = newid_habitaciones;
    }

    public int getId_habitaciones() {
        return hab.id_habitaciones;
    }
    
    public void setNombre_habitacion(String newnombre_habitacion) {
        hab.nombre_habitacion = newnombre_habitacion;
    }

    public String getNombre_habitacion() {
        return hab.nombre_habitacion;
    }
    
    public void setPrecio(float newprecio){
        hab.precio = newprecio;
    }

    public float getPrecio() {
        return hab.precio;
    }

    public void setFoto(String newfoto) {
        hab.foto = newfoto;
    }
    
    public String getFoto(){
        return hab.foto;
    }

    public void setDetalles(String newdetalles) {
        hab.detalles = newdetalles;
    }

    public String getDetalles() {
        return hab.detalles;
    }
    
 /*   public void asociaDatos(String ti, String des, float pre, boolean act){
        reg.tipo=ti;
        reg.descripcion=des;
        reg.precio=pre;
        reg.activo=act;
    }*/
    
    public Habitaciones getClassDatos(){
        return hab;
    }
    
    public Habitaciones[] toArray(){
        Habitaciones vreg[] = new Habitaciones[contarResultados()];        
        try{
        int posActual=rs.getRow();
        
        primero();
        for(int c=0;c<contarResultados();c++){
              vreg[c]=new Habitaciones(hab);
              siguiente();
        }
        irA(posActual);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return vreg;
    }

   
}
