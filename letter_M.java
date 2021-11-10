/*Programa que efetua a leitura de três valores (A,B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.*/

import java.util.Scanner;
import static java.lang.Math.*;

class letter_M{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double valueA, valueB, valueC, sqrtSum;

    System.out.print("\nInforme o primeiro valor: ");
    valueA = keyboard.nextDouble();
    
    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextDouble();
    
    System.out.print("Informe o terceiro valor: ");
    valueC = keyboard.nextDouble();

    sqrtSum = pow((valueA + valueB + valueC),2);
    System.out.print("O quadrado da soma dos três valores é: " + sqrtSum);

  }
}