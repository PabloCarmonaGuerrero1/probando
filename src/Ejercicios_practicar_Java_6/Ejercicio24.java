package Ejercicios_practicar_Java_6;

public class Ejercicio24 {
    public static boolean estarray(int[] x,int y){
        for (int i = 0; i<x.length;i++){
            if (x[i]==y){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] num = {7,4,9,3,5};
        if (estarray(num,3)){
            System.out.println("Este número esta en el array");
        }else {
            System.out.println("Este número no esta en el array");
        }
        if (estarray(num,1)){
            System.out.println("Este número esta en el array");
        }else {
            System.out.println("Este número no esta en el array");
        }
    }
}
