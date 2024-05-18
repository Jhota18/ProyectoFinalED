public class TABLETA_GRAFICA {

    private String serial;   
    private String marca;
    private float tamaño;    
    private float precio; 
    private String almacenamiento; 
    private float peso;

    public TABLETA_GRAFICA(String serial, String marca, float tamaño, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial != null && serial.matches("[a-zA-Z0-9]+")) {
            this.serial = serial;
        }else {
            throw new IllegalArgumentException("El serial solo puede contener letras y números.");
        }   
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && marca.matches("[a-zA-Z]+")) {
            this.marca = marca;
        }else {
            throw new IllegalArgumentException("La marca solo puede contener letras.");
        }
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }  
    
}
