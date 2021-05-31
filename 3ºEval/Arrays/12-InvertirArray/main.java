import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		int a[] =new int[31];
		
		for(int i=0;i<a.length;i++){
		   a[i] = (int)(Math.random()*100);
		}
		
		Arrays.sort(a);
		invertirArray.invertirArray(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
}
