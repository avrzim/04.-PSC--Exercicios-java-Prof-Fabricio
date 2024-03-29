//Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
//Finalize a entrada com valor negativo ou zero.
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero, numeroQuadrado, numeroCubo, numeroRaiz;

        System.out.println("Digite os números a seguir (Digite um número negativo ou 0 para finalizar o programa): ");

        while (true) {
            numero = input.nextInt();

            if(numero == 0 || numero < 0 ){
                break;
            } else{
                System.out.println("O número é: " + numero);
                numeroQuadrado = numero * numero;
                System.out.println("O quadrado do número é: " + numeroQuadrado);
                numeroCubo = numero * numero * numero;
                System.out.println("O cubo do número é: " + numeroCubo);
                numeroRaiz = Math.sqrt(numero);
                System.out.println("A raiz do número é: " + numeroRaiz);
            }
        }
        input.close();
    }
}