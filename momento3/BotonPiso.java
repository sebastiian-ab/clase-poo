
public class BotonPiso extends Boton {

    private String direccion;

    public BotonPiso() {
        this.direccion = "SUBIR";
    }

    public void enviarLlamada() {
        oprimir();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
