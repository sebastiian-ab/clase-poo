public class Bebida {

    private String tipo;
    private double precio;

    public Bebida(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    
    public String getTipo() {
        return this.tipo;
    }

    public double getPrecio() {
        return this.precio;
    }
    
}
