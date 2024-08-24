import java.util.Scanner;

public class comparacaoMaiorEntre5vComArray2 {

    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        final Integer quantidade = 5;

        Integer numero[] = new Integer[quantidade];

        Integer MaiorValor = 0, MaiorPosicao = 0;

        for (int i=0;i<quantidade;i++) {

            System.out.println("inform o "+(i+1)+" Valor: ");
            numero[i] = prompt.nextInt();

            if (numero[i]== 0) {

                MaiorValor = numero[i];
                MaiorPosicao = i+1;

            } else if (numero[i] > MaiorValor) {

                MaiorValor = numero[i];
                MaiorPosicao = i+1;

            }
        }

        System.out.println("\nOs valores recebidor foram: ");

        for (int i=0;i<quantidade;i++) {

            System.out.println((i+1)+"º Posisão = "+numero[i]);

        }
        System.out.println("\nO maior valor é "+MaiorValor+" na "+MaiorPosicao+"º Posisão");

    }

}
