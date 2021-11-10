/*Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
conversão é C = (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

import java.util.Scanner;
class letter_B{
  public static void main(){

    double temperature, change;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme a temperatura em graus Fahrenheit: ");
    temperature = keyboard.nextDouble();

    change = (temperature - 32) * (5.0/9);
    System.out.println("A temperatura em Fahrenheit (°F) convertida para Celsius (°C) é: " + change);

  }
}