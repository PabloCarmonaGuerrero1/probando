package Ejercicios_practicar_Java_6;

public class Ejercicio1 {
    public static boolean capicua(int x){
        String n=String.valueOf(x);
        int tama=n.length();
        for (int i = 0;i<tama/2;i++){
            if (n.charAt(i)!=n.charAt(tama-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        if (capicua(44)){
            System.out.println("Es capicúa");
        }else {
            System.out.println("No es capicúa");
        }
        if (capicua(34)){
            System.out.println("Es capicúa");
        }else {
            System.out.println("No es capicúa");
        }
        if (capicua(54345)){
            System.out.println("Es capicúa");
        }else {
            System.out.println("No es capicúa");
        }
    }
}
