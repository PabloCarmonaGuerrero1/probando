package Ejercicios_practicar_Java_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i <= 10; i ++) {
            System.out.println("Introducir número: ");
            listaNumeros.add(scanner.nextInt());
        }

        int contador = 0;

        for (int i = 0; i < listaNumeros.size(); i ++) {
            if (listaNumeros.get(contador) > 0) {
                System.out.println(listaNumeros.get(contador) + " es positivo");
            }
            else if (listaNumeros.get(contador) < 0) {
                System.out.println(listaNumeros.get(contador) + " es negativo");
            }
            else {
                System.out.println(listaNumeros.get(contador));
            }
            contador ++;
        }
    }
}
