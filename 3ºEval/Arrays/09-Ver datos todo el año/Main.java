public class Main {

	public static void main (String[] args){
		CMes a2020[];
		a2020 = new CMes[12];
		
		byte dias;
		byte mes;
		short año = 2020;
		System.out.println("==================================================");
		System.out.println("Generar los arrays tempMin y tempMax del año" + año);
		System.out.println("==================================================");
		
		for(int i = 0; i < a2020.length; i++){
			mes = (byte)(i+1);
			dias = CCalendario.numeroDias(mes);
			
			if (mes == 2 && CCalendario.esBisiesto(año)){
				dias = (byte)(dias + 1);
			}
			
			System.out.println("Mes: " + CCalendario.nombreMes(mes) + " Dias: " + dias);
			a2020[i] = new CMes(mes, dias);
			a2020[i].CalcularTMinMenor();
			a2020[i].CalcularTMinMayor();
			a2020[i].CalcularTMinMed();
			a2020[i].CalcularTMaxMenor();
			a2020[i].CalcularTMaxMayor();
			a2020[i].CalcularTMaxMed();
		}
		System.out.println("===============================================");
		System.out.println("Visualizar valores estadisticos del año: " + año);
		System.out.println("===============================================");
		
		byte tMinAño = a2020[0].getTMinMenor();
		byte tMaxAño = a2020[0].getTMaxMayor();
		float tMedAño = 0;
		
		for(CMes elemento : a2020){
			if (elemento.getTMinMenor()<tMinAño) tMinAño=elemento.getTMinMenor(); //temperatura mínima del año
				if (elemento.getTMaxMayor()>tMaxAño){
					tMaxAño=elemento.getTMaxMayor(); //temperatura máxima del año
				}
				tMedAño+=elemento.getTMinMed()+elemento.getTMaxMed();                 //acumulador de temperaturas medias, dos por mes
				System.out.println("Mes:"+CCalendario.nombreMes(elemento.getMes()));
				System.out.println("Temperatura mínima menor:"+elemento.getTMinMenor());
				System.out.println("Temperatura mínima mayor:"+elemento.getTMinMayor());
				System.out.println("Temperatura máxima menor:"+elemento.getTMaxMenor());
				System.out.println("Temperatura máxima mayor:"+elemento.getTMaxMayor());
				System.out.println("Temperatura mínima media:"+(float)Math.floor(elemento.getTMinMed()*100)/100);
				System.out.println("Temperatura máxima media:"+(float)Math.floor(elemento.getTMaxMed()*100)/100);	  
				System.out.println(" ");
			}
			System.out.println(" ");
		  	System.out.println("Datos anuales");
		  	System.out.println(" ");
		  	System.out.println("Temperatura mínima del año:"+tMinAño);
		  	System.out.println("Temperatura máxima del año:"+tMaxAño);
		  	System.out.println("Temperatura media del año:"+(float)Math.floor(tMedAño/24*100)/100); //entre 24 porque son dos temperaturas medias por mes
		}

	
	
}	
