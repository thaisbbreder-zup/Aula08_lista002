import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("Olá! Você está pronto para calcular a sua MÉDIA ARITMETICA?!");
        System.out.println("Informe a primeira nota: ");
        double primeiraNota = entradaDoUsuario.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double segundaNota = entradaDoUsuario.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double terceiraNota = entradaDoUsuario.nextDouble();

        System.out.println("Informe a quarta nota: ");
        double quartaNota = entradaDoUsuario.nextDouble();

        double mediaAritmetica = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.printf("A média aritmetica final é: %.2f%n", mediaAritmetica);

        if (mediaAritmetica < 6) {
            System.out.println("Poxa, sua nota foi abaixo do esperado. Procure ajuda do seu professor! =(");
        } else {
            System.out.println("Uau, parábens! Você alcançou a média =)");
        }
    }
}
