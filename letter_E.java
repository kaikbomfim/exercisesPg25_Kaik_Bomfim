/*Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTACAO = VALOR + (VALOR * TAXA/100) * TEMPO).*/

import java.util.Scanner;

class letter_E{
  public static void main(){

    double installment, value, rate, time;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o valor atual da prestação: R$ ");
    value = keyboard.nextDouble();

    System.out.print("Informe a taxa de juros após atraso: ");
    rate = keyboard.nextDouble();

    System.out.print("Informe o período de atraso em meses: ");
    time = keyboard.nextDouble();

    installment = value + ((value * rate/100) * time);
    System.out.print("O novo valor da prestação, após " + time + " meses de atraso, é: R$ " + installment);
  }
}