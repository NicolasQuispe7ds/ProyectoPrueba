package pe.edu.upc.educacionparatodos.dtos;

public class EjercicioDTO {

    private Long id;
    private Long idTema;
    private String nombreTema;
    private String enunciado;
    private String contenidoJson;
    private Integer nivelDificultad;
    private Boolean generadoPorIa;
    private String estado;

    public EjercicioDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTema() {
        return idTema;
    }

    public void setIdTema(Long idTema) {
        this.idTema = idTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getContenidoJson() {
        return contenidoJson;
    }

    public void setContenidoJson(String contenidoJson) {
        this.contenidoJson = contenidoJson;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Boolean getGeneradoPorIa() {
        return generadoPorIa;
    }

    public void setGeneradoPorIa(Boolean generadoPorIa) {
        this.generadoPorIa = generadoPorIa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
