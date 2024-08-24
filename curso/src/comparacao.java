import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("informe o primero valor: ");
        Integer numero1 = prompt.nextInt();

        System.out.println("informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();

        if (numero1 > numero2) {

            System.out.println("o numero 1 "+numero1+" é maior que o numero 2 "+numero2);

        } else if (numero1 < numero2) {

            System.out.println("o numero 1 "+numero1+" é menor que o numero 2 "+numero2);

        } else {

            System.out.println("o numero 1 "+numero1+" é igual ao numero 2 "+numero2);

        }
    }
}

