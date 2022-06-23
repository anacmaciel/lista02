package exercicio7;

import java.util.Scanner;

public class ProgramaExibirSalarioComdescontos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor que você recebe por hora trabalhada");
        double valorHoraTrabalhada = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês");
        double quantidadeHorasTrabalhadas = input.nextDouble();
        input.close();
        double salarioDoMes = valorHoraTrabalhada * quantidadeHorasTrabalhadas;

        System.out.println("Seu salário este mês foi de: " + salarioDoMes);

        double descontoImpostoDeRenda = salarioDoMes * 0.11;
double descontoInss = salarioDoMes * 0.08;
double descontoSindicato= salarioDoMes * 0.05;

double salarioLiqido = salarioDoMes - descontoImpostoDeRenda - descontoInss - descontoSindicato;
        System.out.println("O valor do desconto do imposto de renda  é: " + descontoImpostoDeRenda);

        System.out.println("O valor do desconto do inss é: " + descontoInss);
        System.out.println("O valor do desconto do sindicato é: " + descontoSindicato);

        System.out.println("O salário líquido é: " + salarioLiqido);

    }
}
