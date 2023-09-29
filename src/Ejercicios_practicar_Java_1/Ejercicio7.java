package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base imponible : ");
        double n1 = scanner.nextDouble();
        double n2 = 0.21;
        double fact = (n1*n2)+n1;
        System.out.println("La factura es de "+ fact);
    }

}
