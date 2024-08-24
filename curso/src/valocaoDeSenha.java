import java.util.Scanner;

public class valocaoDeSenha {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        final Integer senhaCorreta = 12345, quantidademaxima=3;
        Integer senhaDigitada = 0, quatidadeTentativa=0;

        do {

            System.out.println("Informe a senha: ");
            senhaDigitada = prompt.nextInt();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("senha esta incorreta");
                quatidadeTentativa ++;
            }

        } while (!senhaDigitada.equals(senhaCorreta) && quatidadeTentativa < quantidademaxima);

       if(quatidadeTentativa.equals(quantidademaxima)) {
           System.out.println("sua conta esta bloqueda por tentar mais de 3 vezes");
       } else {
           System.out.println("senha correta!");
       }


    }
}
