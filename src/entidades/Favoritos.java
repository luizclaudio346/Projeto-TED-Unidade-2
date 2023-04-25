package entidades;

import java.util.ArrayList;

public class Favoritos
{
    private Usuario usuario;
    private ArrayList<Video> videosFavoritos;

    public Favoritos(Usuario usuario) {
        this.usuario = usuario;
        this.videosFavoritos = new ArrayList<>();
    }

    public boolean adicionarVideoFavorito(Video video) {
        if (!videosFavoritos.contains(video)) {
            videosFavoritos.add(video);
        }
        return false;
    }

    public boolean removerVideoFavorito(Video video) {
        videosFavoritos.remove(video);
        return false;
    }

    public ArrayList<Video> getVideosFavoritos() {
        return videosFavoritos;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}