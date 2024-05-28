import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class importar {
    
    public LinkedList<ESTUDIANTE_DISENO> importarEstudiante(String Archivo, LinkedList<ESTUDIANTE_DISENO> lista ) {
        try (BufferedReader importar = new BufferedReader(new FileReader(Archivo))) {
            String Linea;
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                if (Lineas.length < 2) continue;  // Salta líneas mal formateadas
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1].trim();
                switch (Atributo) {
                    case "cedula":
                        String cedula = valor;
                        boolean estudianteExiste = lista.stream().anyMatch(c -> c.getCedula().equals(cedula));
                        if (estudianteExiste) {
                            System.out.println("Se omitió el serial " + cedula + " porque ya se encontraba creado.");
                            // Saltar las siguientes líneas correspondientes a este estudiante
                            for (int i = 0; i < 7; i++) {
                                importar.readLine();
                            }
                            // Leer la línea vacía después del bloque de datos
                            importar.readLine();
                            break;
                        }
                        
                        String nombre = importar.readLine().split(":")[1].trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String telefono = importar.readLine().split(":")[1].trim();
                        String modalidad = importar.readLine().split(":")[1].trim();
                        int cantAsignat = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        int serial=0;
                        String lineaSerial = importar.readLine();
                        if (lineaSerial != null && lineaSerial.split(":").length > 1) {
                            String valorSerial = lineaSerial.split(":")[1].trim();
                            if (!valorSerial.isEmpty()) {
                                serial = Integer.parseInt(valorSerial);
                            }
                        }
                        // int serial = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        ESTUDIANTE_DISENO estudiante = new ESTUDIANTE_DISENO(cedula, nombre, apellido, telefono, modalidad, cantAsignat, serial);
                        lista.add(estudiante);
                        // Leer la línea en blanco entre estudiantes, si existe
                        importar.readLine();
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public LinkedList<ESTUDIANTE_INGENIERIA> importarEstudianteIn(String Archivo, LinkedList<ESTUDIANTE_INGENIERIA> lista ) {
        try (BufferedReader importar = new BufferedReader(new FileReader(Archivo))) {
            String Linea;
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                if (Lineas.length < 2) continue;  // Salta líneas mal formateadas
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1].trim();
                switch (Atributo) {
                    case "cedula":
                        String cedula = valor;
                        boolean estudianteExiste = lista.stream().anyMatch(c -> c.getCedula().equals(cedula));
                        if (estudianteExiste) {
                            System.out.println("Se omitió el serial " + cedula + " porque ya se encontraba creado.");
                            // Saltar las siguientes líneas correspondientes a este estudiante
                            for (int i = 0; i < 7; i++) {
                                importar.readLine();
                            }
                            // Leer la línea vacía después del bloque de datos
                            importar.readLine();
                            break;
                        }
                        String nombre = importar.readLine().split(":")[1].trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String telefono = importar.readLine().split(":")[1].trim();
                        int numSemestre = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float promAcum = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String serial="";
                        String lineaSerial = importar.readLine();
                        if (lineaSerial != null && lineaSerial.split(":").length > 1) {
                            String valorSerial = lineaSerial.split(":")[1].trim();
                            if (!valorSerial.isEmpty()) {
                                serial = valorSerial;
                            }
                        }
                        // String serial = importar.readLine().split(":")[1].trim();
                        ESTUDIANTE_INGENIERIA estudiante = new ESTUDIANTE_INGENIERIA(cedula, nombre, apellido, telefono, numSemestre, promAcum, serial);
                        lista.add(estudiante);
                        // Leer la línea en blanco entre estudiantes, si existe
                        importar.readLine();
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }


        public LinkedList<COMPUTADOR_PORTATIL> importarComputador(String Archivo, LinkedList<COMPUTADOR_PORTATIL> lista) {
            
            int computadorasImportadas = 0;
    
            try (BufferedReader importar = new BufferedReader(new FileReader(Archivo))) {
                String Linea;
                while ((Linea = importar.readLine()) != null) {
                    String[] Lineas = Linea.split(":");
                    if (Lineas.length < 2) continue;  // Salta líneas mal formateadas
                    String Atributo = Lineas[0].toLowerCase().trim();
                    String valor = Lineas[1].trim();
                    switch (Atributo) {
                        case "serial":
                            String serial = valor;
                            
                            // Verificar si el serial ya existe en la lista
                            boolean serialExiste = lista.stream().anyMatch(c -> c.getSerial().equals(serial));
                            if (serialExiste) {
                                System.out.println("Se omitió el serial " + serial + " porque ya se encontraba creado.");
                                // Saltar las siguientes líneas correspondientes a este computador
                                for (int i = 0; i < 5; i++) {
                                    importar.readLine();
                                }
                                // Leer la línea vacía después del bloque de datos
                                importar.readLine();
                                break;
                            }
                            
                            String marca = importar.readLine().split(":")[1].trim();
                            float tamaño = Float.parseFloat(importar.readLine().split(":")[1].trim());
                            float precio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                            String sistemaOperativo = importar.readLine().split(":")[1].trim();
                            String procesador = importar.readLine().split(":")[1].trim();
                            
                            COMPUTADOR_PORTATIL computador = new COMPUTADOR_PORTATIL(serial, marca, tamaño, precio, sistemaOperativo, procesador);
                            lista.add(computador);
                            computadorasImportadas++;
                            
                            importar.readLine(); // Lee la línea vacía
                            break;
                        default:
                            break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    
            System.out.println("Se importaron correctamente " + computadorasImportadas + " computadoras.");
            return lista;
        }
    
    

    public LinkedList<TABLETA_GRAFICA> importarTableta(String Archivo,LinkedList<TABLETA_GRAFICA> lista ) {
        try (BufferedReader importar = new BufferedReader(new FileReader(Archivo))) {
            String Linea;
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                if (Lineas.length < 2) continue;  // Salta líneas mal formateadas
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1].trim();
                switch (Atributo) {
                    case "serial":
                        String serial = valor;
                        boolean serialExiste = lista.stream().anyMatch(c -> c.getSerial().equals(serial));
                            if (serialExiste) {
                                System.out.println("Se omitió el serial " + serial + " porque ya se encontraba creado.");
                                // Saltar las siguientes líneas correspondientes a esta tableta
                                for (int i = 0; i < 5; i++) {
                                    importar.readLine();
                                }
                                // Leer la línea vacía después del bloque de datos
                                importar.readLine();
                                break;
                            }
                        
                        String marca = importar.readLine().split(":")[1].trim();
                        float tamaño = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        float precio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String almacenamiento= importar.readLine().split(":")[1].trim();
                        float peso = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        TABLETA_GRAFICA tableta = new TABLETA_GRAFICA(serial, marca, tamaño, precio, almacenamiento, peso);
                        lista.add(tableta);
                        
                        importar.readLine();
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public String agregarArchivo(){
        JFileChooser fileChooser = new JFileChooser();
        // Opcional: establecer un filtro de archivo
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        fileChooser.setFileFilter(filter);
        String filePath="";
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
        return filePath;
    }
}

