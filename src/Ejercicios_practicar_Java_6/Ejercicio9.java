package Ejercicios_practicar_Java_6;

public class Ejercicio9 {
    public static int quitdig(int x , int y){
        String hx = String.valueOf(x);
        String b = "";
        for (int i = 0;i<hx.length()-y;i++){
            char c = hx.charAt(i);
            b+=String.valueOf(c);
        }
        int a = Integer.parseInt(b);
        return a;
    }
    public static void main(String[]args){
        System.out.println("Aqui esta el nuevo número "+quitdig(57395,2));
        System.out.println("Aqui esta el nuevo número "+quitdig(573523395,1));
        System.out.println("Aqui esta el nuevo número "+quitdig(57432595,5));
    }
}
