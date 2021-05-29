import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		String s = null;
		byte dia = 0;
		byte mes = 0;
		byte diasmes;
		short año = 0;
		boolean bisiesto;
		boolean incorrecto = true;
		
		Scanner teclado = new Scanner(System.in);
		
		while(incorrecto) {
			try {
				System.out.println("Dime una fecha en formato dd/mm/aaaa");
				s = teclado.nextLine();
				
				año = Short.parseShort(s.substring(6,10));
				if(año < 1980 || año > 2050){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Año no valido");
				}
				
				mes = Byte.parseByte(s.substring(3,5));
				if(mes < 1 || mes > 12){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Mes no valido");
				}
				
				diasmes = CCalendario.numeroDias(mes);
				if(mes == 2) {
					bisiesto = CCalendario.esBisiesto(año);
					if(bisiesto == true && mes == 2) {
						diasmes++;
					}
				}
				
				dia = Byte.parseByte(s.substring(0,2));
				if(dia < 1 || dia > diasmes){//si no esta en el rango damos una excepcion
					throw new CValorNoValido ("Dia no valido");
				}
				
				incorrecto = false;
				
			}catch(NumberFormatException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
				System.out.println("Fecha no valida");
				
			}catch(CValorNoValido e){
				incorrecto = true;
				System.out.println(e.getMessage());
				System.out.println("Fecha no valida");
				
			}catch(StringIndexOutOfBoundsException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
				System.out.println("Formato de fecha invalido");
				
			}catch(NullPointerException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
			}
		}

		System.out.println("La fecha: " + dia + " de " + CCalendario.nombreMes(mes) + " del año " + s.charAt(6) + "." + s.substring(7) + " es valida");
		teclado.close();
	}

}
