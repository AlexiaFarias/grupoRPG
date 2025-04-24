import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Personagem jogador = new Personagem("Water", 100, 20, 10, 1);
        Inimigo inimigo = new Inimigo("Fire", 80, 15, 5);

        Scanner scanner = new Scanner(System.in);
        Combate combate = new Combate(jogador, inimigo);
        System.out.println("O planeta está em chamas. O herói Water é a última esperança contra o avanço do império do fogo.");
        System.out.println("De repente, surge um inimigo flamejante... Prepare-se para lutar!");

        combate.iniciarBatalha(scanner);

        System.out.println(" A batalha acabou. A natureza agradece sua coragem!");
    }
}