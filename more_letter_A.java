/*Programa em Java que efetua a leitura de quatro valores inteiros (variáveis A, B, C e D). Ao final o programa apresenta o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor.*/

import java.util.Scanner;

class more_letter_A{
  public static void main(){

    int A, B, C, D, P, S;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o 1° valor: ");
    A = keyboard.nextInt();

    System.out.print("Informe o 2° valor: ");
    B = keyboard.nextInt();

    System.out.print("Informe o 3° valor: ");
    C = keyboard.nextInt();

    System.out.print("Informe o 4° valor: ");
    D = keyboard.nextInt();

    P = A * C;
    System.out.println("\nO produto entre o primeiro e terceiro valor é: " + A + " X " + C + " = " + P);
    S = B + D;
    System.out.println("\nA soma entre o segundo e quarto valor é: " + B + " + " + D + " = " + S);



  }
}