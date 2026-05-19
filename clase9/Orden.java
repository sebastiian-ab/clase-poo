public class Orden {
    private int hora;
    private String mesero;
    private Cliente cliente; 
    private Pago pago;
    private Bebida bebida;
    private Platillo platillo;


      
   

    public Orden(int hora, String mesero, Cliente cliente, Pago pago) {
        this.hora = hora;
        this.mesero = mesero;
        this.cliente = cliente;
        this.pago = pago;
    }





    public String agregarProductos(Bebida bebida, Platillo platillo){

        this.bebida = bebida; 
        this.platillo = platillo;
        return "orden---> Bebida:" + bebida.getTipo() + " | Platllo: " + platillo.getTipo();
    }
    

    public void imprimirRecibo() {
    System.out.println("TICKET DE VENTA ");
    System.out.println("Mesero: " + this.mesero);
    System.out.println("Cliente: " + this.cliente.getNombre()); 
    
   
    System.out.println("Subtotal: $" + this.pago.getSubTotal());
    }
}
