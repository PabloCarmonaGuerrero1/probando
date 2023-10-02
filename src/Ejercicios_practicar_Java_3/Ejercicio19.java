package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.println("Ingrese el carácter para dibujar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i ++) {
            for (int j = 1; j <= altura - i; j ++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k ++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}
