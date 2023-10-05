package Ejercicios_practicar_Java_6;

public class Ejercicio2 {
    public static boolean primo(int x){
        int bomb= 0;
        for (int i =1 ; i<9;i++){
            if (x%i==0){
                bomb++;
            }
        }
        if (x>9){
            if (bomb>1){
                return false;
            }
        }
        if (x<10){
            if (bomb>2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        if (primo(4)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
        if (primo(7)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
        if (primo(11)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
        if (primo(12)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}
