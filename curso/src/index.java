import java.util.Scanner;

public class index {

  public static void main(String[] args) {

    Scanner prompt = new Scanner(System.in);

    System.out.print("Informe as Horas: ");
    int horas = prompt.nextInt();

    System.out.print("Informe as minutos: ");
    int minutos = prompt.nextInt();

    int segundos = prompt.nextInt();
    System.out.print("Informe as segundos: ");

    int resultado = (horas * 60 * 60) + (minutos * 60) + segundos;
    System.out.println("resultado: " + resultado);

  }
}