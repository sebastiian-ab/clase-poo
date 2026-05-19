

public class EjecutarRestaurante {
    public static void main(String[] args) {

        Bebida jugo= new Bebida("jugo de narajan", 3.50);
        Platillo pizza = new Platillo("Pizza Pepperoni", 12.00);

        Cliente alex=new Cliente("Alex", "87654321");
        Efectivo pagoEfectivo = new Efectivo(20.00);
        

        Orden miOrden= new Orden(18, "carlos", alex, pagoEfectivo);
        System.out.println(miOrden.agregarProductos(jugo, pizza));

        


       double totalDeLaOrden = pagoEfectivo.calculoTotal(15.50, 2.00, 1.50);
       System.out.println("El total de la cuenta es: $" + totalDeLaOrden);

       miOrden.imprimirRecibo();

       double cambio = pagoEfectivo.calcularCambio(totalDeLaOrden);
        System.out.println("Cambio a devolver al cliente: $" + cambio);


        
    }
    
}
