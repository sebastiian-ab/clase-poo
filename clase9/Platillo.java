

public class Platillo {

    private String tipo;
    private double precio;

    public Platillo(String tipo, double precio) {
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
