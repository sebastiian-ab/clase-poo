import java.util.Scanner;

public class SalarioSemanal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double tarifaHora, horasDiarias, diasTrabajados, salarioSemanal;

        System.out.print("¿Cuánto le pagan por hora?: ");
        tarifaHora=sc.nextDouble();

        System.out.print("¿Cuántas horas trabaja al día?: ");
        horasDiarias=sc.nextDouble();

        System.out.print("¿Cuántos días trabajó esta semana?: ");
        diasTrabajados=sc.nextDouble();

        salarioSemanal = tarifaHora * horasDiarias * diasTrabajados ;

        System.out.println("El salario total de la semana es: $" + salarioSemanal);

        sc.close();


    }
}