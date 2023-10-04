package Ejercicios_practicar_Java_5;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[]args){
        Random random= new Random();
        int[] num=new int[20];
        int numpar=0;
        int numimpar=0;
        for (int i=0;i< num.length;i++){
            num[i]= random.nextInt(0,101);
            if (num[i]%2==0){
                numpar++;
            }else {
                numimpar++;
            }
        }
        int[] par=new int[numpar];
        int[] impar=new int[numimpar];
        int h1=0;
        int h2=0;
        for (int i=0;i< num.length;i++){
            if (num[i]%2==0){
                par[h1]=num[i];
                h1++;
            }else {
                impar[h2]=num[i];
                h2++;
            }
        }
        for (int i = 0;i<par.length;i++){
            num[i]=par[i];
        }
        for (int i = 0;i<impar.length;i++){
            num[i+par.length]=impar[i];
        }
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
