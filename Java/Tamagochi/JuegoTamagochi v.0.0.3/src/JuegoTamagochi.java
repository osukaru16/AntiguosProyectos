public class JuegoTamagochi {
    
    public static void main(String[] args) {
    	char elSN='\0';
    	do{
    	
    	//MotorTamagochi mt = new MotorTamagochi(51,50,50,50,50,50,101,100,100,100,100,100);
    	
    	Tamagochi t = new Tamagochi("midori","verde");
    	t.juego();
    	
    		System.out.println("\n\nJuegas Otra (S/N)");
			elSN=EntradaTeclado.leeChar();
    
		}while(elSN=='s' || elSN=='S');
    }
}
