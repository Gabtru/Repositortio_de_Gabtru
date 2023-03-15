package Encapsulación.POO.Ejercicio;

public class Pistón {
	private double id;
	private String marca;
	public void piston() {
		System.out.print("Dispone de un  piston de id "+id+" y una marca "+marca);
	}
	public Pistón(double id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}
	
}
