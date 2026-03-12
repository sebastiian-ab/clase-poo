

public class Producto {
    
    private String nombre;
    private int codigo;
    private int cantidad;
    private double precio;

    //constructor
    public Producto(String nombre, int codigo, int cantidad, double precio){


        this.nombre=nombre;
        this.codigo=codigo;
        this.cantidad=cantidad;
        this.precio=precio;
        

    }

     public void agregarStock(int cantidad){

        this.cantidad +=cantidad;
    }

    public void reducirStock(int cantidad){

        this.cantidad -=cantidad;
    }

    public double calcularValorInventario(){
        return cantidad *precio;
    }

    public String toString(){
        return"Producto[ nombre: "+ nombre + " codigo: " + codigo + "cantidad: " + cantidad + "precio: " + precio +"]";
    }
}
