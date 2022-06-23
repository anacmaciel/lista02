package exercicio5;

import  java.util.Scanner;

public class ConversorDeTemperaturaParaFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("digite a temperatura em graus Fahrenheit que você quer converter para célsius.");
        double temperaturaEmFahrenheit = input.nextDouble();
        input.close();
        double calculoConversao = (temperaturaEmFahrenheit - 32.0) / 1.8;

        System.out.println("A conversão da temperatura escolhida para célcius é: " + calculoConversao + " c ");

    }
}
