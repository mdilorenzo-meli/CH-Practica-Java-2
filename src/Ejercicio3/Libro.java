package Ejercicio3;

public class Libro {

    private String titulo, autor;
    private int    ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    public void prestamo(){
        // TODO
        // Pasar por parametro Persona, FechaDesde, FechaHasta
        System.out.println("Metodo en construccion");
    }

    public void devolucion(){
        // TODO
        System.out.println("Metodo en construccion");
    }

}
