import java.util.Scanner;

public class CalcularCirculo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        double radio, longitud, area;

        System.out.println("ingrese el radio del circulo: ");
        radio=sc.nextDouble();

        longitud=2* Math.PI * radio;

        area=Math.PI * Math.pow(radio,2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);

        sc.close();
    }
}
