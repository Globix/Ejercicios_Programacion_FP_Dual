package alumno;

public class Alumno {
	private String nombre = "";
	private String primerApellido = "";
	private String segundoApellido = "";
	
	
	public Alumno(String nombre, String primerApellido, String segundoApellido){
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	
	public void mostrarAlumno(){
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Primer apellido: " + this.primerApellido);
		System.out.println("Segundo apellido: " + this.segundoApellido);
		System.out.println();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	
	public String getSegundoApellido() {
		return segundoApellido;
	}
}