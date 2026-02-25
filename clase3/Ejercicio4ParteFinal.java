import java.util.Scanner;

public class Ejercicio4ParteFinal {
    public static void main(String[] args) {
        //ejercicio de peso 4.7
 
         Scanner sc= new Scanner(System.in);
        
         System.out.print("cuantos alumnos: ");
         int cantidad= sc.nextInt();

         for(int i=1; i<=cantidad; i++){

         System.out.print("digite el peso del alumno: "+ i +":");

         int peso= sc.nextInt();

         if (peso<40) {
             System.out.println("menos de 40 kg: ");


            
         } else if (peso >=40 && peso <50) {

             System.out.println("entre 40 kg y  50 kg ");

            
         }else if (peso >=50 && peso <60) {

             System.out.println("mas de 50 y menos de 60 kg");
               
            
         }else {
            System.out.println("mas o igual a 60 kg");

         }

        }
 
        sc.close();

        
    }
    
}
