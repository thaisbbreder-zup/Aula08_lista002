import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("CALCULADORA DE SALÁRIO");
        System.out.println("Quanto você recebe por hora?");
        double salarioHora = entradaDoUsuario.nextDouble();

        System.out.println("Quantas horas você trabalha por dia?");
        double horaDiaria = entradaDoUsuario.nextDouble();

        System.out.println("Quantos dias você trabalhou nesse mês?");
        double diasTrabalhados = entradaDoUsuario.nextDouble();

        //calculo de quantas horas mensais o usuário trabalhou naquele mês
        double horasMensais = horaDiaria * diasTrabalhados;

        //calculo do salario bruto
        double salarioMensal = salarioHora * horasMensais;

        //calculo do desconto do imposto de renda
        double imposto = (salarioMensal * 11) / 100;

        //calculo do desconto do inss
        double inss = (salarioMensal * 8) / 100;

        //calculo do desconto do sindicato
        double sindicato = (salarioMensal * 5) / 100;

        //calculo do salario liquido
        double salarioLiquido = salarioMensal - imposto - inss - sindicato;

        System.out.println("O seu salário bruto é R$" + salarioMensal
                + "\n\nFoi descontado:"
                + "\nR$" + imposto + " de imposto de renda."
                + "\nR$" + inss + " de INSS."
                + "\nR$" + sindicato + " de sindicato."
                + "\n\nSeu salário liquido é R$" + salarioLiquido);
    }
}

