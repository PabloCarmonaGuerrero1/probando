package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        scanner.close();

        if (exponente >= 1) {
            System.out.println("Potencias de " + base + " desde 1 hasta " + exponente + ":");
            for (int i = 1; i <= exponente; i ++) {
                double resultado = 1.0;

                for (int j = 1; j <= i; j ++) {
                    resultado *= base;
                }
                System.out.println(base + " ^ " + i + " = " + resultado);
            }
        }
        else {
            System.out.println("El exponente debe ser un número entero positivo");
        }
    }
}
