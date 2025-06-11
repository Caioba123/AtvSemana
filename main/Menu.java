package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void voltaraoMenu() {
        String[] args = null;
        main(args); 
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--Bem vindo a nossa empresa!-- ");
        System.out.println("Você quer acessar qual dos nossos menus?");
        System.out.println("1 - Cadastrar Clientes");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Entrada Salário e Folga");
        System.out.println("4 - Cadastrar Produtos"); 
        System.out.println("-----------------------------------------"); 

        int escolha = -1;

        try {
            escolha = teclado.nextInt();

            if (escolha == 1) {
                clientes.empresa1(teclado);
            } else if (escolha == 2) {
                funcionários.empresa2(teclado);
            } else if (escolha == 3) {
                valores.empresa3(teclado);
            } else if (escolha == 4) {
                produtos.empresa4(teclado);
            } else {
                System.out.println("Seção inválida.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número de 1 a 4.");
        }

      
    }
}
