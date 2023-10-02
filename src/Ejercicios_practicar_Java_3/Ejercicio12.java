package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de términos de la serie de Fibonacci que desea mostrar: ");
        int numerosMostrar = scanner.nextInt();

        scanner.close();

        int primero = 0;
        int segundo = 1;

        System.out.println("Serie de Fibonacci con " + numerosMostrar + " términos: ");

        for (int i = 0; i < numerosMostrar; i++) {
            System.out.println(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
