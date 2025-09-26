import java.util.*;
public class BaseDatos {
    private List<Alumno> ListaAlumno;
    private List<Curso> ListaCurso;
    private List<Docente> ListaDocente;
    private List<Inscripcion> ListaInscripcion;
    private HashMap<Integer, String> ListaDeAprobacion;

    //listas inicializadas;

    public BaseDatos() {
    ListaAlumno = new ArrayList<>();
    ListaCurso = new ArrayList<>();
    ListaDocente = new ArrayList<>();
    ListaInscripcion = new ArrayList<>();
    }

    //buscar Alumno
    public Alumno BuscarAlumno(int CodigoAlumno){
        for (Alumno a : ListaAlumno){
            if (a.getCodigoAlumno() == CodigoAlumno)
            return a;
        }
        return null;
    }

    public void AgregarAlumno(Alumno a){ ListaAlumno.add(a); }

    //buscar curso

    public Curso BuscarCurso (int CodigoCurso) {
        for (Curso c : ListaCurso){
            if (c.getCodigoCurso() == CodigoCurso)
                return c;
        }
        return null;
    }

    public void AgregarCurso(Curso c){ ListaCurso.add(c); }

    public void inscribir(Alumno a, Curso c){
        for (Inscripcion ins : ListaInscripcion){
            if (ins.getAlumno().getCodigoAlumno() == a.getCodigoAlumno() && 
            ins.getCurso().getCodigoCurso() == c.getCodigoCurso() ){
                System.out.println("Ya esta inscrito");
                return;
            }
        }
    Inscripcion nueva = new Inscripcion(a, c);
    ListaInscripcion.add(nueva);
    System.out.println("Inscripcion realizada");
    }

    public Alumno PonderadoMasAlto(){
        int notaAlta = ListaInscripcion.get(0).getNotafinal();
        Alumno alumnoDestacado = null;
        for (Inscripcion a: ListaInscripcion) {
            if (a.getNotafinal()> notaAlta){
                alumnoDestacado = a.getAlumno();
            }

        }
        return alumnoDestacado;
    }

    

}
