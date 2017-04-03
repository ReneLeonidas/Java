import java.util.Scanner;
// El sistema debe pedir un numero y devolver su cuadrado
// El sistema termina cuando ingrese el numero 0
public class Cuadrado {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero;

		do {
			System.out.print("Ingrese numero: ");
			numero = t.nextInt();

			System.out.println("Su cuadrado es: " + (numero * numero));
		} while (numero != 0);

	}
}