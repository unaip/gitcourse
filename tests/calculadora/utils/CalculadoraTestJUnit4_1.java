package calculadora.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.ExpectedException;

public class CalculadoraTestJUnit4_1 {

	@Test
	public void testMaxCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3 };

		assertEquals(3, miCalculadora.max(valor));

	}

	@Test
	public void testMaxCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 4, 3 };

		assertEquals(4, miCalculadora.max(valor));

	}

	@Test
	public void testMaxCamino3_1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		try {
			miCalculadora.max(valor);
			fail("No ha arrojado excepción");
		} catch (NoSuchElementException e) {
			assertEquals("Array vacío", e.getMessage());
		}
	}

	@Test(expected = NoSuchElementException.class)
	public void testMaxCamino3_2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		miCalculadora.max(valor);
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void testMaxCamino3_3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		// If we want to check the exception message
		exceptionRule.expect(NoSuchElementException.class);
		exceptionRule.expectMessage("Array vacío");
		miCalculadora.max(valor);
	}

//	@Test
//	public void testMaxCamino3_4() {
//		Calculadora miCalculadora = new Calculadora();
//
//		int[] valor = {  };
//
//		assertEquals(-1, miCalculadora.max(valor));
//
//	}

	@Test
	public void testMaxCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 6 };

		assertEquals(6, miCalculadora.max(valor));

	}

	@Test
	public void testMaxCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3, 2 };

		assertEquals(3, miCalculadora.max(valor));

	}

//	@Test
//	public void testMaxCamino6() {
//		Calculadora miCalculadora = new Calculadora();
//
//		int[] valor = {  };
//
//		assertEquals(-1, miCalculadora.max(valor));
//
//	}

	@Test
	public void testMediaCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 10;
		int maximo = 15;

		assertEquals(12, miCalculadora.media(valor, minimo, maximo), 0);

	}

	@Test
	public void testMediaCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 1;
		int maximo = 11;

		assertEquals(-1, miCalculadora.media(valor, minimo, maximo), 0);

	}

	@Test
	public void testMediaCamino3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 10, 9, 13, -999 };
		int minimo = 10;
		int maximo = 20;

		assertEquals(11.5, miCalculadora.media(valor, minimo, maximo), 0);

	}

	@Test
	public void testMediaCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { -999 };
		int minimo = 20;
		int maximo = 10;

		assertEquals(-1, miCalculadora.media(valor, minimo, maximo), 0);

	}

	@Test
	public void testMediaCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int minimo = 0;
		int maximo = 10;

		assertEquals(1, miCalculadora.media(valor, minimo, maximo), 0);

	}

	@Test
	public void testMaxWithStreamsCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3 };

		assertEquals(3, miCalculadora.maxWithStreams(valor));

	}

	@Test
	public void testMaxWithStreamsCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 4, 3 };

		assertEquals(4, miCalculadora.maxWithStreams(valor));

	}

	@Test
	public void testMaxWithStreamsCamino3_1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		try {
			miCalculadora.maxWithStreams(valor);
			fail("No ha arrojado excepción");
		} catch (NoSuchElementException e) {
			assertEquals("No value present", e.getMessage());
		}
	}

	@Test(expected = NoSuchElementException.class)
	public void testMaxWithStreamsCamino3_2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		miCalculadora.max(valor);
	}

	@Test
	public void testMaxWithStreamsCamino3_3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = {};

		// If we want to check the exception message
		exceptionRule.expect(NoSuchElementException.class);
		exceptionRule.expectMessage("No value present");
		miCalculadora.maxWithStreams(valor);
	}

	// @Test
	// public void testMaxWithStreamsCamino3_4() {
	// Calculadora miCalculadora = new Calculadora();
	//
	// int[] valor = { };
	//
	// assertEquals(-1, miCalculadora.maxWithStreams(valor));
	//
	// }

	@Test
	public void testMaxWithStreamsCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 6 };

		assertEquals(6, miCalculadora.maxWithStreams(valor));

	}

	@Test
	public void testMaxWithStreamsCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 3, 2 };

		assertEquals(3, miCalculadora.maxWithStreams(valor));

	}

	// @Test
	// public void testMaxWithStreamsCamino6() {
	// Calculadora miCalculadora = new Calculadora();
	//
	// int[] valor = { };
	//
	// assertEquals(-1, miCalculadora.maxWithStreams(valor));
	//
	// }

	@Test
	public void testMediaWithStreamsCamino1() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 10;
		int maximo = 15;

		assertEquals(12, miCalculadora.mediaWithStreams(valor, minimo, maximo), 0);

	}

	@Test(expected = NoSuchElementException.class)
	public void testMediaWithStreamsCamino2() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 12, -999 };
		int minimo = 1;
		int maximo = 11;

		miCalculadora.mediaWithStreams(valor, minimo, maximo);

	}

	@Test
	public void testMediaWithStreamsCamino3() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 10, 9, 13, -999 };
		int minimo = 10;
		int maximo = 20;

		assertEquals(11.5, miCalculadora.mediaWithStreams(valor, minimo, maximo), 0);

	}

	@Test(expected = NoSuchElementException.class)
	public void testMediaWithStreamsCamino4() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { -999 };
		int minimo = 20;
		int maximo = 10;

		miCalculadora.mediaWithStreams(valor, minimo, maximo);

	}

	@Test
	public void testMediaWithStreamsCamino5() {
		Calculadora miCalculadora = new Calculadora();

		int[] valor = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int minimo = 0;
		int maximo = 10;

		assertEquals(1, miCalculadora.mediaWithStreams(valor, minimo, maximo), 0);

	}

}
