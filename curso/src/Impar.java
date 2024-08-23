import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer numeroInteriro = prompt.nextInt();

        if (numeroInteriro%2 == 0) {

            System.out.println("O numero "+ numeroInteriro + " é Par!");

        } else  {

            System.out.println("O numero "+ numeroInteriro + " é Impar!");

        }
    }
}