package projeto.modelo;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    //metodos da classe
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Duração em minutos " + getDuracaoMinutos());
    }

    public void exibeAvaliacoes(){
        System.out.println("Total de avaliações: " + getTotalAvaliacao());
        System.out.println("Soma das avaliações: " + getSomaAvaliacoes());
    }

    public void avaliacao(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao ++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacao;
    }
}
