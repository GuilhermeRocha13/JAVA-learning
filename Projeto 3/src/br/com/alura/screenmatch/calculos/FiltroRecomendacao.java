package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("aí e bao");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("ai e bacana");
        }
        else {
            System.out.println("paia");
        }
    }
}
