package Ejercicios_practicar_Java_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        int[] num=new int[100];
        for (int i=0;i< num.length;i++){
            num[i]= random.nextInt(0,501);
        }
        for (int i = 0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        int max = Arrays.stream(num).max().getAsInt();
        int min = Arrays.stream(num).min().getAsInt();
        System.out.println("");
        System.out.print("Cuál quieres destacar?(1 mínimo o 2 máximo)");

        for (int i = 0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        int dec = scanner.nextInt();
        if (dec==1){
            for (int i = 0;i<num.length;i++){
                if (num[i]==min){
                    System.out.print("*"+num[i]+"* ");
                }else {
                    System.out.print(num[i]+" ");
                }
            }
        }
        if (dec==2){
            for (int i = 0;i<num.length;i++){
                if (num[i]==max){
                    System.out.print("*"+num[i]+"* ");
                } else  {
                    System.out.print(num[i]+" ");
                }
            }
        }

    }
}
