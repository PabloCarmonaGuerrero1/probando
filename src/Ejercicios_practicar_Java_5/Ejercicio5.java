package Ejercicios_practicar_Java_5;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int[] num = new int[10];
        for (int i=0;i< num.length;i++){
            System.out.println("Introduce un número");
            int n1= scanner.nextInt();
            num[i]=n1;
        }
        int max = Arrays.stream(num).max().getAsInt();
        int min = Arrays.stream(num).min().getAsInt();
        for (int i = 0;i<num.length;i++){
            if (num[i]==max){
                System.out.println(num[i]+" máximo");
            } else if (num[i]==min){
                System.out.println(num[i]+" mínimo");
            }else {
                System.out.println(num[i]);
            }
        }

    }
}
