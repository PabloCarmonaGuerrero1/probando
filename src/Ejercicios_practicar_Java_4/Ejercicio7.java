package Ejercicios_practicar_Java_4;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream intStream = random.ints(14, 1, 4);
        Iterator<Integer> iterator = intStream.iterator();

        System.out.println("Quiniela:");

        for (int i = 1; i <= 14; i++) {
            System.out.print("Partido " + i + ": ");

            String resultadoTexto = "";
            int resultado = iterator.next();

            switch (resultado) {
                case 1:
                    resultadoTexto = "1";
                    break;

                case 3:
                    resultadoTexto = "X";
                    break;

                case 2:
                    resultadoTexto = "2";
                    break;
            }

            System.out.println(resultadoTexto);
            System.out.println();
        }

        IntStream intStream2 = random.ints(1, 1, 4);
        Iterator <Integer> iterator2 = intStream2.iterator();

        int resultadoPleno15 = iterator2.next();
        String resultadoPleno15Texto = "";

        switch (resultadoPleno15) {
            case 1:
                resultadoPleno15Texto = "1";
                break;
            case 3:
                resultadoPleno15Texto = "X";
                break;
            case 2:
                resultadoPleno15Texto = "2";
                break;
        }

        System.out.print("Pleno al Quince: " + resultadoPleno15Texto);
    }
}
