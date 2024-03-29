//Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é contabilizado pelo jogo), 
//o número de kills, deaths e assists. Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, 
//se chegar a 20 ou mais “master”. Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem “Houston, we have a problem”. 
//Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. Lembre-se, 
//é uma rotina que continua enquanto não houver um vencedor.
//Dicas: 
//há kills, deaths e assists total e da rodada
//medite na frase: enquanto não há um vencedor, faça…
//pergunte a cada loop o número de cada medida comentada.
//você deve perguntar se há um vencedor a cada loop…
import java.util.Scanner;


public class Atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int killsTotal, assistTotal, deathsTotal, kills, assists, deaths;
        char resposta;

        killsTotal = 0;
        assistTotal = 0;
        deathsTotal = 0;

        while (true){
            System.out.println("Digite o número de kills: ");
            kills = input.nextInt();
            killsTotal += kills;

            System.out.println("Digite o número de assists: ");
            assists = input.nextInt();
            assistTotal += assists;

            System.out.println("Digite o número de deaths: ");
            deaths = input.nextInt();
            deathsTotal += deaths;

            if (killsTotal <= 5){
                System.out.println("Noob!");
            } else if (killsTotal >= 20){
                System.out.println("Master!");
            }
            if (deathsTotal >= 20){
                System.out.println("Houston, we have a problem");
            }
            if (assistTotal >= 20){
                System.out.println("Team Work!");
            }
            System.out.println("Existe um vencedor (s/n)?");
            resposta = input.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                break;
            }
        }
        input.close();
    }
}