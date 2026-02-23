import java.util.Scanner;

public class DiasSemanasSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int dia;

        System.out.print("ingrese un numero del 1 al 7: ");

        dia=sc.nextInt();

        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia="lunes";
                break;

            case 2:
                nombreDia="martes";
                break;
            
            case 3:
                nombreDia="miercoles";
                break;

            case 4:
                nombreDia="jueves";
                break;

            case 5:
                nombreDia="viernes";
                break;

            case 6:
                nombreDia="sabado";
                break;

            case 7:
                nombreDia="domingo";
                break;
        
            default:

            nombreDia="error Número fuera de rango (debe ser 1-7)";
                break;
        }
        
        System.out.println("el dia que es: "+ nombreDia);

        sc.close();
    }
}
