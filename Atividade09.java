//Dados dois países, A com população igual a cinco milhões de pessoas, e taxa de natalidade de três por cento ao ano, e, B, 
//com população igual a sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, 
//escreva um programa em Java que calcule iterativamente e exiba em quantos anos a população de A ultrapassará a população de B.

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;
        double A, B;
        String Aformat, Bformat;

        ano = 0;
        A = 5000000;
        B = 7000000;

        while( A <= B){
            A = A * 1.03;
            B = B * 1.02;
            ano++;
        }

        Aformat = String.format("%.3f", A / 1000000);
        Bformat = String.format("%.3f", B / 1000000);

        System.out.println("A cidade A passou a B quando chegou em: " + ano + " anos");
        System.out.println("O número de habitantes na cidade A é: " + Aformat  + " milhões");
        System.out.println("O número de habitantes na cidade B é: " + Bformat  + " milhões");
        input.close();
    }
}