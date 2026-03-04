import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();
        String nombre = "";
        Scanner sc = new Scanner(System.in);

        while (!nombre.equalsIgnoreCase("fin")) {
            System.out.println("Introduce el nombre: ");
            nombre = sc.nextLine();
            nombres.add(nombre);
        }
        nombres.removeLast();

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(i+1 + ". " +nombres.get(i));
        }
    }
}
