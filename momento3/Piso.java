
public class Piso {

    private int numeroPiso;
    private BotonPiso boton;
    private PuertaDePiso puerta;

    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.boton = new BotonPiso();
        this.puerta = new PuertaDePiso(numeroPiso); 

    }

    public BotonPiso getBotonPiso() {
        return this.boton;
    }

    public PuertaDePiso getPuertaPiso() {
        return this.puerta;
    }

    public int getNumeroPiso() {
        return this.numeroPiso;
    }

}
