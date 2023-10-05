package Ejercicios_practicar_Java_6;

public class Ejercicio5 {
    public static int contdig(int x){
        String n=String.valueOf(x);
        int h = n.length();
        return h;
    }
    public static void main(String[]args){
        System.out.println("Este número tiene "+contdig(732)+" dígito/s");
        System.out.println("Este número tiene "+contdig(22)+" dígito/s");
        System.out.println("Este número tiene "+contdig(43255)+" dígito/s");
    }
}
