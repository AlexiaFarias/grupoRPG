public class Inimigo {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Inimigo(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void receberDano(int dano){
        this.vida -= Math.max(dano - defesa, 0);
    }

    public void ataqueEspecial(Personagem jogador) {
        int danoEspecial = this.ataque * 2;
        jogador.receberDano(danoEspecial);
        System.out.println(this.nome + " usou Ataque Especial: Dano Duplo!");
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
    public void premiar(Personagem jogador) {
        jogador.evoluir();
        System.out.println(" Recompensa: " + jogador.getNome() + " aprendeu um novo ataque elemental!");
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getAtaque() { return ataque; }
    public int getDefesa() { return defesa; }

    public void atacar(String personagem) {
        throw new UnsupportedOperationException("Método 'atacar' não implementado para a classe Inimigo. Use ataqueEspecial para um ataque.");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + vida;
        result = prime * result + ataque;
        result = prime * result + defesa;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inimigo other = (Inimigo) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (vida != other.vida)
            return false;
        if (ataque != other.ataque)
            return false;
        if (defesa != other.defesa)
            return false;
        return true;
    }
}