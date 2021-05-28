public class ejercicio12{
	public static void main(String[] args){
		byte n=0; // contador de años
		
		for (int i=1901;i<=2000;i++) // el sigo XX empieza en 1901 y termina en el 2000{
			if (i%4==0){
				if (i%100!=0) {
					n++;
				}else if (i%400==0) {
					n++;
				}
			}
		System.out.print(n);	
	}
}
