import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        int numero = entradaDoUsuario.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O número informado foi " + numero);
        System.out.println("O seu antecessor é " + antecessor + " e o seu sucessor é " + sucessor + ".");

    }
}
