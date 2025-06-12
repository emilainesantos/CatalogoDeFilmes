import java.util.Scanner;

public class Loop_While {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double mediaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0;

            while (nota != -1) {
                System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
                nota = leitura.nextDouble();


               if (nota != -1) {
                   mediaAvaliacao += nota; // quando se usa += { á médiaavaliacao soma seu valor (0) + nota (25)
                   totalDeNotas++ ;
               }
            }

            if (totalDeNotas == 0){ System.out.println("Média encerrada, nenhum valor atribuido ");
            }else {

                System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
            }

        }

    }
