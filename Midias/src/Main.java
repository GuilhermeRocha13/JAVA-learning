import modelos.Filme;
import modelos.Serie;

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

        Serie breakingBad = new Serie();
        breakingBad.setEpisodiosPorTemporadas(6);
        breakingBad.setTemporadas(5);
        breakingBad.setMinutosPorEpisodio(50);
        System.out.println("minutos"+breakingBad.getDuracaoMinutos());
    }
}
