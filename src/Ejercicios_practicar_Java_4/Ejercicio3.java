package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream intStream = random.ints(1, 1, 5);
        Iterator<Integer> iterator = intStream.iterator();

        String palo = "";
        String carta;

        int numPalo = iterator.next();

        switch (numPalo) {
            case 1:
                palo = "oros";
                break;

            case 2:
                palo = "copas";
                break;

            case 3:
                palo = "espadas";
                break;

            case 4:
                palo = "bastos";
                break;
        }

        IntStream intStream2 = random.ints(1, 1, 11);
        Iterator<Integer> iterator2 = intStream2.iterator();

        int numCarta;

        do {
            numCarta = iterator2.next();
        } while (numCarta == 8 || numCarta == 9);

        switch (numCarta) {
            case 1:
                carta = "As";
                break;

            case 10:
                carta = "Sota";
                break;

            case 11:
                carta = "Caballo";
                break;

            case 12:
                carta = "Rey";
                break;

            default:
                carta = String.valueOf(numCarta);
        }

        System.out.println(carta + " de " + palo);
    }
}
