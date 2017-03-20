package agrotur;

import java.util.Vector;

public class Cliente {
        public String idcli;
        public String nombre;
        public String apellido1;
        public String apellido2;
        public String telefono;
        public String email;
        public String identific;
        public boolean infoact;
        public boolean infoofer;
        public String usuario;
        public String pass;
        public int numeroRegistro;
        public String[] bStrings = { "idcli", "Nombre", "Apellido", "Segundo apellido", "Telefono", "Email", "Identificacion","Info Act","Info Ofer","Usuario","Contraseña" };        
    public Cliente(String idcli, String nombre, String apellido1, String apellido2, String telefono, String email, String identific, boolean infoact, boolean infoofer, String usuario, String pass, int numeroRegistro) {
        this.idcli=idcli;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.telefono=telefono;
        this.email=email;
        this.identific=identific;
        this.infoact=infoact;
        this.infoofer=infoofer;
        this.usuario=usuario;
        this.pass=pass;
        this.numeroRegistro=numeroRegistro;
    }
    public Cliente(Cliente cli){
        this.idcli=cli.idcli;
        this.nombre=cli.nombre;
        this.apellido1=cli.apellido1;
        this.apellido2=cli.apellido2;
        this.telefono=cli.telefono;
        this.email=cli.email;
        this.identific=cli.identific;
        this.infoact=cli.infoact;
        this.infoofer=cli.infoofer;
        this.usuario=cli.usuario;
        this.pass=cli.pass;
        this.numeroRegistro=cli.numeroRegistro;
    }
    public Cliente() {
        this("","","","","","","",false ,false,"","",0);
    }
   
    public void asociaDatos(String idcli, String nombre, String apellido1, String apellido2, String telefono, String email, String identific, boolean infoact, boolean infoofer, String usuario, String pass, int numeroRegistro) {
        this.idcli=idcli;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.telefono=telefono;
        this.email=email;
        this.identific=identific;
        this.infoact=infoact;
        this.infoofer=infoofer;
        this.usuario=usuario;
        this.pass=pass;
        this.numeroRegistro=numeroRegistro;                             
    }

    public void setIdcli(String newidcli) {
        this.idcli = newidcli;
    }

    public String getIdcli() {
        return idcli;
    }

    public void setNombre(String newnombre) {
        this.nombre = newnombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido1(String newapellido1) {
        this.apellido1 = newapellido1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido2(String newapellido2) {
        this.apellido2 = newapellido2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setTelefono(String newtelefono) {
        this.telefono = newtelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }

    public String getEmail() {
        return email;
    }

    public void setIdentific(String newidentific) {
        this.identific = newidentific;
    }

    public String getIdentific() {
        return identific;
    }

    public void setInfoact(boolean newinfoact) {
        this.infoact = newinfoact;
    }

    public boolean isInfoact() {
        return infoact;
    }

    public void setInfoofer(boolean newinfoofer) {
        this.infoofer = newinfoofer;
    }

    public boolean isInfoofer() {
        return infoofer;
    }

    public void setUsuario(String newusuario) {
        this.usuario = newusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPass(String newpass) {
        this.pass = newpass;
    }

    public String getPass() {
        return pass;
    }
    public String toString(){
        return apellido1+" "+apellido2+", "+nombre;
    }
    public void setNumeroRegistro(int newnumeroRegistro) {
        this.numeroRegistro = newnumeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    
    public Vector toVectorConsultaComboBox(){
        Vector datos = new Vector();
        datos.add(new DatosComboBox("Todo","idcli"));
        datos.add(new DatosComboBox("Id","idcli"));
        datos.add(new DatosComboBox("Nombre","nombre"));
        datos.add(new DatosComboBox("Apellido","apellido1"));
        datos.add(new DatosComboBox("Segundo apellido","apellido2"));
        datos.add(new DatosComboBox("Telefono","telefono"));
        datos.add(new DatosComboBox("Email","email"));  
        datos.add(new DatosComboBox("Identificacion","identific"));        
        datos.add(new DatosComboBox("Info Act","infoact"));  
        datos.add(new DatosComboBox("Info Ofer","infoofer"));  
        datos.add(new DatosComboBox("Usuario","usuario"));  
        datos.add(new DatosComboBox("Contraseña","pass")); 
        datos.add(new DatosComboBox("Numero Registro","numeroRegistro"));
        return datos;
    }
    public Vector toVector(){
        Vector datos = new Vector () ;
        datos.add(new DatosComboBox(idcli,""+numeroRegistro));
        datos.add(nombre);
        datos.add(apellido1);
        datos.add(apellido2);
        datos.add(telefono);
        datos.add(email);            
        datos.add(identific);
        datos.add(""+infoact);
        datos.add(""+infoofer);            
        datos.add(usuario);            
        datos.add(pass);
        return datos;
    }

    public Vector toVectorCabeceras(){
        Vector datos = new Vector () ;
        datos.add("Id");
        datos.add("Nombre");
        datos.add("Apellido");
        datos.add("Segundo Apellido");
        datos.add("Telefono");
        datos.add("Email");            
        datos.add("Dni/Pass");        
        datos.add("Info Actividades");
        datos.add("Info Ofertas");
        datos.add("Usuario");            
        datos.add("Contraseña");            
        return datos;
    } 
}
