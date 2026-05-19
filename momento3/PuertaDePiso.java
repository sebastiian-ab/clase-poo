public class PuertaDePiso extends Puerta {

    private int numeroPiso;
    private boolean bloqueada;

    public PuertaDePiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.bloqueada = false;
    }

    public void asegurarPuerta() {
        this.bloqueada = true;
    }

    public int getNumeroPiso() {
        return this.numeroPiso;
    }

    public boolean estaBloqueada() {
        return this.bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

}
