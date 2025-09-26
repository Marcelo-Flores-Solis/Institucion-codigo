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

    // ponderado
    public void CalcularNotaFinal(ArrayList<Double> notas){
        double suma = 0;
        for (Double double1 : notas) {
            suma += double1;
        }
        notafinal = (int)(suma/notas.size());
    }

    // ingresar una lista de notas
    public void ingresarNotas(List<Double> nuevasNotas) {
        this.notas = new ArrayList<>(nuevasNotas);
    }

    // agregar una nota individual
    public void agregarNota(Double nota) {
        if (this.notas == null) {
            this.notas = new ArrayList<>();
        }
        this.notas.add(nota);
    }

    // ponderado mas alto
    
    public void calcularPonderadoMasAlto()

    
    

}
