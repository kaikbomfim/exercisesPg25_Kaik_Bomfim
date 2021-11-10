/*Programa em Java que lê quatro números inteiros e apresenta o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
multiplicação e apresentar doze resultados de saída.*/

import java.util.Scanner;

class letter_G{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    float valueA, valueB, valueC, valueD;

    System.out.print("\nInforme o primeiro valor: ");
    valueA = keyboard.nextFloat();

    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextFloat();

    System.out.print("Informe o terceiro valor: ");
    valueC = keyboard.nextFloat();

    System.out.print("Informe o quarto valor: ");
    valueD = keyboard.nextFloat();

    System.out.print("\n====== SOMA ======");
    System.out.print("\nA soma entre o primeiro e segundo valor é: " + (valueA + valueB) + "\nA soma entre o primeiro e terceiro valor é: " + (valueA + valueC) + "\nA soma entre o primeiro e quarto valor é: " + (valueA + valueD) + "\nA soma entre o segundo e terceiro valor é: " + (valueB + valueC) + "\nA soma entre o segundo e quarto valor é: " + (valueB + valueD) + "\nA soma entre o terceiro e quarto valor é: " + (valueC + valueD)); 

    System.out.print("\n\n====== MULTIPLICAÇÃO ======");
    System.out.print("\nA multiplicação entre o primeiro e segundo valor é: " + (valueA * valueB) + "\nA multiplicação entre o primeiro e terceiro valor é: " + (valueA * valueC) + "\nA multiplicação entre o primeiro e quarto valor é: " + (valueA * valueD) + "\nA multiplicação entre o segundo e terceiro valor é: " + (valueB * valueC) + "\nA multiplicação entre o segundo e quarto valor é: " + (valueB * valueD) + "\nA multiplicação entre o terceiro e quarto valor é: " + (valueC * valueD)); 
  }
}