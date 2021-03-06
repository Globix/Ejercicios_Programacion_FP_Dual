package colaErasmus;

import java.util.LinkedList;
import java.util.Queue;
import alumno.Alumno;

public class ColaErasmus {
	LinkedList<Alumno> colaAlumnos;
	
	public ColaErasmus(){
		colaAlumnos = new LinkedList<Alumno>();
	}
	
	public void anyadirAlumno(Alumno alumno){
		colaAlumnos.add(alumno);
	}
	
	public void mostrarPosicionCola(Alumno alumno){
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Primer apellido: " + alumno.getPrimerApellido());
		System.out.println("Segundo apellido: " + alumno.getSegundoApellido());
		System.out.println("Posicion en la cola: " + (colaAlumnos.indexOf(alumno)+1));
	}
}