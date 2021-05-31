public class EjercicioVentitres
 {
 public static void main(String[] args)
  {
  CTemperaturaAnual majadahonda2020=new CTemperaturaAnual("Majadahonda",(short)2020);
  float tMin[][]=majadahonda2020.getTMin();
  System.out.println("Estación de medición:"+majadahonda2020.getEstacionDeMedicion());
  short año=majadahonda2020.getAño();
  System.out.println("Año:"+año);
  byte dias;
  for(int i=0;i<tMin.length;i++)
   {
   dias=CCalendario.numeroDias((byte)(i+1));
   if((i+1)==2&&CCalendario.esBisiesto(año))
    dias++;
   for(int j=0;j<dias;j++)
    {
    majadahonda2020.setTMin((byte)(i+1),(byte)(j+1),CNumeroAleatorio.pedir((short)0,(short)3,(byte)2));  
    }
   }
  byte mes=12;
  System.out.println("Temperaturas desordenadas");
  System.out.println("-------------------------");
  for(int i=0;i<tMin[mes-1].length;i++)
   {
   System.out.println("Día:"+(byte)(i+1)+" Temperatura:"+tMin[mes-1][i]);
   }
  System.out.println("Temperaturas ordenadas");
  System.out.println("-------------------------");
  float tMes[][]=majadahonda2020.mesTMinOrdenadoB(mes);
  for(int i=0;i<tMes.length;i++)
   {
   System.out.println("Día:"+(byte)(tMes[i][0])+" Temperatura:"+tMes[i][1]);
   }
  }
 }
