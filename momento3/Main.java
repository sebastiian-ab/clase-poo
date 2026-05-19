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


        System.out.println("--- SIMULACIÓN 2: INTENTO CON PUERTA OBSTRUIDA ---");
        // Otra persona en el piso 5 oprime el botón
        sistemaCentral.registrarLlamadaPasillo(5, "BAJAR");

        // Simulamos que alguien pone el pie en la puerta del ascensor (ACTIVAMOS OBSTRUCCIÓN)
        // Usamos los Getters para llegar hasta la puerta de la cabina y cambiar su estado
        sistemaCentral.getAscensor().getPuerta().setObstruida(true);

        // El sistema escanea los botones de nuevo e intenta mover el ascensor al piso 5
        sistemaCentral.monitorearBotones();
        
        // --- NUEVO ESCENARIO 3: SE QUITA LA OBSTRUCCIÓN Y EL ASCENSOR ATIENDE EL PISO 5 ---
        System.out.println("\n--- SIMULACIÓN 3: SE LIBERA LA PUERTA Y SE ATIENDE LA LLAMADA ---");
        System.out.println("[Sensor] Objeto removido de la puerta de la cabina.");
        
        // Desactivamos la obstrucción (volvemos a ponerla en false)
        sistemaCentral.getAscensor().getPuerta().setObstruida(false);

        // Volvemos a escanear. Como el botón del piso 5 seguía encendido (true),
        // ahora el sistema sí permitirá mover el ascensor con éxito.
        sistemaCentral.monitorearBotones();

        // Al llegar, abre las puertas y apaga el led del botón del piso 5
        sistemaCentral.abrirPuertasLlegada(5);
        sistemaCentral.resetearBotonPiso(5);


        // --- NUEVO ESCENARIO 4: SEGURIDAD Y MANTENIMIENTO ---
        System.out.println("\n--- SIMULACIÓN 4: PROTOCOLO DE SEGURIDAD EN UN PISO ---");
        // Simulamos que el técnico o el equipo de seguridad necesita bloquear el piso 1
        // para que nadie pueda entrar desde el pasillo mientras limpian el hueco del ascensor.
        sistemaCentral.asegurarPiso(1);

        
        System.out.println("\n=========================================");
        System.out.println("       FIN DE TODAS LAS PRUEBAS          ");
        System.out.println("=========================================");
  
    }
        

        
    
}
