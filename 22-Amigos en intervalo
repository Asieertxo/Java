public class ejercicio22 {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=0;
		int suma1=0;
		int suma2=0;
		int anterior=0;
		
		for (int j=1; j<=6000; j++) {
			for (int h=1; h<=6000; h++) {
				n1=j;
				n2=h;

				suma1=0;
				for (int i=1; i<n1; i++) {
					if (n1%i == 0){
						suma1=suma1+i;
					}
				}
				suma2=0;
				for (int i=1; i<n2; i++) {
					if (n2%i == 0){
						suma2=suma2+i;
					}
				}
				if (n1 == suma2 && n2 == suma1 && suma1 != n1 && suma2 != n2 && n1 != anterior) {
					System.out.println("son amigos: " + n1 + " y " + n2);
					anterior=n2;
				}else {
					
				}
			}
		}
	}

}
