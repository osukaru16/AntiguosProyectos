import java.util.Random;

class MotorTamagochi{
	
	//Variables
	
	private int hambre;
	private int sed;
	private int cansancio;
	private int aburrimiento;
	private int suciedad;
	private int necesidad;
	
	//variable que te dira si esta muerto
	private boolean muerto;
	
	//Variables maximos
	
	private int Maxhambre;
	private int Maxsed;
	private int Maxcansancio;
	private int Maxaburrimiento;
	private int Maxsuciedad;
	private int Maxnecesidad;
	
	
	//acciones Nota: 100 es que necesita mucho algo y 0 que no lo necesita
	public boolean Comer(){
		hambre-=5;
		sed++;
		suciedad+=2;
		necesidad+=2;
		return estaMuerto();	
	}
	
	public boolean Beber(){
		sed-=5;	
		suciedad+=2;
		necesidad+=2;
		return estaMuerto();
	}
	
	public boolean Descansar(){
		cansancio-=5;
		sed+=2;	
		necesidad+=2;
		hambre+=3;
		aburrimiento+=1;	
		suciedad+=3;
		return estaMuerto();
	}
	
	
	public boolean Jugar(){
		hambre+=5;
		sed+=5;
		aburrimiento-=4;
		suciedad+=6;
		necesidad+=2;
		cansancio+=5;
		return estaMuerto();
	}
	
	
	public boolean Ducha(){
		hambre+=2;
		sed-=2;
		aburrimiento+=2;
		suciedad-=8;
		cansancio-=3;
		necesidad+=1;
		return estaMuerto();
	} 
	
	public boolean WC(){
		hambre+=2;
		sed+=2;
		aburrimiento-=2;
		suciedad+=6;
		cansancio+=6;
		necesidad-=8;
		return estaMuerto();
	} 
	


	
	//costructor 1º Nota:este constructor ayudara a cargar datos guardados
	MotorTamagochi(int ham, int se, int can, int aburr, int suci, int nece, int Maxham, int Maxse, int Maxcan, int Maxaburr, int Maxsuci, int Maxnece){
		
	this.hambre=ham;
	this.sed=se;
	this.cansancio=can;
	this.aburrimiento=aburr;
	this.suciedad=suci;
	this.necesidad=nece;
	muerto=false;
	this.Maxhambre=Maxham;
	this.Maxsed=Maxse;
	this.Maxcansancio=Maxcan;
	this.Maxaburrimiento=Maxaburr;
	this.Maxsuciedad=Maxsuci;
	this.Maxnecesidad=Maxnece;	
			
		
	}
	
	
	
	//costructor 2º
	
	MotorTamagochi(){
		Random rmd=new Random(System.currentTimeMillis());
		int a = rmd.nextInt(101)+100;
		int b = rmd.nextInt(101)+100;
		int c = rmd.nextInt(101)+100;
		int d = rmd.nextInt(101)+100;
		int e = rmd.nextInt(101)+100;
		int f = rmd.nextInt(101)+100;

	
		//this(a/2,b/2,c/2,d/2,e/2,f/2,a,b,c,d,e,f);
		//this(a/2,b/2,c/2,d/2,e/2,f/2,false,a,b,c,d,e,f); 
		//this(50,50,50,50,50,50,100,100,100,100,100,100);
		
		
		this.hambre=a/2;
		this.sed=b/2;
		this.cansancio=c/2;
		this.aburrimiento=d/2;
		this.suciedad=e/2;
		this.necesidad=f/2;
		muerto=false;
		this.Maxhambre=a;
		this.Maxsed=b;
		this.Maxcansancio=c;
		this.Maxaburrimiento=d;
		this.Maxsuciedad=e;
		this.Maxnecesidad=f;
		
		
		
	}
	
	
	
	/*public MotorTamagochi(MotorTamagochi obj){
		hambre=obj.getHambre();
		sed=obj.getSed();
		cansancio= obj.getCansancio();
		aburrimiento=obj.getAburrimiento();
		necesidad=obj.getNecesidad();
		suciedad=obj.getSuciedad();
		maxHambre=100;
		maxSed=100;
		maxCansancio=100;
		maxAburrimiento=100;
		maxNecesidad=100;
		maxSuciedad=100;
		haMuerto=false;		
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	//Funciones
	
	//Funciones Hambre
	
	public int getHambre(){
		/*if(hambre<0){
		  System.out.println("El Tamagochi ha muerto de hambre");
		  
		}
		if(hambre>Maxhambre){
			System.out.println("El Tamagochi ha muerto de sobre peso");
			
		}*/
		return hambre;
	}
	
	public void setHambre(int h){
		hambre=h;
	}
	
	
	
	//Funciones Sed
	
	public int getSed(){
		/*if(sed<0){ 
		  System.out.println("El Tamagochi ha muerto de sed");
		}*/
		return sed;
	}
	
	public void setSed(int s){
		sed=s;
	}
	
	
	
	//Funciones Cansancio
	
	public int getCansancio(){
		return cansancio;
	}
	
	public void setCansancio(int c){
		cansancio=c;
	}
	
	
	
	//Funciones Aburrimiento
	
	public int getAburrimiento(){
		return aburrimiento;
	}
	
	public void setAburrimiento(int a){
		aburrimiento=a;
	}
	

	
	//Funciones Suciedad
	
	public int getSuciedad(){
		return suciedad;
	}
	
	public void setSuciedad(int s){
		suciedad=s;
	}
	
	
	
	//Funciones Necesidad
	
	public int getNecesidad(){
		return necesidad;
	}
	
	public void setNecesidad(int n){
		necesidad=n;
	}
	
	
 
	public String toString(){
		String msg="\n El tamagochi tine";
		msg+="\n hambre("+hambre+"/"+Maxhambre+")";
		msg+="\n sed("+sed+"/"+Maxsed+")";
		msg+="\n cansancio("+cansancio+"/"+Maxcansancio+")";
		msg+="\n aburrimiento("+aburrimiento+"/"+Maxaburrimiento+")";
		msg+="\n suciedad("+suciedad+"/"+Maxsuciedad+")";
		msg+="\n necesidad("+necesidad+"/"+Maxnecesidad+")";
		return msg;
		
	}  
	
	
	public boolean estaMuerto(){
		if((hambre<0)||(hambre>Maxhambre)){muerto=true;}
		if((sed<0)||(sed>Maxsed)){muerto=true;}
		if((cansancio<0)||(cansancio>Maxcansancio)){muerto=true;}
	    if((aburrimiento<0)||(aburrimiento>Maxaburrimiento)){muerto=true;}
	    if((suciedad<0)||(suciedad>Maxsuciedad)){muerto=true;}
		if((necesidad<0)||(necesidad>Maxnecesidad)){muerto=true;}

		return muerto;
			
	}
	
	
	public String CSI(){
		//if(!estaMuerto())return "Esta vivio";
		if(hambre<0)return "Murio de obesidad";
		if(hambre>Maxhambre)return "Murio anorecsia";
		if(sed<0)return "Murio ahogado en un vaso de agua";
		if(sed>Maxsed)return "Murio de sed perdido en un desierto";
		if(cansancio<0)return "Entro en coma";
		if(cansancio>Maxcansancio)return "Murio de un infarto por agotamiento";
		if(aburrimiento<0)return "Murio de felicidad";
		if(aburrimiento>Maxaburrimiento)return "Se suicido por aburrido";
		if(suciedad<0)return "Murio por mariatico de la limpieza";
		if(suciedad>Maxsuciedad)return "Murio por lepra ,la peste y por sucio";
		if(necesidad<0)return "Murio por no tener necesidades";
		if(necesidad>Maxnecesidad)return "Murio por diarea";
		return "Esta vivio";
		
	}
	
	
	
	
	
	
	
	
	
	
	}