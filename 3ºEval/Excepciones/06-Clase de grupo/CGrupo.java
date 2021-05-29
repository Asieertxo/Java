public class CGrupo {

	private String ciclo;
	private byte curso;
	private byte pos1;
	private byte pos2;
	private byte nota;
	int notas[][] = new int[30][3];
	
	CGrupo(String ciclo, Byte curso) {
		this.ciclo = ciclo;
		this.curso = curso;
		int notas[][] = new int[30][3];
	}
	
	public void setNota(byte pos1, byte pos2, int nota) {
		notas[pos1][pos2] = nota;
	}
	
	public byte getNota(byte pos1, byte pos2) {
		int cogernota = notas[pos1][pos2];
		
		return (byte)cogernota;
	}
