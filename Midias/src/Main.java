import projeto.modelo.Anime;
import projeto.modelo.Filme;

public class Main {
    public static void main(String[] args) {
        Filme transformers = new Filme();
        transformers.setNome("Transformers");
        transformers.setAnoLancamento(2007);
        transformers.setDuracaoMinutos(144);

        transformers.exibeFichaTecnica();

        transformers.avaliacao(8);
        transformers.avaliacao(10);
        transformers.avaliacao(6);

        transformers.exibeAvaliacoes();
//
//        Serie breakingBad = new Serie();
//        breakingBad.setEpisodiosPorTemporadas(6);
//        breakingBad.setTemporadas(5);
//        breakingBad.setMinutosPorEpisodio(50);
//        System.out.println("Minutos"+breakingBad.getDuracaoMinutos());
//
        Anime jujutsu = new Anime();
        jujutsu.setNome("Jujutsu Kaisen");
        jujutsu.setAnoLancamento(2017);
        jujutsu.setMinutosPorEpisodio(24);
        jujutsu.setEpisodiosPorTemporadas(24);
        jujutsu.setTemporadas(2);
        jujutsu.exibeFichaTecnica();

        jujutsu.avaliacao(5);
        jujutsu.avaliacao(10);
        jujutsu.avaliacao(9);
        jujutsu.exibeAvaliacoes();

    }
}
