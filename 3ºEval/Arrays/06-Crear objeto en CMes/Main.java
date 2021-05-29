public class Main {
	public static void main(String[] args) {

		CMes mes = new CMes((byte)30 , (byte)3);
		
		mes.CalcularTMaxMayor();
		mes.CalcularTMaxMenor();
		mes.CalcularTMaxMed();
		
		mes.CalcularTMinMayor();
		mes.CalcularTMinMenor();
		mes.CalcularTMinMed();
		
		System.out.println("Temperaturas maximas");
		System.out.println("Temperatura maxima mayor " + mes.getTMaxMayor());
		System.out.println("Temperatura maxima menor " + mes.getTMaxMenor());
		System.out.println("Temperatura media maxima " + mes.getTMaxMed());
		
		System.out.println();
		System.out.println("Temperaturas minimas");
		System.out.println("Temperatura minima mayor " + mes.getTMinMayor());
		System.out.println("Temperatura minima menor " + mes.getTMinMenor());
		System.out.println("Temperatura media minima " + mes.getTMinMed());
	}

}
