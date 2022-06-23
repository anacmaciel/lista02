package exercicio4;

import java.util.Scanner;

public class SalarioHorasTrabalhadas {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor que você recebe por hora trabalhada");
    double valorHoraTrabalhada = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês");
    double quantidadeHorasTrabalhadas = input.nextDouble();
input.close();
double salarioDoMes = valorHoraTrabalhada * quantidadeHorasTrabalhadas;

        System.out.println("Seu salário este mês foi de: " + salarioDoMes);

    }

}
