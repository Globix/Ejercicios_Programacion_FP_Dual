package ejercicios;

import java.util.concurrent.ThreadLocalRandom;

import main.Main;;

public class SegundoEjercicio {

	public static void main(String[] args) {

		final int numeroRangoMinimo = 25;
		final int numeroRangoMaximo = 51;
		int[] lista = new int[25];
		double[] auxiliar = new double[4];

		System.out.println("Bienvenido al ejercicio 2\n");

		lista = numerosAleatorios(numeroRangoMinimo, numeroRangoMaximo, lista);

		auxiliar[0] = contarPares(lista);
		auxiliar[1] = contarImpares(lista);
		auxiliar[2] = mediaImpares(lista);
		auxiliar[3] = sumaMinimoPar(lista, numeroRangoMaximo);

		imprimirLista(lista);
		imprimirAuxiliar(auxiliar);

		System.out.println("Fin del ejercicio\n");
		Main.main(null);
	}

	public static int[] numerosAleatorios(int numeroRangoMinimo, int numeroRangoMaximo, int[] lista) {

		for (int i = 0; i < lista.length; i++) {
			lista[i] = ThreadLocalRandom.current().nextInt(numeroRangoMinimo, numeroRangoMaximo);
		}

		return lista;
	}

	public static double contarPares(int[] lista) {

		int contador = 0;

		for (int item : lista) {
			if (item % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}

	public static double contarImpares(int[] lista) {

		int contador = 0;

		for (int item : lista) {
			if (item % 2 == 1) {
				contador++;
			}
		}
		return contador;
	}

	public static double mediaImpares(int[] lista) {

		int total = 0;
		int contador = 0;
		int media = 0;

		for (int item : lista) {
			if (item % 2 == 1) {
				contador++;
				total += item;
			}
		}
		media = total / contador;
		return media;
	}

	public static double sumaMinimoPar(int[] lista, int numeroMaximo) {
		int minimo = 0;
		int suma = 0;

		// Si la lista no esta vacia establecemos el numero minimo al maximo,
		// para que el primero que encuentre sea el minimo siendo mayor que 0.
		// Si la lista esta vacia simplemente se quedara en 0 y sera el numero
		// minimo.
		if (lista != null) {
			minimo = numeroMaximo;
		}

		for (int item : lista) {
			if (item % 2 == 0) {
				if (item < minimo) {
					minimo = item;
				}
			}
		}

		for (int i = 0; i <= minimo; i++) {
			suma += i;
		}

		return suma;
	}

	public static void imprimirLista(int[] lista) {

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion " + i + " de la lista = " + lista[i]);
		}
		System.out.println();
	}
	
	public static void imprimirAuxiliar(double[] auxiliar) {

		System.out.println("Numero de elementos pares: " + (int) auxiliar[0]);
		System.out.println("Numero de elementos impares: " + (int) auxiliar[1]);
		System.out.println("Media impares: " + auxiliar[2]);
		System.out.println("Suma de los enteros comprendidos entre 1 y el minimo de la lista: " + auxiliar[3] + "\n");
	}

}
