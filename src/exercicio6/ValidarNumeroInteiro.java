package exercicio6;

import java.util.Scanner;

public class ValidarNumeroInteiro {

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.println("Digite um número");
int numeroInteiro = input.nextInt();
    input.close();
        int numeroAntecessor= numeroInteiro - 1;
        int numeroSucessor = numeroInteiro + 1;

        if (numeroInteiro > 0) {
            System.out.println("O número antecessor de " + numeroInteiro + " é " + numeroAntecessor + " e seu sucessor é " + numeroSucessor);
        } else {
            System.out.println("Operação inválida");
        }
    }
}
