import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horas,turno;
        double tarifaHora = 0;

        System.out.print("Ingrese las horas trabajadas: ");
         horas = sc.nextInt();

        System.out.print("Seleccione el turno (1-Diurno / 2-Nocturno): ");
         turno = sc.nextInt();

        System.out.print("¿Es domingo? (true/false): ");
        boolean esDomingo = sc.nextBoolean();
        

        if (turno == 1) { 
            tarifaHora = 5;
            if (esDomingo) {
                tarifaHora += 2; 
            }
        } else if (turno == 2) { 
            tarifaHora = 8;
            if (esDomingo) {
                tarifaHora += 3; 
            }
        }

        double totalJornal = horas * tarifaHora;

        System.out.println("--- Resumen del Pago ---");
        System.out.println("Tarifa aplicada por hora: " + tarifaHora + "€");
        System.out.println("Total a pagar por el jornal: " + totalJornal + "€");
        
        sc.close();
        
    }
}
