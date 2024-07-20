public class CalculoINSS {
    public static double calculoINSS(double salario) {

        // os cálculos das alíquotas foram feitos baseados no sistema de cálculo do site: https://www.pontotel.com.br/calculo-inss/
        // os valores utilizados são os disponibilizados no exercício, e não o do site!

        double desconto;

        if (salario <= 1212.00) {
            desconto = salario * 0.075;

        } else if (salario >= 1212.01 && salario <= 2427.35) {
            desconto = 1212.00 * 0.075 + (salario - 1212.01) * 0.09;

        } else if (salario >= 2427.36 && salario <= 3641.03) {
            desconto = 1212.00 * 0.075 + (2427.35 - 1212.00) * 0.09
                    + (salario - 2427.36) * 0.12;

        } else if (salario >= 3641.02 && salario <= 7087.22) {
            desconto = 1212.00 * 0.075 + (2427.35 - 1212.01) * 0.09
                    + (3641.02 - 2427.36) * 0.12 + (salario - 3641.02) * 0.14;

        } else {
            desconto = 1212.00 * 0.075 + (2427.35 - 1212.01) * 0.09
                    + (3641.03 - 2427.36) * 0.12 + (7087.22 - 3641.01) * 0.14
                    + (salario - 7087.23) * 0.14;
        }
        return desconto;
    }
}
