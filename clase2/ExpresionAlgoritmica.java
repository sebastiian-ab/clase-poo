public class ExpresionAlgoritmica {
    public static void main(String[] args) {
       
        double a = 1;
        double b = 5;
        double c = 6;

        // 2. Traducimos la expresión: sqrt(b^2 - 4ac)

        double resultado= Math.sqrt(Math.pow(b, 2)  -  (4*a*c));
        System.out.println("El resultado de la expresión a) es: " + resultado);
    }
}
