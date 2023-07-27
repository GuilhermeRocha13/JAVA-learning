package som;

public class Audio {
    private String titulo;
    private Autor autor;
    private int duracao;
    private int reproducoes;
    private int curtida;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int reproducoes) {
        this.reproducoes = reproducoes;
    }

    public void tocar() {
        this.reproducoes++;
    }
    public void curtir() {
        this.curtida                    ++;
    }

    public void exibeFichaTecnica(){
        System.out.println(getCurtida());
        System.out.println(getDuracao());
        System.out.println(getReproducoes());
    }
}
