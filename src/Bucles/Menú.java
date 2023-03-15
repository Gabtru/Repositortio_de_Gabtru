package Bucles;

import java.util.Scanner;

public class Menú {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion=0;
		while(opcion!=4) {
		System.out.println("Seleccione una opcion entre la 1, 2, 3 o 4.");
		opcion=scan.nextInt();
		if(opcion==1) {
			System.out.println("Se esta validando el email");
		}
		else if (opcion==2) {
			System.out.println("Se esta pintando un cuadrado");
			
		}
		else if (opcion==3) {
			System.out.println("Se estan mostrando datos");
		}
		else if (opcion==4) {
			System.out.println("Se ha salido del menú");
		}
		else {
			System.out.println("No ha seleccionado una opción valida para el programa");
		}
		switch(opcion) {
		case 2 : pintaCaudrado(4);break;
		}
		}
	}
		public static void pintaCaudrado(int size) {
			for (int i=1; i<size;i++) {
				for(int j=1; j<size;j++) {
					if (i==0||i==-1) {
						System.out.print("*\t");
					}
					else if (j==0||j==-1) {
						System.out.print("*\t");
					}
					else {
						System.out.print("*\t");
					}
				}
				
				
			}
		}
	

}
