package Encapsulación.POO;

import java.util.Scanner;

public class Alumno {
private String nombre;
private String apellidos;
private Double notaMedia;
	public void estudiar() {
		System.out.print("El alumno "+nombre+" "+apellidos+" Tiene un nota media de "+notaMedia);
		
	}
	public Alumno(String nombre, String apellidos, Double notaMedia) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}
	public Alumno(String nombre, String apellidos) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Constructor
	
	//Getter y setter
	//public String getNombre(){
	//	return this.nombre;
	//}
	//public void setNombre(String nombre) {
		//this.nombre=nombre;
	//}
	//Cuando quieres que te añada los constructores
	//alt+shift+s
}
