import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		byte dime_mes;
		short dime_año;
		/*..............................................Pedir datos por panatalla*/
		do{
			System.out.println("Dime el numero de mes");
			dime_mes=teclado.nextByte();
		}while(dime_mes < 1 || 12 < dime_mes);
		
		System.out.println("Dime el año");
		dime_año=teclado.nextShort();	
		/*..............................................Constructor*/
		CMes mes = new CMes((byte)dime_mes, (short)dime_año);
		/*..............................................llamada de metodos*/
		mes.CalcularTMaxMayor();
		mes.CalcularTMaxMenor();
		mes.CalcularTMaxMed();
		
		mes.CalcularTMinMayor();
		mes.CalcularTMinMenor();
		mes.CalcularTMinMed();
		/*.............................................Imprimir por pantalla*/
		System.out.println("Temperaturas maximas");
		System.out.println("Temperatura maxima mayor " + mes.getTMaxMayor());
		System.out.println("Temperatura maxima menor " + mes.getTMaxMenor());
		System.out.println("Temperatura media maxima " + mes.getTMaxMed());
		
		System.out.println();
		System.out.println("Temperaturas minimas");
		System.out.println("Temperatura minima mayor " + mes.getTMinMayor());
		System.out.println("Temperatura minima menor " + mes.getTMinMenor());
		System.out.println("Temperatura media minima " + mes.getTMinMed());
	}

}
