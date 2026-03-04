import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Cantidad de números: ");
        int dimension = sc.nextInt();

        for (int i = 0; i < dimension; i++) {
            System.out.println("Número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.println("Lista original: ");
        System.out.println(numeros);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
        System.out.println("Lista sin negativos: ");
        System.out.println(numeros);
    }
}
