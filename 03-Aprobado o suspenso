import java.util.Scanner;
import java.text.DecimalFormat;
public class ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		DecimalFormat formateador1;
		formateador1=new DecimalFormat("#.#");
		teclado=new Scanner(System.in);
		

		System.out.println("Dime una nota: ");
		float nota1=teclado.nextFloat();
		System.out.println("Dime una nota: ");
		float nota2=teclado.nextFloat();
		System.out.println("Dime una nota: ");
		float nota3=teclado.nextFloat();
		
		float nota = 0;
		boolean aprobado = false;
		
	
		if ((nota1+nota2+nota3)/3>=5){
			nota=(nota1+nota2+nota3)/3;
			aprobado=true;
        }
	
		if(nota1>=5&&nota2>=5&&!aprobado){
			nota=(nota1+nota2)/2;
			aprobado=true;
		}
	  
		if(nota2>=5&&nota3>=5&&!aprobado){
		    nota=(nota2+nota3)/2;
		    aprobado=true;
		}
		 
		if(nota1>=5&&nota3>=5&&!aprobado){
		    nota=(nota1+nota3)/2;
		    aprobado=true;
		}
		  
		//Si notaObtenida es false no se ha cumplido ninguna de las cuatro condiciones y por tanto el módulo está suspenso 
		  
		if (aprobado){
		    System.out.println("Módulo aprobado");
		    System.out.println("Nota="+formateador1.format(nota));
		}else {
		  System.out.println("Módulo suspenso");
		}
		
		 
	}

}
