package Ejercicios_practicar_Java_6;

public class Ejercicio28 {
    public static int[] rotaIzqarray(int[] x){
        int[] xrotado= new int[x.length];
        for (int i = 0;i<x.length;i++){
            if (i==0){
                xrotado[x.length-1]=x[i];
            }else {
                xrotado[i-1]=x[i];
            }
        }
        return xrotado;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5,3};
        int [] num2 = rotaIzqarray(num);
        for (int i = 0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
    }
}
