package Atv1206;

import java.util.Scanner;

public class Posto {

    public static void main(String[] args) {

    	 Scanner tec = new Scanner(System.in);

        double alcool = 3.79;

        double diesel = 4.39;

        double gasolina = 5.49;

        

  

        System.out.print("Quantos litros deseja colocar? ");

        double litros = tec.nextDouble();

        



        tec.nextLine();  

        

        System.out.print("Qual combustivel voce quer usar (Alcool, Diesel, Gasolina)? ");

        String comb = tec.nextLine();

        

        double preco = 0.0;

        

        if (comb.equals("alcool")) {

            preco = alcool * litros;

        } else if (comb.equals("diesel")) {

            preco = diesel * litros;

        } else if (comb.equals("gasolina")) {

            preco = gasolina * litros;

        } else {

            System.out.println("Combustivel invalido! Escolha entre Alcool, Diesel ou Gasolina.");

          

        }



        System.out.println("O valor total é: R$ " + preco);

 

        tec.close();

    }

}