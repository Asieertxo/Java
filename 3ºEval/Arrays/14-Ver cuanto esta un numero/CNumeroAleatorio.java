class CNumeroAleatorio{
	//inicio y fin define el intervalo al que queremos que pertenenezca el número
	//numeroDecimales indica el número de decimales que queremos que tenga el número, máximo tres
	static float pedir(short inicio,short fin,byte numeroDecimales){
		double numeroA;   //número generado
		float numero;     //número a devolver
		short aux;
		if (inicio>fin) {   //en caso de intervalo erróneo, intercambiamos los límites
			aux=inicio;
			inicio=fin;
			fin=aux;
		}
		
		short factor;     //valor para obtener los números decimales requeridos
		switch (numeroDecimales){
		case 0:
			factor=1;
			break;
		case 1:
			factor=10;
			break;
		case 2:
			factor=100;
			break;
		default:
			factor=1000;
		}
		
		do{
			numeroA=Math.random();
			numeroA*=fin;
			numero=(float)(Math.floor(numeroA*factor)/factor);
		}while(numero<inicio);//el númeroA nunca es mayor que fin
		
		return numero;
	}
}
