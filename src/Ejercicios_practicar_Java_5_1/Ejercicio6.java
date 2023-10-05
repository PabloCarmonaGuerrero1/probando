package Ejercicios_practicar_Java_5_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[]args){
        Random random = new Random();
        int [][] num = new int[6][10];
        int [] n = new int[60];
        Set<Integer> numerosUnicos = new HashSet<>();
        int h = 0;
        while (numerosUnicos.size() < 60) {
            int na = random.nextInt(1, 1001);
            if (!numerosUnicos.contains(na)) {
                numerosUnicos.add(na);
            }
        }
        for (Integer numero : numerosUnicos) {
            n[h]=numero;
            h++;
        }
        int max = Arrays.stream(n).max().getAsInt();
        int min = Arrays.stream(n).min().getAsInt();
        h=0;
        for (int i = 0; i<num.length;i++){
            for (int j = 0; j<num[0].length;j++){
                num[i][j]=n[h];
                h++;
            }
        }
        int imax=-1;
        int imin=-1;
        int jmax=-1;
        int jmin=-1;
        for (int i = 0; i<num.length;i++){
            for (int j = 0; j<num[0].length;j++){
                System.out.print(num[i][j]+" ");
                if (num[i][j]==max){
                    imax=i;
                    jmax=j;
                }
                if (num[i][j]==min){
                    imin=i;
                    jmin=j;
                }
            }
            System.out.println(" ");
        }
        System.out.println("El mayor número es "+max+" y se encuentra en la fila "+(imax+1)+" y en la columna "+(jmax+1));
        System.out.println("El mayor número es "+min+" y se encuentra en la fila "+(imin+1)+" y en la columna "+(jmin+1));

    }
}
