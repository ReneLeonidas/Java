import java.util.Scanner;

public class Doble {
  public static void main(String[] args) {
    // crear aplicacion que pida 5 numeros y los sume
    int resultado, cantidadNumeros;
    int[] numero;

    Scanner t = new Scanner(System.in);

    System.out.print("Cantidad de numeros: ");
    cantidadNumeros = t.nextInt();

    numero = new int[cantidadNumeros];

    resultado = 0;

    // aqui estamos capturando los numeros
    for(int i = 0; i < cantidadNumeros; i++) {
      System.out.print("Ingrese numero pos. " + i + ": ");
      numero[i] = t.nextInt() * 2;
    }

    // imprimir los nuevos valores
    System.out.println("\nEl doble de los numeros es:\n");

    for(int i = 0; i < cantidadNumeros; i++) {
      System.out.println(numero[i]);
    }
  }
}
