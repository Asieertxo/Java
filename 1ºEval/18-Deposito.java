import java.lang.Math;
public class ejercicio18  {
	public static void main(String[] args){
		float volumen=0;
	    float volumenDisponible=0;
	    float radio=0;
	    int litros,litrosVaciados=0;
	    int segundos,ss,mm,hh=0;
	    final byte CAUDALE=10;    //caudal grifo llenado litros por segundos
	    final byte CAUDALS=4;     //caudal grifo vaciado litros por segundos
	    final byte ALTURA=10;     //altura del depósito en metros  
	    final byte DIAMETRO=3;    //diametro del depósito en metros
	    
	    //cálculo del volumen del depósito en litros
	    
	    radio=(float)DIAMETRO/2;
	    volumen=(float)(Math.PI*Math.pow(radio,2)*ALTURA*1000);
	    
	    //¿cuantos litros entran en el depósito en 10 minutos de llenado?
	    
	    litros=10*60*CAUDALE;
	 
	    //volumen disonible en el depósito después de 10 minutos de llenado
	    
	    volumenDisponible=volumen-litros;
	        
	    //bucle para simular llenado. Cada iteración es un segundo
	    
	    segundos=0;
	    do{
	    	volumenDisponible-=(CAUDALE-CAUDALS);
	    	segundos++;
	    }
	    while (volumenDisponible>0);
	    
	    litrosVaciados=segundos*CAUDALS;
	    
	    ss=segundos%60;
	    mm=segundos/60;
	    hh=mm/60;
	    mm=mm%60;
	    
	    System.out.println("Tiempo de llenado: "+hh+":"+mm+":"+ss);
	    System.out.println("Litros vaciados: "+litrosVaciados);
	           
  }
}
