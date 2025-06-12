import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // o SCANNER é uma variavel que se ref a criação de um objeto do tipo scanner.
        // new Scanner é a criação de um novo objeto scanner que vai ler dados do 'teclado'.
        //(System.in) se ref a entrada padrão do sistema que é o 'teclado'.

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        //NextLine serve para ler oque foi digitado, nesse caso uma String ex: one piece
        //

        System.out.println("Qual o ano de lançamento");
        int anoDelancamento = leitura.nextInt(); //NextInt para numeros inteiros ex: -10, 20, 7, 1 , 0
        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble(); //NextDouble para casas decimais  ex: 3.14, 4.0, 1.000

        System.out.println(filme);
        System.out.println(anoDelancamento);
        System.out.println(avaliacao);



    }
}
