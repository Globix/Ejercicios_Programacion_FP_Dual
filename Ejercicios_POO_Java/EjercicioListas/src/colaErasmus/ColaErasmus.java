package colaErasmus;

import java.util.LinkedList;
//import java.util.Queue;
import alumno.Alumno;

public class ColaErasmus {
	LinkedList<Alumno> colaAlumnos;

	public ColaErasmus() {
		colaAlumnos = new LinkedList<Alumno>();
	}

	public void anyadirAlumno(Alumno alumno) {
		colaAlumnos.add(alumno);
	}

	public void eliminarAlumnoPosicion(int posicion) {
		colaAlumnos.remove(posicion);
	}

	/*
	 * public void eliminarAlumno(Alumno alumno) { colaAlumnos.remove(alumno); }
	 */

	public void mostrarTamanyoCola() {
		int tamanyo = colaAlumnos.size();
		System.out.println("En la cola hay " + tamanyo + " alumnos");
		System.out.println("");
	}

	public int tamanyoCola() {
		int tamanyo = colaAlumnos.size();
		return tamanyo;
	}

	public void adelantarAlumno(int posicionInicial, int posicionFinal) {
		Alumno alumno;
		if ((posicionInicial < colaAlumnos.size()) && (posicionInicial > 0) && (posicionFinal < colaAlumnos.size()) && (posicionFinal > 0)) {
			alumno = colaAlumnos.remove(posicionInicial);
			colaAlumnos.add(posicionFinal, alumno);
		} else {
			System.out.println("Una de las 2 posiciones se sale del rango de la cola.");
		}
	}

	public void mostrarPosicionColaIndex(int i) {
		Alumno alumno = colaAlumnos.get(i);
		if (alumno != null) {
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Primer apellido: " + alumno.getPrimerApellido());
			System.out.println("Segundo apellido: " + alumno.getSegundoApellido());
			System.out.println("Posicion en la cola: " + (colaAlumnos.indexOf(alumno) + 1));
			System.out.println("");
		} else {
			System.out.println("Alumno no encontrado");
		}
	}

	public void mostrarPosicionColaAlumno(Alumno alumno) {
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Primer apellido: " + alumno.getPrimerApellido());
		System.out.println("Segundo apellido: " + alumno.getSegundoApellido());
		System.out.println("Posicion en la cola: " + (colaAlumnos.indexOf(alumno) + 1));
		System.out.println("");
	}

	public void mostrarCola() {
		if (colaAlumnos.peekFirst() != null) {
			for (Alumno alumno : colaAlumnos) {
				System.out.println("Nombre: " + alumno.getNombre());
				System.out.println("Primer apellido: " + alumno.getPrimerApellido());
				System.out.println("Segundo apellido: " + alumno.getSegundoApellido());
				System.out.println("Posicion en la cola: " + (colaAlumnos.indexOf(alumno) + 1));
				System.out.println("");
			}
		} else {
			System.out.println("Cola Vacia");
		}
	}

	public void mostrarColaInversa() {
		Alumno alumno;
		if (colaAlumnos.size() != 0) {
			for (int i = colaAlumnos.size() - 1; i >= 0; i--) {
				alumno = colaAlumnos.get(i);
				System.out.println("Nombre: " + alumno.getNombre());
				System.out.println("Primer apellido: " + alumno.getPrimerApellido());
				System.out.println("Segundo apellido: " + alumno.getSegundoApellido());
				System.out.println("Posicion en la cola: " + (colaAlumnos.indexOf(alumno) + 1));
				System.out.println("");
			}
		} else {
			System.out.println("Cola Vacia");
		}
	}

	public void limpiarCola() {
		Alumno alumno;
		alumno = colaAlumnos.pollFirst();
		while (alumno != null) {
			alumno.mostrarAlumno();
			alumno = colaAlumnos.pollFirst();
		}
	}
}