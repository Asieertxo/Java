public class ejercicio24  {
	public static void main(String[] args){
		final byte LIMITE=10;
		byte eN2; //elemento n-2
		byte eN1; //elemento n-1
		byte eN;  //elemento n
		eN2=0;
		eN1=1;
		
		System.out.print(eN2 + "," + eN1 + ",");
		
		
		for (byte i=3; i<=LIMITE; i++) {
			eN=(byte)(eN2+eN1);
			System.out.print(eN);
			
			if (i<LIMITE) {
				System.out.print(",");
			}
			eN2=eN1;
			eN1=eN;
		}
	}
}
