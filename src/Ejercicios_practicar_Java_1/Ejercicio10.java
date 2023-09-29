package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nº de mb: ");
        double n1 = scanner.nextDouble();
        double n2 = 1000.0;
        double kb = n1/n2;
        System.out.println("Tienes "+ kb + " kb");
    }

}
