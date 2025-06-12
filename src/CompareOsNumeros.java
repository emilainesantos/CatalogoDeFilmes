import java.util.Scanner;

public class CompareOsNumeros {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("digite um numero ");
        int numeroUm = valor.nextInt();

        System.out.println("digite um numero ");
        int numeroDois = valor.nextInt();

        //Comparacao
        if (numeroUm == numeroDois){
            System.out.println(" são iguais");
        }else { System.out.println("Sao diferentes");
        }

        if (numeroUm > numeroDois){
            System.out.println( numeroUm +" é maior.");
        }else { System.out.println(numeroDois + " é maior");
        }
        }

    }
