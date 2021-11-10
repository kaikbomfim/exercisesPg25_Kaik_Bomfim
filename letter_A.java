/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
conversão é F = (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

import java.util.Scanner;
class letter_A{
  public static void main(){

    float temperature, change;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme a temperatura em graus Celsius: ");
    temperature = keyboard.nextFloat();
    

    change = (9* temperature + 160)/5;

    System.out.println("A temperatura em Celsius (°C) convertida para Fahrenheit (°F) é: " + change + " °F");



  }
}