public class invertirArray {
	static void invertirArray(int a[]) {

		int inicio = 0;
		int fin = a.length - 1;
		int aux;
		
		while (inicio > fin) {
			aux = a[inicio];
			a[inicio] = a[fin];
			a[fin] = aux;
			inicio++;
			fin--;
		}
		
		
	}
}
