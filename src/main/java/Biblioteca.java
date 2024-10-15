import java.util.*;

public class Biblioteca {

	public String nombre;
	public String direccion;
	Collection<Libro> libros;
	Collection<Empleado> empleados;
	Collection<Categoria> categorias;

	public Biblioteca(String nombre,String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new ArrayList<>();
		this.empleados = new ArrayList<>();
		this.categorias = new ArrayList<>();

	}
	public boolean agregarLibro(Libro libro) {
		if(libro.getIsbn() != null){
			for(Libro book: this.libros){
				if (book.getIsbn().equals(libro.getIsbn())){
					System.out.println("El libro con ese identificador ya existe...");
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
	public boolean mostrarLibro(Scanner scanner) {
		System.out.println("Ingrese titulo: ");
		String titulo = scanner.nextLine();
		for(Libro libro : this.libros){
			if (libro.getTitulo().equals(titulo))
				libro.mostrarInfo();
			return true;
		}return false;
	}
	public boolean agregarEmpleado(Empleado empleado) {
		if(empleado.getIdentificacion() != null){
			for(Empleado persona: this.empleados){
				if (persona.getIdentificacion().equals(empleado.getIdentificacion())){
					System.out.println("El empleado con ese identificador ya existe...");
					return false;
				}
			}
			empleados.add(empleado);
			return true;
		}
		System.out.println("Error desconocido...");
		return false;
	}

	public boolean eliminarEmpleado(String identificador) {
		for (Empleado persona: this.empleados) {
			if (persona.getIdentificacion().equals(identificador)) {
				empleados.remove(persona);
				return true;
			}
		}
		return false;
	}

	public Empleado modificarEmpleado(String cargo , String identificador) {
		Empleado empleado = new Empleado("pepe","1234567890","nohubocoincidencias");
		for (Empleado persona: this.empleados) {
			if (persona.getIdentificacion().equals(identificador)) {
				persona.setCargo(cargo);
				return persona;
			}
		}
		return empleado;
	}

	public boolean agregarCategoria( Categoria categoria) {
		if (categoria.getNombre() != null) {
			for (Categoria categoria1 : this.categorias) {
				if (categoria1.nombre.equals(categoria.nombre)) {
					System.out.println("la categoria ya existe...");
					return false;
				}
			}
			categorias.add(categoria);
			return true;
		}
		System.out.println("Error desconocido...");
		return false;
	}
	public Categoria editarCategoria() {
		// TODO - implement Biblioteca.editarCategoria
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCategoria(String nombre) {
			for (Categoria categoria: this.categorias) {
				if (categoria.getNombre().equals(nombre)) {
					categorias.remove(categoria);
					return true;
				}
			}
			return false;
	}

}