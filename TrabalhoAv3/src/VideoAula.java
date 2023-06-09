import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoAula implements Comparable<VideoAula> {
    private String nome;
    private double tamanho;

    public VideoAula(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    @Override
    public int compareTo(VideoAula outra) {
        return Double.compare(outra.tamanho, this.tamanho);
    }
}



