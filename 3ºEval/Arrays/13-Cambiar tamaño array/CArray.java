import java.util.Arrays;
import java.util.Scanner;

public class CArray {
	public static void invertir(int a2[]) {
		
		int inicio = 0;
		int fin = a2.length - 1;
		int aux;
		
		while (inicio < fin) {
			aux = a2[inicio];
			a2[inicio] = a2[fin];
			a2[fin] = aux;
			inicio++;
			fin--;
		}
	}
	
	public static int[] cambiarTamaño(int a[]) {
		int cambio;
		int b[]=null;
		 
		Scanner teclado=new Scanner(System.in);
		System.out.println("Variacion del Array: ");
		cambio=teclado.nextInt();
		
		if(cambio==0) {
			b=a.clone();
			return b;
		}
		if(cambio < 0) {
			if(-cambio >= a.length) {
				System.out.println ("No se puede reducir tanto el array");
				b = a.clone();
				return b;
			}else{
				b=Arrays.copyOf(a, a.length + cambio);
				return b;
			}
		}else{
			b=Arrays.copyOf(a, a.length + cambio);
			return b;
		}
	}
}
