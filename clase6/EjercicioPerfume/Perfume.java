

public class Perfume {

    public String nombre;
    public String marca;
    public double capacidad;
    public double precio;


    public Perfume(String nombre, String marca, double capacidad, double precio){

        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicar(double cantidad){
        if (this.capacidad>=cantidad) {
            this.capacidad-=cantidad;

            System.out.println("usted se ha hechado: " + cantidad + " ml" + " del perfume: "+ nombre + ".");
            
        }
        else{
             System.out.println("usted es un pobre que no tiene perfume para esa cantidad." );
        }
    }


    public double consultarCantidad(){
    return this.capacidad;

    }

    public void ajustarPrecio(double nuevoprecio){
        this.precio=nuevoprecio;
        System.out.println("El precio del perfume " + nombre + " ha sido actualizado a: $" + precio);
    }
}
