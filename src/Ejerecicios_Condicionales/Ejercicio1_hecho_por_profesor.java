package Ejerecicios_Condicionales;

import java.util.Scanner;

public class Ejercicio1_hecho_por_profesor {

	public static void main(String[] args) {
		
		String mes="Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println(Math.random());
		//java.lang, son clases que vienen ya importadas por defecto
		//ctrl shift O te permite importar bibliotecas que el programa necesite
		System.out.println("Escribe el nombre de un mes");
		//input
		mes = scan.nextLine();
		System.out.println("Mes introducido:"+mes);
		/*
		 * Como ejecutar java en modo debug
		 */
		
		//Realizamos con el if
		/*
		 * if (mes== "Enero"){
				estacion="Invierno";
				System.out.println("Es "+estacion);
			}
			Esto daría error
		 */
		String estacion="";
		if (mes.equals("Enero") || mes.equals("Febrero")|| mes.equals("Marzo")) {
			estacion="Invierno";
			System.out.println("Estamos en "+estacion);
		}
		else if (mes.equals("Abril") || mes.equals("Mayo")|| mes.equals("Junio")) {
			estacion="Primavera";
			System.out.println("Estamos en "+estacion);
		}
		else if (mes.equals("Julio") || mes.equals("Agosto")|| mes.equals("Septiembre")) {
			estacion="Verano";
			System.out.println("Estamos en "+estacion);
		}
		else if (mes.equals("Octubre") || mes.equals("Noviembre")|| mes.equals("Diciembre")) {
			estacion="Otoño";
			System.out.println("Estamos en "+estacion);
		}
		//Existe el comando( variable1.equalsIgnoreCase(variable2)), este es para ignorar las mayúsculas y minúsculas
		
		//Switch
		switch(mes) {
		case "Enero":System.out.println("Invierno");break;
		case "Febrero":System.out.println("Invierno");break;
		case "Marzo":System.out.println("Invierno");break;
		case "Abril":System.out.println("Primavera");break;
		case "Mayo":System.out.println("Primavera");break;
		case "Junio":System.out.println("Primavera");break;
		case "Julio":System.out.println("Verano");break;
		case "Agosto":System.out.println("Verano");break;
		case "Septiembre":System.out.println("Verano");break;
		case "Octubre":System.out.println("Otoño");break;
		case "Noviembre":System.out.println("Otoño");break;
		case "Diciembre":System.out.println("Otoño");break;
		
		}
		//scan.nextInt() para coger el input de un número
		
	}

}
