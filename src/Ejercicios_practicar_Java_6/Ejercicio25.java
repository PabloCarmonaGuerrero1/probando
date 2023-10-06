package Ejercicios_practicar_Java_6;

public class Ejercicio25 {
    public static String posarray(int[] x,int y){
        String pos = "";
        for (int i = 0; i<x.length;i++){
            if (x[i]==y){
                pos+=String.valueOf(i+1)+" ";
            }
        }
        return pos;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5,3};
        System.out.println("Este número está en la/s posicione/s : "+posarray(num,3));
    }
}
