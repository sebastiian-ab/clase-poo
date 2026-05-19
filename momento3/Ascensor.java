public class Ascensor {

    private int pisoActual;
    private String estado;
    private PuertaDeAscensor puerta;
    private BotonAscensor boton;

    public Ascensor() {
        this.pisoActual = 1;
        this.estado = "DETENIDO";
        this.puerta = new PuertaDeAscensor();
        this.boton = new BotonAscensor();
    }

    public void mover(int piso) {
        this.estado = "EN_MOVIMIENTO";
        this.pisoActual = piso;
    }

    public void detenerse() {
        this.estado = "DETENIDO";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void solicitarAbrir() {
        this.puerta.abrir();
    }

    public int getPisoActual() {
        return this.pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PuertaDeAscensor getPuerta() {
        return this.puerta;
    }

    public BotonAscensor getBoton() {
        return this.boton;
    }
}
