
/* 7.- 
Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de tres dados en función a la cantidad 
de Seis obtenidos, de acuerdo a lo siguiente:
-Seis en los tres dados: excelente
-Seis en dos dados: muy bien
-Seis en un dado: regular
-Ningún seis: pésimo 
Sacchetti, Maria Giselle c2*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el resultado del lanzamiento del Dado1 (1 al 6):");
    int dado1 = scanner.nextInt();
    System.out.println("Ingrese el resultado del lanzamiento del Dado2 (1 al 6):");
    int dado2 = scanner.nextInt();
    System.out.println("Ingrese el resultado del lanzamiento del Dado3 (1 al 6):");
    int dado3 = scanner.nextInt();

    
    int seis = 0;
    if (dado1 == 6)
      seis++;
    if (dado2 == 6)
      seis++;
    if (dado3 == 6)
      seis++;

    String calificacion;
    switch (seis) {
      case 3:
        calificacion = "Excelente";
        break;
      case 2:
        calificacion = "Muy bien";
        break;
      case 1:
        calificacion = "Regular";
        break;
      default:
        calificacion = "Pésimo";
        break;
    }

    System.out.println("Calificación: " + calificacion);

    scanner.close();
  }

}