public class OperacionesConArreglos {
    
    

    //Llenar el arreglo de enteros
    public int[] llenarArreglo(int[] a, int min, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return a;
    }

    //Mostrar el arreglo de enteros
    public void mostrarArreglo(int[] a){
        for (int i = 0; i < a.length; i++) {
           System.out.println("a["+i+"]="+a[i]); 
        }
    }


     public String sumarParesImpares(int[] a){
        int pares = 0, impares = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                pares += a[i];
            }else{
                impares += a[i];
            }
        }
        return "\nLa suma de los pares es: " + pares + " y la de los impares es: " + impares;
    }
}