import java.util.Scanner;

public class reajusteDeSalario {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double salario = prompt.nextInt();

        // quem ganha ate 1412 - reajuste de 12%
        // quem ganha até 3000 - reajuste de 9%
        // quem ganha até 5000 - reajuste de 5%
        // quem ganha acima de 5000 - reajuste de null

    double salarioR = 0;

        if (salario <= 1412) {
            System.out.println("reajuste de 12%");
           salarioR = salario * 1.12;

        }
        else if (salario <= 3000) {
            System.out.println("reajuste de 9%");
             salarioR = salario * 1.09;

        }
        else if (salario <= 5000) {
            System.out.println("reajuste de 5%");
             salarioR = salario * 1.05;

        }
        else if (salario > 5000) {
            System.out.println("Sem reajuste!");

        }

        System.out.println("Novo Salario: " + salarioR);

    }
}
