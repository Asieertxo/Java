import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		

		 System.out.println("Dime una nota: ");
		 float nota1=teclado.nextFloat();
		 System.out.println("Dime una nota: ");
		 float nota2=teclado.nextFloat();
		 System.out.println("Dime una nota: ");
		 float nota3=teclado.nextFloat();
		 
		 if (((nota1+nota2+nota3)/3>=5)||(nota1>=5&&nota2>=5)||(nota2>=5&&nota3>=5)||(nota1>=5&&nota3>=5)) {
			 System.out.println("El modulo esta aprobado");
		 }else {
			 System.out.println("El modulo esta suspenso");
		 }
		 
		
		 
	}

}
