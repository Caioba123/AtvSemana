package Atv1106pt2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dados {
    public static void cadastrar1(Scanner teclado) {
		try {

        System.out.println("----Dados----  ");

        System.out.print("Escolhe qual animal voce deseja consultar:   ");
        
        int escolha = teclado.nextInt();
      

        if (escolha == 1) {
            System.out.print("\n  Nome do dono do animal é Jõao ");
            System.out.print("\n Numero de telefone do dono é 9 8216 8273 ");
            System.out.print("\n Nome do animal é Rex ");
            System.out.print("\n Especie do animal é Cachorro ");
            System.out.print("\n Idade do animal é 2 anos ");
        } else if (escolha == 2) {
        	System.out.print("\n  Nome do dono do animal é Maria ");
            System.out.print("\n Numero de telefone do dono é 9 9876 5432 ");
            System.out.print("\n Nome do animal é Luna ");
            System.out.print("\n Especie do animal é Gato ");
            System.out.print("\n Idade do animal é 4 anos ");
        } else if (escolha == 3) {
        	System.out.print("\n  Nome do dono do animal é Carlos ");
            System.out.print("\n Numero de telefone do dono é 9 9123 4567 ");
            System.out.print("\n Nome do animal é Thor ");
            System.out.print("\n Especie do animal é Cachorro ");
            System.out.print("\n Idade do animal é 3 anos ");
        } else if (escolha == 4) {
        	System.out.print("\n  Nome do dono do animal é Ana ");
            System.out.print("\n Numero de telefone do dono é 9 9988 7766 ");
            System.out.print("\n Nome do animal é Mel ");
            System.out.print("\n Especie do animal é Coelho ");
            System.out.print("\n Idade do animal é 1 ano ");
        } else if (escolha == 5) {
        	System.out.print("\n  Nome do dono do animal é Pedro ");
            System.out.print("\n Numero de telefone do dono é 9 9345 6789 ");
            System.out.print("\n Nome do animal é Spike ");
            System.out.print("\n Especie do animal é Papagaio ");
            System.out.print("\n Idade do animal é 5 anos ");
        } else {
            System.out.println("Seção inválida.");
        }
        
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
	  
        
        teclado.close();
       
        
    }
}
}