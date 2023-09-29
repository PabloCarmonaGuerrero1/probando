package Ejercicios_practicar_Java_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número de pesetas : ");
        double euros = 0.006010121;
        double pesetas = scanner.nextDouble();
        double conversion = euros*pesetas;
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultado = formato.format(conversion);
        System.out.println(resultado+" euro/s");
    }
}
