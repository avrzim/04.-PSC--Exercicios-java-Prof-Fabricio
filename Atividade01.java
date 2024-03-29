//Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.

import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, imparProduto, parSoma;

        parSoma = 0;
        imparProduto = 1; 

        System.out.println("Digite os números a seguir (Digite -1 para parar o programa): ");
        
        while (true) {
            n = input.nextInt();
            
            if (n == -1) {
                break;
            } else if (n % 2 == 0) {
                parSoma += n;
            } else {
                imparProduto *= n;
            }
        }

        System.out.println("A soma dos números pares é: " + parSoma);
        System.out.println("A soma dos números ímpares é: " + imparProduto);

        input.close();
    }
}