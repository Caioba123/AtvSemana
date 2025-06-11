package main;

import java.util.Scanner;
import java.util.ArrayList;

public class produtos {

	public static void empresa4 (Scanner teclado) {
		System.out.println("----Produtos-----");

		       Scanner sc = new Scanner(System.in);
		       ArrayList<String> produtos1 = new ArrayList<>();
		       System.out.println("Quantos produtos voce deseja cadastrar?");
		       int quantidade = sc.nextInt();
		       sc.nextLine();
		       for (int i = 0; i < quantidade; i++) {
		           System.out.println("\n produto " + (i+1));
		           System.out.print("Nome: ");
		           String nome = sc.nextLine();
		           System.out.print("Email: ");
		           String email = sc.nextLine();
		           System.out.print("Endereço: ");
		           String endereco = sc.nextLine();
		           System.out.print("Telefone: ");
		           String telefone = sc.nextLine();
		           String produtos = "Nome: " + nome + " | Email: " + email + " | Endereço: " + endereco + " | Telefone: " + telefone;
		           produtos1.add(produtos);
		       }
		       System.out.println("\n Produtos cadastrados:");
		       for (String p : produtos1) {
		           System.out.println(p);
		       }
		      
		       System.out.println("\n\n Digite 0 para voltar ao menu:");
		       int voltar = teclado.nextInt();
		       if (voltar == 0) {
		           Menu.voltaraoMenu();
		       } else {
		           System.out.println("Numero invalido");
		       }
		      
		      
		       teclado.close();
		     
		      
		   }
		   }


