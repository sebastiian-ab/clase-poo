public class EjecutarNotas {

    public static void main(String[] args) {
         
        OperacionesNotas op = new OperacionesNotas();

        
        double[] notas = new double[4];

        
        notas[0] = 4.5;
        notas[1] = 3.8;
        notas[2] = 4.2;
        notas[3] = 5.0;

        
        op.mostrarNotas(notas);

        
        double promedio = op.calcularPromedio(notas);

        
        System.out.println("El promedio es: " + promedio);
    
    }
    
}
