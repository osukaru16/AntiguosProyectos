import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Dado extends Applet {
	int num; 
	int tamDado;
	int AnchoDado=100;
	int porcentagePunto=80;
	int distancia3D=25;
	int xi,yi;
	int tamAppletAlto=300;
	int tamAppletAncho=500;




	
	
	
	
	public void init() {
		
		Random rmd=new Random(System.currentTimeMillis());
		num = rmd.nextInt(6)+1;
		
		
	}



	public void paint(Graphics g) {
			//variabls de los puntos
		xi=(tamAppletAncho-AnchoDado)/2;	
		yi=(tamAppletAlto-AnchoDado)/2;
		
		//System.out.println("",+xi);
		
		int x1=xi;	
		int y1=yi+distancia3D;	
			
		int x2=xi;	
		int y2=y1+AnchoDado;			
			
		int x3=x2+AnchoDado;	
		int y3=y2;			
			
		int x4=x3+distancia3D;	
		int y4=y2-distancia3D;		
		
		int x5=x4;	
		int y5=y4-AnchoDado;
		
		int x6=x5-AnchoDado;	
		int y6=y5;
		
		
		
		
		
			
			
			
		int ac=AnchoDado/3;
		int tpd=(ac*porcentagePunto)/100;
		int marg=(ac-tpd)/2;	
			
		//puntos dado	
		int p1x=x1+marg;
		int p1y;
	
		int p2x;
		int p2y;
		
		
		
		
		
		int x[] ={x1,x2,x3,x4,x5,x6};
		int y[] ={y1,y2,y3,y4,y5,y6};
		//int x[] ={x1+100,x2+100,x3+100,x4+100,x5+100,x6+120};
		//int y[] ={y1+100,y2+100,y3+100,y4+100,y5+100,y6+100};
		g.drawPolygon(x,y,6);
		
		//g.drawLine(x1,y1,x3,y1);
		g.drawLine(x3,y1,x5,y5);
		//g.drawLine(x3,y1,x3,y3);
		
		g.drawRect(x1,y1,yi,yi);
		
		
		System.out.println(""+x1);
		
		
		
		
		
		
		
		
	
	
	
	
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
