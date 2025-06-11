package Atv1106pt2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dados {
    public static void cadastrar1(Scanner teclado) {
		try {

        System.out.println("----Dados----  ");

        System.out.print("Escolhe qual animal voce deseja consultar:   ");
        
        int escolha = teclado.nextInt();
      

       } else if (escolha == 2) {
    System.out.print("\n Nome do dono do animal é Juliana ");
    System.out.print("\n Número de telefone do dono é 9 8765 4321 ");
    System.out.print("\n Nome do animal é Bella ");
    System.out.print("\n Espécie do animal é Gato ");
    System.out.print("\n Idade do animal é 2 anos ");
    } else if (escolha == 3) {
    System.out.print("\n Nome do dono do animal é Rafael ");
    System.out.print("\n Número de telefone do dono é 9 9123 9876 ");
    System.out.print("\n Nome do animal é Max ");
    System.out.print("\n Espécie do animal é Cachorro ");
    System.out.print("\n Idade do animal é 6 anos ");
    } else if (escolha == 4) {
    System.out.print("\n Nome do dono do animal é Camila ");
    System.out.print("\n Número de telefone do dono é 9 9456 7890 ");
    System.out.print("\n Nome do animal é Thor ");
    System.out.print("\n Espécie do animal é Coelho ");
    System.out.print("\n Idade do animal é 3 anos ");
    } else if (escolha == 5) {
    System.out.print("\n Nome do dono do animal é Lucas ");
    System.out.print("\n Número de telefone do dono é 9 9345 6788 ");
    System.out.print("\n Nome do animal é Kiwi ");
    System.out.print("\n Espécie do animal é Papagaio ");
    System.out.print("\n Idade do animal é 4 anos ");
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
