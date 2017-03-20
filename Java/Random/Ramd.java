import java.util.Random;
class Ramd {
    
    public static void main(String args[]) {
	Random rnd=new Random(System.currentTimeMillis());
	int a=rnd.nextInt(101)+100;
	 //int a=rnd.setSeed(101)+100;
	System.out.println(""+a/2);
	System.out.println(""+a);
	

    }
}
