import java.util.Scanner;

public class Ejercicio3ConEqualsIgnoreCase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CÁLCULO DE JORNAL (v2) ===");

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        sc.nextLine(); // Limpieza de buffer

        System.out.print("Ingrese el turno (Diurno/Nocturno): ");
        String turno = sc.nextLine(); // Guardamos el texto tal cual lo escriba el usuario

        System.out.print("¿Fue en domingo? (Si/No): ");
        String respuestaDomingo = sc.nextLine();

        double tarifaHora = 0;

        // Usamos .equalsIgnoreCase() para comparar directamente
        if (turno.equalsIgnoreCase("diurno")) {
            tarifaHora = 5;
            if (respuestaDomingo.equalsIgnoreCase("si")) {
                tarifaHora += 2;
            }
        } else if (turno.equalsIgnoreCase("nocturno")) {
            tarifaHora = 8;
            if (respuestaDomingo.equalsIgnoreCase("si")) {
                tarifaHora += 3;
            }
        } else {
            System.out.println("Error: El turno '" + turno + "' no es válido.");
            return;
        }

        double totalJornal = horas * tarifaHora;

        System.out.println("\n------------------------------");
        // Gracias a que no usamos .toLowerCase(), podemos mostrar el turno original
        System.out.println("Resumen para el turno: " + turno);
        System.out.println("Pago por hora: " + tarifaHora + "€");
        System.out.println("TOTAL A PAGAR: " + totalJornal + "€");
        System.out.println("------------------------------");
        
        sc.close();
    }
}
