package Bucles;

public class Ejemplo_Bucles {

	public static void main(String[] args) {
		//for
		int a=0;
		System.out.println(a%2==0);
		for( int i=0 ; i<10 ;i++ ) {
			if (i%2==0 && i<8) {
				continue;
			}
			else if (i%3==0) {
				break;
			}
			System.out.println(i);
		}
		//i++ aumenta de uno en uno
		//i++ sirve por ejemplo para imprimir un número y despues ese numero sumarlo más 1
		
		int num=10;
		while (num<=4) {
			System.out.println(num);
			num++;
		}
		
		do {
			System.out.println(num);
		}while(num>3);
		
	}

}
