import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        boolean salir = false;

        do {
            System.out.println("Introduce el nombre ('salir' para salir): ");
            String nombre = sc.nextLine();
            nombres.add(nombre);
            if(nombre.equalsIgnoreCase("salir")){
                salir = true;
            }
        } while(!salir);
        nombres.removeLast();

        System.out.println(nombres);

        System.out.println("Nombre que busca: ");
        String nombreBuscado = sc.nextLine();

        boolean existe = false;
        int contador = 0;
        for(String nombre : nombres){
            if (nombre.equalsIgnoreCase(nombreBuscado)) {
                existe = true;
                contador++;
            }
        }
        if(existe){
            System.out.println("El nombre " + nombreBuscado + " existe. Aparece " + contador + " veces.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no existe");
        }
    }
}
