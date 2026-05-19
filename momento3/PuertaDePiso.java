public class PuertaDePiso extends Puerta {

    private int numeroPiso;
    private boolean bloqueada;

    public PuertaDePiso() {
        this.numeroPiso = 0;
        this.bloqueada = false;
    }

    public void asegurarPuerta() {
        this.bloqueada = true;
    }

    public int getNumeroPiso() {
        return this.numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean estaBloqueada() {
        return this.bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

}
