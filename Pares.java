// Imprimir los 20 primeros numeros pares

public class Pares {
	public static void main(String[] args) {
		int inicio, par;


		for(inicio = 0; inicio < 20; inicio++) {
			par = (inicio + 1) * 2;
			System.out.println("Numero: " + par);
		}
	}
}