public class Alumno {
    private String Nombre;
    private String Apellido;
    private int CodigoAlumno;
    
    
    //getters and setters
    public String getNombre() { return Nombre; }
    public String getApellido() { return Apellido; }
    public int getCodigoAlumno() { return CodigoAlumno; }
    
    public void setNombre(String nombre) { Nombre = nombre; }
    public void setApellido(String apellido) { Apellido = apellido; }
    public void setCodigoAlumno(int codigoAlumno) { CodigoAlumno = codigoAlumno; }
    
    // constructor
    public Alumno(String nombre, String apellido, int codigoAlumno) {
        Nombre = nombre;
        Apellido = apellido;
        CodigoAlumno = codigoAlumno;
    }

    

}
