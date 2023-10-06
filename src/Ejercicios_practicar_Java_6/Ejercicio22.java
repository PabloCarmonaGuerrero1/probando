package Ejercicios_practicar_Java_6;

import java.util.Arrays;

public class Ejercicio22 {
    public static int maxarray(int[] x){
        int max = Arrays.stream(x).max().getAsInt();
        return max;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5};
        System.out.println("El máximo de este array es "+maxarray(num));
    }
}
