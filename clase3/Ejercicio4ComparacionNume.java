import java.util.Scanner;

public class Ejercicio4ComparacionNume {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double num1,num2;

        System.out.print("ingrese el primer numero: ");
        num1=sc.nextDouble();

        System.out.print("ingrese el segundo numero: ");
        num2=sc.nextDouble();

        if (num1>num2) {
            System.out.println("El primer número es el mayor.");
            
        }else if (num1<num2) {

            System.out.println("El primer número es el mas pequeño.");

        }else{
            System.out.println("ambos números son iguales.");
        }
        
        sc.close();
    }
}
