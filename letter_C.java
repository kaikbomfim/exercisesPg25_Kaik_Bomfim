/*Programa em Java que calcula e apresenta o valor do volume de uma lata de óleo, utilizando a fórmula:
Volume = (pi * Raio2 * Altura)*/

import static java.lang.Math.*;
import java.util.Scanner;
class letter_C{
  public static void main(){

    double pi, range, height, volume;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o raio da lata de óleo em centímetros (cm): ");
    range = keyboard.nextDouble();

    System.out.print("Informe a altura da lata de óleo em centímetros (cm): ");
    height = keyboard.nextDouble();

    pi = 3.14;
    volume = pi * pow(range,2) * height;
    System.out.println("\nO volume da lata de óleo é: " + volume + " cm³");
  }
}