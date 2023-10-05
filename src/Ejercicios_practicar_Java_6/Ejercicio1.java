package Ejercicios_practicar_Java_6;

public class Ejercicio1 {
    public static boolean capicua(int x){
        String n=String.valueOf(x);
        int tama=n.length();
        for (int i = 0;i<tama;i++){
            if (n.charAt(i)==n.charAt(tama)){
                tama--;
            }
        }
        return
    }
    public static void main(String[]args){

    }
}
