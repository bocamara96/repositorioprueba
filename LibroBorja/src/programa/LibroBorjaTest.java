package programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroBorjaTest {

	@Test
	void testGetTitulo() {
		LibroBorja l1 = new LibroBorja ("LIBRO DE EJEMPLO", 150);
		String titulo = l1.getTitulo();
		assertEquals("LIBRO DE EJEMPLO",l1.getTitulo());
	}

	@Test
	void testSetTitulo() {
		LibroBorja l1 = new LibroBorja ("LIBRO DE EJEMPLO", 150);
		l1.setTitulo("LIBRO DE EJERCICIOS");
		assertEquals("LIBRO DE EJERCICIOS",l1.getTitulo());
	}

	@Test
	void testAgregarPaginas() {
		LibroBorja l1 = new LibroBorja ("LIBRO DE EJEMPLO", 150);
		l1.agregarPaginas(200);
		assertEquals(350, l1.getNumeroDePaginas());
	}

	@Test
	void testQuitarPaginas() {
		LibroBorja l1 = new LibroBorja ("LIBRO DE EJEMPLO", 150);
		l1.quitarPaginas(50);
		assertEquals(100, l1.getNumeroDePaginas());
	}
	/*En la cobertura de la clase 'LibroBorja' aparece un 68,8% ya que los metodos
	'mostrarLibro() y setNumeroDePaginas() no se introducen en el test de JUnit, por
	lo que al no testearlo y no dar un 100% de acierto, lo pone como un 0%, bajando la 
	cobertura total de la clase escrita.*/
}
