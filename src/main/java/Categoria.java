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


}