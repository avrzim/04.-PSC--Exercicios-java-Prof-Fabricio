//Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
//a) a quantidade de pessoas com idade superior a 50 anos;
//b) a média das alturas das pessoas com idade entre 10 e 20 anos;
//c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.


import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double idade, altura, peso, pessoas, idade50, mediaALturaIdade10e20, mediaAltura, pessoas40KG, porcPeso40KG;
        int quantidade10entre20;

        mediaALturaIdade10e20 = 0;

        pessoas40KG = 0;

        quantidade10entre20 = 0;

        idade50 = 0;

        pessoas = 0;

        while (pessoas < 11){

            System.out.println("Digite sua idade: ");
            idade = input.nextDouble();

            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();

            System.out.println("Digite seu peso: ");
            peso = input.nextDouble();

            pessoas ++;

            if (idade > 50){
                idade50 = idade50 + 1;
            }
            if (idade >= 10 && idade <= 20){
                mediaALturaIdade10e20 += altura;
                quantidade10entre20++;
            }
            if (peso < 40){
                pessoas40KG ++;
            }
        }
        mediaAltura = mediaALturaIdade10e20 / quantidade10entre20;

        porcPeso40KG = pessoas40KG * 10;

        System.out.println("O número de pessoas com idade superior á 50 é: " + idade50);
        System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAltura);
        System.out.println("a porcentagem de pessoas com peso inferior a 40 quilos é: " + porcPeso40KG + "%");

        input.close();
    }
}