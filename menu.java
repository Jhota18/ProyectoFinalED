import java.util.Scanner;

public class menu {
    
    public void MenuPrincipal(){

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
                    op1.Opcion1(); 
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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