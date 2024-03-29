//Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: retângulo, 
//diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. 
//As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. 
//Abaixo estão alguns exemplos das formas:
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coluna, escolha;

        System.out.println("Digite o número de colunas que você quer na sua forma geométrica: ");
        coluna = input.nextInt();  

        System.out.println("Escolha a sua forma geométrica: ");
        System.out.println("1 para retângulo, 2 para diagonal superior esquerda, 3 para diagonal superior direita, 4 para diagonal inferior esquerda, 5 para diagonal inferior direita");
        escolha = input.nextInt();
        
        switch (escolha) {
            case 1:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j <= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= coluna - i - 1) {
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        input.close();
    }
}