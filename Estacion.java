import java.util.Scanner;
// PRIMAVERA: marzo=3, abril=4 y mayo=5
// VERANO: junio=6, julio=7 y agosto=8
// OTONO: septiembre=9, octubre y noviembre
// INVIERNO: diciembre, enero, febrero
public class Estacion {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int mes;

		System.out.print("Ingrese mes: ");
		mes = t.nextInt();

		if(mes >= 3 && mes <= 5) System.out.println("PRIMAVERA");
		else if(mes >= 6 && mes <= 8) System.out.println("VERANO");
		else if(mes >= 9 && mes <= 11) System.out.println("OTONO");
		else if(mes == 12 || mes == 1 || mes == 2) System.out.println("INVIERNO");
		else System.out.println("El mes ingresado no existe!");
	}
}