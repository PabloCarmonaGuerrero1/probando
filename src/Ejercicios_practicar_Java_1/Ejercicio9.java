package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del cono: ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce la altura del cono : ");
        double n2 = scanner.nextDouble();
        double pi = 3.14;
        double v = (1.0/3.0)*pi*(n1*n1)*n2;
        System.out.println("El volumen de este cono es "+ v);
    }

}
