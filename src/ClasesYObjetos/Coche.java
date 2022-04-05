
package ClasesYObjetos;

/**
 *
 * @author MIGUEL
 */
public class Coche {
    //atributios del coche
  String color;
  String marca;
 int km;  
   
 // creamos el metodo
   public static void main (String [] args)
   {
       // creamos el objeto
       Coche coche1 = new Coche();
       coche1.color = "blanco";
       coche1.marca="audi";
       coche1.km=0;
       
       System.out.println("el color del coche es:"+coche1.color);
      System.out.println("la marca delcoche es:"+coche1.marca);
      System.out.println("la distancia recorido es:"+coche1.km);
     // creamos el segundo objeto
      Coche coche2= new Coche();
      
      coche2.color = "rojo";
      coche2.marca = "Toyota";
      coche2.km =100;
      
      System.out.println("\nel color del coche2 es:"+coche2.color);
      System.out.println("la marca delcoche2 es:"+coche2.marca);
      System.out.println("la distancia recorido es:"+coche2.km);
      
   }
}
