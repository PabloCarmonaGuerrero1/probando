package Ejercicios_practicar_Java_3;

public class Ejercicio12 {
    public static void main(String[] args){
        int linea = 0;
        for(int i = 0; i < 8000; i++) {
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
            if (linea++ == 60) {
                linea = 0;
                System.out.println();
            }
        }
    }
}
