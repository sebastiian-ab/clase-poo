public class OperacionesNumeros {

    public int encontrarMayor(int[] numeros) {
        int mayor = numeros[0]; 

        {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("num[" + i + "] = " + numeros[i]);
        }
    }

}
