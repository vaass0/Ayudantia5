public class Libro {

	public String titulo;
	public String autor;
	public String isbn;
	public int publicacion;

	public Libro(String titulo,String autor,String isbn, int publicacion){
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.publicacion = publicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}