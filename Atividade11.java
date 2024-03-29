//Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. 
//Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que calcule iterativamente 
//e imprima o tempo necessário para que a massa deste material se torne menor que 0,10 grama. 
//O programa pode calcular o tempo para várias massas.

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double massa, massaFinal, tempoSegundos, tempo;

        massaFinal = 0.10;

        System.out.println("Digite a massa do objeto em gramas: ");
        massa = input.nextDouble();

        for (tempo = 0; massa >= massaFinal; tempo++){
            massa *= 0.75;
        }
        tempoSegundos = tempo * 30;
        System.out.println("O tempo necessário para a massa ser reduzida até ser menor que 0.10 gramas foi: " + tempoSegundos);

        input.close();
    }
}