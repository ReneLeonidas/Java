import java.util.Scanner;

public class Suma2 {
  public static void main(String[] args) {
    // crear aplicacion que pida 5 numeros y los sume
    int resultado;
    int[] numero;

    Scanner t = new Scanner(System.in);

    numero = new int[10];

    resultado = 0;

    for(int i = 0; i < 10; i++) {
      System.out.print("Ingrese numero pos. " + i + ": ");
      numero[i] = t.nextInt();
    }

    for(int i = 0; i < 10; i++) {
      resultado = resultado + numero[i];
    }

    System.out.println("Resultado de la suma: " + resultado);
  }
}
