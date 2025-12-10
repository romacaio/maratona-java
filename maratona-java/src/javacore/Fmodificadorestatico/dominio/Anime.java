package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 1 - JVM carreaga a classe e inicializa os atributos estáticos e executa o bloco de inicialização estático
    // 2 - O espaço em memória é alocado para o objeto
    // 3 - O atributos são inicializados com valores default ou que foi passado
    // 4 - Bloco de inicialização de instância é executado
    // 5 - O construtor é executado

    static {
        System.out.println("dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
