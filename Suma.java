import java.util.Scanner;

public class Suma {
  public static void main(String[] args) {
    // crear aplicacion que pida 5 numeros y los sume
    int resultado, numero;
    Scanner t = new Scanner(System.in);


    resultado = 0;

    do {
      System.out.print("Ingrese numero: ");
      numero = t.nextInt();

      resultado = resultado + numero;
    } while(numero != 0);

    System.out.println("La suma total es: " + resultado);
  }
}
