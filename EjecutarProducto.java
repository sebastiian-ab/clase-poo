public class EjecutarProducto {
    public static void main(String[] args) {
        
        Producto objP1 = new Producto("teclado",10012,10,230.0);
        System.out.println(objP1);
        
         //Mostrar el contenido del objeto objP1
         objP1.agregarStock(5);
        System.out.println(objP1);

        //Descontar 8 teclados y mostrar nuevemente el objeto "cantidad = 7"
        objP1.reducirStock(8);
        System.out.println(objP1);
        
        //Calcular el invetario
        //double total = objP1.calcularValorInventario(); Ejemplo 1
        //System.out.println(total);
        System.out.println(objP1.calcularValorInventario()); 
    }
}
 