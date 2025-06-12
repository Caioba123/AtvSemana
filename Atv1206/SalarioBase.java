package Atv1206;

import java.util.Scanner;

public class SalarioBase {

    public static void main (String[] args) {

        Scanner tec = new Scanner(System.in);


        
        System.out.print("Diga o seu salário base: ");
        double escolha = tec.nextDouble();

        
        double gratificação = escolha * 0.08;
        double imposto = escolha * 0.11;
        double vresultado = escolha + gratificação - imposto;

        
        System.out.println("Seu Salario base é: " + escolha);
        System.out.println("Sua Gratificação é: " + gratificação);
        System.out.println("O seu imposto de renda é: " + imposto);
        System.out.println("O valor final após imposto e gratificação do seu salário é: " + vresultado);
        System.out.println("-------------------------------------");

        
        double primeirov = vresultado * 0.05;
        double segundov = vresultado - primeirov;

        double primeirov2 = vresultado * 0.11;
        double segundov2 = vresultado - primeirov2;

        
        if (vresultado < 3000.00) {
            System.out.println("5% de desconto no salario: " + segundov);
        } else if (vresultado > 3000.00) {
            System.out.println("11% de desconto no salario: " + segundov2);
        } else {
            System.out.println("Valor incorreto");
        }

    }
}
