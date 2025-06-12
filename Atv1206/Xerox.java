package Atv1206;

import java.util.Scanner;

public class Xerox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner tec = new Scanner(System.in);
		 
		 System.out.println("--Bem vindo a nossa empresa-- ");
	        System.out.println("Qual dos serviços voce deseja?");
	        System.out.println("1 - Xerox");
	        System.out.println("2 - Impressão");
	        System.out.println("3 - Manutenção de Computador");
	        System.out.println("Obs: apenas digite o número.");
	        int escolha = tec.nextInt();

	        if (escolha == 1) {
	            System.out.println("Diga seu nome");
	            String nome1 = tec.nextLine();
	            System.out.println(nome1 + " solicitou o serviço " +escolha);
	        } else if (escolha == 2) {
	        	 System.out.println("Diga seu nome");
		         String nome2 = tec.nextLine();
		         System.out.println(nome2 + " solicitou o serviço " +escolha);
	        } else if (escolha == 3) {
	        	 System.out.println("Diga seu nome");
		         String nome3 = tec.nextLine();
		         System.out.println(nome3 + " solicitou o serviço " +escolha);
	        }else {
	            System.out.println("Erro.");
	        }
	}

}
