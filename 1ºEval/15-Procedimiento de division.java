import java.util.Scanner;
public class ejercicio15{
	public static void main(String[] args){
		Scanner teclado = new Scanner (System.in);
		
		int dividendo,divisor,cociente,resto,numeroRestas;
		numeroRestas=0;
		cociente=0;
    
		do{
			System.out.println("Dividendo:");
			dividendo=teclado.nextInt();

			System.out.println("Divisor:");
			divisor=teclado.nextInt();

		}while (divisor>dividendo);
 
		while (dividendo>=divisor){
			cociente++;
			numeroRestas++;
			dividendo=dividendo-divisor;
		}
        
		resto=dividendo;
    

		System.out.println("Cociente:"+cociente);
		System.out.println("Resto:"+resto);
		System.out.println("Nº de restas realizadas:"+numeroRestas);
	}
}
