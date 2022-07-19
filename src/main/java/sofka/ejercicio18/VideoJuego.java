package sofka.ejercicio18;

public class VideoJuego implements Entregable{
    private String titulo="";
    private int horasEstimadas =10;
    private boolean entregado = false;
    private String genero="";
    private String compañia="";

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public boolean entregar() {
        this.entregado = true;
        return this.entregado;
    }

    @Override
    public boolean devolver() {
        this.entregado = false;
        return this.entregado;
    }

    @Override
    public boolean isEntregado() {
        return  this.entregado;
    }

    @Override
    public int compareTo(Object videoJuego) {
        Integer horas = horasEstimadas;
        int compararHoras = ((Integer) horas).compareTo(((VideoJuego)videoJuego).getHorasEstimadas());
        return compararHoras;
    }
}
