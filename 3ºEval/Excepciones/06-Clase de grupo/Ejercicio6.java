java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		boolean incorrecto = true;
		boolean repetir = false;
		String string;
		byte pos1 = 0;
		byte pos2 = 0;
		byte nota = 0;
		char letra;
		char s = 's';
		char S = 'S';
		CGrupo programacion = new CGrupo((String)"Programacion", (byte)2);
		Scanner teclado = new Scanner(System.in);
		
		while(incorrecto == true || repetir == true) {//con datos incorrectos o pidiendolo se repito//
			try {
				incorrecto = true;
				
				System.out.println("Indicame el numero de alumno");
				string = teclado.nextLine();
				pos1 = Byte.parseByte(string);                    		//pedimos el alumno, comvertimos y comprobamos que este en el rango//
				if(pos1<0 || pos1>29) {
					throw new CValorNoValido ("Alumno no valido");
				}
				
				System.out.println("Indicame el numero de evaluacion");
				string = teclado.nextLine();
				pos2 = Byte.parseByte(string);                 			//pedimos la evaluacion, comvertimos y comprobamos que este en el rango//
				if(pos2<0 || pos2>3) {
					throw new CValorNoValido ("Evaluacion no valida");
				}
				
				System.out.println("Dime una nota entre 0 y 10");
				string = teclado.nextLine();
				nota = Byte.parseByte(string);							//pedimos la nota, comvertimos y comprobamos que este en el rango//
				if(nota<0 || nota>10){
					throw new CValorNoValido ("La nota no esta dentro de los parametros");
				}
				
				programacion.setNota((byte)pos1, (byte)pos2, (byte)nota); //usamos la clase CGrupo para almacenar la nota//
				System.out.println("Se ha guardado la nota");
				
				incorrecto = false;  //cambiamos para que no vuelva al bucle//
				
				System.out.println("Escriba una (S) si quiere añadir otra nota o (N) si no quiere");
				string = teclado.nextLine();				//pedimos una letra, con una s repetimos el bucle//
				letra = string.charAt(0);
				if(letra == S || letra == s) {
					repetir = true;
				}else {
					repetir = false;
				}
				
			}catch(NumberFormatException e){
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(CValorNoValido e){
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(StringIndexOutOfBoundsException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
			}
		}
		incorrecto = true;

		while(incorrecto == true || repetir == true) {
			try {
				incorrecto = true;
			
				System.out.println("Indicame el numero de alumno que quiere ver");
				string = teclado.nextLine();
				pos1 = Byte.parseByte(string);									//pedimos el alumno, comvertimos y comprobamos que este en el rango//
				if(pos1<0 || pos1>29) {
					throw new CValorNoValido ("Alumno no valido");
				}
				
				System.out.println("Indicame el numero de evaluacion que quiere visualizar");
				string = teclado.nextLine();
				pos2 = Byte.parseByte(string);									//pedimos la evaluacion, comvertimos y comprobamos que este en el rango//
				if(pos2<0 || pos2>3) {
					throw new CValorNoValido ("Evaluacion no valida");
				}
			}catch(NumberFormatException e){
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(CValorNoValido e){
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(StringIndexOutOfBoundsException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				incorrecto = true;
				System.out.println(e.getMessage());
			}catch(Exception e) {
				incorrecto = true;
				System.out.println(e.getMessage());
			}
			
			nota = programacion.getNota((byte)pos1, (byte)pos2);	//cogemos la nota, la mostramos y cambiamos incorrecto para que no siga el bucle//
			System.out.println("La nota es: " + nota);
			incorrecto = false;
			
			System.out.println("Escriba una (S) si quiere ver otra nota o (N) si no quiere");
			string = teclado.nextLine();				//pedimos una letra, con una s repetimos el bucle//
			letra = string.charAt(0);
			if(letra == S || letra == s) {
				repetir = true;
			}else {
				repetir = false;
			}
		}
		teclado.close();
	}

}
