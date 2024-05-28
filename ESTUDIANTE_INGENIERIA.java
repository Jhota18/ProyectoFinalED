public class ESTUDIANTE_INGENIERIA {
    private String cedula;   
    private String nombre;
    private String apellido;
    private String telefono;    
    private int numSemestre; 
    private float promAcum; 
    private String serial;

    public ESTUDIANTE_INGENIERIA(String cedula, String nombre, String apellido, String telefono, int numSemestre, float promAcum, String serial){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.numSemestre=numSemestre;
        this.promAcum=promAcum;
        this.serial=serial;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula != null && cedula.matches("[a-zA-Z0-9]+")) {
            this.cedula = cedula;
        }else {
            throw new IllegalArgumentException("La cedula solo puede contener letras y números.");
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

    public int getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public float getPromAcum() {
        return promAcum;
    }

    public void setPromAcum(float promAcum) {
        this.promAcum = promAcum;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial != null && serial.matches("[a-zA-Z0-9]+")) {
            this.serial = serial;
        }else {
            throw new IllegalArgumentException("El serial no puede contener caracteres especiales");
        } 
        
    }

}
