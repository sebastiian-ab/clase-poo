import java.util.Scanner;

public class Ejercicio4ParteB {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("--- EJERCICIO C ---");
        int totalPositivos = 0, totalNegativos = 0,numeral;
        System.out.print("Ingrese un número (numeral): ");
         numeral = sc.nextInt();

        if (numeral>0) {

            totalPositivos +=numeral;
            System.out.println("Se sumó a positivos. Total: "+totalPositivos);

            
        } else{
          
            totalNegativos +=numeral;
            System.out.println("se sumo a negativos. total: "+totalNegativos);

        }

        System.out.println("\n--- EJERCICIO D ---");
         int x,y,z;
        
        System.out.print("Ingrese X: ");
         x = sc.nextInt();
        System.out.print("Ingrese Y: ");
         y = sc.nextInt();
        System.out.print("Ingrese Z: ");
         z = sc.nextInt();

         if (x>y && z<20) {

            System.out.print("ingrese el  valor para p:");
           double p=sc.nextDouble();
           System.out.println("El valor de p es: " + p);

            
         } else{

            System.out.println("no se cumplio la condicion: ");
         }

         System.out.println("----- EJERCICIO E -----");
         
        System.out.print("Ingrese la distancia: ");
        double distancia = sc.nextDouble();

        if (distancia > 20 && distancia < 35) {
            System.out.print("Distancia en rango. Ingrese tiempo: ");
            double tiempo = sc.nextDouble();
            System.out.println("Tiempo registrado: " + tiempo);
        } else {
            System.out.println("Distancia fuera de rango (21-34)");
        }

        sc.close();
    }
}
