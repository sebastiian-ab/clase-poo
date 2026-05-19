public class EjecutarNumeros {
    public static void main(String[] args) {
        
        OperacionesNumeros op = new OperacionesNumeros();

        int[] numeros = new int[5];

        numeros[0] = 12;
        numeros[1] = 45;
        numeros[2] = 7;
        numeros[3] = 89;
        numeros[4] = 23;

        op.mostrarNumeros(numeros);

        int mayor = op.encontrarMayor(numeros);

        System.out.println("El número mayor es: " + mayor);
    
    }
    
}
