import java.util.Arrays;
import java.util.Scanner;

public class CArrays {
	/*Nos dice las veces que esta un numero en un array*/
	public static int NumeroVeces(int a[], int num) {
		int veces = 0;
		for (int i=0; i<a.length; i++){
			if (a[i] == num) {
				veces++;
			}
		}
		return veces;
	}
	
	/*Cambiar el tamaño de un Array, pasamos numero +-*/
	public static int[] cambiarTamaño(int a[]) {
		int cambio;
		int b[]=null;
		 
		Scanner teclado=new Scanner(System.in);
		System.out.println("Variacion del Array: ");
		cambio=teclado.nextInt();
		
		if(cambio==0) {
			b=a.clone();
			return b;
		}
		if(cambio < 0) {
			if(-cambio >= a.length) {
				System.out.println ("No se puede reducir tanto el array");
				b = a.clone();
				return b;
			}else{
				b=Arrays.copyOf(a, a.length + cambio);
				return b;
			}
		}else{
			b=Arrays.copyOf(a, a.length + cambio);
			return b;
		}
	}


	/*Ordena de mayor a menor*/
	public static void OrdenDescendente(int a[]) {
		int inicio = 0;
		int fin = a.length - 1;
		int aux;

		while (inicio < fin) {
			aux = a[inicio];
			a[inicio] = a[fin];
			a[fin] = aux;
			inicio++;
			fin--;
		}	
	}
	
	/*Ordena de menor a mayor*/
	public static void OrdenAscendente(int a[]) {
		int inicio = 0;
		int fin = a.length - 1;
		int aux;

		while (inicio > fin) {
			aux = a[inicio];
			a[inicio] = a[fin];
			a[fin] = aux;
			inicio++;
			fin--;
		}	
	}


	
	/*--------------------------------Burbuja---------------------------------------------------*/
	
	/*Ordenacion del array de menor a mayor metodo Burbuja*/
	public static void OrdenBurbujaAscendente(int a[]) {
		int aux=0;
		int longitud=a.length;
		boolean cambio=true;
		while(cambio){
			cambio=false;
			for(int i=0;i<longitud-1;i++){
				if (a[i]<a[i+1]){
					aux=a[i];
					a[i]=a[i+1];
					a[i+1]=aux;
					cambio=true;
				}
			}
			longitud--;
		}
	}
	
	/*Ordenacion del array de mayor a menor metodo Burbuja*/
	public static void OrdenBurbujaDescendente(int a[]) {
		int aux=0;
		int longitud=a.length;
		boolean cambio=true;
		while(cambio){
			cambio=false;
			for(int i=0;i<longitud-1;i++){
				if (a[i]<a[i+1]){
					aux=a[i+1];
					a[i+1]=a[i];
					a[i]=aux;
					cambio=true;
				}
			}
			longitud--;
		}
	}

	/*--------------------------------Selecion--------------------------------------------------*/
	
	/*Ordenacion del array de menor a mayor metodo OrdenacionSeleccion*/
	public static void OrdenSeleccionAscendente (int a[]) {
		int posicion;
		int aux;
		for(int i=0;i<a.length-1;i++){
			posicion=i;
			for(int j=i;j<a.length-1;j++){
				if(a[posicion]>a[j+1])
					posicion=j+1;
			}
			aux=a[i];
			a[i]=a[posicion];
			a[posicion]=aux;
		}
	}
	
	/*Ordenacion del array de mayor a menor metodo OrdenacionSeleccion*/
	public static void OrdenSeleccionDescendente (int a[]) {
		int posicion;
		int aux;
		for(int i=0;i<a.length-1;i++){
			posicion=i;
			for(int j=i;j<a.length-1;j++){
				if(a[posicion]<a[j+1])
					posicion=j+1;
			}
			aux=a[i];
			a[i]=a[posicion];
			a[posicion]=aux;
		}
	}

	/*--------------------------------Insercion-------------------------------------------------*/
	
	/*Ordenacion del array de menor a mayor metodo OrdenacionInsercion*/
	public static void OrdenInsercionAscendente(int a[]) {
		int aux;
		int j;
		for(int i=1;i<a.length;i++){
			aux=a[i];
			j=i-1;
			while(j>=0&&aux<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=aux;
		}
	}
	
	/*Ordenacion del array de mayor a menor metodo OrdenacionInsercion*/
	public static void OrdenInsercionDescendente(int a[]) {
		int aux;
		int j;
		for(int i=1;i<a.length;i++){
			aux=a[i];
			j=i-1;
			while(j>=0&&aux>a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=aux;
		}
	}
}
