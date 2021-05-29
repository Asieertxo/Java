class CMes {
	
	CMes (byte mes, byte dias){
		this.mes = mes;
		this.dias = dias;
		
		tempMin = new byte[dias];
		for(int i=0; i<tempMin.length; i++){
			tempMin[i]=(byte)(Math.random()*10);
		}
		
		tempMax = new byte[dias];
		byte nElementos = 0;
		byte temperaturaMax;
		while(tempMax.length > nElementos){
			temperaturaMax = (byte)(Math.random()*40);
			if(temperaturaMax >= 20 && 40 >= temperaturaMax){
				tempMax[nElementos] = temperaturaMax;
				nElementos++;
			}
		}
	}

	private int año;
	private byte mes;
	private byte dias;
	private byte tMinMenor;
	private byte tMinMayor;
	private byte tMaxMenor;
	private byte tMaxMayor;
	private float tMinMed;
	private float tMaxMed;
	byte tempMin[];
	byte tempMax[];
	
	/*.........................calculos con temperaturas minimas*/
	void CalcularTMinMenor(){
		tMinMenor = tempMin[0];
		for(byte i=0; tempMin.length>i; i++){
			if(tMinMenor > tempMin[i]){
				tMinMenor = tempMin[i];
			}
		}
	}
	
	void CalcularTMinMayor(){
		tMinMayor = tempMin[0];
		for(byte i=0; tempMin.length>i; i++){
			if(tMinMayor < tempMin[i]){
				tMinMayor = tempMin[i];
			}
		}
	}
	
	void CalcularTMinMed(){
		tMinMed = 0;
		for(byte i=0; tempMin.length>i; i++){
			tMinMed = (tMinMed + tempMin[i]);
		}
		
		tMinMed = (tMinMed / tempMin.length);
	}
	
	/*.........................calculos con temperaturas maximas*/
	void CalcularTMaxMenor(){
		tMaxMenor = tempMax[0];
		for(byte i=0; tempMax.length>i; i++){
			if(tMaxMenor > tempMax[i]){
				tMaxMenor = tempMax[i];
			}
		}
	}
	
	void CalcularTMaxMayor(){
		tMaxMayor = tempMax[0];
		for(byte i=0; tempMax.length>i; i++){
			if(tMaxMayor < tempMax[i]){
				tMaxMayor = tempMax[i];
			}
		}
	}
	
	void CalcularTMaxMed(){
		tMaxMed = 0;
		for(byte i=0; tempMax.length>i; i++){
			tMaxMed = (tMaxMed + tempMax[i]);
		}
		tMaxMed = (tMaxMed / tempMax.length);
	}
	
	/*.........................get de minimas*/
	byte getTMinMenor(){
		return tMinMenor;
	}
	byte getTMinMayor(){
		return tMinMayor;
	}
	float getTMinMed(){
		return tMinMed;
	}
	
	/*.........................get de maximas*/
	byte getTMaxMenor(){
		return tMaxMenor;
	}
	byte getTMaxMayor(){
		return tMaxMayor;
	}
	float getTMaxMed(){
		return tMaxMed;
	}
	
	
	byte getMes(){
		return mes;
	}
	byte getDias(){
		return dias;
	}
	
}
