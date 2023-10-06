package Ejercicios_practicar_Java_6;

import java.util.Arrays;

public class Ejercicio21 {
    public static int minarray(int[] x){
        int min = Arrays.stream(x).min().getAsInt();
        return min;
    }
    public static void main(String[]args){
        int[] num = {7,4,6,3,5};
        System.out.println("El mínimo de este array es "+minarray(num));
    }
}
