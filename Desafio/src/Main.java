import som.Audio;
import som.Autor;
import som.Musica;

public class Main {
    public static void main(String[] args) {


        Autor mac = new Autor();
        mac.setNomeAutor("Mac DeMarco");
        mac.setIdade(32);
        System.out.println(mac.getIdade());

        Musica musica = new Musica();
        musica.setAutor(mac);
    }

}