import java.util.Scanner;

public class DiasSemanasIf {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int dia;

        String nombreDia;

        System.out.print("ingrese un número del 1 al 7: ");
        dia=sc.nextInt();


      if (dia==1) {
        nombreDia="lunes";
        
        
      }else if (dia==2) {
           nombreDia="martes";

        
      }else if (dia==3) {
           nombreDia="miercoles";

        
      }else if (dia==4) {
           nombreDia="jueves";

        
      }else if (dia==5) {
           nombreDia="viernes";

        
      }else if (dia==6) {
           nombreDia="sabado";

        
      }else if (dia==7) {
           nombreDia="domingo";

        
      } else {

        nombreDia="error numero invalido";
         System.out.println( nombreDia);
         return;
      }

     System.out.println("el dia es: "+ nombreDia);
     
     sc.close();

    }
}
