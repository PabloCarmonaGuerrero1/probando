package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("Número   Cuadrado   Cubo");

        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-8d %-10d %-4d%n", i, cuadrado, cubo);
        }
    }
}
