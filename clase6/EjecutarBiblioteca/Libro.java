

public class Libro {

    public String titulo;
    public String autor;
    public String isbn;
    public int numeroPaginas;
    public boolean disponible;


    public Libro (String titulo, String autor, String isbn, int numeroPaginas){

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;
    }
    
    public void prestar(){
        if (this.disponible) {
            this.disponible=false;
            System.out.println("el libro: " + titulo + " ah sido prestado.");
            
            
        }

        else{
            System.out.println("el libro" + titulo + " no esta disponiblee.");
        }
    }


    public void devolver(){
        this.disponible=true;
        System.out.println("Has devuelto el libro '" + titulo + "'. Gracias");

    }

    public boolean estaDisponible(){
        return this.disponible;
    }

}
