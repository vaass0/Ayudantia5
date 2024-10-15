public class Empleado {

	public String nombre;
	public String identificacion;
	public String cargo;

	public Empleado(String nombre, String identificacion, String cargo){
		this.nombre = nombre;
		this.cargo = cargo;
		this.identificacion = identificacion;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



}