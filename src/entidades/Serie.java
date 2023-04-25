package entidades;

import java.util.List;

public class Serie extends Video {
    private int temporada;
    private int episodios;

    public Serie(String titulo, String diretor, List<String> elenco, String genero, String sinopse, int ano, int classificacaoInd, int temporada, int episodios) {
        super(titulo, diretor, elenco, genero, sinopse, ano, classificacaoInd);
        this.temporada = temporada;
        this.episodios = episodios;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Série " + getTitulo() + " - " + getAno() + " - " + getGenero() +
                " - " + getClassificacaoInd() + " anos - " + getTemporada() +
                " temporadas - " + getEpisodios() + " episódios\n" + getSinopse();
    }
}