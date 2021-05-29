import java.util.Scanner;
public class ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int n;
		int factorial=1;
		
		do {
			System.out.println("Dime un numero entre 5 y 10: ");
			n=teclado.nextInt();
			
		}while(n<5 || n>10);
		
		for (int i=2; i<=n; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
