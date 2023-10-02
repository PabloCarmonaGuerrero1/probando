package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero, segundoNumero;

        do {
            System.out.println("Ingrese el primer número: ");
            primerNumero = scanner.nextInt();

            System.out.println("Ingrese el segundo número (distinto al primero): ");
            segundoNumero = scanner.nextInt();

            if (primerNumero == segundoNumero) {
                System.out.println("Los números deben ser distintos. Inténtelo de nuevo.");
            }
        } while (primerNumero == segundoNumero);

        int numeroMenor = Math.min(primerNumero, segundoNumero);
        int numeroMayor = Math.max(primerNumero, segundoNumero);

        for (int i = numeroMenor; i <= numeroMayor; i += 7) {
            System.out.println(i);
        }
    }
}
