
public class Credito extends Pago {

    private String nombreTarjeta;
    private String tipo; 
    private String fechaVencimiento;

    public Credito(String nombreTarjeta, String tipo, String fechaVencimiento) {
        this.nombreTarjeta = nombreTarjeta;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void validarTarjeta() {
        System.out.println("Validando tarjeta " + tipo + " de " + nombreTarjeta + "...");
    }

    
}
