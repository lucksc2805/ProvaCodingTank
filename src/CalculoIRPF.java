//Classe para calcular o Imposto de Renda.

public class CalculoIRPF {
    public static double calculoIR(double salario) {

        double desconto;

        if (salario <= 1903.98) {
            desconto = 0;

        } else if (salario >= 1903.99 && salario <= 2826.65) {
            desconto = (salario - 1903.99) * 0.075;

        } else if (salario >= 2926.66 && salario <= 3751.05) {
            desconto = (2826.65 - 1903.99) * 0.075 + (salario - 2826.66) * 0.15;

        } else if (salario >= 3751.06 && salario <= 4664.68) {
            desconto = (2826.65 - 1903.99) * 0.075 + (3751.05 - 2826.65) * 0.15
                    + (salario - 3751.06) * 0.225;

        } else {
            desconto = (2826.65 - 1903.99) * 0.075 + (3751.05 - 2826.65) * 0.15
                    + (4664.68 - 3751.05) * 0.225 + (salario - 4664.69) * 0.275;
        }
        return desconto;
    }
}
