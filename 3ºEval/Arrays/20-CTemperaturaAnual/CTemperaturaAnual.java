import java.util.Arrays;
class CTemperaturaAnual
 {
 //constructor
 CTemperaturaAnual(String estacionDeMedicion,short año)
  {
  this.año=año;
  this.estacionDeMedicion=estacionDeMedicion;
  this.crearTMin();
  this.crearTMax();
  }
 private short año;
 private String estacionDeMedicion;
 private float tMin[][];
 private float tMax [][];
 
 //métodos privados
 
 //crea el array de meses para temperaturas mínimas
 private void crearTMin() 
  {
  tMin=new float[12][];	  
  }
 
 //crea el array de meses para temperaturas máximas
 private void crearTMax() 
  {
  tMax=new float[12][];	  
  }
 
 //crea el array del mes para temperaturas mínimas
 private void crearArrayMesTMin(byte mes,byte dias)
  {
  tMin[mes-1]=new float[dias];  
  }
 
 //crea el array del mes para temperaturas máximas
 private void crearArrayMesTMax(byte mes,byte dias)
  {
  tMax[mes-1]=new float[dias];  
  }
 
 //métodos de nivel de protección de paquete
 
 void setAño(short año)
  {
  this.año=año;
  }
  
 short getAño()
  {
  return año;  
  }
  
 void setEstacionDeMedicion(String estacionDeMedicion)
  {
  this.estacionDeMedicion=estacionDeMedicion;  
  }
  
 String getEstacionDeMedicion()
  {
  return estacionDeMedicion;	  
  }
  
 float[][] getTMin()
  {
  return tMin;	 
  }
  
 float[][] getTMax()
 {
 return tMax;	 
 }
 
 //almacena la temperatura mínima de un día de un mes
 //devuelve true si se almacena y false si no
 boolean setTMin(byte mes,byte dia,float t) //t es la temperatura
  {
  if(mes>0&&mes<13)
   {
   byte dias=CCalendario.numeroDias(mes);
   if(mes==2&&CCalendario.esBisiesto(this.año))
	dias++;
   if(dia>0&&dia<=dias)
    {
	//comprobar que el array del mes está creado
	if (tMin[mes-1]==null)
	 //crear el array
	 this.crearArrayMesTMin(mes,dias);	
	tMin[mes-1][dia-1]=t;
	return true;
    }
   else
	return false;
   }
  else
   return false;
  }
  
 //almacena la temperatura máxima de un día de un mes
 //devuelve true si se almacena y false si no 
 boolean setTMax(byte mes,byte dia,float t) //t es la temperatura
  {
  if(mes>0&&mes<13)
   {
   byte dias=CCalendario.numeroDias(mes);
   if(mes==2&&CCalendario.esBisiesto(this.año))
	dias++;
   if(dia>0&&dia<=dias)
    {
	//comprobar que el array del mes está creado
	if (tMax[mes-1]==null)
	 //crear el array
	 this.crearArrayMesTMax(mes,dias);	
	tMax[mes-1][dia-1]=t;
	return true;
    }
   else
  	return false;
   }
  else
   return false;
  }
 
 //ordena de forma ascendente las temperaturas mínimas
 //del mes que se pasa como parámetro
 //y las devuelve en un array unidimensional
 //si el mes está fuera de rango devuelve null
 float[] mesTMinOrdenado(byte mes)
  {
  if(mes>0&&mes<13)
   {
   //almacenar en tMes las temperaturas mínimas del mes 
   float tMes[]=tMin[mes-1].clone();
   Arrays.sort(tMes);
   return tMes;
   }
  else
   return null;
  }

 //ordena de forma ascendente las temperaturas máximas
 //del mes que se pasa como parámetro
 //y las devuelve en un array unidimensional
 //si el mes está fuera de rango devuelve null
 float[] mesTMaxOrdenado(byte mes)
  {
  if(mes>0&&mes<13)
   {
   //almacenar en tMes las temperaturas máximas del mes 
   float tMes[]=tMax[mes-1].clone(); 
   Arrays.sort(tMes);
   return tMes;
   }
  else
   return null;
  }
 
 //ordena de forma ascendente las temperaturas mínimas
 //del mes que se pasa como parámetro
 //y las devuelve en un array bidimensional
 //que tambien almacena las posiciones que se
 //corresponden con el día del mes
 //si el mes está fuera de rango devuelve null
 float[][] mesTMinOrdenadoB(byte mes)
  {
   if(mes>0&&mes<13)
    {
    //almacenar en tMes las temperaturas mínimas del mes
    //y las posiciones que se corresponden con los días del mes
    float tMes[][]=new float[tMin[mes-1].length][2]; 
    for(int i=0;i<tMin[mes-1].length;i++)
     {
     tMes[i][0]=i+1; //día del mes
     tMes[i][1]=tMin[mes-1][i]; //temperatura del dia
     }
    //ordenar el array bidimensional tMes de forma ascendente
    //manteniendo la asociación temperatura:día del mes
    //método de la burbuja
    float aux[]=null;
    int longitud=tMes.length;
    boolean cambio=true;
    while(cambio)
     {
     cambio=false;
     for(int i=0;i<longitud-1;i++)
      {
      if (tMes[i][1]>tMes[i+1][1])
       {
       aux=tMes[i];
       tMes[i]=tMes[i+1];
       tMes[i+1]=aux;
       cambio=true;
       }
      }
     longitud--;
     }
    return tMes;
    }
   else
    return null;
  }
 
 //ordena de forma ascendente las temperaturas máximas
 //del mes que se pasa como parámetro
 //y las devuelve en un array bidimensional
 //que tambien almacena las posiciones que se
 //corresponden con el día del mes
 //si el mes está fuera de rango devuelve null
 float[][] mesTMaxOrdenadoB(byte mes)
 {
  if(mes>0&&mes<13)
   {
   //almacenar en tMes las temperaturas máximas del mes
   //y las posiciones que se corresponden con los días del mes
   float tMes[][]=new float[tMax[mes-1].length][2]; 
   for(int i=0;i<tMax[mes-1].length;i++)
    {
    tMes[i][0]=i+1; //día del mes
    tMes[i][1]=tMax[mes-1][i]; //temperatura del dia
    }
   //ordenar el array bidimensional tMes de forma ascendente
   //manteniendo la asociación temperatura:día del mes
   //método de la burbuja
   float aux[]=null;
   int longitud=tMes.length;
   boolean cambio=true;
   while(cambio)
    {
    cambio=false;
    for(int i=0;i<longitud-1;i++)
     {
     if (tMes[i][1]>tMes[i+1][1])
      {
      aux=tMes[i];
      tMes[i]=tMes[i+1];
      tMes[i+1]=aux;
      cambio=true;
      }
     }
    longitud--;
    }
   return tMes;
   }
  else
   return null;
 } 
}
