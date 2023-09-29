package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número : ");
        int n1 =scanner.nextInt();
        System.out.print("Introduce un número : ");
        int n2 =scanner.nextInt();
        System.out.print(n1*n2);
    }
}