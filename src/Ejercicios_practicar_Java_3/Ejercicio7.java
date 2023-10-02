package Ejercicios_practicar_Java_3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contrasenya = 5460;
        int oportunidades = 4;

        while (oportunidades > 0) {
            System.out.println("Introduce la combinación de la caja fuerte:");
            int contrasenyaUser = scanner.nextInt();

            if (contrasenya != contrasenyaUser) {
                System.out.println("Lo siento, esa no es la combinación");
                oportunidades --;
            }
            else {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
    }
}
