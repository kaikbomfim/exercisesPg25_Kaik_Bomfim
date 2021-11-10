/*Programa em Java que efetua a leitura de três valores (A, B e C) e apresenta como resultado final à soma dos quadrados dos três valores lidos.*/

import java.util.Scanner;
import static java.lang.Math.*;

class letter_L{
  public static void main(){

    double valueA, valueB, valueC, sqrtSum;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o primeiro valor: ");
    valueA = keyboard.nextDouble();

    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextDouble();

    System.out.print("Informe o terceiro valor: ");
    valueC = keyboard.nextDouble();

    sqrtSum = (pow(valueA, 2) + pow(valueB, 2) + pow(valueC, 2));
    System.out.print("A soma dos quadrados dos três valores é: " + sqrtSum);
  }
}