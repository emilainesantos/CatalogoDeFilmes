import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int valor = numero.nextInt();

        if (valor >= 0) {
            System.out.println("Numero Positivo");

        } else {
            System.out.println("Numero Negativo");
        }

    }

}
