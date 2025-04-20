import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Personagem jogador = new Personagem("Water", 100, 20, 10, 1);
        Inimigo inimigo = new Inimigo("Fire", 80, 15, 5);

        Scanner scanner = new Scanner(System.in);
        Combate combate = new Combate(jogador, inimigo);
        combate.iniciarBatalha(scanner);
    }
}