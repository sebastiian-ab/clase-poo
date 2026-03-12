

public class EjecutarLibro {
    public static void main(String[] args) {
        
        Libro libro1= new Libro("cien años de soledad", "gabriel garcia marques", "978-1", 496);
        
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-2", 1000);

         
        System.out.println(libro1.titulo + " disponible: " + libro1.estaDisponible());
        System.out.println(libro2.titulo + " disponible: " + libro2.estaDisponible());
        
        libro1.prestar();

        libro1.prestar();

        System.out.println("Sigue " + libro2.titulo + " disponible? " + libro2.estaDisponible());

        System.out.println("--- Devoluciones ---");

        libro1.devolver();

        System.out.println("Estado del  " + libro1.titulo + ": " + libro1.estaDisponible());
    }
    
}
