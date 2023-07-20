public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double avalicao;
    int totalAvaliacao;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoLancamento);
    }
}
