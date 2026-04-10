package model;

public class Personagem {

    private String nome;
    private int nivel;
    private int vida;
    private String classe;

    public Personagem() {
        nome = "Sem nome";
        nivel = 1;
        vida = 100;
        classe = "Guerreiro";
    }

    public Personagem(String nome, int nivel, int vida, String classe) {
        setNome(nome);
        setNivel(nivel);
        setVida(vida);
        setClasse(classe);
    }

    public void atacar() {
        System.out.println(nome + " atacou!");
    }

    public void subirNivel() {
        nivel = nivel + 1;
        vida = vida + 10;
        System.out.println(nome + " subiu de nível!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) {
            this.nome = "Sem nome";
        } else {
            this.nome = nome;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        if (classe == null || classe.equals("")) {
            this.classe = "Guerreiro";
        } else {
            this.classe = classe;
        }
    }

    @Override
    public String toString() {
        return nome + " | Nivel: " + nivel + " | Vida: " + vida + " | Classe: " + classe;
    }
}