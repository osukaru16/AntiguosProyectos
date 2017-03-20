import java.io.*;
public class EntradaTeclado{
   public static String leeString(){
	String sdato="";
	try{
	   InputStreamReader isr=new InputStreamReader(System.in);
	   BufferedReader lectorEntrada=new BufferedReader(isr);
	   sdato=lectorEntrada.readLine();
	}
	catch(IOException e){
	   e.printStackTrace();
	}
	return sdato;
    }


   public static short leeShort(){

	try{
	    return Short.parseShort(leeString());
	}
	catch(NumberFormatException e){
	   return Short.MIN_VALUE;
	}
   }

 public static long leeLong(){

	try{
	    return Long.parseLong(leeString());
	}
	catch(NumberFormatException e){
	   return Long.MIN_VALUE;
	}
   }	

 public static int leeInt(){

	try{
	    return Integer.parseInt(leeString());
	}
	catch(NumberFormatException e){
	   return Integer.MIN_VALUE;
	}
   }	



 public static float leeFloat(){

	try{
	    Float f= new Float(leeString());
	    return f.floatValue();
	}
	catch(NumberFormatException e){
	   return Float.NaN;
	}
   }




 public static double leeDouble(){

	try{
	    Double d= new Double(leeString());
	    return d.doubleValue();
	}
	catch(NumberFormatException e){
	   return Double.NaN;
	}
   }






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
	return sdato;
    }





 public static int leeCharCode(){
	return (int) leeChar();
 } 
























}