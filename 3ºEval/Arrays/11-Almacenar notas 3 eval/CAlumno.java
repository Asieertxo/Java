class CAlumno{
	CAlumno(String nombre,String apellidos){
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	private String nombre;
	private String apellidos;
	private String modulo;
	//almacena las notas de las tres evaluaciones
	private float notas[]=new float[3]; 
	//almacena true si ha presentado a la evaluación correspondiente y false en caso contrario
	private boolean presentado[]=new boolean[3];
 
	void setModulo(String modulo){
		this.modulo=modulo; 
 	}
 
	void setNota(int evaluacion,float nota,boolean noEvaluado){
		if(noEvaluado) {
			presentado[evaluacion-1]=false;
		}else{
			presentado[evaluacion-1]=true;
			notas[evaluacion-1]=nota;
		}
	}
 
	float[] getNotas(){
		return notas; 
	}
 
	boolean[] getPresentado(){
		return presentado; 
	}
 
	String getNombre(){
		return nombre; 
	}
 
	String getApellidos(){
		return apellidos; 
	}
 
	String getModulo(){
		return modulo; 
	}
}
