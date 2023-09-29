package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo : ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce la altura del triángulo : ");
        int n2 = scanner.nextInt();
        System.out.println("El área del triángulo es "+(n1*n2)/2);
    }

}
