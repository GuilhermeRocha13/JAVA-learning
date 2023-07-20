public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Jujutsu";
        meuFilme.anoLancamento = 2017;
        meuFilme.duracaoMinutos = 24;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);
        meuFilme.avaliacao(6);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.pegaMedia());
    }
}
