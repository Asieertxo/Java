public class Main{
	public static void main(String[] args){
		float nota;
		boolean noEvaluado;
		int evaluacion;
		String nombre,apellidos,modulo;
		CAlumno alumnosDaw[]=new CAlumno[30];
	 
		//genera los 30 nombres y apellidos matriculados en Programación
		for(int i=0;i<alumnosDaw.length;i++){
			nombre="Nombre"+String.valueOf(i+1);
			apellidos="Apellidos"+String.valueOf(i+1);
		 	alumnosDaw[i]=new CAlumno(nombre,apellidos);
		 	alumnosDaw[i].setModulo("Programación");
		}
		
		//genera las notas de las tres evaluaciones para todos los alumnos
		for(int i=0;i<alumnosDaw.length;i++){
			for(int j=0;j<3;j++){
				//generar No Evaluados aleatorios
				noEvaluado=false;
				if(CNumeroAleatorio.pedir((short)0,(short)3,(byte)0)==2) {
					noEvaluado=true;
				}
					
				nota=CNumeroAleatorio.pedir((short)0,(short)10,(byte)2);
				evaluacion=j+1;
				alumnosDaw[i].setNota(evaluacion,nota,noEvaluado);
			}
		}
		
		//visualizar los datos generados
		for(int i=0;i<alumnosDaw.length;i++){
			nombre=alumnosDaw[i].getNombre();
			apellidos=alumnosDaw[i].getApellidos();
			modulo=alumnosDaw[i].getModulo();
			System.out.println("Alumno:"+nombre+" "+apellidos);
			System.out.println("Módulo:"+modulo);
			System.out.println("Notas:");
			float notas[];
			boolean presentado[];
			notas=alumnosDaw[i].getNotas();
			presentado=alumnosDaw[i].getPresentado();
			for(int j=0;j<notas.length;j++){
				System.out.print("Evaluación nº "+(j+1)+": ");
				if(presentado[j]) {
					System.out.println(notas[j]);
				}else{
					System.out.println("No evaluado");
				}
			}
		}
	}
}
