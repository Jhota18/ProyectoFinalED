import java.util.LinkedList;
import java.util.Scanner;

public class opcion1 {

    public void Opcion1(LinkedList<COMPUTADOR_PORTATIL> lista_computador){

        acciones_ingeniero aci = new acciones_ingeniero();
        validar_entrada val = new validar_entrada();
        Scanner sc = new Scanner(System.in);
        menu me = new menu();

        int seleccion = 0;

        do {
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("*          Estudiante de ingenieria          *");
            System.out.println("**********************************************");
            System.out.println("* 1. Registrar préstamo de equipo.           *");
            System.out.println("* 2. Modificar préstamo de equipo.           *");
            System.out.println("     (Por serial o cedula).                  *");
            System.out.println("* 3. Devolución de equipo                    *");
            System.out.println("     (eliminar registro por serial o cedula) *");
            System.out.println("* 4. Buscar equipo                           *");
            System.out.println("     (Por serial o cedula).                  *");
            System.out.println("* 5. Volver al menú principal                *");
            System.out.println("**********************************************");
            seleccion = val.obtenerOpcionValida(sc, 1, 5);

            switch (seleccion) {
                case 1:
                    aci.registrar(lista_computador);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Volviendo al menu principal..........");
                    System.out.println();
                    break;
            }
        } while (seleccion != 5);
    }   
}
