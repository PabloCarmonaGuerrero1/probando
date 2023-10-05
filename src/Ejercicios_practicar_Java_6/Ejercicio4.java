package Ejercicios_practicar_Java_6;

public class Ejercicio4{
    public static int potencia(int x,int y){
        int var = x;
        for (int i = 1;i<y;i++){
            var = var * x;
        }
        return var;
    }
    public static void main(String[]args){
        System.out.println("La potencia es : "+potencia(5,5));
    }
}
