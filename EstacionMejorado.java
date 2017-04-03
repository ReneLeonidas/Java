import java.util.Scanner;
// PRIMAVERA: marzo=3, abril=4 y mayo=5
// VERANO: junio=6, julio=7 y agosto=8
// OTONO: septiembre=9, octubre y noviembre
// INVIERNO: diciembre, enero, febrero
public class EstacionMejorado {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int mes;

		System.out.print("Ingrese mes: ");
		mes = t.nextInt();

		switch(mes) {
			case 3:
			case 4:
			case 5:
				System.out.println("PRIMAVERA");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("VERANO");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("OTONO");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("INVIERNO");
				break;
			default:
				System.out.println("El mes ingresado no existe!");
		}
	}
}