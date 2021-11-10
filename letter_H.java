/*Programa em Java que calcula e apresenta o volume de uma caixa retangular, por meio da fórmula
VOLUME = COMPRIMENTO * LARGURA * ALTURA.*/

import java.util.Scanner;

class letter_H{
  public static void main(){

    float volume, length, height, width;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o comprimento da caixa em centímetros (cm): ");
    length = keyboard.nextFloat();

    System.out.print("Informe a largura da caixa em centímetros (cm): ");
    width = keyboard.nextFloat();

    System.out.print("Informe a altura da caixa em centímetros (cm): ");
    height = keyboard.nextFloat();

    volume = length * width * height;
    System.out.println("O volume da caixa retangular é: " + volume + " cm³");
  }
}