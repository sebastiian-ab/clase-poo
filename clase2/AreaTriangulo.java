import java.util.Scanner;

public class AreaTriangulo {

  public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

   double b = 10.5; 

     double a = 5.0;

     double su = (b * a) / 2;
    System.out.println("Base: " + b);
     System.out.println("Altura: " + a);
     System.out.println("La superficie calculada es: " + su);

  //-----------------------------------------------------------------------------------//
    
   double base , altura , superficie ;

   System.out.println("Ingresa la base del triángulo: ");
        base = entrada.nextDouble();

   System.out.println("Ingresa la altura del triángulo: ");
        altura = entrada.nextDouble();


        superficie = (base * altura) / 2;
        System.out.println("La superficie del triángulo es: " + superficie);

        entrada.close();





  }

}