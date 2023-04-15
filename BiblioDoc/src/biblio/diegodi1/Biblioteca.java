package biblio.diegodi1;

import java.util.ArrayList;

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
    
    public void destruirLibro() {
    	
    }

   
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
    
}
