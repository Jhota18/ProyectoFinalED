import java.util.LinkedList;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        
        LinkedList<TABLETA_GRAFICA> lista_tableta = new LinkedList<>();
        LinkedList<COMPUTADOR_PORTATIL> lista_computador = new LinkedList<>();
        Exportacion exp = new Exportacion();
        LLAMADA_TC tc = new LLAMADA_TC();
        lista_tableta = tc.tableta(lista_tableta);
        exp.exportarTableta(lista_tableta);
        lista_computador = tc.computador(lista_computador);
        exp.exportarComputador(lista_computador);
        
    }
}