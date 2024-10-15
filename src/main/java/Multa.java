public class Multa {
	public String monto;
	public String fechaDeGeneracion;
	public String estadoMulta;
	Prestamo prestamo;

	public Multa(String monto, String fechaDeGeneracion, String estadoMulta, Prestamo prestamo){
		this.estadoMulta = estadoMulta;
		this.prestamo = prestamo;
		this.fechaDeGeneracion = fechaDeGeneracion;
		this.monto = monto;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getFechaDeGeneracion() {
		return fechaDeGeneracion;
	}

	public void setFechaDeGeneracion(String fechaDeGeneracion) {
		this.fechaDeGeneracion = fechaDeGeneracion;
	}

	public String getEstadoMulta() {
		return estadoMulta;
	}

	public void setEstadoMulta(String estadoMulta) {
		this.estadoMulta = estadoMulta;
	}



}