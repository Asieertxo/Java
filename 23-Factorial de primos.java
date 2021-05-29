public class ejercicio23 {

	public static void main(String[] args) {
		
		int primo=0;
		int nprimo=0;
		float factorial=0;
		
		for (int i=2; i<=30; i++) {
			primo=0;
			for (int j=1; j<=i; j++) {
				if (i%j == 0) {
					primo++;
				}
			}
			if (primo == 2) {
				nprimo++;
				System.out.print("Numero primo: " + i);
				factorial=1;
				for (int h=2; h<=i; h++) {
					factorial=factorial*h;
				}
				System.out.println("      Factorial " + factorial);
			}

		}
		System.out.print("Numero de numero primos encontrados: " + nprimo);

	}

}
