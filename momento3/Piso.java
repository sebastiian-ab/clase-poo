
public class Piso {

    private int numeroPiso;
    private BotonPiso boton;
    private PuertaDePiso puerta;

    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.boton = new BotonPiso();
        this.puerta = new PuertaDePiso();
        this.puerta.setNumeroPiso(numeroPiso); // recuerda mi rey esto es lanzarle ese número x a la puerta. Es el acto
                                               // de pasar el paquete. mas no actualizarlo
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
