package Bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe cuantos numeros quieres de la serie de Fibonacci");
		numero = scan.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		for( int i=0; i<numero-2;i++ ) {
			if(i==0) {
				System.out.println(0);
				System.out.println(1);
			}
			num3=num2+num1;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
