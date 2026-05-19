
public class BotonAscensor extends Boton{

    private int pisoDestino;

    
    public BotonAscensor() {
        this.pisoDestino = 0; 
    }

    
    public void marcarDestino() {
        oprimir(); 
    }

    
    public int getPisoDestino() {
        return this.pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
    
}
