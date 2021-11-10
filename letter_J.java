/*Programa em Java que efetua a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.*/

import java.util.Scanner;
class letter_J{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    double valueDolar, amountDolar, exchange;

    System.out.print("\nInforme o valor da cotação do dólar: ");
    valueDolar = keyboard.nextDouble();

    System.out.print("Informe a quantidade de dólares que você possui: ");
    amountDolar = keyboard.nextDouble();

    exchange = (amountDolar * valueDolar);
    System.out.print("\nA sua quantia de $" + amountDolar + " dólares corresponde a " + "R$" +exchange + " reais");
  }
}