import java.util.Scanner;

public class comparacaoEntre5valores3 {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        Integer numero,maiorValor=0,maiorPosicao=0;

        final Integer qualtidade = 5;

        for (int i=1;i<=qualtidade;i++) {
            System.out.println("informe o " +i+" valor");
            numero = prompt.nextInt();
            if (i==1) {
                maiorValor = numero;
                maiorPosicao = i;
            } else if (maiorValor > numero) {
                maiorValor = numero;
                maiorPosicao= i;
            }
        }
        System.out.println("o maior valor é " + maiorValor + " e sua posição é a " +maiorPosicao+"º");
    }
}
