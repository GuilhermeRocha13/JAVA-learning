import som.Audio;
import som.Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setAutor("Mac DeMarco");
        musica.setTitulo("Freaking out the neighborhood");
        musica.setDuracao(3);
        musica.setReproducoes(3700000);
        musica.setCurtida(500000);
        musica.exibeFichaTecnica();
    }

}