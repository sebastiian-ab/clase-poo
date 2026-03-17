public class ReservaHotel {
    public String nombreCliente;
    public String fechaEntrada;
    public String fechaSalida;
    public int numeroHabitacion;
    public boolean activa;

    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion) {

        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.activa = true;

    }

    public void nuevaReserva() {
        this.activa = true;
        System.out.println("Reserva confirmada para: " + nombreCliente + " en la habitación " + numeroHabitacion);

    }

    public void cancelarReserva() {
        if (this.activa) {
            this.activa = false;

            System.out.println("Reserva ha nombre de  " + nombreCliente + " ha sido cancelada ");
        } else {
            System.out.println("Reserva ha nombre de  " + nombreCliente + " ya estaba cancelada");
        }

    }

    public void consultarReserva() {
        String estado;
        if (this.activa) {
            estado = "ACTIVA";

        } else {
            estado = "CANCELADA";
        }

        System.out.println("--- DETALLES DE LA RESERVA ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("habitacion: " + numeroHabitacion);
        System.out.println("Estado: " + estado);

    }

}
