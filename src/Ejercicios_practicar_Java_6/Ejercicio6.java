package Ejercicios_practicar_Java_6;


public class Ejercicio6 {
    public static int voltear(int x){
        int h = 0;
        String n=String.valueOf(x);
        String n2 = "";
        for(int i = n.length()-1 ; i>=0;i--){
            n2+=n.charAt(i);
        }
        h=Integer.parseInt(n2);
        return h;
    }
    public static void main(String[]args){
        System.out.println("El número al revés es "+voltear(345));
        System.out.println("El número al revés es "+voltear(325890));
        System.out.println("El número al revés es "+voltear(59));
    }
}
