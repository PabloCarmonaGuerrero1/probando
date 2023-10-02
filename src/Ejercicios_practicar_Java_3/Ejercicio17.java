package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInicial;

        do {
            System.out.println("Ingrese un número entero y positivo: ");
            numeroInicial = scanner.nextInt();
        }
        while (numeroInicial <= 0);

        scanner.close();

        int suma = 0;

        for (int i = 1; i <= 100; i ++) {
            suma += numeroInicial + i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numeroInicial + " es: " + suma);
    }
}
