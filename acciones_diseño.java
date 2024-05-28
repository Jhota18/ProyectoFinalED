import java.util.LinkedList;
import java.util.Scanner;

public class acciones_diseño {

    private LinkedList<TABLETA_GRAFICA> Tdisponibles = new LinkedList<>();
    private LinkedList<TABLETA_GRAFICA> Tprestados = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);
    private validar_entrada val = new validar_entrada(); 

    public void registrar(LinkedList<TABLETA_GRAFICA> lista_tableta, LinkedList<ESTUDIANTE_DISENO> estudiante) {

        Tdisponibles.clear();
        Tdisponibles.addAll(lista_tableta);
        
        int iterador = 1;
        String serialElegido = "";
        String cedula = "";
        System.out.println();
        System.out.println("Despues de ver los equipos disponibles escoge uno por medio del serial:");
        System.out.println();

        for (TABLETA_GRAFICA tableta : Tdisponibles) {
            System.out.println("Tableta # " + iterador++);
            System.out.println();
            System.out.print("Serial: " + tableta.getSerial() + "\n");
            System.out.print("Marca: " + tableta.getMarca() + "\n");
            System.out.print("Almacenamiento: " + tableta.getAlmacenamiento() + "\n");
            System.out.println();
        }
        
        System.out.print("Ingresa el serial de la tableta elegida: ");
        serialElegido = sc.nextLine();
        System.out.print("Ingresa la cedula del estudiante: ");
        cedula = sc.nextLine();
        
        TABLETA_GRAFICA tabletaElegida = ValidarExistencia(serialElegido, Tdisponibles);
        ESTUDIANTE_DISENO verificarEstudiante= ValidarCedula(cedula,estudiante);
        if (tabletaElegida != null&&verificarEstudiante!=null) {
            Tdisponibles.remove(tabletaElegida);
            lista_tableta.remove(tabletaElegida);
            Tprestados.add(tabletaElegida);
            verificarEstudiante.setSerial(serialElegido);
            System.out.println("La tableta con serial " + serialElegido + " ha sido prestado.");
        } else {
            System.out.println("La tableta con serial " + serialElegido + " no se encontró en la lista de disponibles o el estudiante no existe");
        }

        System.out.println("elegiste:  " + serialElegido);
    }
    
    public void modificar(String cedula, LinkedList<ESTUDIANTE_DISENO> estudiante){
        ESTUDIANTE_DISENO verificarEstudiante = ValidarCedula(cedula,estudiante);
        System.out.println("Por favor ingrese el nuevo serial:");
        String serialNuevo= sc.nextLine();
        if (verificarEstudiante!=null) {
            verificarEstudiante.setSerial(serialNuevo);
        }
    }

    public void devolucion(LinkedList<ESTUDIANTE_DISENO> lista_diseño, LinkedList<TABLETA_GRAFICA> lista_tableta){
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
                ESTUDIANTE_DISENO est = ValidarCedula(cedula, lista_diseño);
                if (est != null) {
                    System.out.println("El estudiante con cedula " + cedula + " ha sido encontrado.");
                    serialB = est.getSerial();
                    TABLETA_GRAFICA com = ValidarTableta(serialB, lista_tableta);
                    if(com != null){
                        System.out.println("El computador no a sido prestado");
                    }else{
                        Tprestados.remove(serialB);
                        lista_tableta.add(com);
                    }
                } else {
                    System.out.println("El estudiante con cedula " + cedula + " no se encuentra.");
                }
                break;
            case 2:
                System.out.print("Ingresa el serial:  ");
                String serialA = sc.nextLine();
                TABLETA_GRAFICA com = ValidarTableta(serialA, lista_tableta);
                if(com != null){
                    System.out.println("La tableta no a sido prestado");
                }else{
                    Tprestados.remove(serialA);
                    lista_tableta.add(com);
                }
                break;
        }
    }

    public void buscar(LinkedList<TABLETA_GRAFICA> lista_tableta, LinkedList<ESTUDIANTE_DISENO> lista_diseño){

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
                ESTUDIANTE_DISENO est = ValidarCedula(cedula, lista_diseño);
                if (est != null) {
                    System.out.println("El estudiante con cedula " + cedula + " ha sido encontrado.");
                    serialB = est.getSerial();
                    TABLETA_GRAFICA com = ValidarTableta(serialB, lista_tableta);
                    if(com != null){
                        System.out.println("La tableta no a sido prestada");
                    }else{
                        System.out.println("La tableta esta prestada");
                    }
                } else {
                    System.out.println("El estudiante con cedula " + cedula + " no se encuentra.");
                }
                break;
            case 2:
                System.out.print("Ingresa el serial:  ");
                String serialA = sc.nextLine();
                TABLETA_GRAFICA com = ValidarTableta(serialA, lista_tableta);
                if(com != null){
                    System.out.println("La tableta no a sido prestado");
                }else{
                    System.out.println("La tableta esta prestado");
                }
                break;
        }
    }

    public TABLETA_GRAFICA ValidarExistencia(String serial, LinkedList<TABLETA_GRAFICA> Tdisponibles) {
        for (TABLETA_GRAFICA tableta : Tdisponibles) {
            if (tableta.getSerial().equals(serial)) {
                return tableta;
            }
        }
        return null;
    }

    public ESTUDIANTE_DISENO ValidarCedula(String cedula, LinkedList<ESTUDIANTE_DISENO> lista_diseño) {
        for (ESTUDIANTE_DISENO N : lista_diseño) {
            if (N.getCedula().equals(cedula)) {
                return N;
            }
        }
        return null;
    }

    public TABLETA_GRAFICA ValidarTableta(String serialB, LinkedList<TABLETA_GRAFICA> lista_tableta) {
        for (TABLETA_GRAFICA com : lista_tableta) {
            if (com.getSerial().equals(serialB)) {
                return com;
            }
        }
        return null;
    }
}

