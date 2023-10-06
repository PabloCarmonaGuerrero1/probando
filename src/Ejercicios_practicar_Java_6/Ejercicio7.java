package Ejercicios_practicar_Java_6;

public class Ejercicio7 {
    public static int digitoN(int x , int h){
        String n=String.valueOf(x);
        char dign=n.charAt(h-1);
        n=String.valueOf(dign);
        int b = Integer.parseInt(n);
        return b;
    }
    public static void main(String[]args){
        System.out.println("El dígito de esa posición es "+digitoN(343,2));
        System.out.println("El dígito de esa posición es "+digitoN(345,1));
        System.out.println("El dígito de esa posición es "+digitoN(345,3));
    }
}
