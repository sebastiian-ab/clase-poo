

public class Libro {

    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo,String autor,int paginas){

        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;


    }

     public void mostrarInfo(int numero){
        System.out.println("libro:"+ numero + ": " + titulo +" | escrito por " + autor);

        
     }
}
