//Escreva um programa que: 
//leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
//determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
//assuma que não exista dois ou mais alunos com a mesma nota;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Nfichas, matricula1, matricula2, matricula;
        double nota1, nota2, nota;

        nota1 = -1;
        nota2 = -1;
        nota = 0;
        matricula1 = 0;
        matricula2 = 0;
        matricula = 0;
        Nfichas = 5;

        for(int i = 1; i <= Nfichas; i++){
            System.out.print("Digite a matricula do Aluno " + i + ":");
            matricula = input.nextInt();

            System.out.print("Digite a nota do Aluno " + i + ":");
            nota = input.nextDouble();

            if(nota > nota1){
                nota2 = nota1;
                matricula2 = matricula1;
                nota1 = nota;
                matricula1 = matricula; 
            } else if ( nota > nota2){
                nota2 = nota;
                matricula2 = matricula;
            }
        }
        System.out.println("A maior nota é " + nota1 + ", obtida pelo aluno de matrícula " + matricula1 + ".");
        System.out.println("A segunda maior nota é " + nota2 + ", obtida pelo aluno de matrícula " + matricula2 + ".");
        input.close();
    }
}