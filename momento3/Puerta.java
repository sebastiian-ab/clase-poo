public class Puerta {

    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public boolean estaAbierta() {
        return this.abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

}
