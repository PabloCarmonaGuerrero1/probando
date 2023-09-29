package Ejercicios_practicar_Java_1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String iva = scanner.next();
        double ivar = 0;
        if (iva.equals("general")) {
            ivar = 0.21;
        } else if (iva.equals("reducido")) {
            ivar = 0.1;
        } else if (iva.equals("superreducido")) {
            ivar = 0.04;
        }
        System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo = scanner.next();
        double promor = 0;
        if (promo.equals("nopro")) {
            promor = 0;
        } else if (promo.equals("mitad")) {
            promor = 0.5;
        } else if (promo.equals("meno5")) {
            promor = 5;
        } else if (promo.equals("5porc")) {
            promor=0.05;
        }
        if (promor==5){
            System.out.println("Base imponible: " + n1 + "\n" +
                    "IVA: " + ivar * 100 + "%\n" +
                    "Precio con IVA: " + ((n1 * ivar) + n1) + "\n" +
                    "Cod. promo: " + promor + "% -" + 5 + "€\n" +
                    "Total: " + (n1 * ivar + n1 - 5));
        }else{
            System.out.println("Base imponible: " + n1 + "\n" +
                    "IVA: " + ivar * 100 + "%\n" +
                    "Precio con IVA: " + ((n1 * ivar) + n1) + "\n" +
                    "Cod. promo: " + promor + "% -" + n1 * promor + "€\n" +
                    "Total: " + (n1 * ivar + n1 - n1 * promor));
        }


    }

}
