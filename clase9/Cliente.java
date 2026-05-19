
public class Cliente {

    private String nombre;
    private String cedula; 

   
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    
    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }
    
}
