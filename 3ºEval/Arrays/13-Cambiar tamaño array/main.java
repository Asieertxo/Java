import java.util.Arrays;

import java.util.Scanner;
public class main{
	public static void main(String[] args){
		int a[] = new int[15];
		
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*100);
		}
		
		Arrays.sort(a);
		CArray.invertir(a);
		
		for (int elemento : a){
			System.out.println(elemento);
		}
		
		System.out.println("............................................");
		
		if(a != null) {
			a = CArray.cambiarTamaño(a);
			for (int elemento : a) {
				System.out.println(elemento);
			}
		}
		
	}
}
