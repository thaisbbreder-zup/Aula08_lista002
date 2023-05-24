import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("CONVERSOR DE MEDIDAS");
        System.out.println("Informe a medida em metros (ex: 1,56)");

        double medida = entradaDoUsuario.nextDouble();
        double conversao = medida * 100;

        System.out.println(medida + " metros é igual a " + conversao + " centímetros");

    }
}
