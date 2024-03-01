package programa;

public class LibroBorja {
	private String titulo; // Título del libro
	private int numeroDePaginas; // Número de páginas del libro
	
	public LibroBorja(String tituloLibro, int paginasLibro) {
		titulo=tituloLibro;
		numeroDePaginas=paginasLibro;
	}																															
	public String getTitulo() {
		return titulo;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setTitulo(String tituloLibro) {
		titulo=tituloLibro;
	}
	public void setNumeroDePaginas(int paginasLibro) {
		numeroDePaginas=paginasLibro;
	}
	public void agregarPaginas(int paginas) {
		numeroDePaginas=numeroDePaginas+paginas;
	}
	public void quitarPaginas(int paginas) {
		numeroDePaginas=numeroDePaginas-paginas;
	}
	public void mostrarLibro() {
		System.out.println("Título del libro: " + getTitulo());
		System.out.println("Número de páginas: " + getNumeroDePaginas());
	}
}
