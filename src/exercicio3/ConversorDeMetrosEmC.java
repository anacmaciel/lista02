package exercicio3;

import java.util.Scanner;

public class ConversorDeMetrosEmC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite, em metros a altura que você quer converter em centímetros e tecle enter.");

        double alturaEmMetros = input.nextDouble();
input.close();

double alturaEmCm = alturaEmMetros * 100;

    System.out.println("A conversão de metros em centímetros é: " + alturaEmCm + " CM");

    }

}

