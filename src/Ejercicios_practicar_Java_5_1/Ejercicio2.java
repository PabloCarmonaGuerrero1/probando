package Ejercicios_practicar_Java_5_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int[][] num = new int[4][5];
        for (int i = 0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.println("Introduce un número :");
                int numero = scanner.nextInt();
                num[i][j]=numero;
            }
        }
        int suma = 0;
        for (int i = 0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+"         ");
                if (j==num[i].length-1){
                    System.out.println("Fila "+i);
                }
                suma+=num[i][j];
            }
        }
        for(int i = 0; i<num[0].length;i++){
            System.out.print("Columna "+i+" ");
            if (i==num[0].length-1){
                System.out.print(suma);
            }
        }


    }
}
