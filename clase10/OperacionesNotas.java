public class OperacionesNotas {
    // Método para calcular el promedio
    public double calcularPromedio(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        return suma / notas.length;
    }

    // Método para mostrar las notas
    public void mostrarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota[" + i + "] = " + notas[i]);
        }
    }
}
