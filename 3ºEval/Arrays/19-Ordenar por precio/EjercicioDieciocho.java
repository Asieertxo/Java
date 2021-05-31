public class EjercicioDiecinueve
 {
 public static void main(String[] args)
  {
  CArticulo articulo[]=new CArticulo[20];
  String nombre;
  float precio;
  byte iva;
  short inicio=10;
  short fin=40;
  byte numeroDecimales=2;
  //creación de los objetos del array
  for(int i=0;i<articulo.length;i++)
   {
   if(i+1<10) //para que todos los nombres tengan dos dígitos
    nombre="Artículo0"+String.valueOf(i+1);
   else
    nombre="Artículo"+String.valueOf(i+1);
   precio=CNumeroAleatorio.pedir(inicio,fin,numeroDecimales);
   iva=(byte)CNumeroAleatorio.pedir((short)0,(short)4,(byte)0);
   if(iva==1)
    iva=4;
   else if(iva==2)
    iva=10;
   else
    iva=21;
   articulo[i]=new CArticulo(nombre,precio,iva);
   }
  //ordenación ascendente por precio de artículo
  //método de la burbuja
  CArticulo aux;
  int longitud=articulo.length;
  boolean cambio=true;
  while(cambio)
   {
   cambio=false;
   for(int i=0;i<longitud-1;i++)
    {
    if (articulo[i].getPrecio()>articulo[i+1].getPrecio())
     {
     aux=articulo[i];
     articulo[i]=articulo[i+1];
     articulo[i+1]=aux;
     cambio=true;
     }
    }
   longitud--;
   }
  //visualización del array
  for(CArticulo elemento:articulo)
   {
   nombre=elemento.getNombre();
   precio=elemento.getPrecio();
   iva=elemento.getIva();
   System.out.println(nombre+" "+precio+" "+iva);
   }
  }
 }
