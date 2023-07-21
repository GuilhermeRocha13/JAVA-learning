public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    int duracaoMinutos;
    int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoLancamento);
    }

    void avaliacao(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao ++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacao;
    }
}
