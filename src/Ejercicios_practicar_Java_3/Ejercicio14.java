package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        double resultado = 1;

        if (exponente >= 0) {
            for (int i = 0; i < exponente; i ++) {
                resultado *= base;
            }

            System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
        }
        else {
            System.out.println("El exponente debe ser un número entero positivo");
        }
    }
}
