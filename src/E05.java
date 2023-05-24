import java.awt.*;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("Informe a temperatura em Fahrenheit");
        double fahrenheit = entradaDoUsuario.nextDouble();

        double conversao = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " fahrenheit é igual a " + conversao + " graus Celcius");

    }
}
