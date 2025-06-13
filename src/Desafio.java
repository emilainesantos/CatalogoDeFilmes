import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nome = "Jaqueline oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        int opcao = 0;
        double receberValor;
        double transferencia;

        System.out.println("****************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da conta: R$" + saldoInicial);
        System.out.println("****************");

        //menu
        String menu = """
                   ** Operações **
                   
                   1- Consultar saldos
                   2- Receber valor
                   3- Transferir valor
                   4- Sair
                   
                   Digite a opção desejada:
                   """;

        Scanner leitura = new Scanner(System.in);


       while (opcao != 4){
           System.out.println(menu);
           opcao = leitura.nextInt();

           if (opcao == 1){
               System.out.println("Saldo da conta é R$ " + saldoInicial);
           }
           if (opcao == 2){
               System.out.println("Qual valor? ");
               receberValor = leitura.nextDouble();
               double valor = saldoInicial + receberValor;
               System.out.println("""
                       Valor recebido
                       Saldo final R$
                       """ + valor);
           }
            if (opcao == 3){
               System.out.println("Qual valor? ");
               transferencia = leitura.nextDouble();

               if( transferencia > saldoInicial) {
                   System.out.println("Não é valor suficiente para transferir");
               }else  {
                     double valor = saldoInicial - transferencia;
               System.out.println("""
                       Tranferencia realizada
                       Saldo final
                       """ + valor);
               }

           } if (opcao == 4){
               System.out.println("finalizado");
           }
       }

    }
}
