package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayorPar = 0;
        int mediaImpares = 0;
        int contadorImpares = 0;
        int numeroTeclado;
        int contador = 0;

        do {
            System.out.println("Escribe un número: ");
            numeroTeclado = scanner.nextInt();

            if (numeroTeclado >= 0) {
                contador += 1;

                if ((numeroTeclado % 2) == 0) {
                    if (mayorPar < numeroTeclado) {
                        mayorPar = numeroTeclado;
                    }
                }
                else {
                    mediaImpares += numeroTeclado;
                    contadorImpares += 1;
                }
            }
        } while (numeroTeclado >= 0);

        System.out.println("Se han introducido " + contador + " números");

        if (contadorImpares == 0) {
            System.out.println("La media de los números impares introducidos es: 0");
        }
        else {
            System.out.println("La media de los números impares introducidos es: " + (mediaImpares / contadorImpares));
        }

        System.out.println("El mayor de los números pares introducidos es: " + mayorPar);
    }
}
