public class CArray {
	public static int veces(int a[], int num) {
		int veces = 0;
		for (int i=0; i<a.length; i++){
			if (a[i] == num) {
				veces++;
			}
		}
		return veces;
	}
}
