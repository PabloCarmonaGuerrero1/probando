package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(3, 1, 7);
        Iterator<Integer> iterator = intStream.iterator();

        int contadorTiradas = 0;

        while (iterator.hasNext()) {
            contadorTiradas ++;
            System.out.println("Tirada número " + contadorTiradas + ": " + iterator.next());
        }
    }
}
