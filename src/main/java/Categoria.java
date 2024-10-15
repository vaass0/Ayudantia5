import java.util.*;

public class Categoria {

	public String nombre;
	public String descripcion;
	Collection<Libro> libros;

	public Categoria(String nombre,String descripcion){
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.libros = new ArrayList<>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarLibro(Libro libro){

		if(libro.getIsbn() != null){
			for(Libro book: this.libros){
				if (book.getIsbn().equals(libro.getIsbn())){
					System.out.println("El libro con ese identificador ya esta en la categoria...");
					return false;
				}
			}
			libros.add(libro);
			return true;
		}
		System.out.println("Error desconocido...");
		return false;
	}
	public boolean eliminarLibro(String isbn) {
		for (Libro libro : this.libros) {
			if (libro.getTitulo().equals(isbn)) {
				libros.remove(libro);
				return true;
			}

		}return false;
	}

}