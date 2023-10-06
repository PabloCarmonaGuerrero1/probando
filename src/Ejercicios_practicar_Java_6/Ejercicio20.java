package Ejercicios_practicar_Java_6;


import java.util.Random;

public class Ejercicio20 {
    public static int[] genarray(int x , int y , int z){
        Random random = new Random();
        int[] num=new int[x];
        for (int i = 0;i<num.length;i++){
            num[i]=random.nextInt(y,z+1);
        }
        return num;
    }
    public static void main(String[]args){
        int[] b =genarray(10,0,10);
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
