public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true; // Verificar se o filme é gratis ou não
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else{
            System.out.println("Filme não liberado, você tem que pagar a locação");
        }
    }
}
