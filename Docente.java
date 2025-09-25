public class Docente {
    private int DNI;
    private String nombre;
    private String Apellido;
    private String Especialidad;
    private int AñosExperiencia;
    
    //getters and setters
    public int getDNI() { return DNI; }
    public String getNombre() { return nombre; }
    public String getApellido() { return Apellido; }
    public String getEspecialidad() { return Especialidad; }
    public int getAñosExperiencia() { return AñosExperiencia; }

    public void setDNI(int dNI) { DNI = dNI; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { Apellido = apellido; }
    public void setEspecialidad(String especialidad) { Especialidad = especialidad; }
    public void setAñosExperiencia(int añosExperiencia) { AñosExperiencia = añosExperiencia; }

    //constructor
    public Docente(int dNI, String nombre, String apellido, String especialidad, int añosExperiencia) {
        DNI = dNI;
        this.nombre = nombre;
        Apellido = apellido;
        Especialidad = especialidad;
        AñosExperiencia = añosExperiencia;
    }
    
}
