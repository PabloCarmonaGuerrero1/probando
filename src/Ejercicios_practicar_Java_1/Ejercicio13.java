package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce la nota que quieres en el trimestre: ");
        double n2 = scanner.nextDouble();
        double mt = n2;
        n1 = n1*0.4;
        n2=(n2-n1)/0.6;
        System.out.println("Tendrás que sacar un "+n2+" en el siguiente examen para tener un "+mt+" en el trimestre");
    }

}
