import java.util.Scanner;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		int a[] = new int[1000];
		int numero;
		int veces;
		
		for (int i=0; i<a.length; i++){
			a[i]=(int)CNumeroAleatorio.pedir((short)25,(short)50,(byte)0);
		}
		
		Arrays.sort(a);
		
		do {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Numero a buscar: ");
		numero=teclado.nextInt();
		}while(numero < 25 && 50 > numero);
		
		veces= CArray.veces(a, numero);
		
		
		System.out.println("El numero " + numero + " esta " + veces + " veces");
		
	}
}
