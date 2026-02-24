import java.util.Scanner;

public class Ejercicio4ParteA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int angulo,temperatura;

        System.out.print("ingrese el valor del angulo: ");

        angulo=sc.nextInt();

      
        if (angulo==90) {

            System.out.println("El ángulo es recto");
            
        } 
        else {
            System.out.println("El ángulo no es recto");

        }

       System.out.println("-------------Condicional de temperatura del agua---------------");

       System.out.println("ingrese la temperatura del agua: ");
       temperatura= sc.nextInt();

       if (temperatura>100) {

        System.out.println("por encima del punto de ebullición del agua");
        
       }
       else if (temperatura<100) {
        
        System.out.println("por debajo del punto de ebullición del agua");
        
       }else {

         System.out.println("temperatura se encuentra en el punto de ebullicion (100°).");
       }
         
        

       

       sc.close();
        
    }
}
