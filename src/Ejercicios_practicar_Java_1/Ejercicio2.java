package Ejercicios_practicar_Java_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número de euros : ");
        double euros = scanner.nextDouble();
        double pesetas = 166.386;
        double conversion = euros*pesetas;
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(conversion);
        System.out.println(resultado+" peseta/s");
    }
}
