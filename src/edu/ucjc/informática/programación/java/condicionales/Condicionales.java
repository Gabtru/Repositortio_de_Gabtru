package edu.ucjc.informática.programación.java.condicionales;

public class Condicionales {

	public static void main(String[] args) {
	
		//declarar
		int numero1=10;
		int numero2=4;
		//if
		if(numero1>numero2) {
			System.out.println("numero 1 es mayor que numero 2");
		}
		//elif
		else if(numero1!=numero2) {
			System.out.println("numero 2 es mayor que numero 1");
			}
		//else
		else {
			System.out.println("numero 1 y numero 2 son iguales");
			}
		//or
		if(numero1==4 && numero2==4) {
			System.out.println("Que casualidad los dos números son iguales a 4");
		}
		//and
		else if (numero1==4 || numero2==4) {
			System.out.println("uno de estros numeros es igual a cuatro");
		}
		//Condiciones con switch
		switch(numero1) {
		case 1:System.out.println("Este número1 es igual a 1");break;
		case 7:System.out.println("Este número1 es igual a 7");break;
		case 9:System.out.println("Este número1 es igual a 9");break;
		case 0:System.out.println("Este número1	es igual a 0");break;
		default:System.out.println("Este número1 es diferente de 0,9,7,1");break;
		}
		}
	}


