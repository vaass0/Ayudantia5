import java.util.Date;

public class Prestamo {

	public Date fechaDePrestamo;
	public Date fechaDeDevolucion;
	public Libro libroAsociado;
	public String estadoPrestamo;

	public Prestamo(Date fechaDePrestamo,Date fechaDeDevolucion,Libro libro,String estadoPrestamo){
		this.libroAsociado = libro;
		this.estadoPrestamo = estadoPrestamo;
		this.fechaDePrestamo = fechaDePrestamo;
		this.fechaDeDevolucion = fechaDeDevolucion;
	}

	public Libro getLibroAsociado() {
		return libroAsociado;
	}

	public void setLibroAsociado(Libro libroAsociado) {
		this.libroAsociado = libroAsociado;
	}

	public Date getFechaDePrestamo() {
		return fechaDePrestamo;
	}

	public void setFechaDePrestamo(Date fechaDePrestamo) {
		this.fechaDePrestamo = fechaDePrestamo;
	}

	public Date getFechaDeDevolucion() {
		return fechaDeDevolucion;
	}

	public void setFechaDeDevolucion(Date fechaDeDevolucion) {
		this.fechaDeDevolucion = fechaDeDevolucion;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}



}