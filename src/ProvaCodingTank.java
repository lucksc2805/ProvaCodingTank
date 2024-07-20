import java.util.Scanner;

public class ProvaCodingTank {
    public static void main(String[] args) {

        System.out.println("Bem-vindo. Este programa calcula o salário líquido, junto aos seus descontos do INSS e IFPR e os disponibiliza.");

        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Escreva o salário bruto do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        scanner.close();

        for (int i = 0; i < 5; i++) {

            double salarioBruto = salarios[i];
            double descontoINSS = CalculoINSS.calculoINSS(salarioBruto);
            double descontoIRPF = CalculoIRPF.calculoIR(salarioBruto - descontoINSS);
            double salarioLiquido = (salarioBruto - descontoINSS - descontoIRPF);

            System.out.printf("Funcionário %d \n", i + 1);

            System.out.printf("Valor do salário bruto: R$ %.2f \n", salarioBruto);

            System.out.printf("Valor do desconto do INSS: R$ %.2f \n", descontoINSS);

            System.out.printf("Valor do desconto do IRPF: R$ %.2f \n", descontoIRPF);

            System.out.printf("Valor do salário líquido: R$ %.2f \n \n", salarioLiquido);
        }
    }
}