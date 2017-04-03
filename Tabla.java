public class Tabla {
	public static void main(String[] args) {
		int i, multiplicando, multiplidor, resultado;
		i = 0;

		multiplidor = 7;


		while(i < 10) {
			multiplicando = i + 1;
			resultado = multiplicando * multiplidor;

			System.out.println("El numero " + multiplicando
				+ " x " + multiplidor + " es igual a: " + resultado);

			i++;
		}
	}
}