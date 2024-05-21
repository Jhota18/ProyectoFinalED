public class ESTUDIANTE_DISENO {
    private String cedula;   
    private String nombre;
    private String apellido;
    private String telefono;    
    private String modalidad; 
    private int cantAsignat; 
    private int serial;

    public ESTUDIANTE_DISENO(String cedula, String nombre, String apellido, String telefono, String modalidad, int cantAsignat, int serial){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.modalidad=modalidad;
        this.cantAsignat=cantAsignat;
        this.serial=serial;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCantAsignat() {
        return cantAsignat;
    }

    public void setCantAsignat(int cantAsignat) {
        this.cantAsignat = cantAsignat;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
