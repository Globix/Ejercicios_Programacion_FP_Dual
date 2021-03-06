package casosTest;

import ejercicios.SegundoEjercicio;

public class CT_SegundoEjercicio {

	public static void main(String[] args) {

		// Caso TEST calcularPares
		int[] lista = { 2, 5, 6, 3, 4 };

		if (SegundoEjercicio.contarPares(lista) == 3) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Caso TEST calcularImpares
		if (SegundoEjercicio.contarImpares(lista) == 2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Caso TEST mediaImpares
		if (SegundoEjercicio.mediaImpares(lista) == 4) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Caso TEST sumaMinimoPar
		if (SegundoEjercicio.sumaMinimoPar(lista, 6) == 3) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

}
