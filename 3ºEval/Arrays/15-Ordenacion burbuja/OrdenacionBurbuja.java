public class OrdenacionBurDes{
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
		CArrays.OrdenBurbujaDescendente(numeros);
		
		//visualizar el array
		for (int elemento:numeros){
			System.out.println(elemento);
		}
	}
}
