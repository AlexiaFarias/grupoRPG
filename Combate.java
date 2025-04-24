import java.util.Random;
import java.util.Scanner;

public class Combate {

    private Personagem jogador;
    private Inimigo inimigo;

    public Combate(Personagem jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public void iniciarBatalha(Scanner scanner) {
        while (jogador.estaVivo() && inimigo.estaVivo()) {

            System.out.println(jogador.getNome() + " vs " + inimigo.getNome());
            System.out.println("Vida do Jogador: " + jogador.getVida() + " | Vida do Inimigo: " + inimigo.getVida());

            System.out.println("Escolha sua ação: ");
            System.out.println("1. Atacar");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Elemental");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(inimigo);
                System.out.println(jogador.getNome() + " atacou!");
            } else if (escolha == 2) {
                jogador.ataqueEspecial(inimigo);
            } else if (escolha == 3) {
                jogador.ataqueElemental(inimigo);
            }

          
            if (inimigo.estaVivo()) {
                Random random = new Random();
                int escolher = random.nextInt(2); // 0 ou 1

                if (escolher == 0) {
                    inimigo.ataqueEspecial(jogador);
                } else {
                    System.out.println(inimigo.getNome() + " atacou normalmente.");
                    jogador.receberDano(inimigo.getAtaque());
                }
            }

            if (!jogador.estaVivo()) {
                System.out.println(jogador.getNome() + " foi derrotado!");
            } else if (!inimigo.estaVivo()) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                inimigo.premiar(jogador); 
            }
        }

        System.out.println("A batalha acabou. A natureza agradece sua coragem!");
    }
}

