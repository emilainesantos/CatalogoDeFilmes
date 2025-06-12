import java.util.Scanner;

public class Loop_for {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota; // aqui não possuo ex: nota= 0, porque ele vai receber os dados da nota

        for (int i = 0; i < 3; i++) { // icrementei para ele solicitar 3 notas digitadas no imput
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble(); // vai receber as 3 notas ex: nota 10, 5, 10. total 25
            mediaAvaliacao += nota; // quando se usa += { á médiaavaliacao soma seu valor (0) + nota (25)

        }

        System.out.println("Média de avaliações "+ mediaAvaliacao/3); // 25/3  resultando a nota final.
    }


}
