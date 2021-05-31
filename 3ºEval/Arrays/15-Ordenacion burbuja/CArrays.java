public class CArrays {
	/*Nos dice las veces que esta un numero en un array*/
	public static int veces(int a[], int num) {
		int veces = 0;
		for (int i=0; i<a.length; i++){
			if (a[i] == num) {
				veces++;
			}
		}
		return veces;
	}
	
	/*Ordenamos el array de mayor a menor (descendente)*/
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
}
