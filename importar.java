import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class importar {
    public LinkedList<ESTUDIANTE_DISENO> importarEstudiante(String Archivo) {
        LinkedList<ESTUDIANTE_DISENO> lista = new LinkedList<>();
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
                        String nombre = importar.readLine().split(":")[1].trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String telefono = importar.readLine().split(":")[1].trim();
                        String modalidad = importar.readLine().split(":")[1].trim();
                        int cantAsignat = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        int serial = Integer.parseInt(importar.readLine().split(":")[1].trim());
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
}

