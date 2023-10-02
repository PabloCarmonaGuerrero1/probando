package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.println("Ingrese el carácter para dibujar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        scanner.close();

        for (int i = 1; i <= altura; i ++) {
            if (i == 1 || i == altura) {
                for (int j = 1; j <= i; j ++) {
                    System.out.print(caracter);
                }
            }
            else {
                System.out.print(caracter);

                for (int k = 2; k < i; k ++) {
                    System.out.print(" ");
                }

                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}
