package Atv1106pt2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	 public static void voltaraoMenu() {
		 
	        String[] args = null;
	        main(args); 
	    }
    public static void main(String[] args) {
		try {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--Bem vindo ao nosso sistema veterinario-- ");
        System.out.println("Você quer acessar qual dos nossos menus?\n  1- Menu de Dados \n 2- Menu de Comportamentos \n 3- Menu de Responsabilidades ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            dados.cadastrar1(teclado);
        } else if (escolha == 2) {
            comportamentos.cadastrar2(teclado);
        } else if (escolha == 3) {
            responsabilidades.cadastrar3(teclado);
        } else {
            System.out.println("Seção inválida.");
        }

		} catch (InputMismatchException e) {
		    System.out.println("Erro encontrado. Use numero inteiro. ");
		} catch (Exception e) {
		    System.out.println("Erro inesperado: " + e.getMessage());
		} finally {
       
    }
}
}