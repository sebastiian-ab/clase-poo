import java.util.Scanner;

public class Ejercicio3ConToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CÁLCULO DE JORNAL ===");

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer (importante para que no se salte el turno)

        System.out.print("Ingrese el turno (diurno/nocturno): ");
        String turno = sc.nextLine().toLowerCase(); // Convertimos a minúsculas para facilitar

        System.out.print("¿El trabajo fue en domingo? (si/no): ");
        String respuestaDomingo = sc.nextLine().toLowerCase();
        boolean esDomingo = respuestaDomingo.equals("si");

        double tarifaHora = 0, totalJornal;

        // Lógica con comparación de palabras
        if (turno.equals("diurno")) {
            tarifaHora = 5;
            if (esDomingo) {
                tarifaHora += 2;
            }
        } else if (turno.equals("nocturno")) {
            tarifaHora = 8;
            if (esDomingo) {
                tarifaHora += 3;
            }
        } else {
            System.out.println("Error: Turno no reconocido.");
            return; // Finaliza el programa si el turno es inválido
        }

        totalJornal = horas * tarifaHora;

        System.out.println("------------------------------");
        System.out.println("Resumen para turno " + turno + (esDomingo ? " (Domingo)" : ""));
        System.out.println("Pago por hora: " + tarifaHora + "€");
        System.out.println("TOTAL JORNAL: " + totalJornal + "€");
        System.out.println("------------------------------");
        
        sc.close();

    }
}
