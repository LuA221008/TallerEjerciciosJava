package sofka.ejercicio18;

public class Serie implements Entregable{
    private String titulo ="";
    private int numeroDeTemporadas =3;
    private boolean entregado = false;
    private String genero = "";
    private String creador ="" ;


    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
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
        return this.entregado;
    }

    @Override
    public int compareTo(Object serie) {
        Integer temporadas = numeroDeTemporadas;
        int comparaNumeroTemporada = ((Integer) temporadas).compareTo(((Serie) serie).getNumeroDeTemporadas());
        return comparaNumeroTemporada;
    }
}
