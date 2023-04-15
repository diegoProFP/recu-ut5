package biblio.base;

import java.util.ArrayList;

//Poner para qué sirve la clase y el autor, y la version 1.0
public class Biblioteca {
    public String nombre;
    public ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void anadirLibro(Libro libro) {
        libros.add(libro);
    }

    public int getNumeroLibros() {
        return libros.size();
    }


    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    
    //Este metodo tiene que marcarse como deprecado
    public void destruirLibro() {
    	
    }

    /**
     * Devuelve una representación en cadena de este objeto.
     *
     * @return Una cadena que representa este objeto.
     */
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
    
}
