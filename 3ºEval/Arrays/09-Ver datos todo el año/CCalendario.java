class CCalendario {

	static byte numeroDias(byte mes){
		byte dias = 0;
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias = 30;
				break;
			case 2:
				dias = 28;
				break;
		}
		return dias;
	}
	
	
	static boolean esBisiesto(short año){
		boolean bisiesto = false;
		
		if (año%4 == 0){
			if (año%100 != 0){
				bisiesto = true;
			}else if (año%400 == 0){
				bisiesto = true;
			}
		}
		return bisiesto;
	}
	
	static String nombreMes(byte mes){
		String nMes = null;
		switch(mes){
			case 1:
				nMes = "Enero";
				break;
			case 2:
				nMes = "Febrero";
				break;
			case 3:
				nMes = "Marzo";
				break;
			case 4:
				nMes = "Abril";
				break;
			case 5:
				nMes = "Mayo";
				break;
			case 6:
				nMes = "Junio";
				break;
			case 7:
				nMes = "Julio";
				break;
			case 8:
				nMes = "Agosto";
				break;
			case 9:
				nMes = "Septiembre";
				break;
			case 10:
				nMes = "Octubre";
				break;
			case 11:
				nMes = "Noviembre";
				break;
			case 12:
				nMes = "Diciembre";
				break;
		}
		return nMes;
	}
	
}
