import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questao4 {
	
	    public static void main(String[] args) {
	        // Lista de vídeo-aulas com seus respectivos tamanhos
	        List<VideoAula> videoAulas = new ArrayList<>();
	        videoAulas.add(new VideoAula("Aula1", 800.0));
	        videoAulas.add(new VideoAula("Aula2", 600.0));
	        videoAulas.add(new VideoAula("Aula3", 1000.0));
	        videoAulas.add(new VideoAula("Aula4", 1500.0));
	        videoAulas.add(new VideoAula("Aula5", 400.0));
	        videoAulas.add(new VideoAula("Aula6", 1200.0));

	        double capacidadePendrive = 3000.0; // Capacidade do pendrive em MB

	        List<VideoAula> videoAulasSelecionadas = escolherVideoAulas(videoAulas, capacidadePendrive);

	        System.out.println("Vídeo-aulas selecionadas:");
	        for (VideoAula videoAula : videoAulasSelecionadas) {
	            System.out.println(videoAula.getNome() + " - " + videoAula.getTamanho() + " MB");
	        }
	    }

	    public static List<VideoAula> escolherVideoAulas(List<VideoAula> videoAulas, double capacidadePendrive) {
	        List<VideoAula> videoAulasSelecionadas = new ArrayList<>();
	        Collections.sort(videoAulas); // Ordena as vídeo-aulas pelo tamanho em ordem decrescente

	        double espacoDisponivel = capacidadePendrive;
	        for (VideoAula videoAula : videoAulas) {
	            if (videoAula.getTamanho() <= espacoDisponivel) {
	                videoAulasSelecionadas.add(videoAula);
	                espacoDisponivel -= videoAula.getTamanho();
	                System.out.println("Selecionado: " + videoAula.getNome() + " - " + videoAula.getTamanho() + " MB");
	            }
	        }

	        return videoAulasSelecionadas;
	    }
}
