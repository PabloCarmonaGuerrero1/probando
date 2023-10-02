package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        scanner.close();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        }
        else {
            for (int i = 2; i < numero; i ++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        }
        else {
            System.out.println(numero + " no es un número primo");
        }
    }
}
