import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double distancia, duracion, precioTotal, descuento;
        double precioKilometro=2.5;
        System.out.print("ingrese la distancia en km: ");
        distancia=sc.nextDouble();
        System.out.print("ingrese la duracion de los dias: ");
        duracion=sc.nextDouble(); 

        precioTotal=(distancia*2)* precioKilometro;

        if (distancia>800 && duracion>7) {
            descuento= precioTotal * 0.30;
            precioTotal=precioTotal - descuento;
            System.out.println("¡Se ha aplicado un descuento del 30%!");
            
        }

        System.out.println("el precio final es: "+precioTotal+ " euros ");

        sc.close();
        
        

    }
}
