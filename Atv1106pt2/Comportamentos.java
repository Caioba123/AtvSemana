package Atv1106pt2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Comportamentos {
    public static void cadastrar2(Scanner teclado) {
		try {

        System.out.println("----Comportamentos---- ");

    System.out.print("Escolhe qual animal voce deseja consultar:   ");
        
        int escolha = teclado.nextInt();
      
        if (escolha == 1) {
        	System.out.print("\n - Rex participou de uma sessão de treinamento básico.");
        	System.out.print("\n - Rex fez amizade com outro cachorro chamado Max.");
        	System.out.print("\n - Rex teve consulta para vacinação anual.");
        	System.out.print("\n - Rex brincou bastante no parque da clínica.");
        	System.out.print("\n - Rex apresentou sinais de ansiedade durante a tempestade.");

        } else if (escolha == 2) {
        	System.out.print("\n - Luna foi examinado para controle de peso.");
        	System.out.print("\n - Luna fez amizade com outro gato chamado Simba.");
        	System.out.print("\n - Luna teve consulta para tratar uma alergia na pele.");
        	System.out.print("\n - Luna evitou contato com humanos por alguns dias.");
        	System.out.print("\n - Luna recebeu sessão de escovação para pelagem.");
        } else if (escolha == 3) {
        	System.out.print("\n - Thor participou de aulas de socialização.");
        	System.out.print("\n - Thor brigou com um cachorro chamado Rex, mas logo se reconciliaram.");
        	System.out.print("\n - Thor teve consulta de rotina e recebeu vermífugo.");
        	System.out.print("\n - Thor adorou a piscina de bolinhas da clínica.");
        	System.out.print("\n - Thor foi vacinado contra a gripe canina.");
        } else if (escolha == 4) {
        	System.out.print("\n - Mel teve acompanhamento para dieta balanceada.");
        	System.out.print("\n - Mel fez amizade com outro coelho chamado Fluffy.");
        	System.out.print("\n - Mel apresentou melhora na saúde após tratamento dentário.");
        	System.out.print("\n - Mel evitou brincadeiras no início do mês.");
        	System.out.print("\n - Mel participou de sessões de higiene.");
        } else if (escolha == 5) {
        	System.out.print("\n - Spike aprendeu novos comandos de voz.");
        	System.out.print("\n - Spike fez amizade com um outro papagaio chamado Kiwi.");
        	System.out.print("\n - Spike teve consulta para tratar uma leve infecção nas penas.");
        	System.out.print("\n - Spike cantou bastante e animou a clínica.");
        	System.out.print("\n - Spike foi avaliado para verificar a nutrição adequada.");
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