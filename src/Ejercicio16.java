import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Introduce el número (-1 para salir): ");
            int num = sc.nextInt();
            numeros.add(num);

            if (num == -1){
                continuar = false;
            }
        }
        numeros.removeLast();
        System.out.println("Lista sin ordenar: ");
        System.out.println(numeros);

        System.out.println("Lista ordenada: ");
        Collections.sort(numeros);
        System.out.println(numeros);

    }
}
