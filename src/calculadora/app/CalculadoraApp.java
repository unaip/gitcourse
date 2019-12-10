package calculadora.app;

import java.util.Scanner;

import calculadora.utils.Calculadora;

public class CalculadoraApp {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		do {
			System.out.println("MENU");

			System.out.println("1. Calcular media");
			System.out.println("3. Calcular max");

			System.out.println("Introduce opción (0 para salir)");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				calcularMedia();

				break;

			case 2:
				calcularMax();

				break;
			default:
				break;
			}

		} while (opc != 0);

	}

	private static void calcularMax() {
		// TODO Auto-generated method stub

	}

	private static void calcularMedia() {

		int min = 0, max = 100;
		int[] valores = { 1, 3, 4, 5, 6, -999 };
		// TODO: Pedir valores al usuario
		Calculadora miCalculadora = new Calculadora();

		System.out.println(" La media de 1, 3, 4, 5, 6 es: " + miCalculadora.media(valores, min, max));

	}

}
