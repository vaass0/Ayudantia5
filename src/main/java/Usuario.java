import java.util.*;

public class Usuario {

	Collection<Multa> multas;
	public String nombre;
	public String identificacion;
	Collection<Prestamo> prestamos;

	public Usuario(String nombre, String identificacion){
		this.identificacion = identificacion;
		this.prestamos = new ArrayList<>();
		this.multas = new ArrayList<>();
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public boolean realizarPrestamo() {
		// TODO - implement Usuario.realizarPrestamo
		throw new UnsupportedOperationException();
	}

	public void verMultas() {
		// TODO - implement Usuario.verMultas
		throw new UnsupportedOperationException();
	}

	public boolean pagarMulta() {
		// TODO - implement Usuario.pagarMulta
		throw new UnsupportedOperationException();
	}

	public boolean devolverLibro() {
		// TODO - implement Usuario.devolverLibro
		throw new UnsupportedOperationException();
	}

}