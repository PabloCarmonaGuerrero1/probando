package Ejercicios_practicar_Java_6;

public class Ejercicio26 {
    public static int[] volteararray(int[] x){
        int[] xinvert= new int[x.length];
        int b = 0;
        for (int i = x.length-1;i>=0;i--){
            xinvert[b]=x[i];
            b++;
        }
        return xinvert;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5,3};
        int [] num2 = volteararray(num);
        for (int i = 0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
    }
}
