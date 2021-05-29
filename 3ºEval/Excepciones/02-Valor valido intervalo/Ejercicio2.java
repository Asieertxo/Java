import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String s;
		short n = 0;
		boolean incorrecto = true;
		
		Scanner teclado = new Scanner(System.in);
		
		while(incorrecto) {
			System.out.println("Introduzca un numero por teclado: ");
			s = teclado.nextLine();
			
			try {
				n = Short.parseShort(s);
				if(n<20000 || n>3000) {
					throw new CValorNoValido ("El numero debe estan comprendido entre 20.000 y 30.000");
				}
				incorrecto = false;
				System.out.println("Numero correcto");
			}catch(NumberFormatException e){
				System.out.println(e.getMessage());
				System.out.println("Numero no valido");
			}catch(CValorNoValido e){
				System.out.println(e.getMessage());
				System.out.println("Numero no valido");
			}
		}

	}

}
