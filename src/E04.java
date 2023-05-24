import java.util.Scanner;

public class E04 {
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

        double salarioMensal = salarioHora * horasMensais;
        System.out.println("Esse mês seu salário será R$" + salarioMensal);


    }
}
