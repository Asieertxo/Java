public class OrdenacionInsercion{
	public static void main(String[] args){
		//generar array
		int numeros[];
		double numeroA;
		int tamaño=15;
		numeros=new int[tamaño];
		for(int i=0;i<numeros.length;i++){
			numeroA=Math.random()*1000;
			numeros[i]=(int)numeroA;
		}
 
 
	 	//ordenar el array de forma ascendente
	 	int aux;
	 	int j;
	 	for(int i=1;i<numeros.length;i++){
	 		aux=numeros[i];
	 		j=i-1;
	 		while(j>=0&&aux<numeros[j]){
	 			numeros[j+1]=numeros[j];
	 			j--;
	 		}
	 		numeros[j+1]=aux;
	 	}
 
 
	 	//visualizar el array
	 	for (int elemento:numeros){
	 		System.out.println(elemento);
		}
	}
}
