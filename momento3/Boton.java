
public class Boton {

    private boolean encendido;

    public Boton() {
        this.encendido = false; 
    }

    public void oprimir() {
        this.encendido = true; 
    }

    public boolean estaEncendido() {
        return this.encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    

}
