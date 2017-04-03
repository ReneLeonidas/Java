import java.util.Scanner;

public class Suma3 {
  public static void main(String[] args) {
    // crear aplicacion que pida 5 numeros y los sume
    int resultado, cantidadNumeros;
    int[] numero;

    Scanner t = new Scanner(System.in);

    System.out.print("Cantidad de numeros: ");
    cantidadNumeros = t.nextInt();

    numero = new int[cantidadNumeros];

    resultado = 0;

    for(int i = 0; i < cantidadNumeros; i++) {
      System.out.print("Ingrese numero pos. " + i + ": ");
      numero[i] = t.nextInt();
    }

    for(int i = 0; i < cantidadNumeros; i++) {
      resultado = resultado + numero[i];
    }

    System.out.println("Resultado de la suma: " + resultado);
  }
}
