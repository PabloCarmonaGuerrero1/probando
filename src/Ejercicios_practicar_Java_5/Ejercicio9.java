package Ejercicios_practicar_Java_5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int[] num = new int[10];
        for (int i=0;i< num.length;i++){
            System.out.println("Introduce un número");
            int n1= scanner.nextInt();
            num[i]=n1;
        }
        for (int i=0;i<num.length;i++){
            if (num[i]%2==0){
                System.out.println(num[i]+" es par");
            } else {
                System.out.println(num[i]+" es impar");
            }
        }
    }
}
