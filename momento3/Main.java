public class Main {
    public static void main(String[] args) {
      System.out.println("--- INICIANDO SIMULADOR DE ASCENSOR ---");

        // 1. CREAMOS EL EDIFICIO: Instanciamos el Sistema de Control con 5 pisos
        // Cambiamos el nombre de la variable a: sistemaCentral
        SistemaDeControl sistemaCentral = new SistemaDeControl(5);

        System.out.println("\n--- SIMULACIÓN 1: LLAMADA NORMAL ---");
        // Una persona en el piso 3 oprime el botón para subir
        sistemaCentral.registrarLlamadaPasillo(3, "SUBIR");

        // El sistema escanea constantemente los botones para ver si hay llamadas
        sistemaCentral.monitorearBotones();

        // El ascensor llega al destino, abre sus puertas y apaga el botón del pasillo
        sistemaCentral.abrirPuertasLlegada(3);
        sistemaCentral.resetearBotonPiso(3);


        System.out.println("\n--- SIMULACIÓN 2: INTENTO CON PUERTA OBSTRUIDA ---");
        // Otra persona en el piso 5 oprime el botón
        sistemaCentral.registrarLlamadaPasillo(5, "BAJAR");

        // Simulamos que alguien pone el pie en la puerta del ascensor (ACTIVAMOS OBSTRUCCIÓN)
        // Usamos los Getters para llegar hasta la puerta de la cabina y cambiar su estado
        sistemaCentral.getAscensor().getPuerta().setObstruida(true);

        // El sistema escanea los botones de nuevo e intenta mover el ascensor al piso 5
        sistemaCentral.monitorearBotones();
        
        // --- FIN DE LA SIMULACIÓN ---
  
    }
        

        
    
}
