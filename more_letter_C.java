/*Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato. Esse programa em Java efetua a leitura da quantidade de votos válidos para cada candidato, efetua também a leitura da quantidade de votos nulos e votos em branco. Ao final o programa apresenta o número total de eleitores, considerando
votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à
quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.*/

import java.util.Scanner;

class more_letter_C{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double qtd_validosA, qtd_validosB, qtd_validosC, qtd_nulos, qtd_brancos, qtd_total_validos, qtd_total_eleitores, percentual_total_validos, percentual_validosA, percentual_validosB, percentual_validosC, percentual_nulos, percentual_brancos;

    System.out.print("\nInforme a quantidade de votos válidos do candidato A: ");
    qtd_validosA = keyboard.nextDouble();
    
    System.out.print("Informe a quantidade de votos válidos do candidato B: ");
    qtd_validosB = keyboard.nextDouble();
    
    System.out.print("Informe a quantidade de votos válidos do candidato C: ");
    qtd_validosC = keyboard.nextDouble();

    System.out.print("Informe a quantidade de votos nulos: ");
    qtd_nulos = keyboard.nextDouble();
    
    System.out.print("Informe a quantidade de votos em branco: ");
    qtd_brancos = keyboard.nextDouble();

    qtd_total_validos = qtd_validosA + qtd_validosB + qtd_validosC;

    qtd_total_eleitores = qtd_total_validos + qtd_brancos + qtd_nulos;

    percentual_total_validos = (qtd_total_validos/qtd_total_eleitores) * 100;

    percentual_validosA = (qtd_validosA/qtd_total_eleitores) * 100;

    percentual_validosB = (qtd_validosB/qtd_total_eleitores) * 100;

    percentual_validosC = (qtd_validosC/qtd_total_eleitores) * 100;

    percentual_nulos = (qtd_nulos/qtd_total_eleitores) * 100;

    percentual_brancos = (qtd_brancos/qtd_total_eleitores) * 100;

    System.out.print("\n======== ESTATÍSTICAS DA ELEIÇÃO SINDICAL ========");

    System.out.print("\n\nTOTAL DE ELEITORES: " + qtd_total_eleitores + " eleitores.");

    System.out.print("\n\nPERCENTUAL DE VOTOS VÁLIDOS TOTAIS/QUANTIDADE TOTAL DE ELEITORES: " + percentual_total_validos + "%");

    System.out.print("\n\nPERCENTUAL DE VOTOS VÁLIDOS (CANDIDATO A)/QUANTIDADE TOTAL DE ELEITORES: " + percentual_validosA + "%");

    System.out.print("\n\nPERCENTUAL DE VOTOS VÁLIDOS (CANDIDATO B)/QUANTIDADE TOTAL DE ELEITORES: " + percentual_validosB + "%");

    System.out.print("\n\nPERCENTUAL DE VOTOS VÁLIDOS (CANDIDATO C)/QUANTIDADE TOTAL DE ELEITORES: " + percentual_validosC + "%");

    System.out.print("\n\nPERCENTUAL DE VOTOS NULOS/QUANTIDADE TOTAL DE ELEITORES: " + percentual_nulos + "%");

    System.out.print("\n\nPERCENTUAL DE VOTOS EM BRANCO/QUANTIDADE TOTAL DE ELEITORES: " + percentual_brancos + "%");

  }
}