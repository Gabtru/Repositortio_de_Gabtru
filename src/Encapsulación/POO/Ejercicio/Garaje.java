package Encapsulación.POO.Ejercicio;

import java.util.Scanner;

public class Garaje {
	
	
	

	public static void main(String[] args) {
		Motor motor1= new Motor("valswaggen",400,6);
		Motor motor2= new Motor("mclaren",550,8);
		Coche coche1= new Coche("Subaru", 45439560);
		Coche coche2= new Coche("BMW", 7777779);
		coche1.coche();
		coche2.coche();
	}

}
