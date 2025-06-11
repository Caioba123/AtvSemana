package Atv1106pt2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Responsabilidades {
    public static void cadastrar3(Scanner teclado) {
		try {

        System.out.println("----Cadastro---- \n");
        
        Scanner entrada = new Scanner(System.in);
        Scanner tec = new Scanner(System.in);
       int opcao = 0;
       System.out.println("seja bem vindo ao nosso sistema \n");
       System.out.println("por favor, coloque o seu nome: ");
       String nome = entrada.nextLine();

       System.out.println("por favor, coloque o seu CPF: ");
       double cpf = entrada.nextDouble();
       entrada.nextLine();

        
        Scanner agendamento = new Scanner(System.in);
        Scanner tec1 = new Scanner(System.in);  
         System.out.println("seja bem vindo ao nosso sistema");
         System.out.println("escolha um dia melhor para você \n");
         System.out.println("segunda às 9h às 18h");
         System.out.println("terça às 7h às 17h");
         System.out.println("quarta às 10h às 19h");
         System.out.println("quinta às 9h às 18h");
         System.out.println("sexta às 7h às 19h");

         System.out.print("Digite o dia escolhido: ");
         String diaEscolhido = agendamento.nextLine().toLowerCase();

         if (diaEscolhido.equals("segunda")) {
             System.out.println("consulta agendada com sucesso! \n");
         } else if (diaEscolhido.equals("terca") || diaEscolhido.equals("terça")) {
             System.out.println("consulta agendada com sucesso! \n");
         } else if (diaEscolhido.equals("quarta")) {
             System.out.println("consulta agendada com sucesso! \n");
         } else if (diaEscolhido.equals("quinta")) {
             System.out.println("consulta agendada com sucesso! \n");
         } else if (diaEscolhido.equals("sexta")) {
             System.out.println("consulta agendada com sucesso! \n");
         } else {
             System.out.println("dia inválido. Por favor, tente novamente. \n");
         }
         
         System.out.println("vamos calcular a idade do seu animal por favor \n");
         
         System.out.println("coloque o ano que o animal nasceu: ");
         double anonasceu = tec1.nextDouble();
         System.out.println("agora o ano atual: ");
         double anoatual = tec1.nextDouble();
         double idade = anoatual-anonasceu;
         System.out.println("O animal tem: " + idade );

         System.out.println("\n\nDigite 1 para voltar ao menu:");
         int voltar = teclado.nextInt();
         if (voltar == 1) {
             Menu.voltaraoMenu();
         } else {
             System.out.println("Encerrando o programa.");
         }
         
		} catch (InputMismatchException e) {
		    System.out.println("Erro encontrado. Use numero inteiro. ");
		} catch (Exception e) {
		    System.out.println("Erro inesperado: " + e.getMessage());
		} finally {
			
		}
         teclado.close();


    }
}

