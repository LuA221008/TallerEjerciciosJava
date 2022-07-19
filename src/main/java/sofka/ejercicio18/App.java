package sofka.ejercicio18;

import org.jboss.logging.Logger;
import sofka.ejercicio17.ElectrodomesticosApp;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());

        Serie[] series = new Serie[5];
        VideoJuego[] videojuegos = new VideoJuego[5];
        int seriesRegresadas = 0;
        int videosjuegosEntregados =0;
        Serie serieMasLarga = new Serie();
        VideoJuego videoJuegoMasLargo = new VideoJuego();

        series[0] = new Serie("The Queen's Gambit", (short) 1, "Drama", "Scott Frank");
        series[1] = new Serie("The boys", (short) 3, "Superhéroes, Humor negro", "Eric Kripke");
        series[2] = new Serie("Mr Robot", "Sam Esmail");
        series[3] = new Serie("Rick & Morty", (short) 5, "Comedia Adultos","Justin Roiland, Dan Harmon");
        series[4] = new Serie("The big bang theory", (short)12, "Comedia","Chuck Lorre, Bill Prady, Maria Ferrari, Jim Reynolds");

        videojuegos[0] = new VideoJuego("Crash Bandicoot", (short) 36, "Plataformas", "NaughtyDog");
        videojuegos[1] = new VideoJuego("Super Smash Bros", (short) 12, "Cooperativo", "Nintendo");
        videojuegos[2] = new VideoJuego("Street Fighter", (short) 16);
        videojuegos[3] = new VideoJuego("Medal of honor", (short) 42, "Shooter", "Electronic Arts");
        videojuegos[4] = new VideoJuego("Mortal Kombat", (short) 20);

        videojuegos[0].entregar();
        series[0].entregar();
        videojuegos[4].entregar();
        series[4].entregar();

        for (Serie serie: series) {
            if(serie.getNumeroDeTemporadas() > serieMasLarga.getNumeroDeTemporadas()){
              serieMasLarga = serie;
            }
            if (serie.isEntregado()){
                seriesRegresadas += 1;
                serie.devolver();
            }
        }
        for (VideoJuego videoJuego: videojuegos) {
            if (videoJuego.isEntregado()){
                videosjuegosEntregados +=1;
                videoJuego.devolver();
            }
            if(videoJuego.getHorasEstimadas() > videoJuegoMasLargo.getHorasEstimadas()){
                videoJuegoMasLargo = videoJuego;
            }
        }
        logger.info("Series regresadas:\n"+seriesRegresadas);
        logger.info("VideoJuegos regresadas:\n"+videosjuegosEntregados);

        System.out.println(serieMasLarga);
    }
}
