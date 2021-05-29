import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String s;
		byte dia = 0;
		byte mes = 0;
		byte diasmes;
		short año = 0;
		boolean bisiesto;
		boolean incorrecto = true;
		
		Scanner teclado = new Scanner(System.in);
		
		while(incorrecto) {
			try {//Pediomos el dia por String y lo pasamos a Byte
				System.out.print("Dime el dia: ");
				s = teclado.nextLine();
				dia = Byte.parseByte(s);
				
				//Pedimos el mes por String y lo pasamos a Byte
				System.out.print("Dime el mes: ");
				s = teclado.nextLine();
				mes = Byte.parseByte(s);
				if(mes < 1 || mes > 12){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Mes no valido");
				}
				
				//Pedimos el mes por String y lo pasamos a Short
				System.out.print("Dime el año: ");
				s = teclado.nextLine();
				año = Short.parseShort(s);
				if(año < 1980 || año > 2050){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Año no valido");
				}
				
				//calculamos los dias del mes y si es bisiesto añadimos un dia
				diasmes = CCalendario.numeroDias(mes);
				
				if(mes == 2) {
					bisiesto = CCalendario.esBisiesto(año);
					if(bisiesto == true && mes == 2) {
						diasmes++;
					}
				}
				
				if(dia < 1 || dia > diasmes){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Dia no valido");
				}
				
				incorrecto = false;//si todo ha ido bien cambiamos para parar el bucle
				
			}catch(NumberFormatException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
				System.out.println("Fecha no valida");
				
			}catch(CValorNoValido e){
				incorrecto = true;
				System.out.println(e.getMessage());
				System.out.println("Fecha no valida");
			}
		}
		System.out.println("La fecha: " + dia + "/" + mes + "/" + año + " es valida");
		teclado.close();
	}
}
