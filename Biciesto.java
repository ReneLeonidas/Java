import java.util.Scanner;

public class Biciesto {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int year, m4, m100, m400;

		// buble para el ingreso de informacion
		// y determinar si es biciesto
		do {
			System.out.print("Ingrese anio: ");
			year = t.nextInt();

			m4 = year % 4;
			m100 = year % 100;
			m400 = year % 400;

			if(m4 == 0 && (m100 != 0 || m400 != 0)) System.out.println("ANIO BICIESTO");
			else System.out.println("ANIO NO BICIESTO");

		} while(year != 0 && year > 0);
	}
}