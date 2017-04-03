// El sistema debe pedir un numero y devolver si es impar o par
// El sistema termina cuando ingrese el numero 0

import java.util.Scanner;
public class Impar {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		int numero, resiudo;
		boolean tieneResiduo;

		do {
			System.out.print("Ingrese numero: ");
			numero = t.nextInt();

			resiudo = numero % 2;

			if(resiudo == 0) {
				tieneResiduo = false;
			} else {
				tieneResiduo = true;
			}

			if(tieneResiduo == true) System.out.println("El numero x es PAR.");
			else System.out.println("El numero x es IMPAR.");
		} while (numero != 0);

	}
}
