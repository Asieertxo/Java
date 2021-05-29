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
		
		//Visualizar las temperaturas maximas
		float nmax = tempMax[0];
		float nmin = tempMax[0];
		float mediamax = 0;
		for(byte i = 0; i<tempMax.length; i++){
			if(nmax < tempMax[i]){ //temperatura maxima
				nmax = tempMax[i];
			}
			if(nmin > tempMax[i]){ //temperatura minima
				nmin = tempMax[i];
			}
			
			mediamax = mediamax + tempMax[i] / tempMax.length; //temperatura media
		}
		System.out.println("Temperatura maxima mayor: " + nmax);
		System.out.println("Temperatura maxima menor: " + nmin);
		System.out.println("Temperatura media maxima: " + mediamax);
		
		//Visualizar las temperaturas minimas
		nmax = tempMin[0];
		nmin = tempMin[0];
		float mediamin = 0;
		for(byte i = 0; i<tempMin.length; i++){
			if(nmax < tempMin[i]){ //temperatura maxima
				nmax = tempMin[i];
			}
			if(nmin > tempMin[i]){ //temperatura minima
				nmin = tempMin[i];
			}
			
			mediamin = mediamin + tempMin[i] / tempMin.length; //temperatura media
		}
		System.out.println("Temperatura minima mayor: " + nmax);
		System.out.println("Temperatura minima menor: " + nmin);
		System.out.println("Temperatura media minima: " + mediamin);
	}
}
