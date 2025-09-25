public class Curso {
    private int CodigoCurso;
    private String NombreCurso;
    private Docente docente;
    
    
    //getters and setters
    public int getCodigoCurso() { return CodigoCurso; }
    public String getNombreCurso() { return NombreCurso; }
    public Docente getDocente() { return docente; }
    
    public void setCodigoCurso(int codigoCurso) { CodigoCurso = codigoCurso; }
    public void setNombreCurso(String nombreCurso) { NombreCurso = nombreCurso; }
    public void setDocente(Docente docente) { this.docente = docente; }

    // constructor
    public Curso(int codigoCurso, String nombreCurso, Docente docente) {
        CodigoCurso = codigoCurso;
        NombreCurso = nombreCurso;
        this.docente = docente;
    }
    
}