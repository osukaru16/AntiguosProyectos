import java.io.*;



class Tamagochi extends MotorTamagochi{
	
	
	
	//variables
	
	String nombre;
	String color;
	


    





   
	
	
	
	
	//Menu
	
	
	public void Menu(){
		
		
		do{
		
		
		System.out.println("Pulsa c para comer");
		System.out.println("Pulsa b para beber");
		System.out.println("Pulsa d para descansar");
		System.out.println("Pulsa j para jugar");
		System.out.println("Pulsa h para duchar");
		System.out.println("Pulsa w para ir al WC");
		System.out.println("Pulsa k para llama al CSI");
		System.out.println("Pulsa e para el estado");
		
		
	//informacion del tamagochi	
		
		
		/*public String {
		
		}
		*/
		
		
		
		
		
		
	//Entrada teclado
   public static char leeChar(){
	char sdato='\0';
	try{
	   InputStreamReader isr=new InputStreamReader(System.in);
	   BufferedReader lectorEntrada=new BufferedReader(isr);
	   sdato=(char)lectorEntrada.read();
	}
	catch(IOException e){
	   e.printStackTrace();
	}
		
		
		
		
		
	//evaluar teclas
		
		switch(sdato){
			
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
					
			case 'k':
					CSI();
					break;
					
			case 'e':		
					toString();
					break;
					
			default:
					System.out.println("No has introducido nunguno de los comandos");
					break;	
		}
		
		
	} 
	
	
	}while(!estaMuerto());
	
	
	
	
}	
}