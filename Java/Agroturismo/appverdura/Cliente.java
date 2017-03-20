package appverdura;

public class Cliente {
    
    public int idcliente;
    public String nombre;
    public String apellido;
    public String dni;
    public String email;
    public String tel;
    public String usu;
    public String pas;
    public boolean infoa;
    public boolean infoo;
    public int numeroRegistro;
    
    
    
    
    
    
    public Cliente(int idcliente, String nombre, String apellido, String dni, String email, String tel, String usu, String pas, boolean infoa, boolean infoo, int numeroRegistro) {
    this.idcliente=idcliente;
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.email=email;
    this.tel=tel;
    this.usu=usu;
    this.pas=pas;
    this.infoa=infoa;
    this.infoo=infoo;
    this.numeroRegistro=numeroRegistro;
    }


    public Cliente(Cliente cli){
        this.idcliente=cli.idcliente;
        this.nombre=cli.nombre;
        this.apellido=cli.apellido;
        this.dni=cli.dni;
        this.email=cli.email;
        this.tel=cli.tel;
        this.usu=cli.usu;
        this.pas=cli.pas;
        this.infoa=cli.infoa;
        this.infoo=cli.infoo;
        this.numeroRegistro=cli.numeroRegistro;

    }


    public Cliente() {
        this(0, "", "", "", "", "", "","",true,true,0);
    }
  
  
  
    public void asociaDatos(int idcliente, String nombre, String apellido, String dni, String email, String tel, String usu,String pas ,boolean infoa, boolean infoo, int numeroRegistro) {
    this.idcliente=idcliente;
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.email=email;
    this.tel=tel;
    this.usu=usu;
    this.pas=pas;
    this.infoa=infoa;
    this.infoo=infoo;
    this.numeroRegistro=numeroRegistro;
    }
  
    public String toString(){
        return idcliente+" - "+nombre+" - "+apellido+" - "+dni+" - "+email+" - "+usu;
    }


    public void setIdcliente(int newidcliente) {
        this.idcliente = newidcliente;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setNombre(String newnombre) {
        this.nombre = newnombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String newapellido) {
        this.apellido = newapellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(String newdni) {
        this.dni = newdni;
    }

    public String getDni() {
        return dni;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }

    public String getEmail() {
        return email;
    }

    public void setTel(String newtel) {
        this.tel = newtel;
    }

    public String getTel() {
        return tel;
    }

    public void setUsu(String newusu) {
        this.usu = newusu;
    }

    public String getUsu() {
        return usu;
    }

    public void setPas(String newpas) {
        this.pas = newpas;
    }

    public String getPas() {
        return pas;
    }

    public void setInfoa(boolean newinfoa) {
        this.infoa = newinfoa;
    }

    public boolean isInfoa() {
        return infoa;
    }

    public void setInfoo(boolean newinfoo) {
        this.infoo = newinfoo;
    }

    public boolean isInfoo() {
        return infoo;
    }

    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
}
