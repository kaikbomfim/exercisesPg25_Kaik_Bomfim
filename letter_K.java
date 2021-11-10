/*Programa em Java que efetua a apresentação do valor da conversão em dólar de um valor lido em
real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário, para que seja apresentado o valor em moeda americana.*/

import java.util.Scanner;
class letter_K{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    double valueDolar, amountReais, exchange;

    System.out.print("\nInforme o valor da cotação do dólar: ");
    valueDolar = keyboard.nextDouble();

    System.out.print("Informe a quantidade de reais que você possui: ");
    amountReais = keyboard.nextDouble();

    exchange = (amountReais / valueDolar);
    System.out.print("\nA sua quantia de R$" + amountReais + " reais corresponde a " + "$" +exchange + " dólares");
  }
}