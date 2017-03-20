import java.io.*;



class Tamagochi extends MotorTamagochi{
	
	//variables
	
	String nombre;
	String color;
	

	//costructor 1
    public Tamagochi(String nom, String c) {
		this.nombre=nom;
		this.color=c;
		
	}
	
	
	//costructor 2
	/*public Tamagochi(String n, String c, MotorTamagochi obj) {
		super(obj);
		nombre=n;
		color=c;
		
	}*/
	
	
	
	
	//costructor 3
	public Tamagochi() {
		this("midori","verde");
	}



	
	//El Menu
	
	
	public void juego(){
		System.out.println("================");
		System.out.println("|| Bienvenido ||");
		System.out.println("================");
		System.out.println(" ////");
		System.out.println("(-  -)");
		System.out.println("(o)(o)");
		System.out.println("   J  ");
		//System.out.println("");
		
		
		do{
		
		System.out.println("============================");
		System.out.println("|| Pulsa c para comer     ||");
		System.out.println("|| Pulsa b para beber     ||");
		System.out.println("|| Pulsa d para descansar ||");
		System.out.println("|| Pulsa j para jugar     ||");
		System.out.println("|| Pulsa h para duchar    ||");
		System.out.println("|| Pulsa w para ir al WC  ||");
		System.out.println("============================");
		
		System.out.println(this);
	//informacion del tamagochi	
		
		
		/*public String {
		
		}
		*/
		
		
		
		
		
		
	//Entrada teclado
   /*public static char leeChar(){
	char sdato='\0';
	try{
	   InputStreamReader isr=new InputStreamReader(System.in);
	   BufferedReader lectorEntrada=new BufferedReader(isr);
	   sdato=(char)lectorEntrada.read();
	}
	catch(IOException e){
	   e.printStackTrace();
	}*/
		
		char sdat=EntradaTeclado.leeChar();
		
		

		
		
	//evaluar teclas
		
		switch(sdat){
			
			case 'c':
					Comer();
					break;
			
			
			case 'b':
					Beber();
					break;
			
			case 'd':
					Descansar();
					break;
					
			case 'j':
					Jugar();
					break;
					
			case 'h':
					Ducha();
					break;
					
			case 'w':
					WC();
					break;
					
			/*case 'k':
					CSI();
					break;
					
			case 'e':		
					toString();
					break;*/
					
			default:
					System.out.println("No has introducido nunguno de los comandos");
					break;	
		}
		
		
	 
	
	
	}while(!estaMuerto());
	System.out.println(CSI());
	
	
	
}


	public String toString() {
		String msg="El nombre del tamagochi es "+nombre+"\n y es de color "+color+"\n";
		msg+=super.toString();
		return msg;
	}
	
}