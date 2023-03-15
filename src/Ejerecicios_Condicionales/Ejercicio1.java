package Ejerecicios_Condicionales;

public class Ejercicio1 {
	public static void main(String[] args) {
	String mes="Enero";
	int caso=0;
	if (mes=="Enero"||mes=="Febrero"||mes=="Marzo") {
		caso=1;
	}
	else if (mes=="Abril"||mes=="Mayo"||mes=="Junio") {
		caso=2;
	}
	else if (mes=="Julio"||mes=="Agosto"||mes=="Septiembre") {
		caso=3;
	}
	else if (mes=="Octubre"||mes=="Nobiembre"||mes=="Diciembre") {
		caso=4;
	}
	switch(caso) {
	case 1:System.out.println("Tu estacion es invierno");break;
	case 2:System.out.println("Tu estacion es primavera");break;
	case 3:System.out.println("Tu estacion es verano");break;
	case 4:System.out.println("Tu estacion es otoño");break;
	}

}
}
