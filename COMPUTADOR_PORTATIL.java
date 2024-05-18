public class COMPUTADOR_PORTATIL {

    private String serial;   
    private String marca;
    private float tamaño;    
    private float precio; 
    private String sistemaOperativo; 
    private String procesador;
    
    public COMPUTADOR_PORTATIL(String serial, String marca, float tamaño, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    
}
