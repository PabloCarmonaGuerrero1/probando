package Ejercicios_practicar_Java_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a hacer la media de varios números\n" +
                "Si desea dejar de introducir números, introduzca un número negativo");

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        while (true) {
            System.out.println("Introduce un número");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                listaNumeros.add(numero);
            }
            else {
                break;
            }
        }

        int sumaNumeros = 0;
        int i;

        for (i = 0; i < listaNumeros.size(); i ++) {
            sumaNumeros += listaNumeros.get(i);
        }

        double media = (double) sumaNumeros / i;
        System.out.println("La media de los números " + listaNumeros + " es " + media);
    }
}
