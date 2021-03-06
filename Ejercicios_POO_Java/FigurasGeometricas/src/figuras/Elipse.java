package figuras;

public class Elipse extends FiguraGeometrica{
	
	private double radioMenor;
	private double radioMayor;
	
	public Elipse(){
		super();
		radioMenor = 0;
		radioMayor = 0;
	}
	
	public Elipse(String nombre){
		super(nombre);
		radioMenor = 0;
		radioMayor = 0;
	}
	
	public Elipse(double base, double altura){
		this.radioMenor = base;
		this.radioMayor = altura;
	}
	
	public Elipse(String nombre, double base, double altura){
		super(nombre);
		this.radioMenor = base;
		this.radioMayor = altura;
	}

	public double getBase() {
		return this.radioMenor;
	}

	public void setBase(double base) {
		this.radioMenor = base;
	}

	public double getAltura() {
		return this.radioMayor;
	}

	public void setAltura(double altura) {
		this.radioMayor = altura;
	}
	
	@Override
	public double calcularArea(){
		double area = this.radioMenor * this.radioMayor * Math.PI;
		return area;
	}

	@Override
	public String toString() {
		return "Elipse [nombre=" + super.getNombre() + ", area=" + calcularArea() + "]";
	}

	@Override
	public void draw(){
		System.out.println("Esto es un elipse");
	}
}
