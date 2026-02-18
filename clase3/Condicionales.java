import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //leer dos numeros y deducir si es creciente o decreciente

        /*  
        comentarios
        para
        varias lineas
        */
         
        int a,b;

         System.out.print("ingrese el numero: ");
         a=sc.nextInt();


         System.out.print("ingrese el segundo numero: ");
         b=sc.nextInt();
    
        if (a<=b) {

            System.out.println("orden creciente: ");
            
        }else{
            System.out.println("orden decreciente: ");
        }
            
    sc.close();


    }
}
