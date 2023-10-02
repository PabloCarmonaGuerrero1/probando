package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream intStream = random.ints(1, 1, 5);
        Iterator<Integer> iterator = intStream.iterator();

        String palo = "";
        String carta;

        int numPalo = iterator.next();

        switch (numPalo) {
            case 1:
                palo = "picas";
                break;

            case 2:
                palo = "corazones";
                break;

            case 3:
                palo = "diamantes";
                break;

            case 4:
                palo = "tréboles";
                break;
        }

        IntStream intStream2 = random.ints(1, 1, 14);
        Iterator<Integer> iterator2 = intStream2.iterator();

        int numCarta = iterator2.next();

        switch (numCarta) {
            case 1:
                carta = "As";
                break;

            case 11:
                carta = "J";
                break;

            case 12:
                carta = "Q";
                break;

            case 13:
                carta = "K";
                break;

            default:
                carta = String.valueOf(numCarta);
        }

        System.out.println(carta + " de " + palo);
    }
}
