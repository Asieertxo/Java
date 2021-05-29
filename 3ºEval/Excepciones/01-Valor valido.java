import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		String s = null;
		short n = 0;
		boolean valido = true;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			try {
				valido = true;
				System.out.println("Teclea un número entre " + Short.MIN_VALUE + " y " + Short.MAX_VALUE + ":");
				s=teclado.nextLine();
				n = Short.parseShort(s);
			}
			catch(NumberFormatException e){
				System.out.println("Esto no es un numero short \n");
				valido = false;
			}
		}while(valido == false);
		
		System.out.println("El numero short es: " + n);
		teclado.close();
	}

}
