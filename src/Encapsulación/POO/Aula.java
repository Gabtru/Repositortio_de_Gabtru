package Encapsulación.POO;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Alumno alumno1= new Alumno("Juan","Hernandez",8.7);
		Alumno alumno2=new Alumno("Gonzalo","Jiménez");
		;
		//alumno1.nombre="Juan";
		
		Scanner scan= new Scanner(System.in);
		int opcion;
		System.out.println("Que alumno elige");
		opcion=scan.nextInt();
		if (opcion==1) {
			alumno1.estudiar();
		}
		else {
			alumno2.estudiar();
		}
	}
	
//clase asignatura nombre y nota
	}
