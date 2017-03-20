package agrotur;

public class Habitaciones {
    public int id_habitaciones;
    public int ocupacion_max;
    public String nombre_habitacion;
    public String detalles;
    public String foto;
    public float precio;
    public int numeroRegistro;


    public Habitaciones(int id_habitaciones, int ocupacion_max, String nombre_habitacion, String detalles, String foto, float precio, int numeroRegistro) {
        this.id_habitaciones=id_habitaciones;
        this.ocupacion_max=ocupacion_max;
        this.nombre_habitacion=nombre_habitacion;
        this.detalles=detalles;
        this.foto=foto;
        this.precio=(float)precio;
        this.numeroRegistro=numeroRegistro;
        
    }

    public Habitaciones(Habitaciones hab){
        this.id_habitaciones=hab.id_habitaciones;
        this.ocupacion_max=hab.ocupacion_max;
        this.nombre_habitacion=hab.nombre_habitacion;
        this.detalles=hab.detalles;
        this.foto=hab.foto;
        this.precio=(float)hab.precio;
        this.numeroRegistro=hab.numeroRegistro;
    }

    public Habitaciones() {
        this(0,0,"","","",0.0f,0);
    }

    public void asociaDatos(int id_habitaciones, int ocupacion_max, String nombre_habitacion, String detalles, String foto, float precio, int numeroRegistro) {
        
        this.id_habitaciones=id_habitaciones;
        this.ocupacion_max=ocupacion_max;
        this.nombre_habitacion=nombre_habitacion;
        this.detalles=detalles;
        this.foto=foto;
        this.precio=(float)precio;
        this.numeroRegistro=numeroRegistro;
        
    }

    public void setId_habitaciones(int newid_habitaciones) {
        this.id_habitaciones = newid_habitaciones;
    }

    public int getId_habitaciones() {
        return id_habitaciones;
    }

    public void setOcupacion_max(int newocupacion_max) {
        this.ocupacion_max = newocupacion_max;
    }

    public int getOcupacion_max() {
        return ocupacion_max;
    }

    public void setNombre_habitacion(String newnombre_habitacion) {
        this.nombre_habitacion = newnombre_habitacion;
    }

    public String getNombre_habitacion() {
        return nombre_habitacion;
    }

    public void setDetalles(String newdetalles) {
        this.detalles = newdetalles;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setFoto(String newfoto) {
        this.foto = newfoto;
    }

    public String getFoto() {
        return foto;
    }

    public void setPrecio(float newprecio) {
        this.precio = newprecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
}


