package Ejercicios_practicar_Java_3;

public class Ejercicio22 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i ++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j ++) {
                if ((i % j) == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
