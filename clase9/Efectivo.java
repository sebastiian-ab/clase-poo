

public class Efectivo extends Pago {

    private double cantidad;

    public Efectivo(double cantidad){
        this.cantidad=cantidad;

    }

    public double calcularCambio(double totalDeLaOrden) {
        return this.cantidad - totalDeLaOrden;
        
    }


    
}
