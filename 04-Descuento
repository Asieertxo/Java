import java.util.Scanner;
public class ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime el precio: ");
		float precio=teclado.nextFloat();
		System.out.println("Dime las unidades: ");
		int unidades=teclado.nextInt();
		
		int descuento=0;
		if (unidades>=1 && unidades<11) {
			descuento=1;
		}
		if (unidades>=11 && unidades<21) {
			descuento=2;
		}
		if (unidades>=21 && unidades<31) {
			descuento=3;
		}
		if (unidades>=31) {
			descuento=5;
		}
		
		float descontado=(precio*unidades)*descuento/100;
		float pagar=(precio*unidades)-descontado;
		
		System.out.println("Precio: " + precio);
		System.out.println("Unidades: " + unidades);
		System.out.println("% Descuento aplicado: " + descuento + "%");
		System.out.println("Importe descontado: " + descontado);
		System.out.println("Total a pagar: " + pagar);

	}

}
