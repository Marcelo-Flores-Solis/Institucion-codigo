import java.util.*;
public class Inscripcion {
    private Alumno Alumno;
    private Curso curso;
    private List<Double> notas;
    private int notafinal;
    
    //getters and setters
    public Alumno getAlumno() { return Alumno; }
    public Curso getCurso() { return curso; }
    public List<Double> getNotas() { return notas; }
    public int getNotafinal() { return notafinal; }

    public void setAlumno(Alumno alumno) { Alumno = alumno; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public void setNotas(List<Double> notas) { this.notas = notas; }
    public void setNotafinal(int notafinal) { this.notafinal = notafinal; }
    
    // constructor
    public Inscripcion(Alumno alumno, Curso curso) {
        Alumno = alumno;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    
    

}
