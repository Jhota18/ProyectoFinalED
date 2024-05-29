import java.util.LinkedList;

public class Inventario{
    public void inventario(LinkedList<COMPUTADOR_PORTATIL> lista_computador, LinkedList<TABLETA_GRAFICA> lista_tableta, LinkedList<COMPUTADOR_PORTATIL> X, LinkedList<TABLETA_GRAFICA> Y){

        System.out.println("Computadores disponibles:");
        for (COMPUTADOR_PORTATIL computador : lista_computador) {
            System.out.println("Serial" + " : " + computador.getSerial() + "\n");
            System.out.println("Marca" + " : " + computador.getMarca() + "\n");
            System.out.println("Tamaño" + " : " + computador.getTamaño() + " pulgadas" + "\n");
            System.out.println("Precio" + " : " + computador.getPrecio() + " pesos colombianos" + "\n");
            System.out.println("Sistema operativo" + " : " + computador.getSistemaOperativo() + "\n");
            System.out.println("Procesador" + " : " + computador.getProcesador() + "\n");
            System.out.println("\n");
        }

        System.out.println("Computadores prestados:");
        for (COMPUTADOR_PORTATIL computador : X) {
            System.out.println("Serial" + " : " + computador.getSerial() + "\n");
            System.out.println("Marca" + " : " + computador.getMarca() + "\n");
            System.out.println("Tamaño" + " : " + computador.getTamaño() + " pulgadas" + "\n");
            System.out.println("Precio" + " : " + computador.getPrecio() + " pesos colombianos" + "\n");
            System.out.println("Sistema operativo" + " : " + computador.getSistemaOperativo() + "\n");
            System.out.println("Procesador" + " : " + computador.getProcesador() + "\n");
            System.out.println("\n");
        }

        System.out.println("Tabletas disponibles:");
        for (TABLETA_GRAFICA tabla : lista_tableta) {
            System.out.print("Serial" + " : " + tabla.getSerial() + "\n");
            System.out.print("Marca" + " : " + tabla.getMarca() + "\n");
            System.out.print("Tamaño" + " : " + tabla.getTamaño() + " pulgadas" + "\n");
            System.out.print("Precio" + " : " + tabla.getPrecio() + " pesos colombianos" + "\n");
            System.out.print("Almacenamiento" + " : " + tabla.getAlmacenamiento() + "\n");
            System.out.print("Peso" + " : " + tabla.getPeso() + " kilogramos" + "\n");
            System.out.print("\n");
        }

        System.out.println("Tabletas prestados:");
        for (TABLETA_GRAFICA tableta : Y) {
            System.out.print("Serial" + " : " + tableta.getSerial() + "\n");
            System.out.print("Marca" + " : " + tableta.getMarca() + "\n");
            System.out.print("Tamaño" + " : " + tableta.getTamaño() + " pulgadas" + "\n");
            System.out.print("Precio" + " : " + tableta.getPrecio() + " pesos colombianos" + "\n");
            System.out.print("Almacenamiento" + " : " + tableta.getAlmacenamiento() + "\n");
            System.out.print("Peso" + " : " + tableta.getPeso() + " kilogramos" + "\n");
            System.out.print("\n");
        }


    }
}