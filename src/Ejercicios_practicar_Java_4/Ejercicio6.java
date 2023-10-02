package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        IntStream intStream = random.ints(1, 0, 101);
        Iterator<Integer> iterator = intStream.iterator();

        int numeroAleatorio = 0;

        while (iterator.hasNext()) {
            numeroAleatorio = iterator.next();
        }

        int oportunidades = 5;
        int numeroUsuario;

        while (oportunidades > 0) {
            System.out.println("Adivina el número (0 - 100): ");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Enhorabuena, el número aleatorio era: " + numeroAleatorio + "!");
                break;
            }
            else {
                oportunidades --;
                System.out.println("¡Mala suerte, ese no es el número aleatorio!\n" +
                        "Te quedan " + oportunidades + " intentos");

                if (oportunidades == 0) {
                    System.out.println("¡Mala suerte, no has adivinado el número aleatorio!\n" +
                            "¡El número aleatorio era: " + numeroAleatorio + "!");
                }
                else {
                    if (numeroUsuario > numeroAleatorio) {
                        System.out.println("El número aleatorio es menor que " + numeroUsuario);
                    }
                    else {
                        System.out.println("El número aleatorio es mayor que " + numeroUsuario);
                    }
                }
            }

            scanner.close();
        }
    }
}
