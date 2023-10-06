package Ejercicios_practicar_Java_6;

public class Ejercicio8 {
    public static int buscdig(int x , int y){
        String hx = String.valueOf(x);
        int b = -1;
        for (int i = 0;i<hx.length();i++){
            char n = hx.charAt(i);
            String n2 = String.valueOf(n);
            if (Integer.parseInt(n2)==y){
                b=i+1;
                break;
            }
        }
        return b;
    }
    public static void main(String[]args){
        System.out.println("Está en la posición "+buscdig(1904856890,7));
        System.out.println("Está en la posición "+buscdig(1904856890,8));
    }
}
