package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas esta semana : ");
        int n1 = scanner.nextInt();
        int n2 = 12;
        int salario = n1*n2;
        System.out.println("Tu salario esta semana es de "+ salario);
    }

}
