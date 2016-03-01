package main;

import java.util.Scanner;
import ejercicios.*;

public class Main {

	public static void main(String[] args) {
		menu();

	}

	private static void menu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca un numero para acceder a:\n");
		System.out.println("1 - Ejercicio 1");
		System.out.println("2 - Ejercicio 2");
		System.out.println("3 - Ejercicio 3");
		System.out.println("4 - Ejercicio 4");
		System.out.println("5 - Ejercicio 5");
		System.out.println("6 - Ejercicio 6");
		System.out.println("0 - Salir\n");

		try {
			System.out.print("Respuesta: ");
			int respuesta = scanner.nextInt();
			System.out.println("");
			switch (respuesta){
				case 1: 
					PrimerEjercicio.main(null);
					break;
				case 2: 
					SegundoEjercicio.main(null);
					break;
				case 3: 
					TercerEjercicio.main(null);
					break;
				case 4: 
					CuartoEjercicio.main(null);
					break;
				case 5: 
					QuintoEjercicio.main(null);
					break;
				case 6: 
					SextoEjercicio.main(null);
					break;
				case 0: 
					System.out.println("�Hasta luego!");
					break;
				default:
					System.out.println("El numero introducido no es valido");
					menu();
					break;
			}
		} catch (Exception e){
			System.out.println("No has introducido un valor valido");
			menu();
		}
	}

}
