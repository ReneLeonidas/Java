import java.util.Scanner;

// estudiante nota > 10 true
// inasistencias < 3 true

public class Booleanos {
  public static void main(String[] args) {
    boolean estadoNota, estadoAsistencia;

    int promedio, inasistencias;
    Scanner t = new Scanner(System.in);

    System.out.print("Ingrese promedio: ");
    promedio = t.nextInt();

    System.out.print("Ingrese cantidad de inasistencias: ");
    inasistencias = t.nextInt();

    if(promedio > 10) {
      estadoNota = true;
    } else {
      estadoNota = false;
    }

    if(inasistencias < 3) {
      estadoAsistencia = true;
    } else {
      estadoAsistencia = false;
    }

    if(estadoNota == true && estadoAsistencia == true) {
      System.out.println("El estudiante ha aprobado el curso.");
      System.out.println("Promedio: " + estadoNota);
      System.out.println("Asistencias: " + estadoAsistencia);
    } else {
      System.out.println("El estudiante ha desaprobado el curso.");
      System.out.println("Promedio: " + estadoNota);
      System.out.println("Asistencias: " + estadoAsistencia);
    }

  }
}
