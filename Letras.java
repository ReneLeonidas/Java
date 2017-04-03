// Ingrese una moneda
// 1 UN SOL
// 2 DOS SOLES
// 3 TRES SOLES
// 20 VEINTE SOLES
import java.util.Scanner;

public class Letras {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int moneda;

		System.out.print("Ingresar mes: ");
		moneda = t.nextInt();

		switch(moneda) {
			case 1:
				System.out.println("UN SOL");
				break;
			case 2:
				System.out.println("DOS SOLES");
				break;
			case 3:
				System.out.println("TRES SOLES");
				break;
			case 40:
				System.out.println("CUARENTA SOLES");
				break;
			case 14210:
				System.out.println("CATORCE MIL DOSCIENTOS DIEZ SOLES");
				break;
			default:
				System.out.println("LA MONEDA NO ESTA REGISTRADA.");
		}
	}
}