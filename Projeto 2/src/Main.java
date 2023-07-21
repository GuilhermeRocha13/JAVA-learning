import modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Jujutsu");
        meuFilme.setAnoLancamento(2100);
        meuFilme.setDuracaoMinutos(24);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);
        meuFilme.avaliacao(6);

        System.out.println("Total avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegaMedia());
    }
}
