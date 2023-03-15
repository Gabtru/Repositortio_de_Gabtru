package Encapsulación.POO.Ejercicio;

public class Motor {
	private String marca;
	private double numCaballos;
	private double numPiston;
	public Motor(String marca, double numCaballos, double numPiston) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
		this.numPiston = numPiston;
	}
	public void motor() {
		System.out.print();
	}
	public static void main(String[] args) {
		Pistón piston1= new Pistón(9384203853.890, "volkswagen");
		Pistón piston2= new Pistón(9334820.04, "mclaren");
		
	}
	
}	
