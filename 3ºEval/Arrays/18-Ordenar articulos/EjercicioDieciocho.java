public class EjercicioDieciocho
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
  //ordenación descendente por nombre de artículo
  //método de inserción
  String str;
  CArticulo aux;
  int j;
  for(int i=1;i<articulo.length;i++)
   {
   aux=articulo[i];
   str=aux.getNombre();
   j=i-1;
   while(j>=0&&(str.compareTo(articulo[j].getNombre())>0))
    {
    articulo[j+1]=articulo[j];
    j--;
    }
   articulo[j+1]=aux;
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
