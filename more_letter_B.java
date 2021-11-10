/*Programa em Java que lê o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresenta o valor do novo salário (variável
NS).*/

import java.util.Scanner;

class more_letter_B{
  public static void main(){

    double SM, PR, NS;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o seu salário mensal: R$ ");
    SM = keyboard.nextDouble();

    System.out.print("Informe o percentual de reajuste: ");
    PR = keyboard.nextDouble();

    NS = SM * (1 + PR/100);
    System.out.print("\nO seu novo salário com um percentual de reajuste de " + PR + "%" +  " é igual a: R$ " + NS);
  }
} 