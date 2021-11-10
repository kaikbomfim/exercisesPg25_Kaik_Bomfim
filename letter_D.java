/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Possuindo o valor da
distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS = DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

import java.util.Scanner;

class letter_D{
  public static void main(){

    double time, velocity, distance, liters_used;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInforme o tempo de duração da viagem (min): ");
    time = keyboard.nextDouble();

    System.out.print("Informe a velocidade média durante a viagem (km/h): ");
    velocity = keyboard.nextDouble();

    distance = (time/60) * velocity;
    liters_used = distance/12;

    System.out.print("\nSegue abaixo as seguintes informações sobre a viagem:\n\nTempo gasto na viagem: " + time + " minutos" + "\nVelocidade média na viagem: " + velocity + " km/h" + "\nDistância percorrida: " + distance + " km" + "\nLitros de combustível consumido: " + liters_used + " litros");

  }

}