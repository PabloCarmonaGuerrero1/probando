package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intStream = random.ints(20, 0, 11);
        Iterator<Integer> iterator = intStream.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
