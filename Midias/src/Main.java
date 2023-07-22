import modelos.Filme;
import modelos.Serie;

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

//        Serie breakingBad = new Serie();
//        breakingBad.setEpisodiosPorTemporadas(6);
//        breakingBad.setTemporadas(5);
//        breakingBad.setMinutosPorEpisodio(50);
//        System.out.println("minutos"+breakingBad.getDuracaoMinutos());
    }
}
