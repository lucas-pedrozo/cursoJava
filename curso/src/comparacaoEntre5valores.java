import java.util.Scanner;

public class comparacaoEntre5valores {

    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        Integer mairoValor,maiorPosicao;

        System.out.println("informe o primero valor: ");
        Integer numero1 = prompt.nextInt();
        mairoValor = numero1;
        maiorPosicao = 1;

        System.out.println("informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();

            if (numero2 > mairoValor) {
                mairoValor = numero2;
                maiorPosicao = 2;
            }

        System.out.println("informe o terceiro valor: ");
        Integer numero3 = prompt.nextInt();

            if (numero3 > mairoValor) {
                mairoValor = numero3;
                maiorPosicao = 3;
            }

        System.out.println("informe o quarto valor: ");
        Integer numero4 = prompt.nextInt();

            if (numero4 > mairoValor) {
                mairoValor = numero4;
                maiorPosicao = 4;
            }

        System.out.println("informe o quinto valor: ");
        Integer numero5 = prompt.nextInt();

            if (numero5 > mairoValor) {
                mairoValor = numero5;
                maiorPosicao = 5;
            }

        System.out.println("o maior valor é " + mairoValor + " e sua posição é a " +maiorPosicao+"º");
    }
}
