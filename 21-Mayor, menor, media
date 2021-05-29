import java.util.Scanner;
public class ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		float n=0;
		int cantidad=0;
		float mayor=0;
		float menor=0;
		float medio=0;
		
		
		System.out.println("Dime un numero (-1 para salir): ");
		n=teclado.nextInt();
		mayor=n;
		menor=n;
		medio=n;
		cantidad++;
		if (n!=-1) {
			do {
				System.out.println("Dime un numero (-1 para salir): ");
				n=teclado.nextInt();
				if (n != -1) {
					if (n>mayor) {
						mayor=n;
					}
					if (n<menor) {
						menor=n;
					}
					medio=medio+n;
					cantidad++;
				}
			}while(n != -1);
			
			medio=medio/cantidad;
		
			System.out.println(mayor);
			System.out.println(menor);
			System.out.println(medio);
			System.out.println(cantidad);
		}else {
			System.out.println("No se han introducido numeros");
		}
		

		
		
	}

}
