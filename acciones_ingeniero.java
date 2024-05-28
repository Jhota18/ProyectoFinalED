import java.util.LinkedList;
import java.util.Scanner;

public class acciones_ingeniero {

    private LinkedList<COMPUTADOR_PORTATIL> Cdisponibles = new LinkedList<>();
    private LinkedList<COMPUTADOR_PORTATIL> Cprestados = new LinkedList<>();

    public void registrar(LinkedList<COMPUTADOR_PORTATIL> lista_computador) {
        Scanner sc = new Scanner(System.in);

        Cdisponibles.clear();
        Cdisponibles.addAll(lista_computador);
        
        int iterador = 1;
        String serialElegido = "";
        System.out.println();
        System.out.println("Despues de ver los equipos disponibles escoge uno por medio del serial:");
        System.out.println();

        for (COMPUTADOR_PORTATIL computador : Cdisponibles) {
            System.out.println("Computador # " + iterador++);
            System.out.println();
            System.out.print("Serial: " + computador.getSerial() + "\n");
            System.out.print("Marca: " + computador.getMarca() + "\n");
            System.out.print("Sistema operativo: " + computador.getSistemaOperativo() + "\n");
            System.out.print("Procesador: " + computador.getProcesador() + "\n");
            System.out.println();
        }
        
        System.out.print("Ingresa el serial del computador elegido: ");
        serialElegido = sc.nextLine();
        
        COMPUTADOR_PORTATIL computadorElegido = VerificarExistencia(serialElegido, Cdisponibles);
        if (computadorElegido != null) {
            Cdisponibles.remove(computadorElegido);
            lista_computador.remove(computadorElegido);
            Cprestados.add(computadorElegido);
            System.out.println("El computador con serial " + serialElegido + " ha sido prestado.");
        } else {
            System.out.println("El computador con serial " + serialElegido + " no se encontró en la lista de disponibles.");
        }

        System.out.println("elegiste:  " + serialElegido);
    }
    
    public void modificar(){
        
    }

    public void devolucion(){
        
    }

    public void buscar(){
        
    }

    public COMPUTADOR_PORTATIL VerificarExistencia(String serial, LinkedList<COMPUTADOR_PORTATIL> Cdisponibles) {
        for (COMPUTADOR_PORTATIL computador : Cdisponibles) {
            if (computador.getSerial().equals(serial)) {
                return computador;
            }
        }
        return null;
    }
}
