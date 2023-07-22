package modelos;

import java.time.LocalDate;

public class Titulo {
    public String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    int duracaoMinutos;
    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if(anoLancamento<anoAtual) {
            this.anoLancamento = anoLancamento;
        }
        else{
            this.anoLancamento = 6;
        }
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoLancamento);
    }

    public void avaliacao(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao ++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacao;
    }
}
