import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime un numero: ");
		int n1=teclado.nextInt();
		System.out.println("Dime otro numero: ");
		int n2=teclado.nextInt();
		
		int suma1=0;
		int suma2=0;
		
		for (int i=1; i<n1; i++) {
			if (n1%i == 0) {
				suma1=suma1+i;
			}
		}
		for (int i=1; i<n2; i++) {
			if (n2%i == 0) {
				suma2=suma2+i;
			}
		}
		
		if (suma1 == n2 && suma2 == n1) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}
		
	}

}
