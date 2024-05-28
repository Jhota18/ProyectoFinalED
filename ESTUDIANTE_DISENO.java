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
        if (cedula != null && cedula.matches("[0-9]+")) {
            this.cedula = cedula;
        }else {
            throw new IllegalArgumentException("La cedula solo puede tener números.");
        }  
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.matches("[a-zA-Z]+")) {
            this.nombre = nombre;
        }else {
            throw new IllegalArgumentException("El nombre solo puede contener letras.");
        } 
    
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && apellido.matches("[a-zA-Z]+")) {
            this.apellido = apellido;
        }else {
            throw new IllegalArgumentException("El apellido solo puede contener letras.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("[0-9]+")) {
            this.telefono = telefono;
        }else {
            throw new IllegalArgumentException("El telefono solo puede tener numeros");
        }
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
