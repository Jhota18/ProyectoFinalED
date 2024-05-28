import java.util.LinkedList;
import java.util.Scanner;

public class opcion2 {

    public void Opcion2(LinkedList<TABLETA_GRAFICA> lista_tableta, LinkedList<ESTUDIANTE_DISENO> lista_diseño){

        acciones_diseño acd = new acciones_diseño();
        validar_entrada val = new validar_entrada();
        Scanner sc = new Scanner(System.in);
        menu me = new menu();

        int seleccion = 0;

        do {
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("*          Estudiante de diseño              *");
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
                    acd.registrar(lista_tableta,lista_diseño);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Por favor ingrese su cedula:");
                    String cedula=sc.nextLine();
                    acd.modificar(cedula,lista_diseño);
                    break;
                case 3:
                    acd.devolucion(lista_diseño, lista_tableta);
                    break;
                case 4:
                    acd.buscar(lista_tableta,lista_diseño);
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
