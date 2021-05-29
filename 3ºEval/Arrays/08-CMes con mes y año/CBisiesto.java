class CBisiesto {
	
	int año;
	boolean esbisiesto = false;
	CBisiesto (int año){
		this.año = año;
		
		
		if (año%4==0){
	        if (año%100!=0){
	        	esbisiesto = true;
	        }else if (año%400==0){
	        	esbisiesto = true;
	        }
		}
	}
	
	boolean getEsbisiesto(){
		return esbisiesto;
	}
	
}
