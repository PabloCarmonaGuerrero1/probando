package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nº de kb: ");
        double n1 = scanner.nextDouble();
        double n2 = 1000.0;
        double mb = n1*n2;
        System.out.println("Tienes "+ mb + " mb");
    }

}
