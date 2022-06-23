package exercicio2;

import java.util.Scanner;

public class MediaNotasDoBimestre {

    public static void main(String[] args) {

    Scanner input =new Scanner(System.in    );

System.out.println("Oi! Eu sou sua calculadora bimestral , digite sua primeira nota do bimestre, clique enter ao preencher");

double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota do bimestre");
        double nota2 = input.nextDouble();

        System.out.println("Digite sua terceira nota do bimestre");

        double nota3 = input.nextDouble();
        System.out.println("Digite sua terceira nota do bimestre");
        double nota4 = input.nextDouble();

        System.out.println("Digite sua quarta nota do bimestre");
        input.close();

        double somaDasnotas = nota1 + nota2 + nota3 + nota4;
        double mediaDasnotas = somaDasnotas / 4;

        System.out.println("A média das suas notas é: " + somaDasnotas);
    }

}

