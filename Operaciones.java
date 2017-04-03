// Crear un menu en JAVA
// AREA DE FIGURAS GEOMETRICAS
// ===========================
// 1. CUADRADO
// 2. TRIANGULO
// 3. RECTANGULO
// 4. ROMBO
// 5. CIRCULO
// 6. SALIR DE LA APLICACION

// Ingrese opcion: x
// Cada vez que termine una operacion, repite el menu
import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int menu;
		int a, b, resultado;

		do {
		System.out.println("AREA DE FIGURAS GEOMETRICAS");
		System.out.println("===========================\n");
		System.out.println("[1] Area del CUADRADO.");
		System.out.println("[2] Area del TRIANGULO");
		System.out.println("[3] Area del RECTANGULO");
		System.out.println("[4] Area del ROMBO");
		System.out.println("[5] Area del CIRCULO");
		System.out.println("[6] Salir de la aplicacion.\n");

		System.out.print("Ingrese opcion: ");
		menu = t.nextInt();

		switch(menu) {
			case 1:
				System.out.print("Ingrese el lado: ");
				a = t.nextInt();
				resultado = a * a;
				System.out.println("El AREA del CUADRADO es: " + resultado);
				System.out.println();
				System.out.println();
				System.out.println();
				break;
			case 2:
				System.out.print("Ingrese la base: ");
				a = t.nextInt();

				System.out.print("Ingrese la altura: ");
				b = t.nextInt();
				resultado = (a * b) / 2;
				System.out.println("El AREA del TRIANGULO es: " + resultado);
				System.out.println();
				System.out.println();
				System.out.println();
				break;
			case 5:
				System.out.print("Ingrese el radio: ");
				a = t.nextInt();
				resultado = (int)(a * a * 3.1416f);
				System.out.println("El AREA del CIRCULO es: " + resultado);
				System.out.println();
				System.out.println();
				System.out.println();
			case 6:
				System.out.println("Usted ha cerrado la aplicacion. Adios!");
				break;
			default:
				System.out.println("La opcion marcada es incorrecta.");
		}
		} while(menu != 6);
	}
}

