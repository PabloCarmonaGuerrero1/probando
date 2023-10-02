package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        long numero = scanner.nextLong();

        scanner.close();

        if (numero < 0) {
            numero = -numero;
        }

        int contadorDigitos = 0;

        while (numero > 0) {
            numero = numero / 10;
            contadorDigitos ++;
        }

        System.out.println("El número ingresado tiene " + contadorDigitos + " dígitos.");
    }
}
