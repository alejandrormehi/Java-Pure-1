package fase1;

import java.util.Scanner;

public class Arbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int filas = sc.nextInt();		


		for(int i=1 ; i<=filas ; i++) {
			for(int j=0 ; j<filas-i ; j++) {
				System.out.print(" ");
			}
			for(int k=0; k < (i*2); k++) {
				
				System.out.print("*");				
			}
			System.out.println();
		}
		for(int i=1 ; i<=filas ; i++) {
			for(int j=0 ; j<=i ; j++) {
				if (i == filas / 2  ) {
				System.out.print("*");				
			}else {
			System.out.print(" ");
			}
		}
			System.out.println();
		}
	}
}


