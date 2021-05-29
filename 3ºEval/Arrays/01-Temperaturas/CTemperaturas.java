public class CTemperaturas {
	public static void main (String[] args){
		float tempMax[] = new float[30];
		float tempMin[] = new float[30];
		
		float temperatura;
		float numeroA;
		byte nElementos = 0;
		
		while (tempMax.length > nElementos){
			numeroA = (float)Math.random()*30;
			temperatura = (float)Math.floor(numeroA * 100)/100;
			
			if (temperatura >= 20 && temperatura <=30){
				tempMax[nElementos] = temperatura ;
				nElementos++;
			}
		}
		
		nElementos = 0;
		
		while (tempMin.length > nElementos){
			numeroA = (float)Math.random()*10;
			temperatura = (float)Math.floor(numeroA * 100)/100;
			
			tempMin[nElementos] = temperatura ;
			nElementos++;
		}
	}
}
