package ejercicios;

import main.Main;

public class CuartoEjercicio {

	public static void main(String[] args) {
		final int tamaņoMatriz = 10;
		int[][] matrizUnaria = new int[tamaņoMatriz][tamaņoMatriz];

		System.out.println("Bienvenido al ejercicio 4\n");

		CuartoEjercicio.calcularMatrizUnaria(matrizUnaria);
		CuartoEjercicio.imprimirMatrizUnaria(matrizUnaria);

		System.out.println("Fin del ejercicio\n");
		Main.main(null);
	}

	public static void calcularMatrizUnaria(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = 1;
				}
			}

		}
	}

	public static void imprimirMatrizUnaria(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");

		}
		System.out.println("");
	}

}
