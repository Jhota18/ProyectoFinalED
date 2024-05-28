import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportacion {
    
    public void exportarTableta(LinkedList<TABLETA_GRAFICA> lista_tableta) {
        try {
            System.out.println();
            System.out.println("Iniciando exportación de tabletas gráficas..........");
            File archivo = new File("ExportarTabletas_graficas.txt");
            boolean exists = archivo.exists();
            FileWriter exportar = new FileWriter(archivo, !exists);

            if (lista_tableta.isEmpty()) {
                System.out.println("La lista de tabletas graficas está vacía.");
            }else{

                for (TABLETA_GRAFICA tabla : lista_tableta) {
                    exportar.write("Serial" + " : " + tabla.getSerial() + "\n");
                    exportar.write("Marca" + " : " + tabla.getMarca() + "\n");
                    exportar.write("Tamaño" + " : " + tabla.getTamaño() + " pulgadas" + "\n");
                    exportar.write("Precio" + " : " + tabla.getPrecio() + " pesos colombianos" + "\n");
                    exportar.write("Almacenamiento" + " : " + tabla.getAlmacenamiento() + "\n");
                    exportar.write("Peso" + " : " + tabla.getPeso() + " kilogramos" + "\n");
                    exportar.write("\n");
                }
            
                exportar.close();
                System.out.println("Datos exportados correctamente!!!");
            }
        } catch (Exception e) {
            System.out.println("Error al exportar los datos: ");
        }
    }
    
    
    public void exportarComputador(LinkedList<COMPUTADOR_PORTATIL> lista_computador) {
        try {
            System.out.println();
            System.out.println("Iniciando exportación de computadores portátiles..........");
            File archivo = new File("ExportarComputadores_portatiles.txt");
            FileWriter exportar = new FileWriter(archivo, false); // false to overwrite the file

            if (lista_computador.isEmpty()) {
                System.out.println("La lista de computadores portátiles está vacía.");
            }else{

                for (COMPUTADOR_PORTATIL computador : lista_computador) {
                    exportar.write("Serial" + " : " + computador.getSerial() + "\n");
                    exportar.write("Marca" + " : " + computador.getMarca() + "\n");
                    exportar.write("Tamaño" + " : " + computador.getTamaño() + " pulgadas" + "\n");
                    exportar.write("Precio" + " : " + computador.getPrecio() + " pesos colombianos" + "\n");
                    exportar.write("Sistema operativo" + " : " + computador.getSistemaOperativo() + "\n");
                    exportar.write("Procesador" + " : " + computador.getProcesador() + "\n");
                    exportar.write("\n");
                }
                exportar.close();
                System.out.println("Datos exportados correctamente!!!");
            }
        } catch (IOException e) {
            System.err.println("Error de IO al exportar los datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al exportar los datos: " + e.getMessage());
        }
    }  
    
    
    public void exportarIngeniero(LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenierias) {
        try {
            System.out.println();
            System.out.println("Iniciando exportación de lista de estudiantes de ingenieria..........");
            File archivo = new File("ExportarIngenieros.txt");
            FileWriter exportar = new FileWriter(archivo, false); // false to overwrite the file

            if (lista_Ingenierias.isEmpty()) {
                System.out.println("La lista de ingenieros está vacía.");
            }else{

                for (ESTUDIANTE_INGENIERIA ing : lista_Ingenierias) {
                    exportar.write("Cedula" + " : " + ing.getCedula() + "\n");
                    exportar.write("Nombre" + " : " + ing.getNombre() + "\n");
                    exportar.write("Apellido" + " : " + ing.getApellido() + "\n");
                    exportar.write("Telefono" + " : " + ing.getTelefono() + "\n");
                    exportar.write("Numero de semestre" + " : " + ing.getNumSemestre() + "\n");
                    exportar.write("Promedio acumulado" + " : " + ing.getPromAcum() + "\n");
                    exportar.write("Serial" + " : " + ing.getSerial() + "\n");
                    exportar.write("\n");
                }
                exportar.close();
                System.out.println("Datos exportados correctamente!!!");
            }
        } catch (IOException e) {
            System.err.println("Error de IO al exportar los datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al exportar los datos: " + e.getMessage());
        }
    }   


    public void exportarDiseño(LinkedList<ESTUDIANTE_DISENO> lista_Disenos) {
        try {
            System.out.println();
            System.out.println("Iniciando exportación de lista de estudiantes de diseño..........");
            File archivo = new File("ExportarDiseño.txt");
            FileWriter exportar = new FileWriter(archivo, false); // false to overwrite the file

            if (lista_Disenos.isEmpty()) {
                System.out.println("La lista de estudiantes de diseño está vacía.");
            }else{

                for (ESTUDIANTE_DISENO dis : lista_Disenos) {
                    exportar.write("Cedula" + " : " + dis.getCedula() + "\n");
                    exportar.write("Nombre" + " : " + dis.getNombre() + "\n");
                    exportar.write("Apellido" + " : " + dis.getApellido() + "\n");
                    exportar.write("Telefono" + " : " + dis.getTelefono() + "\n");
                    exportar.write("Modalidad de estudio" + " : " + dis.getModalidad() + "\n");
                    exportar.write("Cantidad de asignaturas" + " : " + dis.getCantAsignat() + "\n");
                    exportar.write("Serial" + " : " + dis.getSerial() + "\n");
                    exportar.write("\n");
                }
                exportar.close();
                System.out.println("Datos exportados correctamente!!!");
            }
        } catch (IOException e) {
            System.err.println("Error de IO al exportar los datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al exportar los datos: " + e.getMessage());
        }
    }
}

