public class ejercicio20 {
	public static void main(String[] args){
		final byte LIMITE=15;
	    byte m=1;
	      
	    do{
	    	for (byte i=LIMITE; i>=m; i-=2){ 	
	    		System.out.print(i);
	    		if (i>m) {
	    			System.out.print("-");
	    		}
	    	}
	    	m+=2;
	    	System.out.print("\n");
	    }while (m<=LIMITE);
	    
	    m=LIMITE-2;
	    
	    do{
	    	for (byte i=LIMITE;i>=m;i-=2){ 	
	    		System.out.print(i);
	    		if (i>m) System.out.print("-");
	    	}
	    	m-=2;
	    	System.out.print("\n");
	    }while (m>=1);
	}
}
