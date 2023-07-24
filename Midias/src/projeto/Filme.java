package projeto;

public class Filme extends Titulo {
    //calculo para converter horas + minuto para minutos
    //(hora * 60) + minutos
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
