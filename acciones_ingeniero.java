import java.util.LinkedList;
import java.util.Scanner;

public class acciones_ingeniero {

    private LinkedList<COMPUTADOR_PORTATIL> Cdisponibles = new LinkedList<>();
    private LinkedList<COMPUTADOR_PORTATIL> Cprestados = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);
    private validar_entrada val = new validar_entrada(); 

    public void registrar(LinkedList<COMPUTADOR_PORTATIL> lista_computador, LinkedList<ESTUDIANTE_INGENIERIA> estudiante) {

        Cdisponibles.clear();
        Cdisponibles.addAll(lista_computador);
        
        int iterador = 1;
        String serialElegido = "";
        String cedula = "";
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
        System.out.print("Ingresa la cedula del estudiante: ");
        cedula = sc.nextLine();
        
        COMPUTADOR_PORTATIL computadorElegido = VerificarExistencia(serialElegido, Cdisponibles);
        ESTUDIANTE_INGENIERIA verificarEstudiante= VerificarCedula(cedula,estudiante);
        if (computadorElegido != null&&verificarEstudiante!=null) {
            Cdisponibles.remove(computadorElegido);
            lista_computador.remove(computadorElegido);
            Cprestados.add(computadorElegido);
            verificarEstudiante.setSerial(serialElegido);
            System.out.println("El computador con serial " + serialElegido + " ha sido prestado.");
        } else {
            System.out.println("El computador con serial " + serialElegido + " no se encontró en la lista de disponibles o el estudiante no existe");
        }

        System.out.println("elegiste:  " + serialElegido);
    }
    
    public void modificar(String cedula, LinkedList<ESTUDIANTE_INGENIERIA> estudiante){
        ESTUDIANTE_INGENIERIA verificarEstudiante= VerificarCedula(cedula,estudiante);
        
        if (verificarEstudiante!=null) {
            System.out.println("Por favor ingrese el nuevo serial:");
            String serialNuevo= sc.nextLine();
            verificarEstudiante.setSerial(serialNuevo);
        }
    }

    public void devolucion(LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenierias, LinkedList<COMPUTADOR_PORTATIL> lista_computador){
        System.out.println();
        System.out.print("Vas a devolver el equipo por 1. cedula o por 2. serial :  ");
        int opcion = 0;
        opcion = val.obtenerOpcionValida(sc, 1, 2);
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el numero de cedula:  ");
                String cedula = sc.nextLine();
                String serialB = "";
                ESTUDIANTE_INGENIERIA est = VerificarCedula(cedula, lista_Ingenierias);
                if (est != null) {
                    System.out.println("El estudiante con cedula " + cedula + " ha sido encontrado.");
                    serialB = est.getSerial();
                    COMPUTADOR_PORTATIL com = VerificarComputador(serialB, lista_computador);
                    if(com != null){
                        System.out.println("El computador no a sido prestado");
                    }else{
                        Cprestados.remove(serialB);
                        lista_computador.add(com);
                    }
                } else {
                    System.out.println("El estudiante con cedula " + cedula + " no se encuentra.");
                }
                break;
            case 2:
                System.out.print("Ingresa el serial:  ");
                String serialA = sc.nextLine();
                COMPUTADOR_PORTATIL com = VerificarComputador(serialA, lista_computador);
                if(com != null){
                    System.out.println("El computador no a sido prestado");
                }else{
                    Cprestados.remove(serialA);
                    lista_computador.add(com);
                }
                break;
        }
    }

    public void buscar(LinkedList<COMPUTADOR_PORTATIL> lista_computador, LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenierias){

        System.out.println();
        System.out.print("Vas a buscar el equipo por 1. cedula o por 2. serial :  ");
        int opcion = 0;
        opcion = val.obtenerOpcionValida(sc, 1, 2);
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el numero de cedula:  ");
                String cedula = sc.nextLine();
                String serialB = "";
                ESTUDIANTE_INGENIERIA est = VerificarCedula(cedula, lista_Ingenierias);
                if (est != null) {
                    System.out.println("El estudiante con cedula " + cedula + " ha sido encontrado.");
                    serialB = est.getSerial();
                    COMPUTADOR_PORTATIL com = VerificarComputador(serialB, lista_computador);
                    if(com != null){
                        System.out.println("El computador no a sido prestado");
                    }else{
                        System.out.println("El computador esta prestado");
                    }
                } else {
                    System.out.println("El estudiante con cedula " + cedula + " no se encuentra.");
                }
                break;
            case 2:
                System.out.print("Ingresa el serial:  ");
                String serialA = sc.nextLine();
                COMPUTADOR_PORTATIL com = VerificarComputador(serialA, lista_computador);
                if(com != null){
                    System.out.println("El computador no a sido prestado");
                }else{
                    System.out.println("El computador esta prestado");
                }
                break;
        }
    }

    public COMPUTADOR_PORTATIL VerificarExistencia(String serial, LinkedList<COMPUTADOR_PORTATIL> Cdisponibles) {
        for (COMPUTADOR_PORTATIL computador : Cdisponibles) {
            if (computador.getSerial().equals(serial)) {
                return computador;
            }
        }
        return null;
    }

    public ESTUDIANTE_INGENIERIA VerificarCedula(String cedula, LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenierias) {
        for (ESTUDIANTE_INGENIERIA N : lista_Ingenierias) {
            if (N.getCedula().equals(cedula)) {
                return N;
            }
        }
        return null;
    }

    public COMPUTADOR_PORTATIL VerificarComputador(String serialB, LinkedList<COMPUTADOR_PORTATIL> lista_computador) {
        for (COMPUTADOR_PORTATIL com : lista_computador) {
            if (com.getSerial().equals(serialB)) {
                return com;
            }
        }
        return null;
    }
}
