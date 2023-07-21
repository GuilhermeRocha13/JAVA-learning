package modelos;

public class Filme {

   public String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    int duracaoMinutos;
    public int getTotalAvaliacao(){
        return totalAvaliacao;
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
