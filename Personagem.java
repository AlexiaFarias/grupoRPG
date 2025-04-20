public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int nivel;
    static final String Personagem = null;

    public Personagem(String nome, int vida, int ataque, int defesa, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }

   
    public void receberDano(int dano) {
        this.vida -= Math.max(dano - defesa, 0); 
    }

    public void atacar(Inimigo inimigo) {
        inimigo.receberDano(ataque);  
    }

    public void ataqueEspecial(Inimigo inimigo) {
        int danoEspecial = this.ataque * 2; 
        inimigo.receberDano(danoEspecial);
        System.out.println(this.nome + " usou Ataque Especial: Dano Duplo!");
    }

    public void ataqueElemental(Inimigo inimigo) {
        int danoElemental = this.ataque + 10; 
        inimigo.receberDano(danoElemental);
        System.out.println(this.nome + " usou Ataque Elemental: Dano Extra!");
    }

   
    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void evoluir() {
        this.nivel++;
        this.ataque += 5; 
        this.defesa += 2; 
        this.vida += 20; 
    }


    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getAtaque() { return ataque; }
    public int getDefesa() { return defesa; }
    public int getNivel() { return nivel; }
}
