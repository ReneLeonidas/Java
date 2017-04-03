// Introducir un valor de inicio y final
// Hallar los numeros pares comprendidos entre ambos
import java.util.Scanner;

public class ParesMejorado {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int par, indice, inicio, fin;

		System.out.print("Valor de inicio: ");
		inicio = t.nextInt();

		System.out.print("Valor de fin: ");
		fin = t.nextInt();

		for(indice = inicio; indice <= fin; indice++) {
			if(indice == 30) break;

			if(indice == 14) continue;

			if(indice % 2 == 0) System.out.println("Numero: " + indice);
		}

	}
}