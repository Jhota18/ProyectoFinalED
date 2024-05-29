import java.util.Scanner;
import java.util.LinkedList;

public class menu {
    
    public void MenuPrincipal(LinkedList<COMPUTADOR_PORTATIL> lista_computador, LinkedList<TABLETA_GRAFICA> lista_tableta, LinkedList<ESTUDIANTE_INGENIERIA> lista_Ingenierias, LinkedList<ESTUDIANTE_DISENO> lista_diseño, LinkedList<COMPUTADOR_PORTATIL> X, LinkedList<TABLETA_GRAFICA> Y){

        Scanner sc = new Scanner(System.in);
        validar_entrada val = new validar_entrada();


        int opcion = 0;

        do {
            System.out.println();
            System.out.println("***********************************");
            System.out.println("*          MENÚ PRINCIPAL         *");
            System.out.println("***********************************");
            System.out.println("* 1. Estudiante de Ingenieria     *");
            System.out.println("* 2. Estudiante de diseño         *");
            System.out.println("* 3. Imprimir inventario total    *");
            System.out.println("* 4. Volver al menu crear objetos *");
            System.out.println("***********************************");
            opcion = val.obtenerOpcionValida(sc, 1, 4);

            switch (opcion) {
                case 1:                       
                    opcion1 op1 = new opcion1(); 
                    op1.Opcion1(lista_computador, lista_Ingenierias, X ); 
                    break;
                case 2:
                    opcion2 op2 = new opcion2();
                    op2.Opcion2(lista_tableta, lista_diseño, Y);
                    break;
                case 3:
                    Inventario inv = new Inventario();
                    inv.inventario(lista_computador, lista_tableta, X, Y); 
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Cargando..........");
                    System.out.println();
                    break;
            }
        } while (opcion != 4);
    }
}
