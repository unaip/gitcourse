package calculadora.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraTestJUnit5 {

	@Test
	void testMediaCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 10;
		int maximo = 15;

		assertEquals(12, miCalculadora.media(valor, minimo, maximo));

	}

	@Test
	void testMediaCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 1;
		int maximo = 11;

		assertEquals(-1, miCalculadora.media(valor, minimo, maximo));

	}

	@Test
	void testMediaCamino3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 10, 9, 13, -999 };
		int minimo = 10;
		int maximo = 20;

		assertEquals(11.5, miCalculadora.media(valor, minimo, maximo));

	}

	@Test
	void testMediaCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { -999 };
		int minimo = 20;
		int maximo = 10;

		assertEquals(-1, miCalculadora.media(valor, minimo, maximo));

	}

	@Test
	void testMediaCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int minimo = 0;
		int maximo = 10;

		assertEquals(1, miCalculadora.media(valor, minimo, maximo));

	}

	@Test
	void testMaxCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3 };

		assertEquals(3, miCalculadora.max(valor));

	}

	@Test
	void testMaxCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 4, 3 };

		assertEquals(4, miCalculadora.max(valor));

	}

	@Test
	public void testMaxCamino3_1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { };

		try {
			miCalculadora.max(valor);
			fail("No ha arrojado excepción");
		} catch (IllegalArgumentException e) {
			assertEquals("Array vacío", e.getMessage());
		}
	}

	@Test
	void testMaxCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 6 };

		assertEquals(6, miCalculadora.max(valor));

	}


	@Test
	void testMaxCamino3_2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { };

		assertThrows(IllegalArgumentException.class, () -> miCalculadora.max(valor));

	}
	
	@Test
	void testMaxCamino3_3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { };

		Throwable exception = assertThrows(IllegalArgumentException.class, () -> miCalculadora.max(valor));
		assertEquals("Array vacío", exception.getMessage() );
	}
	
	@Test
	void testMaxCamino3_4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {  };

		assertEquals(-1, miCalculadora.max(valor));

	}
	
//	@Test
//	void testMaxCamino4() {
//		Calculadora miCalculadora = new Calculadora();
//
//		int[] valor = { 6 };
//
//		assertEquals(6, miCalculadora.max(valor));
//
//	}

	@Test
	void testMaxCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3, 2 };

		assertEquals(3, miCalculadora.max(valor));

	}

	@Test
	void testMaxCamino6() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {  };

		assertEquals(-1, miCalculadora.max(valor));

	}


}
