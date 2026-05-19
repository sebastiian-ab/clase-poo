public class PuertaDeAscensor extends Puerta {

    private boolean obstruida;

    public PuertaDeAscensor() {
        this.obstruida = false;
    }

    public boolean verificarObstruccion() {
        return this.obstruida;
    }

    public boolean estaObstruida() {
        return this.obstruida;
    }

    public void setObstruida(boolean obstruida) {
        this.obstruida = obstruida;
    }
}
