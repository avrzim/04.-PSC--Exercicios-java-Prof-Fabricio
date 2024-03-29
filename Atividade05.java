//Crie um programa em Java que implementa um jogo simples de adivinhação. 
//O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador. 
//Este número estará entre 1 e 100, inclusive. Para tornar o jogo interativo e dar feedback ao jogador, 
//o programa deve informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto. 
//O jogo termina quando o usuário acertar o número, 
//e o programa deve informar o número de tentativas que foram necessárias para chegar à resposta correta. Exemplo:
import java.util.Scanner;
import java.util.Random;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random inputR = new Random();

        int palpite, numeroCerto, tentativas;

        numeroCerto = inputR.nextInt(100) + 1;
        tentativas = 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Estou pensando em um número entre 1 e 100... Tente adivinhar qual é!");

        while (true){
            palpite = input.nextInt();


            if (palpite < numeroCerto){
                System.out.println("Muito baixo!");
            } else if (palpite > numeroCerto){
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns você acertou!");
                break;
            }
            tentativas ++;
        }
        System.out.println("Em " + tentativas + " tentativas.");
        input.close();
    }
}