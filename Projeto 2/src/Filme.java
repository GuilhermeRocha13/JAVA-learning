public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacao;
    int duracaoMinutos;

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
