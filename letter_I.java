/*Programa em Java que lê dois inteiros (variáveis A e B) e imprime o resultado do quadrado da diferença do primeiro valor pelo segundo.*/

import java.util.Scanner;
import static java.lang.Math.*; 

class letter_I{
  public static void main(){
    Scanner keyboard = new Scanner(System.in);

    int valueA, valueB;
    double sqrtDif;

    System.out.print("\nInforme o primeiro valor: ");
    valueA = keyboard.nextInt();

    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextInt();

    sqrtDif = pow((valueA - valueB), 2);
    System.out.print("O quadrado da diferença entre o primeiro e segundo valor é: " + sqrtDif);



  }
}