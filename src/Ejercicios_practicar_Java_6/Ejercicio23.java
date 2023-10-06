package Ejercicios_practicar_Java_6;

import java.util.Arrays;

public class Ejercicio23 {
    public static double medarray(int[] x){
        double med = 0;
        for (int i = 0; i< x.length;i++){
            med+=x[i];
        }
        med = med/x.length;
        return med;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5};
        System.out.println("La media de este array es "+medarray(num));
    }
}
