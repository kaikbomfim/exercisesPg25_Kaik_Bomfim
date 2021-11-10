/*Programa em Java que ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetua a troca dos valores de
forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
variável A. No final, apresenta os valores trocados*/
import java.util.Scanner;

class letter_F{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    String type; 
    System.out.print("\nInforme qual será o tipo das variáveis - inteiro, caractere ou real -(escreva tudo em minúsculo): ");
    type = keyboard.nextLine();
    
    if (type.equals("inteiro")){
      int valueA, valueB, replace;
      System.out.print("\nInforme o valor A: ");
      valueA = keyboard.nextInt();

      System.out.print("Informe o valor B: ");
      valueB = keyboard.nextInt();

      replace = valueB;
      valueB = valueA;
      valueA = replace;

      System.out.print("\nApós a troca de valores, temos que:\n\nValor A = " + valueA + "\nValor B = " + valueB);
    }
    if (type.equals("real")){
      float valueA, valueB, replace;

      System.out.print("\nInforme o valor A: ");
      valueA = keyboard.nextFloat();

      System.out.print("Informe o valor B: ");
      valueB = keyboard.nextFloat();

      replace = valueB;
      valueB = valueA;
      valueA = replace;

      System.out.print("\nApós a troca de valores, temos que:\n\nValor A = " + valueA + "\nValor B = " + valueB);
    }
    if (type.equals("caractere")){
      String valueA, valueB, replace;

      System.out.print("\nInforme o valor A: ");
      valueA = keyboard.nextLine();

      System.out.print("Informe o valor B: ");
      valueB = keyboard.nextLine();

      replace = valueB;
      valueB = valueA;
      valueA = replace;

      System.out.print("\nApós a troca de valores, temos que:\n\nValor A = " + valueA + "\nValor B = " + valueB);

    }
   
   

  }
}